package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.FriendDto;
import test.util.DBConnect;

public class FriendDao {
	
	//친구 정보 입력해주는 메소드
	public boolean insert(FriendDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		
		try {
			conn = new DBConnect().getConn();
			//미완성 sql문
			String sql = "INSERT INTO FRIEND"
					+ " (num, name, phone, birth)"
					+ " VALUES(FRIEND_seq.NEXTVAL, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getBirth());
			
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
	
	//친구 한 명의 정보를 수정하는 메소드
	public boolean update(FriendDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		try {
			conn = new DBConnect().getConn();
			String sql = "UPDATE FRIEND SET name=?,"
					+ " phone=?,"
					+ " birth=?"
					+ " WHERE num=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getPhone());
			pstmt.setString(3, dto.getBirth());
			pstmt.setInt(4, dto.getNum());
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
	
	//친구 한 명의 정보를 삭제해주는 메소드
	public boolean delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int rowCount = 0;
		
		try {
			conn = new DBConnect().getConn();
			String sql = "DELETE FROM FRIEND where num =?";				
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
		if(rowCount > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//모든 친구의 목록을 리턴해주는 메소드
	public List<FriendDto> getList(){
		List<FriendDto> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		//SELECT의 결과값이 ResultSet에 들어있다
		ResultSet rs = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT num, name , phone, birth"
					+ " FROM FRIEND"
					+ " ORDER BY num ASC";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				FriendDto dto = new FriendDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setPhone(rs.getString("phone"));
				dto.setBirth(rs.getString("birth"));
				
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
		return list;
	}
}
