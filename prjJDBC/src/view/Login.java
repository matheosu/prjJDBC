package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Login extends JFrame {
	@SuppressWarnings("unused")
	private JPanel contentPane;
	private JLabel lblTexto;
	private JLabel lblUsuario;
	private JLabel lblSenha;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;
	private JButton btnEntrar;
	
	public Login() {
		super("Login");
		setBounds(100, 50, 270, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		contentPane = new JPanel();
		getContentPane().setLayout(null);
		
		lblTexto = new JLabel("Bem Vindo ao Sistema!");
		lblTexto.setBounds(80,20,120,20);
		add(lblTexto);
		
		lblUsuario = new JLabel("Usuário: ");
		lblUsuario.setBounds(20,60,100,20);
		add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(80,60,150,20);
		txtUsuario.setToolTipText("Digite aqui o seu usuário");
		add(txtUsuario);
		
		lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(20,90,100,20);
		add(lblSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(80,90,100,20);
		txtSenha.setToolTipText("Digite aqui sua senha");
		add(txtSenha);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(80,120,150,20);
		add(btnEntrar);
				

	}
}
