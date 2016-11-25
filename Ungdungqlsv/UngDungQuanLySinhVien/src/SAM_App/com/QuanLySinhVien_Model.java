package SAM_App.com;

import SAM_App.com.connectdatabase;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.microsoft.sqlserver.jdbc.SQLServerException;

public class QuanLySinhVien_Model {
	// Kiem tra Dang Nhap
	public String ktDangNhap(String username, String pwd) {
		Connection con = connectdatabase.Connect();
		try {
			String sql = "select id,pwd,permit  from USER_TB  where id = '"+username+"'";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			String temp = "";
			while (rs.next()) {
				temp = (String) rs.getString(1).toString();
				temp = temp.trim();
				if (temp.equals(username)) {
					temp = rs.getString(2);
					temp = temp.trim();
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
	public boolean themSinhVien(String masv, String hoten, String diachi, String sdt, java.util.Date ngaysinh,
			String gioitinh, String noisinh,  String malop) {
		Connection con = connectdatabase.Connect();
		String sql = "INSERT INTO SINHVIEN (maSV , hoten,diachi,sdt,gioitinh,noisinh,maLop,ngaysinh) VALUES (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, masv);
			pre.setString(2, hoten);
			pre.setString(3, diachi);
			
			pre.setString(5, gioitinh);
			pre.setString(6, noisinh);
			
			pre.setString(7, malop);
			pre.setString(4, sdt);
			Date sqldate = new Date(ngaysinh.getTime());
			pre.setDate(8, sqldate);
			

			pre.executeUpdate();
			pre.close();
			con.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

	}

	// Xoa Sinh Vien
	public boolean xoaSinhVien(String masv) {
		Connection con = connectdatabase.Connect();
		String sql = "DELETE FROM SINHVIEN WHERE maSV='" + masv + "'";
		try {
			java.sql.Statement st = con.createStatement();
			st.executeUpdate(sql);
			con.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return false;
		}

	}

	// Sua Sinh Vien
	public boolean suaTTSV(String masv, String hoten, String diachi, String sdt, java.util.Date ngaysinh,
			String gioitinh, String noisinh, String malop) {
		Connection con = connectdatabase.Connect();
		String sql = "UPDATE SINHVIEN SET hoten= ?,ngaysinh=?,diachi =?,sdt= ?,gioitinh = ?,noisinh=?,maLop =? where maSV =?";
		try {
			PreparedStatement pre = con.prepareStatement(sql);
			pre.setString(1, hoten);
			pre.setString(3, diachi);
			
			pre.setString(5, gioitinh);
			pre.setString(6, noisinh);
			
			pre.setString(7, malop);
			pre.setString(4, sdt);
			Date sqldate = new Date(ngaysinh.getTime());
			pre.setDate(2, sqldate);
			pre.setString(8, masv);

			pre.executeUpdate();
			pre.close();
			con.close();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	// Tim Sinh Vien
	public String TimSV(String maSV) {
		Connection con = connectdatabase.Connect();
		try {
			String sql = "select * from SINHVIEN Where maSV='" + maSV + "'";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {

				JSONObject sv = new JSONObject();
				sv.put("maSV", rs.getString(1));
				sv.put("hoten", rs.getString(2));
				sv.put("ngaysinh", rs.getDate(3).toString());
				sv.put("diachi", rs.getString(4));
				sv.put("sdt", rs.getString(5));
				sv.put("gioitinh", rs.getString(6));
				sv.put("noisinh", rs.getString(7));
				sv.put("malop", rs.getString(8));

				return sv.toString();
			} else

				connectdatabase.disconnect(con);
			return null;
		} catch (SQLServerException e) {
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			connectdatabase.disconnect(con);
			return null;
		}
	}

	public String xuatDSSV() {
		Connection con = connectdatabase.Connect();
		JSONObject sv, res;
		JSONArray svlst = new JSONArray();
		res = new JSONObject();
		try {
			String sql = "select * from SINHVIEN ";
			java.sql.Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {

				sv = new JSONObject();
				sv.put("maSV", rs.getString(1));
				sv.put("hoten", rs.getString(2));
				sv.put("ngaysinh", rs.getDate(3).toString());
				sv.put("diachi", rs.getString(4));
				sv.put("sdt", rs.getString(5));
				
				sv.put("gioitinh", rs.getString(6));
				sv.put("noisinh", rs.getString(7));
				
				sv.put("malop", rs.getString(8));
				svlst.add(sv);
			}
			res.put("lst", svlst);
			connectdatabase.disconnect(con);
			return res.toString();

		} catch (SQLServerException e) {
			connectdatabase.disconnect(con);
			return res.toString();
		} catch (SQLException e) {
			connectdatabase.disconnect(con);
			return res.toString();
		}
	}
}
