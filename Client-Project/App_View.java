package sm_app.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class App_View extends JFrame implements ActionListener, MouseListener {
	/*
	 * 
	 * TODO KHAI BAO
	 * 
	 */
	private JButton btn_them, btn_refresh, btn_xoa, btn_sua, btn_thoat, btn_Tim, btn_QL;

	private JTextField tf_diachi, tf_dienthoai, tf_mssv, tf_ngaysinh, tf_noisinh, tf_tensv, tf_timkiem;

	private JComboBox<String> cbb_gioitinh, cbb_lop;

	private JLabel lb_masv, lb_gioitinh, lb_lop, lb_title, lb_tensv, lb_ngaysinh, lb_noisinh, lb_diachi, lb_dienthoai;
	private JPanel pn_dssv, pn_ttsv;
	private JScrollPane scroll;
	private JTable table;
	private ArrayList<Sinhvien> lst;
	private String permit;
	private Client_Controller control;

	/*
	 * 
	 * TODO CONSTRUCTOR
	 * 
	 */
	public App_View( String permit) {
		this.permit = permit;
		this.lst = new ArrayList<Sinhvien>();
		initComponents();
		setTitle(permit);
		setLocation(300, 50);
		if(permit.trim().equalsIgnoreCase("user")){
			setSize(890, 510);
		}
		else if(permit.trim().equalsIgnoreCase("manager")){
			setSize(890, 650);
		}else if(permit.trim().equalsIgnoreCase("admin")){
			setSize(890, 650);
		}
	
	
	}

	private void initComponents() {
		control = new Client_Controller();
		pn_ttsv = new JPanel();
		lb_masv = new JLabel();
		lb_tensv = new JLabel();
		lb_ngaysinh = new JLabel();
		lb_noisinh = new JLabel();
		lb_diachi = new JLabel();
		lb_dienthoai = new JLabel();
		lb_gioitinh = new JLabel();
		lb_lop = new JLabel();
		tf_tensv = new javax.swing.JTextField();
		tf_mssv = new javax.swing.JTextField();
		tf_ngaysinh = new javax.swing.JTextField();
		tf_noisinh = new javax.swing.JTextField();
		tf_diachi = new javax.swing.JTextField();
		tf_dienthoai = new javax.swing.JTextField();
		cbb_gioitinh = new JComboBox<>();
		cbb_lop = new JComboBox<>();
		lb_title = new JLabel();
		btn_them = new JButton();
		btn_xoa = new JButton();
		btn_sua = new JButton();
		btn_refresh = new JButton();
		btn_thoat = new JButton();
		pn_dssv = new JPanel();
		scroll = new JScrollPane();
		table = new JTable();
		tf_timkiem = new JTextField();
		btn_Tim = new JButton();
		btn_QL = new JButton();
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		pn_ttsv.setBorder(BorderFactory.createTitledBorder(null, "Thông tin sinh viên",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N
		pn_ttsv.setForeground(new java.awt.Color(255, 51, 51));

		lb_masv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		lb_masv.setForeground(new java.awt.Color(51, 51, 255));
		lb_masv.setText("MÃ SV:");

		lb_tensv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		lb_tensv.setForeground(new java.awt.Color(51, 51, 255));
		lb_tensv.setText("TÊN SV:");

		lb_ngaysinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		lb_ngaysinh.setForeground(new java.awt.Color(51, 51, 255));
		lb_ngaysinh.setText("NGÀY SINH:");

		lb_noisinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		lb_noisinh.setForeground(new java.awt.Color(51, 51, 255));
		lb_noisinh.setText("NƠI SINH:");

		lb_diachi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		lb_diachi.setForeground(new java.awt.Color(51, 51, 255));
		lb_diachi.setText("ĐỊA CHỈ:");

		lb_dienthoai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		lb_dienthoai.setForeground(new java.awt.Color(51, 51, 255));
		lb_dienthoai.setText("ĐIỆN THOẠI:");

		lb_gioitinh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		lb_gioitinh.setForeground(new java.awt.Color(51, 51, 255));
		lb_gioitinh.setText("GIỚI TÍNH:");

		lb_lop.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
		lb_lop.setForeground(new java.awt.Color(51, 51, 255));
		lb_lop.setText("LỚP:");

		javax.swing.GroupLayout pn_ttsvLayout = new javax.swing.GroupLayout(pn_ttsv);
		pn_ttsv.setLayout(pn_ttsvLayout);
		pn_ttsvLayout
				.setHorizontalGroup(
						pn_ttsvLayout
								.createParallelGroup(
										javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(
										pn_ttsvLayout.createSequentialGroup().addGap(28, 28, 28)
												.addGroup(
														pn_ttsvLayout
																.createParallelGroup(
																		javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(lb_masv).addComponent(lb_tensv)
																.addComponent(lb_ngaysinh).addComponent(lb_noisinh))
												.addGap(27, 27, 27)
												.addGroup(pn_ttsvLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(tf_tensv).addComponent(tf_mssv)
														.addComponent(tf_ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE,
																207, Short.MAX_VALUE)
														.addComponent(tf_noisinh))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
														139, Short.MAX_VALUE)
												.addGroup(pn_ttsvLayout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(pn_ttsvLayout.createSequentialGroup()
																.addComponent(lb_diachi).addGap(39, 39, 39)
																.addComponent(tf_diachi,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 211,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(pn_ttsvLayout.createSequentialGroup()
																.addGroup(pn_ttsvLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(lb_dienthoai)
																		.addComponent(lb_gioitinh).addComponent(lb_lop))
																.addGap(18, 18, 18)
																.addGroup(pn_ttsvLayout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(tf_dienthoai)
																		.addComponent(cbb_lop)
																		.addGroup(pn_ttsvLayout.createSequentialGroup()
																				.addComponent(cbb_gioitinh,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addGap(0, 0, Short.MAX_VALUE)))))
												.addGap(124, 124, 124)));
		pn_ttsvLayout.setVerticalGroup(pn_ttsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(pn_ttsvLayout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(pn_ttsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_masv).addComponent(lb_diachi)
								.addComponent(tf_mssv, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tf_diachi, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(24, 24, 24)
						.addGroup(pn_ttsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_tensv).addComponent(lb_dienthoai)
								.addComponent(tf_tensv, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(tf_dienthoai, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(33, 33, 33)
						.addGroup(pn_ttsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_ngaysinh).addComponent(lb_gioitinh)
								.addComponent(tf_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cbb_gioitinh, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(34, 34, 34)
						.addGroup(pn_ttsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lb_noisinh).addComponent(lb_lop)
								.addComponent(tf_noisinh, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cbb_lop, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(25, Short.MAX_VALUE)));

		lb_title.setBackground(new java.awt.Color(102, 255, 102));
		lb_title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
		lb_title.setForeground(new java.awt.Color(255, 51, 51));
		lb_title.setText("                                           QUẢN LÝ SINH VIÊN");
		lb_title.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 204), 5, true));

		btn_them.setText("Thêm");
		btn_them.addActionListener(this);
		btn_xoa.setText("Xóa");
		btn_xoa.addActionListener(this);
		btn_sua.setText("Sửa");
		btn_sua.addActionListener(this);
		btn_refresh.setText("Refresh");
		btn_refresh.addActionListener(this);
		btn_thoat.setText("Thoát");
		btn_thoat.addActionListener(this);

		cbb_gioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam\t", "Nữ" }));

		ArrayList<String> loplst = control.xuatlop();
		String s[] = new String[loplst.size()];

		for (int i = 0; i < loplst.size(); i++) {
			s[i] = loplst.get(i);
		}
		cbb_lop.setModel(new javax.swing.DefaultComboBoxModel<>(s));

		btn_QL.setText("QL User");
		btn_QL.addActionListener(this);
		pn_dssv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách sinh viên",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 255))); // NOI18N

		table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null },
						{ null, null, null, null, null, null, null, null } },
				new String[] { "Mã SV", "Họ Tên", "Giới Tính", "Ngày Sinh", "Nơi Sinh", "Địa Chỉ", "Số Điện Thoại",
						"Lớp" }));
		table.setColumnSelectionAllowed(true);
		scroll.setViewportView(table);
		table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

		btn_QL.setVisible(false);
		
		javax.swing.GroupLayout layout_pn1 = new javax.swing.GroupLayout(pn_dssv);
		pn_dssv.setLayout(layout_pn1);
		layout_pn1.setHorizontalGroup(
				layout_pn1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(scroll));
		layout_pn1.setVerticalGroup(layout_pn1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout_pn1.createSequentialGroup().addContainerGap()
						.addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
						.addContainerGap()));

		btn_Tim.setText("Tìm kiếm");
		btn_Tim.addActionListener(this);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pn_ttsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(lb_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addGroup(layout.createSequentialGroup().addGap(127, 127, 127)
						.addComponent(btn_them, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(44, 44, 44)
						.addComponent(btn_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(50, 50, 50)
						.addComponent(btn_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(45, 45, 45)
						.addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 76,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(33, 33, 33)
						.addComponent(btn_thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(33, 33, 33)
						.addComponent(btn_QL, javax.swing.GroupLayout.PREFERRED_SIZE, 77,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

				.addGroup(layout.createSequentialGroup()
						.addComponent(pn_dssv, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(tf_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 173,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(btn_Tim).addGap(106, 106, 106)));
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(lb_title, javax.swing.GroupLayout.PREFERRED_SIZE, 79,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(btn_Tim)
										.addGroup(layout.createSequentialGroup().addComponent(tf_timkiem).addGap(2, 2,
												2)))
								.addComponent(pn_ttsv, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btn_them).addComponent(btn_xoa).addComponent(btn_sua)
										.addComponent(btn_refresh).addComponent(btn_thoat).addComponent(btn_QL))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(pn_dssv, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pn_ttsv.getAccessibleContext().setAccessibleName("");
		table.addMouseListener(this);
		load_table();
		checkPermit();
		pack();
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(App_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(App_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(App_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(App_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				String s = "admin";
				new App_View( s).setVisible(true);
			}
		});
	}
	private void checkPermit() {
		if (permit.trim().equalsIgnoreCase("user")) {
			this.btn_them.setVisible(false);
			this.btn_xoa.setVisible(false);
			this.btn_sua.setVisible(false);
			this.btn_QL.setVisible(false);
			this.pn_ttsv.setVisible(false);
		} else if (permit.trim().equalsIgnoreCase("manager")) {
			this.btn_QL.setVisible(false);
		}
	}
	public void load_table() {

		try {
			ArrayList<Sinhvien> temp = this.control.xuatdssv();
			this.lst.clear();
			this.lst = temp;

			table.setModel(new Configtable(this.lst));
			cleardataField();

		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Không thể cập nhật\nLỗi:\t" + e.toString(), "Lỗi",
					JOptionPane.ERROR_MESSAGE);

		}
	}

	public void cleardataField() {
		this.tf_diachi.setText(null);
		this.tf_dienthoai.setText(null);
		this.tf_mssv.setText(null);
		this.tf_ngaysinh.setText(null);
		this.tf_noisinh.setText(null);
		this.tf_tensv.setText(null);
		this.tf_timkiem.setText(null);
	}
	/*
	 * 
	 * TODO XU LY NUT TIM
	 * 
	 */
	public void timBtnAction() {

		String msv = tf_timkiem.getText();
		ArrayList<Sinhvien> lst = new ArrayList<Sinhvien>();

		if (!msv.isEmpty()) {
			org.json.simple.parser.JSONParser prs = new org.json.simple.parser.JSONParser();

			try {
				String temp = control.timsv(msv);

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

				this.table.setModel(cf);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "MSSV không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	
	
	
	
	
/*
 * 
 * 	TODO XU LY NUT XOA
 * 
 */
	public void xoaBtnAction() {
		try {
			int row = table.getSelectedRow();

			String name = (String) table.getValueAt(row, 1);
			int dialogchose = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn xóa Sinh Viên: " + name, "Confirm",
					JOptionPane.OK_CANCEL_OPTION);
			if (dialogchose == JOptionPane.OK_OPTION) {

				String temp = (String) table.getValueAt(row, 0);

				if ((control.xoasinhvien(temp))) {
					JOptionPane.showMessageDialog(null, "Xóa thành công!", "Thông báo",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
			this.load_table();
			this.cleardataField();

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Không có Sinh Viên nào được chọn", "Lỗi", JOptionPane.ERROR_MESSAGE);
		}
	}

	/*
	 * 
	 * TODO XU LY NUT SUA
	 * 
	 */
	public void suaBtnAction() {

		final String P_MASV = "^[s][v]\\d{3}$";
		final String P_NGAYSINH = "^\\d{2}[/]\\d{2}[/]\\d{4}$";
		final String P_SDT = "((^\\+84|0)[9]\\d{8})|((^\\+84|0)[1]\\d{9})$";
		final String P_LOP = "^[L]\\d{3}$";
		boolean error = false;
		Sinhvien sv = new Sinhvien();
		sv.setMaSV(this.tf_mssv.getText().trim());
		sv.setHoten(this.tf_tensv.getText());
		sv.setNgaysinh(this.tf_ngaysinh.getText().trim());
		sv.setNoisinh(this.tf_noisinh.getText());
		sv.setDiachi(this.tf_diachi.getText());
		sv.setSdt(this.tf_dienthoai.getText().trim());
		sv.setGioitinh((String) this.cbb_gioitinh.getSelectedItem());
		sv.setMalop((String) this.cbb_lop.getSelectedItem());

		for (int i = 0; i < this.lst.size(); i++)
			if (this.lst.get(i).getMaSV().trim().equalsIgnoreCase(sv.getMaSV()))
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
		} else if (!(Pattern.compile(P_LOP).matcher(sv.getMalop().trim()).find())) {
			JOptionPane.showMessageDialog(null, "Mã lớp có dạng LXXX (X là số)", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else if (!error) {
			JOptionPane.showMessageDialog(null, "Mã số sinh viên không tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
		} else {
			try {

				int confirm = 0;
				confirm = JOptionPane.showConfirmDialog(this,
						"Bạn có chắc muốn sửa thông tin sinh viên:" + sv.getMaSV(), "Thông báo",
						JOptionPane.YES_NO_OPTION);
				System.out.println(confirm);
				if (confirm == 0) {
					if (control.suattsv(sv.getMaSV(), sv.getHoten(), sv.getDiachi(), sv.getSdt(), sv.getNgaysinh(),
							sv.getGioitinh(), sv.getNoisinh(), sv.getMalop())) {
						JOptionPane.showMessageDialog(null, "Cập nhật thành công");
						load_table();
						cleardataField();
					} else
						JOptionPane.showMessageDialog(null, "Cập nhật không thành công");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ngày sinh không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
			}

		}

	}

	/*
	 * 
	 * TODO Xử lý nút thêm
	 * 
	 */
	public void themBtnAction() {
		int check;
		check = JOptionPane.showConfirmDialog(null,
				"Bạn có chắc muốn thêm sinh viên: " + this.tf_tensv.getText().toString(), "Confirm",
				JOptionPane.YES_NO_OPTION);
		if (check == JOptionPane.YES_OPTION) {
			final String P_MASV = "^[s][v]\\d{3}$";
			final String P_NGAYSINH = "^\\d{2}[/]\\d{2}[/]\\d{4}$";
			final String P_SDT = "((^\\+84|0)[9]\\d{8})|((^\\+84|0)[1]\\d{9})$";
			final String P_LOP = "^[L]\\d{3}$";
			boolean error = false;
			Sinhvien sv = new Sinhvien();
			sv.setMaSV(this.tf_mssv.getText().trim());
			sv.setHoten(this.tf_tensv.getText());
			sv.setNgaysinh(this.tf_ngaysinh.getText().trim());
			sv.setNoisinh(this.tf_noisinh.getText());
			sv.setDiachi(this.tf_diachi.getText());
			sv.setSdt(this.tf_dienthoai.getText().trim());
			sv.setGioitinh((String) this.cbb_gioitinh.getSelectedItem());
			sv.setMalop((String) this.cbb_lop.getSelectedItem());
			for (int i = 0; i < this.lst.size(); i++)
				if (this.lst.get(i).getMaSV().equalsIgnoreCase(sv.getMaSV()))
					error = true;
			if (this.tf_mssv.getText().isEmpty() || this.tf_diachi.getText().isEmpty()
					|| this.tf_dienthoai.getText().isEmpty() || this.tf_ngaysinh.getText().isEmpty()
					|| this.tf_noisinh.getText().isEmpty() || this.tf_tensv.getText().isEmpty())
				JOptionPane.showMessageDialog(null, "Các thông tin là bắt buộc không để trống", "Lỗi",
						JOptionPane.ERROR_MESSAGE);
			else if (!Pattern.compile(P_MASV).matcher(sv.getMaSV()).find()) {
				JOptionPane.showMessageDialog(null, "Mã sinh viên có dạng svXXX (X là số)", "Lỗi",
						JOptionPane.ERROR_MESSAGE);
			} else if (!Pattern.compile(P_NGAYSINH).matcher(sv.getNgaysinh()).find()) {
				JOptionPane.showMessageDialog(null, "Ngày sinh có định dạng dd/mm/yyyy", "Lỗi",
						JOptionPane.ERROR_MESSAGE);
			} else if (!Pattern.compile(P_SDT).matcher(sv.getSdt()).find()) {
				JOptionPane.showMessageDialog(null, "Số điện thoại không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
			} else if (!(Pattern.compile(P_LOP).matcher(sv.getMalop().trim()).find())) {
				JOptionPane.showMessageDialog(null, "Mã lớp có dạng LXXX (X là số)", "Lỗi", JOptionPane.ERROR_MESSAGE);
			} else if (error) {
				JOptionPane.showMessageDialog(null, "Mã số sinh viên đã tồn tại", "Lỗi", JOptionPane.ERROR_MESSAGE);
			} else {
				try {
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
					String dateInString = sv.getNgaysinh();
					Date date = formatter.parse(dateInString);
					formatter.format(date);

					if (control.themsinhvien(sv.getMaSV(), sv.getHoten(), sv.getDiachi(), sv.getSdt(), sv.getNgaysinh(),
							sv.getGioitinh(), sv.getNoisinh(), sv.getMalop())) {
						JOptionPane.showMessageDialog(null, "Thêm thành công");

						cleardataField();

						load_table();

					} else
						JOptionPane.showMessageDialog(null, "Thêm không thành công");

				} catch (java.text.ParseException e) {
					JOptionPane.showMessageDialog(null, "Ngày sinh không đúng", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}

	/*
	 * 
	 * TODO Bắt sự kiện nút nhấn
	 * 
	 */

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_Tim) {
			this.timBtnAction();
		} else if (e.getSource() == btn_them) {
			themBtnAction();
		} else if (e.getSource() == btn_xoa) {
			this.xoaBtnAction();
		} else if (e.getSource() == btn_sua) {
			this.suaBtnAction();
		} else if (e.getSource() == btn_refresh) {
			this.load_table();
		} else if (e.getSource() == btn_thoat) {
			super.setVisible(true);
			this.dispose();
		}
	}

	/*
	 * 
	 * TODO Xử lý sự kiện click
	 * 
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() >= 2) {
			int row = this.table.getSelectedRow();
			Sinhvien sv;
			String masv = (String) this.table.getValueAt(row, 0);
			for (int i = 0; i < this.lst.size(); i++)
				if (this.lst.get(i).getMaSV().equalsIgnoreCase(masv)) {
					sv = new Sinhvien(this.lst.get(i).getMaSV(), this.lst.get(i).getHoten(),
							this.lst.get(i).getNgaysinh(), this.lst.get(i).getDiachi(), this.lst.get(i).getSdt(),
							this.lst.get(i).getGioitinh(), this.lst.get(i).getNoisinh(), this.lst.get(i).getMalop());
					this.tf_mssv.setText(sv.getMaSV());
					this.tf_tensv.setText(sv.getHoten());
					this.tf_ngaysinh.setText(sv.getNgaysinh().toString());
					this.tf_noisinh.setText(sv.getNoisinh());
					this.tf_diachi.setText(sv.getDiachi());
					this.tf_dienthoai.setText(sv.getSdt());
					this.cbb_gioitinh.setSelectedItem(sv.getGioitinh());
					this.cbb_lop.setSelectedItem(sv.getMalop());

				}

		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
