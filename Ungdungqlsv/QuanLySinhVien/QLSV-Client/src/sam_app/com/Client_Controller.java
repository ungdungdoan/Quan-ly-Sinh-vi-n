package sam_app.com;

import java.rmi.RemoteException;
import java.sql.Date;

import javax.swing.JOptionPane;

import org.apache.axis2.AxisFault;
import sam_app.com.*;
import sam_app.com.QuanLySinhVien_ModelStub.KtDangNhap;
import sam_app.com.QuanLySinhVien_ModelStub.SuaTTSV;
import sam_app.com.QuanLySinhVien_ModelStub.ThemSinhVien;
import sam_app.com.QuanLySinhVien_ModelStub.TimSV;
import sam_app.com.QuanLySinhVien_ModelStub.XoaSinhVien;
import sam_app.com.QuanLySinhVien_ModelStub.XuatDSSV;

public class Client_Controller {
	// Goi den ham xoa sv phia server thong qua webservice
	// Tra ve True or False
	public boolean xoasinhvien(String masv) {
		try {
			QuanLySinhVien_ModelStub stub = new QuanLySinhVien_ModelStub();
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
	public boolean themsinhvien(String masv, String hoten, String diachi, String sdt, java.util.Date ngaysinh,
			String gioitinh, String noisinh, String malop) {
		try {
			QuanLySinhVien_ModelStub stub = new QuanLySinhVien_ModelStub();
			ThemSinhVien tsv = new ThemSinhVien();
			tsv.setMasv(masv);
			tsv.setHoten(hoten);
			tsv.setDiachi(diachi);
			tsv.setSdt(sdt);
			tsv.setNgaysinh(ngaysinh);
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

	public boolean suattsv(String masv, String hoten, String diachi, String sdt, java.util.Date ngaysinh,
			String gioitinh, String noisinh, String malop) {
		try {
			QuanLySinhVien_ModelStub stub = new QuanLySinhVien_ModelStub();
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
			QuanLySinhVien_ModelStub stub = new QuanLySinhVien_ModelStub();
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
			QuanLySinhVien_ModelStub stub = new QuanLySinhVien_ModelStub();
			TimSV tsv = new TimSV();
			tsv.setMaSV(msv);
			return stub.timSV(tsv).get_return().toString();
		} catch (AxisFault e) {
			return null;

		} catch (RemoteException e) {
			return null;
		}
	}

	public String xuatdssv() {
		try {
			QuanLySinhVien_ModelStub stub = new QuanLySinhVien_ModelStub();
			XuatDSSV xds = new XuatDSSV();
			String s = stub.xuatDSSV(xds).get_return();
			return s;
		} catch (AxisFault e) {
			return null;
		} catch (RemoteException e) {
			return null;
		}
	}
}
