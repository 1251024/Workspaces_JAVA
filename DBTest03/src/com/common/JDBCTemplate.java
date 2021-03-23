package com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DB연결, 연결해제, 저장(commit), 취소(rollback)
//method를 static으로 만들자.
public class JDBCTemplate {

	// 1.
	// 2.
	public static Connection getConnection() {
		// 1.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 2.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);// 자동커밋안되게, 원할때만 자동설정하게
										// 기본은 오토커밋(디폴트)는 true인데 false로 바꿔준것

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
