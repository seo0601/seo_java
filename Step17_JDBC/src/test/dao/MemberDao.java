package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 *  Data Access Object 만들어 보기
 *  
 *  - DB에 insert, update, delete, select 작업을 대신해주는 객체를 생성할 클래스 설계하기 
 */
public class MemberDao {
	
	//회원 한 명의 정보를 저장하고 작업의 성공 여부를 리턴해주는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		//수정된 row의 갯수를 담을 지역 변수를 미리 만들고 초기값 0 대입하기
		int rowCount = 0;
		
		try {
			//Connection 객체의 참조값 얻어 오기
			conn = new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql = "INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			
			//PreapareStatement 객체의 잠조 값 얻어오기
			pstmt = conn.prepareStatement(sql);
			//?에 값 바인딩하기
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			//sql 문을 실행하고 변화된(추가, 수정, 삭제) row의 갯수를 리턴받기
			//executeUpdate는 row count의 int값을 리턴해주는데 이를 활용하면 작업 성공 여부를 확인할 수 있다.
			rowCount = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	    	  try {
	    		  if(pstmt != null)pstmt.close();
	    		  if(conn != null)conn.close();
	    	  }catch(Exception e) {}
	     }
		//앞에서 if문을 사용하게 되면 후속 작업을 못하고 끝나기때문에 뒤에서 사용
		//변화된 rowCount 값을 확인해서 작업의 성공 여부를 리턴해 준다. rowCount를 사용하려면 필드에 변수 선언해야한다.
		if(rowCount > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//회원 한 명의 정보를 수정하고 작업의 성공 여부를 리턴해주는 메소드
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
		     String sql = "UPDATE member SET name=?,"
		    	  		+ " addr=?"
		    	  		+ " WHERE num=?";
		     
		     pstmt = conn.prepareStatement(sql);
		     pstmt.setString(1, dto.getName());
		     pstmt.setString(2, dto.getAddr());
		     pstmt.setInt(3, dto.getNum());
		     rowCount = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	    	  try {
	    		  if(pstmt != null)pstmt.close();
	    		  if(conn != null)conn.close();
	    	  }catch(Exception e) {}
	     }
		if(rowCount > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//회원 한 명의 정보를 삭제하고 작업의 성공 여부를 리턴해주는 메소드
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {			
			conn = new DBConnect().getConn();		
			String sql = "DELETE FROM member where num =?";				
			pstmt = conn.prepareStatement(sql);			
			pstmt.setInt(1, num);			
			rowCount = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	    	  try {
	    		  if(pstmt != null)pstmt.close();
	    		  if(conn != null)conn.close();
	    	  }catch(Exception e) {}
	     }
		//3항 연산자
		return rowCount >0 ? true:false;		
	}
	
	//전체 회원의 목록을 리턴해주는 메소드
	public List<MemberDto> getList(){	
		//회원 전체 목록을 담을 ArrayList 객체를 생성해서 참조 값을 List 인터페이스 type으로 담기
		List<MemberDto> list = new ArrayList<>();
			
		Connection conn = null;
		PreparedStatement pstmt = null;
		//ORACL 에서 SELECT의 결과가 ResultSet에 들어가있다면 생각하면 편하다.
		ResultSet rs = null;
		try {
			//Connection 객체의 참조값 얻어 오기
			conn = new DBConnect().getConn();
			//실행할 미완성의 sql 문
			String sql = "SELECT num, name ,addr"
						+ " FROM member"
						+ " ORDER BY num ASC";
				
			//PreapareStatement 객체의 잠조 값 얻어오기
			pstmt = conn.prepareStatement(sql);
			//?에 값 바인딩
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//커서가 위치한 곳의 회원 정보를 MemberDto 객체에 담기
				MemberDto dto = new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
					
				//회원 한명의 정보가 담긴 MemberDto 객체의 참조 값을 ArrayList 객체에 누적시키기
				list.add(dto);
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
	    	  try {
	    		  if(rs != null)rs.close();
	    		  if(pstmt != null)pstmt.close();
	    		  if(conn != null)conn.close();
	    	  }catch(Exception e) {}
	     }
		//모든 회원의 정보가 누적된 ArrayList 객체의 잠조 값 리턴해주기
		return list;
	}
	
	   //인자로 전달된 번호에 해당하는 회원 한명의 정보를 리턴하는 메소드 
	   //번호에 해당하는 회원의 정보가 없으면 null 을 리턴 
	   public MemberDto getData(int num) {
	      //MemberDto 객체의 참조값을 담을 지역변수 미리 만들기 
	      MemberDto dto=null;
	      
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try {
	         //Connection 객체의 참조값 얻어오기
	         conn=new DBConnect().getConn();
	         //실행할 미완성의 sql 문
	         String sql="SELECT num, name, addr"
	               + " FROM member"
	               + " WHERE num=?";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         //? 에 값 바인딩
	         pstmt.setInt(1, num);
	         rs=pstmt.executeQuery();
	         //만일 cursor 를 한칸 내릴수 있다면(select 된 row 가 있다면)
	         if(rs.next()) {
	            //MemberDto 객체를 생성해서 참조값을 미리 만들어진 지역변수 dto 에 담기 
	            dto=new MemberDto();
	            //cursor 가 위치한 곳의 회원정보를 MemberDto 객체에 담기 
	            dto.setNum(rs.getInt("num"));
	            dto.setName(rs.getString("name"));
	            dto.setAddr(rs.getString("addr"));
	         }
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(rs!=null)rs.close();
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	      }
	      //회원 한명의 정보를 담고 있는 MemberDto 객체 리턴해주기 
	      return dto;      
	   }
}
