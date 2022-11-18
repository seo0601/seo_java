package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import test.mypac.Member;
import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		//추가할 회원의 정보
		String name = "주댕이";
		String addr = "봉천동";
		
		//추가할 회원의 정보를 HashMap 객체에 key : value의 쌍으로 저장한 다음
		Map<String, Object> map= new HashMap<>();
		map.put("name", name);
		map.put("addr", addr);
		
		//insert() 메소드를 호출하면서 Map 객체 전달하기
		insert(map);
		
	
		
	}
	
	//회원 한명의 정보를 추가하는 메소드를 만들기
	public static void insert(Map<String, Object> m) {
		 String name = (String)m.get("name");
		 String addr = (String)m.get("addr");
		 Connection conn = null;
	     PreparedStatement pstmt = null;
	     try {
	     conn = new DBConnect().getConn();
	     String sql = "INSERT INTO member"
	    	  		+ " (num, name, addr)"
	    	  		+ " VALUES(member_seq.NEXTVAL, ?, ?)";
	     
	    pstmt = conn.prepareStatement(sql);	    	  
   	  	pstmt.setString(1, name);
   	  	pstmt.setString(2, addr);
   	  	pstmt.executeUpdate();
   	  	System.out.println("회원 정보를 추가했습니다.");
	    }catch(Exception e) {
	    	  e.printStackTrace();
	    }finally {
	    	  try {
	    		  if(pstmt != null)pstmt.close();
	    		  if(conn != null)conn.close();
	    	  }catch(Exception e) {}
	     }
	}
}
