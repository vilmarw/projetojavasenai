package br.senai.sc.projetojava.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import java.awt.Component;
import java.awt.Toolkit;


@SuppressWarnings("serial")
public class TelaInicial extends JFrame {

	private JPanel contentPane;
	private JTextField cpNomeUsuario;
	private JLabel lblSenha;
	private JPasswordField cppasswordField;
	private JButton btnCancela;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\vilmar\\Desktop\\Nova pasta (8)\\burj_dubai.jpg"));
		setTitle("Login e senha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(Color.BLUE);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		final JLabel lblLogin = new JLabel("Nome de usu\u00E1rio");
		lblLogin.setForeground(new Color(255, 0, 0));
		lblLogin.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblLogin.setBackground(new Color(51, 51, 255));
		lblLogin.setBounds(68, 73, 96, 14);
		panel.add(lblLogin);

		cpNomeUsuario = new JTextField();
		cpNomeUsuario.setToolTipText("Digite seu email ou nome de us\u00FAario");
		cpNomeUsuario.setBounds(174, 70, 201, 20);
		panel.add(cpNomeUsuario);
		cpNomeUsuario.setColumns(10);

		lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(255, 0, 0));
		lblSenha.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblSenha.setBounds(115, 116, 49, 14);
		panel.add(lblSenha);

		cppasswordField = new JPasswordField();
		cppasswordField.setToolTipText("Digite sua senha com no minimo 6 dig\u00EDtos");
		cppasswordField.setBounds(174, 113, 201, 20);
		panel.add(cppasswordField);

		final JButton btnLogin = new JButton("Login");
		btnLogin.setToolTipText("Clique para fazer login");
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(verificar()== false) return;

				if(validarUsuario()== false) return;
				if(validarSenha()== false) return;
			}

		});
		btnLogin.setBounds(212, 218, 89, 23);
		panel.add(btnLogin);

		btnCancela = new JButton("Cancela");
		btnCancela.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCampos();
			}
		});
		btnCancela.setToolTipText("Clique para cancelar");
		btnCancela.setBounds(325, 218, 89, 23);
		panel.add(btnCancela);
	}

	public void limparCampos(){
		cpNomeUsuario.setText("");
		cppasswordField.setText("");
	}
	@SuppressWarnings("deprecation")
	public boolean verificar(){
		if(cpNomeUsuario.getText().equals("")){
			JOptionPane.showMessageDialog(this, 
					"Informe o seu nome de usuario", 
					"Erro", JOptionPane.ERROR_MESSAGE);
			cpNomeUsuario.requestFocus();
			return false;

		}
		if(cppasswordField.getText().equals("")){
			JOptionPane.showMessageDialog(this, 
					"Informe a senha", 
					"Erro", JOptionPane.ERROR_MESSAGE);
			cppasswordField.requestFocus();
			return false;
		}
		return true;
	}
	private boolean validarSenha(){
		if(cppasswordField.getText().equals("8989")){
			JOptionPane.showMessageDialog(null, "Bem vindo");
			cppasswordField.requestFocus();

		}else{
			JOptionPane.showMessageDialog(null, "senha incorreta");
			return false;
		}
		return true;
	}

	private boolean validarUsuario(){
		if(cpNomeUsuario.getText().equals("vilmar")){
			cpNomeUsuario.requestFocus();
		}else{
			JOptionPane.showMessageDialog(null, "Nome de usuario inválido");
			return false;
		}
		return true;
	}

}