package com.it.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Database {

		private Connection con; 		// mysql 연결
		private PreparedStatement psmt; // sql 문장 전송
		private final String URL = "jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC";

		//생성자, 드라이브 등록 : 한번만 하면 됨. 
		public Database() {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("성공 입니다.");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		//연결
		public void getConnetion() {
			try {
				con = DriverManager.getConnection(URL,"root","1234");
				System.out.println("접속아 잘되니");
			}catch(Exception e) {
				e.printStackTrace();		
			}
		}
		
		//연결해제
		public void disConnetion() {
			try {

				if(psmt != null	) psmt.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			Database db = new Database();
			db.getConnetion();
		}
}