package kbqtht.com;

import kbqtht.com.connectdatabase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuanLySinhVien_Model {
	public String ktDangNhap(String username, String pwd) {
		Connection con = connectdatabase.connect();
		try {
			String sql = "select id , pwd , permision form DANGNHAP";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			String temp = "";
			while (rs.next()) {
				temp = rs.getString(1);
				if (temp.equals(username)) {
					temp = rs.getString(2);
					if (temp.equals(pwd)) {
						temp = rs.getString(3);
						return temp;
					}
				}
			}
			connectdatabase.disconnect(con);
			return null;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			connectdatabase.disconnect(con);
			return null;
		}
	}
	
	
	public boolean themSinhVien(SinhVien sv) {
		Connection con = connectdatabase.connect();
		
	}
	
	

}
