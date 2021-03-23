package com.test01;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class MTest01 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//JDBC 순서
		
		//ojdbc6.jar(꼭! 추가해야한다!!)->oracle.jdbc.driver.OracleDriver
		
		//1.driver 연결
		Class.forName("oracle.jdbc.driver.OracleDriver");// 쓰로우즈해준다 또는 트라이캐치//웬만해서 트라이캐치
		// Syntax error on token "class", invalid Expression->Class에 C...대문자로 안쓰면 나오는 에러
		
		//2. 계정 연결
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// Window ->Show View->Other->Data Source Explorer
		// Database Connections 우클릭 ->New ->Oracle
		// New Driver Definition->Oracle Thin Driver 11선택후 ->
		// JAR List 에서 기본적으로 추가되어 있는것 삭제( Remove JAR/Zip)
		// ->Add JAR/Zip->C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib에 있는
		// ojdbc6 열기
		// ->Properties->커넥션URL 은 jdbc:oracle:thin:@localhost:1521:xe 데이터베이스네임은xe하고 ok
		// ->유저네임, 패스워드에 각각 kh->Test Connection해서 Ping succeeded나오면 ok->Finish
		// 데이터베이스 커넥션이 생성
		// Data Source Explorer->Database Connections의 MyOracle 우클릭->Properties->Driver
		// Properties
		// 커넥션 유알엘의 "jdbc:oracle:thin:@localhost:1521:xe" 복붙
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url,user,password);
		// 커넥션에 임포트 java.sql //쓰로우즈 해준다 또는 트라이캐치//웬만해서 트라이캐치
		
		//3.query 준비
		String sql = " SELECT * FROM EMP ";
		Statement stmt = con.createStatement();//Statement에 임포트
		
		//4.query실행 및 리턴
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.printf("%5d %11s %9s %5d %10s %8.2f %8.2f %2d \n", 
					rs.getInt(1), rs.getString(2), rs.getString("JOB"), rs.getInt(4), 
					rs.getDate(5), rs.getDouble("SAL"), rs.getDouble(7),rs.getInt(8) );
		}
		
		//5.db종료
		rs.close();
		stmt.close();
		con.close();
	}

}
