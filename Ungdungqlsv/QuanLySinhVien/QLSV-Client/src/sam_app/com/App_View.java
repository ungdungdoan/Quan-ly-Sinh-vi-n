package sam_app.com;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.sun.tools.classfile.StackMapTable_attribute.append_frame;

import jdk.nashorn.internal.parser.JSONParser;

public class App_View extends javax.swing.JFrame implements FocusListener, MouseListener {
	private javax.swing.JButton btnQL;
	private javax.swing.JButton btnDelete;
	private javax.swing.JButton btnSave;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel pnlAdd;
	private String permit;
	private javax.swing.JPanel pnlEdit;
	private javax.swing.JTextField tfAddLocationName;
	private javax.swing.JTextField tfEditLocationId;
	private javax.swing.JTextField tfEditLocationName;
	// End of variables declaration
	private Client_Controller clControl = new Client_Controller();
	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnAdd;
	private javax.swing.JButton btnCancel;
	private javax.swing.JButton btnDel;
	private javax.swing.JButton btnEdit;
	private javax.swing.JButton btnExit;
	private javax.swing.JButton btnFind;
	private javax.swing.JTextField diachi;
	private javax.swing.JTextField dienthoai;
	private javax.swing.JComboBox<String> gioitinh;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTextField lop;
	private javax.swing.JTextField masv;
	private javax.swing.JTextField ngaysinh;
	private javax.swing.JTextField noisinh;
	private javax.swing.JPanel panelinfo;
	private javax.swing.JTextField tensv;
	private javax.swing.JTextField timkiem;

	private ArrayList<Sinhvien> list;
	private ArrayList<Sinhvien> littimkiem;

