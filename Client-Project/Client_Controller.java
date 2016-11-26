package sm_app.com;

import java.rmi.RemoteException;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.apache.axis2.AxisFault;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import sm_app.com.*;
import sm_app.com.App_ModelStub.*;

public class Client_Controller {
	// Goi den ham xoa sv phia server thong qua webservice
	// Tra ve True or False
	public boolean xoasinhvien(String masv) {
		try {
			App_ModelStub stub = new App_ModelStub();
			XoaSinhVien xsv = new XoaSinhVien();
			xsv.setMasv(masv);
			return (stub.xoaSinhVien(xsv).get_return() ? true : false);
		} catch (AxisFault e) {
			return false;

		} catch (RemoteException e) {
			return false;
		}
	}

	// Goi den ham them sv phia server thong qua webservice
	// Tra ve true or false
	public boolean themsinhvien(String masv, String hoten, String diachi, String sdt, String ns, String gioitinh,
			String noisinh, String malop) {
		try {
			App_ModelStub stub = new App_ModelStub();
			ThemSinhVien tsv = new ThemSinhVien();
			tsv.setMasv(masv);
			tsv.setHoten(hoten);
			tsv.setDiachi(diachi);
			tsv.setSdt(sdt);
			tsv.setNgaysinh(ns);
			tsv.setNoisinh(noisinh);
			tsv.setGioitinh(gioitinh);
			tsv.setMalop(malop);
			return (stub.themSinhVien(tsv).get_return() ? true : false);

		} catch (AxisFault e) {
			return false;
		} catch (RemoteException e) {
			return false;
		}
	}

	public boolean suattsv(String masv, String hoten, String diachi, String sdt, String ngaysinh, String gioitinh,
			String noisinh, String malop) {
		try {
			App_ModelStub stub = new App_ModelStub();
			SuaTTSV tsv = new SuaTTSV();
			tsv.setMasv(masv);
			tsv.setHoten(hoten);
			tsv.setDiachi(diachi);
			tsv.setSdt(sdt);
			tsv.setNgaysinh(ngaysinh);
			tsv.setNoisinh(noisinh);
			tsv.setGioitinh(gioitinh);
			tsv.setMalop(malop);
			return (stub.suaTTSV(tsv).get_return() ? true : false);

		} catch (AxisFault e) {
			return false;
		} catch (RemoteException e) {
			return false;
		}
	}

	public String dangnhap(String id, String pwd) {
		try {
			App_ModelStub stub = new App_ModelStub();
			KtDangNhap ktdn = new KtDangNhap();
			ktdn.setUsername(id);
			ktdn.setPwd(pwd);
			return stub.ktDangNhap(ktdn).get_return();
		} catch (AxisFault e) {
			JOptionPane.showMessageDialog(null, "Không có kết nối");
			return null;

		} catch (RemoteException e) {
			JOptionPane.showMessageDialog(null, "Không có kết nối");
			return null;

		}

	}

	public String timsv(String msv) {
		try {
			App_ModelStub stub = new App_ModelStub();
			TimSV tsv = new TimSV();
			tsv.setMaSV(msv);
			return stub.timSV(tsv).get_return().toString();
		} catch (AxisFault e) {
			return null;

		} catch (RemoteException e) {
			return null;
		}
	}

	public ArrayList<Sinhvien> xuatdssv() throws org.json.simple.parser.ParseException {
		try {
			App_ModelStub stub = new App_ModelStub();
			XuatDSSV xds = new XuatDSSV();
			String str = stub.xuatDSSV(xds).get_return();

			ArrayList<Sinhvien> lst = new ArrayList<Sinhvien>();

			org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
			JSONObject obj = (JSONObject) parser.parse(str);
			JSONArray arr = new JSONArray();
			arr = (JSONArray) obj.get("lst");
			JSONObject obj_ = new JSONObject();
			for (int i = 0; i < arr.size(); i++) {
				obj_ = (JSONObject) arr.get(i);
				Sinhvien sv = new Sinhvien(obj_.get("maSV").toString(), obj_.get("hoten").toString(),
						obj_.get("ngaysinh").toString(), obj_.get("diachi").toString(), obj_.get("sdt").toString(),
						obj_.get("gioitinh").toString(), obj_.get("noisinh").toString(), obj_.get("malop").toString());
				lst.add(sv);
			}

			return lst;
		} catch (AxisFault e) {
			return null;
		} catch (RemoteException e) {
			return null;
		}
	}

	public ArrayList<String> xuatlop() {
		try {
			ArrayList<String> lst = new ArrayList<String>();
			App_ModelStub stub = new App_ModelStub();
			XuatDSL xds = new XuatDSL();
			String temp;
			String s = stub.xuatDSL(xds).get_return();

			org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
			JSONObject obj = (JSONObject) parser.parse(s);
			JSONArray arr = new JSONArray();
			arr = (JSONArray) obj.get("lst");
			for (int i = 0; i < arr.size(); i++) {
				temp = (String) arr.get(i);
				lst.add(temp);
			}

			return lst;
		} catch (AxisFault e) {
			return null;
		} catch (RemoteException e) {
			return null;
		} catch (org.json.simple.parser.ParseException e) {
			return null;
		}
	}
}
