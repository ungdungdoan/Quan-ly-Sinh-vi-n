package sam_app.com;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.ConnectException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.json.simple.parser.ParseException;

public class App extends JFrame implements WindowListener {
	static App login_View;

	public static void main(String[] args) {
		login_View =  new App();
		login_View.setLocation(700, 100);
		login_View.setSize(400, 300);
		login_View.setVisible(true);
		login_View.setResizable(false);
		login_View.setDefaultCloseOperation(EXIT_ON_CLOSE);
		

		}

	public App() {
		super("Đăng nhập");
		panel = new JPanel();
		
		panel.setLayout(null);
		
		userLabel = new JLabel("TÊN ĐĂNG NHẬP:");
		// userLabel.setBounds(20, 10, 80, 25);
		userLabel.setBounds(20, 10, 150, 25);
		userLabel.setBackground(Color.RED);
		panel.add(userLabel);

		userText = new JTextField(20);
		userText.setBounds(150, 10, 160, 25);
		panel.add(userText);

		passwordLabel = new JLabel("MẬT KHẨU");
		passwordLabel.setBounds(20, 40, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField(20);
		passwordText.setBounds(150, 40, 160, 25);
		panel.add(passwordText);

		loginButton = new JButton("OK");
		loginButton.setBounds(150, 80, 80, 25);
		panel.add(loginButton);
		final String str;
		Client_Controller clcontroller = new Client_Controller();
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String s;
				s = clcontroller.dangnhap(userText.getText(), passwordText.getText());

				if (userText.getText().isEmpty())
					JOptionPane.showMessageDialog(null, "Nhập tên đăng nhập");
				else if (passwordText.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Nhập mật khẩu");
				} else if (s == null)
					JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không đúng");
				else {
					// dang nhap thanh cong
					dangnhapthanhcong(s);
				}

			}

		});
		add(panel);

	}
	public void dangnhapthanhcong(String s){
		ArrayList<Sinhvien> arr = new ArrayList<>();
		try {
			App_View apv = new App_View(s, arr);
			//apv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			apv.setVisible(true);
			apv.setLocationRelativeTo(null);
			apv.setResizable(false);
			this.setVisible(false);
			apv.addWindowListener(this);
			apv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Lỗi","Lỗi",JOptionPane.ERROR_MESSAGE);
		}
	}

	
	private JPanel panel;
	private JLabel userLabel;
	private JTextField userText;
	private JLabel passwordLabel;
	private JPasswordField passwordText;
	private JButton loginButton;
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		//if( == e.getSource())
		login_View.setVisible(true);
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	
}