	public App_View(String permit, ArrayList<Sinhvien> list) throws ParseException {
		this.list = list;
		this.permit = permit;
		initComponents(permit);
	}
	
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents(String permit) throws ParseException {
		String str = clControl.xuatdssv();
		org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
		JSONObject obj = (JSONObject) parser.parse(str);
		JSONArray arr = new JSONArray();
		arr = (JSONArray) obj.get("lst");
		JSONObject obj1 = new JSONObject();
		for (int i = 0; i < arr.size(); i++) {
			obj1 = (JSONObject) arr.get(i);
			Sinhvien sv = new Sinhvien(obj1.get("maSV").toString(), obj1.get("hoten").toString(),
					obj1.get("ngaysinh").toString(), obj1.get("diachi").toString(), obj1.get("sdt").toString(),
					obj1.get("gioitinh").toString(), obj1.get("noisinh").toString(), obj1.get("malop").toString());
			this.list.add(sv);
		}
		panelinfo = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		tensv = new javax.swing.JTextField();
		masv = new javax.swing.JTextField();
		ngaysinh = new javax.swing.JTextField();
		noisinh = new javax.swing.JTextField();
		diachi = new javax.swing.JTextField();
		dienthoai = new javax.swing.JTextField();
		lop = new javax.swing.JTextField();
		gioitinh = new javax.swing.JComboBox<>();
		jLabel12 = new javax.swing.JLabel();
		btnAdd = new javax.swing.JButton();
		btnQL = new JButton();
		btnDel = new javax.swing.JButton();
		btnEdit = new javax.swing.JButton();
		btnCancel = new javax.swing.JButton();
		btnExit = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		timkiem = new javax.swing.JTextField();
		btnFind = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		// setResizable(false);
		setSize(900, 1000);
		setTitle(permit);

		panelinfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin sinh viên",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
		panelinfo.setForeground(new java.awt.Color(255, 51, 51));

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(51, 51, 255));
		jLabel1.setText("Mã SV:");

		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel5.setForeground(new java.awt.Color(51, 51, 255));
		jLabel5.setText("Tên SV:");

		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(51, 51, 255));
		jLabel6.setText("Ngày Sinh:");

		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel7.setForeground(new java.awt.Color(51, 51, 255));
		jLabel7.setText("Nơi Sinh");

		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(51, 51, 255));
		jLabel8.setText("Địa Chỉ:");

		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(51, 51, 255));
		jLabel9.setText("SDT:");

		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(51, 51, 255));
		jLabel10.setText("Giới Tính");

		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(51, 51, 255));
		jLabel11.setText("Lớp:");

		tensv.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tensvActionPerformed(evt);
			}
		});

		masv.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				masvActionPerformed(evt);
			}
		});

		ngaysinh.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				ngaysinhActionPerformed(evt);
			}
		});

		lop.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				lopActionPerformed(evt);
			}
		});

		gioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam\t", "Nữ" }));
		gioitinh.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				gioitinhActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout panelinfoLayout = new javax.swing.GroupLayout(panelinfo);
		panelinfo.setLayout(panelinfoLayout);
		panelinfoLayout
				.setHorizontalGroup(
						panelinfoLayout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										panelinfoLayout.createSequentialGroup().addGap(28, 28, 28)
												.addGroup(
														panelinfoLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(jLabel1).addComponent(jLabel5)
																.addComponent(jLabel6).addComponent(jLabel7))
												.addGap(27, 27, 27)
												.addGroup(panelinfoLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(tensv).addComponent(masv)
														.addComponent(ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE,
																207, Short.MAX_VALUE)
														.addComponent(noisinh))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														151, Short.MAX_VALUE)
												.addGroup(panelinfoLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(panelinfoLayout.createSequentialGroup()
																.addComponent(jLabel8).addGap(39, 39, 39).addComponent(
																		diachi, javax.swing.GroupLayout.PREFERRED_SIZE,
																		211, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(panelinfoLayout.createSequentialGroup()
																.addGroup(panelinfoLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(jLabel9).addComponent(jLabel10)
																		.addComponent(jLabel11))
																.addGap(18, 18, 18)
																.addGroup(panelinfoLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(dienthoai).addComponent(lop)
																		.addGroup(panelinfoLayout
																				.createSequentialGroup()
																				.addComponent(gioitinh,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(0, 0, Short.MAX_VALUE)))))
												.addGap(124, 124, 124)));
		panelinfoLayout.setVerticalGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(panelinfoLayout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1).addComponent(jLabel8)
								.addComponent(masv, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(diachi, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(24, 24, 24)
						.addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5).addComponent(jLabel9).addComponent(tensv,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(dienthoai, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(33, 33, 33)
						.addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6).addComponent(jLabel10)
								.addComponent(ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(34, 34, 34)
						.addGroup(panelinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel7).addComponent(jLabel11).addComponent(noisinh,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(lop, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(25, Short.MAX_VALUE)));

		jLabel12.setBackground(new java.awt.Color(102, 255, 102));
		jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(255, 51, 51));
		jLabel12.setText("                                             Quản Lý Sinh Viên");
		jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 204), 5, true));

		btnAdd.setText("Thêm");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});
		btnQL.setText("QL");
		btnQL.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnQLActionPerformed(e);
				
			}
		});

		btnDel.setText("Xóa");
		btnDel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDelActionPerformed(evt);
			}
		});

		btnEdit.setText("Sửa");
		btnEdit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnEditActionPerformed(evt);
			}
		});

		btnCancel.setText("RESET");
		btnCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnCancelActionPerformed(evt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		btnExit.setText("Thoát");
		btnExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExitActionPerformed(evt);
			}
		});

		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sach sinh vien",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N

		// .setModel(new j);
		jTable1.setColumnSelectionAllowed(true);

		jScrollPane2.setViewportView(jTable1 = new JTable(new Configtable(this.list)));
		jTable1.addFocusListener(this);
		jTable1.addMouseListener(this);

		// jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jScrollPane2));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
						.addContainerGap()));

		btnFind.setText("Tìm Kiếm");
		btnFind.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnFindActionPerformed(evt);
			}
		});
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(panelinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(127, 127, 127)
						.addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(44, 44, 44)
						.addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(50, 50, 50)
						.addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(45, 45, 45)
						.addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(33, 33, 33)
						.addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(44, 44, 44)
						.addComponent(btnQL, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btnFind).addGap(106, 106, 106)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(btnFind)
								.addGroup(layout.createSequentialGroup().addComponent(timkiem).addGap(2, 2, 2)))
						.addComponent(panelinfo, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnAdd).addComponent(btnDel).addComponent(btnEdit).addComponent(btnCancel)
								.addComponent(btnExit)).addComponent(btnQL)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		panelinfo.getAccessibleContext().setAccessibleName("");
		checkPermit();
		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void masvActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_masvActionPerformed

	}// GEN-LAST:event_masvActionPerformed

	private void tensvActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_tensvActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_tensvActionPerformed

	private void ngaysinhActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ngaysinhActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_ngaysinhActionPerformed

	private void gioitinhActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_gioitinhActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_gioitinhActionPerformed

	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
		final String P_MASV = "^[s][v]\\d{3}$";
		final String P_NGAYSINH = "^\\d{4}[-]\\d{2}[-]\\d{2}$";
		final String P_SDT = "((^\\+84|0)[9]\\d{8})|((^\\+84|0)[1]\\d{9})$";
		final String P_LOP = "^[L]\\d{3}$";
		boolean error = false;
		Sinhvien sv = new Sinhvien();
		sv.setMaSV(this.masv.getText().trim());
		sv.setHoten(this.tensv.getText());
		sv.setNgaysinh(this.ngaysinh.getText().trim());
		sv.setNoisinh(this.noisinh.getText());
		sv.setDiachi(this.diachi.getText());
		sv.setSdt(this.dienthoai.getText().trim());
		sv.setGioitinh((String) this.gioitinh.getSelectedItem());
		sv.setMalop(this.lop.getText().trim());
		for (int i = 0; i < this.list.size(); i++)
			if (this.list.get(i).getMaSV().equalsIgnoreCase(sv.getMaSV()))
				error = true;

		if (!Pattern.compile(P_MASV).matcher(sv.getMaSV()).find()) {
			JOptionPane.showMessageDialog(null, "Mã sinh viên có dạng svXXX (X là số)", "Lỗi",
					JOptionPane.ERROR_MESSAGE);
		} else if (sv.getHoten().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Tên không được bõ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (!Pattern.compile(P_NGAYSINH).matcher(sv.getNgaysinh()).find()) {
			JOptionPane.showMessageDialog(null, "Ngày sinh có định dạng yyyy-mm-dd", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (sv.getNoisinh().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nơi sinh không được trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (sv.getDiachi().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Địa chỉ là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (!Pattern.compile(P_SDT).matcher(sv.getSdt()).find()) {
			JOptionPane.showMessageDialog(null, "Số điện thoại không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (!(Pattern.compile(P_LOP).matcher(sv.getMalop()).find())) {
			JOptionPane.showMessageDialog(null, "Mã lớp có dạng LXXX (X là số)", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (error) {
			JOptionPane.showMessageDialog(null, "Mã số sinh viên đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else {
			try {
				this.list.add(sv);

				DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				Date ns = (Date) df.parse(sv.getNgaysinh());

				if (clControl.themsinhvien(sv.getMaSV(), sv.getHoten(), sv.getDiachi(), sv.getSdt(), ns,
						sv.getGioitinh(), sv.getNoisinh(), sv.getMalop())) {
					JOptionPane.showMessageDialog(null, "Thêm thành công");
					this.masv.setText(null);
					this.ngaysinh.setText(null);
					this.noisinh.setText(null);
					this.tensv.setText(null);
					this.timkiem.setText(null);
					this.dienthoai.setText(null);
					this.gioitinh.setSelectedIndex(0);
					this.diachi.setText(null);
					this.lop.setText(null);
					jTable1.setModel(new Configtable(this.list));
				} else
					JOptionPane.showMessageDialog(null, "Thêm không thành công");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ngày sinh không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}

		}

	}// GEN-LAST:event_btnAddActionPerformed

	private void lopActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_lopActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_lopActionPerformed

	private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDelActionPerformed
		try {
			int row = jTable1.getSelectedRow();

			String name = (String) jTable1.getValueAt(row, 1);
			int dialogchose = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa Sinh Viên: " + name, "Confirm",
					JOptionPane.OK_CANCEL_OPTION);
			if (dialogchose == JOptionPane.OK_OPTION) {

				String temp = (String) jTable1.getValueAt(row, 0);
				for (int i = 0; i < this.list.size(); i++) {
					if (this.list.get(i).getMaSV().equalsIgnoreCase(temp)) {
						this.list.remove(i);
						if ((clControl.xoasinhvien(temp))) {
							JOptionPane.showMessageDialog(null, "Xóa thành công!", "Thông báo",
									JOptionPane.INFORMATION_MESSAGE);
						}
					}
				}
				jTable1.setModel(new Configtable(this.list));
				this.masv.setText(null);
				this.ngaysinh.setText(null);
				this.noisinh.setText(null);
				this.tensv.setText(null);
				this.timkiem.setText(null);
				this.dienthoai.setText(null);
				this.gioitinh.setSelectedIndex(0);
				this.diachi.setText(null);
				this.lop.setText(null);

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Không có Sinh Viên nào được chọn", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}// GEN-LAST:event_btnDelActionPerformed

	private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditActionPerformed
		final String P_MASV = "^[s][v]\\d{3}$";
		final String P_NGAYSINH = "^\\d{4}[-]\\d{2}[-]\\d{2}$";
		final String P_SDT = "((^\\+84|0)[9]\\d{8})|((^\\+84|0)[1]\\d{9})$";
		final String P_LOP = "^[L]\\d{3}$";
		boolean error = false;
		Sinhvien sv = new Sinhvien();
		sv.setMaSV(this.masv.getText().trim());
		sv.setHoten(this.tensv.getText());
		sv.setNgaysinh(this.ngaysinh.getText().trim());
		sv.setNoisinh(this.noisinh.getText());
		sv.setDiachi(this.diachi.getText());
		sv.setSdt(this.dienthoai.getText().trim());
		sv.setGioitinh((String) this.gioitinh.getSelectedItem());
		sv.setMalop(this.lop.getText().trim());

		for (int i = 0; i < this.list.size(); i++)
			if (this.list.get(i).getMaSV().equalsIgnoreCase(sv.getMaSV()))
				error = true;

		if (!Pattern.compile(P_MASV).matcher(sv.getMaSV()).find()) {
			JOptionPane.showMessageDialog(null, "Mã sinh viên có dạng svXXX (X là số)", "Lỗi",
					JOptionPane.ERROR_MESSAGE);
		} else if (sv.getHoten().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Tên không được bõ trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (!Pattern.compile(P_NGAYSINH).matcher(sv.getNgaysinh()).find()) {
			JOptionPane.showMessageDialog(null, "Ngày sinh có định dạng yyyy-mm-dd", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (sv.getNoisinh().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nơi sinh không được trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (sv.getDiachi().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Địa chỉ là bắt buộc", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (!Pattern.compile(P_SDT).matcher(sv.getSdt()).find()) {
			JOptionPane.showMessageDialog(null, "Số điện thoại không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (!(Pattern.compile(P_LOP).matcher(sv.getMalop()).find())) {
			JOptionPane.showMessageDialog(null, "Mã lớp có dạng LXXX (X là số)", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (!error) {
			JOptionPane.showMessageDialog(null, "Mã số sinh viên không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else {
			try {

				int confirm = 0;
				confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn sửa thông tin sinh viên:" + sv.getMaSV(),
						"Thông báo", JOptionPane.YES_NO_OPTION);
				System.out.println(confirm);
				if (confirm == 0) {
					for (int i = 0; i < this.list.size(); i++) {
						if (this.list.get(i).getMaSV() == sv.getMaSV()) {
							this.list.remove(i);
							this.list.add(sv);
							break;
						}

					}

					DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					Date ns = (Date) df.parse(sv.getNgaysinh());

					if (clControl.suattsv(sv.getMaSV(), sv.getHoten(), sv.getDiachi(), sv.getSdt(), ns,
							sv.getGioitinh(), sv.getNoisinh(), sv.getMalop())) {
						JOptionPane.showMessageDialog(null, "Cập nhật thành công");
						this.masv.setText(null);
						this.ngaysinh.setText(null);
						this.noisinh.setText(null);
						this.tensv.setText(null);
						this.timkiem.setText(null);
						this.dienthoai.setText(null);
						this.gioitinh.setSelectedIndex(0);
						this.diachi.setText(null);
						this.lop.setText(null);
						String str = clControl.xuatdssv();

						org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
						JSONObject obj = (JSONObject) parser.parse(str);
						JSONArray arr = new JSONArray();
						arr = (JSONArray) obj.get("lst");
						this.list.clear();
						JSONObject obj_ = new JSONObject();
						for (int i = 0; i < arr.size(); i++) {
							obj_ = (JSONObject) arr.get(i);
							Sinhvien sv1 = new Sinhvien(obj_.get("maSV").toString(), obj_.get("hoten").toString(),
									obj_.get("ngaysinh").toString(), obj_.get("diachi").toString(),
									obj_.get("sdt").toString(), obj_.get("gioitinh").toString(),
									obj_.get("noisinh").toString(), obj_.get("malop").toString());
							this.list.add(sv1);
						}
						jTable1.setModel(new Configtable(this.list));
					} else
						JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ngày sinh không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}

		}

	}// GEN-LAST:event_btnEditActionPerformed

	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {// GEN-FIRST:event_btnCancelActionPerformed
		this.list.clear();
		String str = clControl.xuatdssv();

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
			this.list.add(sv);
		}

		this.masv.setText(null);
		this.ngaysinh.setText(null);
		this.noisinh.setText(null);
		this.tensv.setText(null);
		this.timkiem.setText(null);
		this.dienthoai.setText(null);
		this.gioitinh.setSelectedIndex(0);
		this.diachi.setText(null);
		this.lop.setText(null);
		jTable1.setModel(new Configtable(this.list));

	}// GEN-LAST:event_btnCancelActionPerformed

	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
		super.setVisible(true);
		this.dispose();
		

	}// GEN-LAST:event_btnExitActionPerformed

	// Nut tim kiem
	private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFindActionPerformed

		jTable1.removeFocusListener(this);
		jTable1.removeMouseListener(this);
		String msv = timkiem.getText();
		ArrayList<Sinhvien> lst = new ArrayList<>();

		if (!msv.isEmpty()) {
			jTable1.addMouseListener(this);
			org.json.simple.parser.JSONParser prs = new org.json.simple.parser.JSONParser();

			try {
				String temp = clControl.timsv(msv);

				Object sv1 = prs.parse(temp);

				JSONObject sv = (JSONObject) sv1;
				Sinhvien svien = new Sinhvien();

				if (sv != null) {

					svien.setMaSV(sv.get("maSV").toString());
					svien.setHoten(sv.get("hoten").toString());
					svien.setGioitinh(sv.get("gioitinh").toString());
					svien.setNgaysinh(sv.get("ngaysinh").toString());
					svien.setNoisinh(sv.get("noisinh").toString());
					svien.setDiachi(sv.get("diachi").toString());
					svien.setSdt(sv.get("sdt").toString());
					svien.setMalop(sv.get("malop").toString());

					lst.add(svien);

				}
				Configtable cf = new Configtable(lst);

				jTable1.setModel(cf);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "MSSV không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
		}

	}// GEN-LAST:event_btnFindActionPerformed

	private void btnQLActionPerformed(java.awt.event.ActionEvent evt) {
		
	}
	
	private void checkPermit(){
		if(permit.trim().equalsIgnoreCase("user")){
			this.btnAdd.setVisible(false);
			this.btnDel.setVisible(false);
			this.btnEdit.setVisible(false);
			this.btnQL.setVisible(false);
			this.panelinfo.setVisible(false);
		}else if(permit.trim().equalsIgnoreCase("manager")){
			this.btnQL.setVisible(false);
		}
	}
// 	public static void main(String args[]) {
//
//	}

	@Override
	public void focusGained(FocusEvent arg0) {

	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getClickCount() >= 2) {
			int row = jTable1.getSelectedRow();
			Sinhvien sv;
			String masv = (String) jTable1.getValueAt(row, 0);
			for (int i = 0; i < this.list.size(); i++)
				if (this.list.get(i).getMaSV().equalsIgnoreCase(masv)) {
					sv = new Sinhvien(this.list.get(i).getMaSV(), this.list.get(i).getHoten(),
							this.list.get(i).getNgaysinh(), this.list.get(i).getDiachi(), this.list.get(i).getSdt(),
							this.list.get(i).getGioitinh(), this.list.get(i).getNoisinh(), this.list.get(i).getMalop());
					this.masv.setText(sv.getMaSV());
					this.tensv.setText(sv.getHoten());
					this.ngaysinh.setText(sv.getNgaysinh().toString());
					this.noisinh.setText(sv.getNoisinh());
					this.diachi.setText(sv.getDiachi());
					this.dienthoai.setText(sv.getSdt());
					this.gioitinh.setSelectedIndex((sv.getGioitinh() == "nam") ? 0 : 1);
					this.lop.setText(sv.getMalop());
				}

		}

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// End of variables declaration//GEN-END:variables
}
