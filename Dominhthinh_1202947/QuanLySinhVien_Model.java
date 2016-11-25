package kbqtht.com;

import kbqtht.com.connectdatabase;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuanLySinhVien_Model {
	
	


	
	
	
	// Kiem tra Dang Nhap
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

	
	
	// Them Sinh Vien
	public boolean themSinhVien(SinhVien sv) {
		Connection con = connectdatabase.connect();
		String sql = "INSERT INTO SINHVIEN (maSV,hoten,ngaysinh,diachi,sdt,mail,gioitinh,"
				+ "noisinh,cmnd,ngaynhaphoc,maK,maL) " + "VALUES ('" + sv.maSV + "','" + sv.hoTen + "','" + sv.ngaySinh
				+ "','" + sv.diaChi + "'" + "," + sv.sdt + ",'" + sv.mail + "','" + sv.sex + "','" + sv.noiSinh + "',"
				+ sv.cmnd + "" + ",'" + sv.ngNhapHoc + "','" + sv.maKhoa + "','" + sv.maLop + "') ";
		try {
			java.sql.Statement st = con.createStatement();
			st.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	
	
	//Xoa Sinh Vien
	public boolean xoaSinhVien(String masv) {
		Connection con = connectdatabase.connect();
		String sql = "DELETE FROM SINHVIEN WHERE maSV='" + masv + "'";
		try {
			java.sql.Statement st = con.createStatement();
			st.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	
	//Sua Sinh Vien
	public boolean suaTTSV(SinhVien sv) {
		Connection con = connectdatabase.connect();
		String sql = "UPDATE SINHVIEN" + "SET maSV='" + sv.maSV + "' ,hoten= '" + sv.hoTen + "',ngaysinh= '"
				+ sv.ngaySinh + "',diachi = '" + sv.diaChi + "',sdt= " + sv.sdt + ",mail = '" + sv.mail
				+ "',gioitinh = '" + sv.sex + "'," + "noisinh= '" + sv.noiSinh + "',cmnd = " + sv.cmnd
				+ ",ngaynhaphoc = '" + sv.ngNhapHoc + "',maK= '" + sv.maKhoa + "',maL = '" + sv.maLop + "'";
		try {
			java.sql.Statement st = con.createStatement();
			st.executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	
	//Tim Sinh Vien
	public SinhVien TimSV(String maSV) {
		Connection con = connectdatabase.connect();
		try {
			String sql = "select * form DANGNHAP where maSV='" + maSV + "'";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs != null) {
				SinhVien sv = new SinhVien();
				sv.maSV = rs.getString(1);
				sv.hoTen = rs.getString(2);
				sv.ngaySinh = rs.getDate(3);
				sv.diaChi = rs.getString(4);
				sv.sdt = rs.getInt(5);
				sv.mail = rs.getString(6);
				sv.sex = rs.getString(7);
				sv.noiSinh = rs.getString(8);
				sv.cmnd = rs.getInt(9);
				sv.ngNhapHoc = rs.getDate(10);
				sv.maKhoa = rs.getString(11);
				sv.maLop = rs.getString(12);
				connectdatabase.disconnect(con);
				return sv;
			}else

			connectdatabase.disconnect(con);
			return null;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			connectdatabase.disconnect(con);
			return null;
		}
	}

}
