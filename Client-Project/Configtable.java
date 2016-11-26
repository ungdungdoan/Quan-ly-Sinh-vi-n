package sm_app.com;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

public class Configtable extends AbstractTableModel {

	private static final int MASV=0;
	private static final int TEN=1;
	private static final int NGAYSINH=2;
	private static final int DIACHI=3;
	private static final int SDYT=4;
	private static final int GIOITINH=5;
	private static final int NOISINH=6;
	private static final int MALOP=7;
	
	private String column_name[] =  { "Mã SV", "Họ Tên", "Ngày sinh", "Địa chỉ", "SĐT", "Giới Tính", "Nơi Sinh", "Lớp" };
	private Class<?> column_type[]={String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class};
	ArrayList<Sinhvien> list;
	
	
	public Configtable(ArrayList<Sinhvien> list) {
		super();
		this.list = list;
	}
	@Override
	public int getColumnCount() {
		
		return column_name.length;
	}
	
	
	
	
	
	@Override
	public int getRowCount() {
		
		return list.size();
	}
	@Override
	public Object getValueAt(int row, int column) {
		Sinhvien sinhvien = list.get(row);
		switch (column) {
		case MASV: return sinhvien.getMaSV();
		case TEN:return sinhvien.getHoten();
		case NGAYSINH:return sinhvien.getNgaysinh();
		case  DIACHI: return sinhvien.getDiachi();
		case SDYT:return sinhvien.getSdt();
		case GIOITINH: return sinhvien.getGioitinh();
		case NOISINH: return sinhvien.getNoisinh();
		case MALOP:return sinhvien.getMalop();

		default: return sinhvien.getMaSV();
			
		}
		
	}
	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return column_name[column];
	}
	
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO Auto-generated method stub
		return column_type[columnIndex];
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
