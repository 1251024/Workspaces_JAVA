package com.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MTest02 {

	//DEPT 테이블에 있는 모든 값을 출력해보자.
	public static void main(String[] args) {
		
		try {
			selectList();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void selectList() throws ClassNotFoundException, SQLException {
		
		//1. driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		//2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
			
		//3. query 준비
		String sql = " SELECT DEPTNO, DNAME, LOC "
				+ " FROM DEPT ";
		//쿼리만들때 앞뒤 공백 필수!!
		
		Statement stmt = con.createStatement();
		
		
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt("DEPTNO")+" \t " + rs.getString(2) + " \t " + rs.getString(3));
		} 
		
			
		//5. db종료
		rs.close();
		stmt.close();
		con.close();
		
	}
}
