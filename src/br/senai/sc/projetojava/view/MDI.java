package br.senai.sc.projetojava.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;

public class MDI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDI frame = new MDI();
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
	public MDI() {
		setForeground(Color.BLUE);
		setTitle("MDI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu cpCadastro = new JMenu("Cadastro");
		cpCadastro.setForeground(Color.BLUE);
		menuBar.add(cpCadastro);
		
		JMenuItem cpCliente = new JMenuItem("Cliente");
		cpCliente.setForeground(Color.BLACK);
		cpCadastro.add(cpCliente);
		
		JMenuItem cpFornecedor = new JMenuItem("Fornecedor");
		cpCadastro.add(cpFornecedor);
		
		JMenuItem cpProduto = new JMenuItem("Produto");
		cpCadastro.add(cpProduto);
		
		JMenu mnMovimentao = new JMenu("Movimenta\u00E7\u00E3o");
		mnMovimentao.setForeground(Color.BLUE);
		menuBar.add(mnMovimentao);
		
		JMenuItem mntmPeriodoDeVenda = new JMenuItem("Periodo de venda");
		mnMovimentao.add(mntmPeriodoDeVenda);
		
		JMenuItem cpPeriodoDeCompra = new JMenuItem("Periodo de compra");
		mnMovimentao.add(cpPeriodoDeCompra);
		
		JMenu mnEstoque = new JMenu("Estoque");
		mnEstoque.setForeground(Color.BLUE);
		menuBar.add(mnEstoque);
		
		JMenuItem cpConsulta = new JMenuItem("Consulta");
		mnEstoque.add(cpConsulta);
		
		JMenuItem cpRelatrio = new JMenuItem("Relat\u00F3rio");
		mnEstoque.add(cpRelatrio);
		
		JMenu mnUtilitrios = new JMenu("Utilit\u00E1rios");
		mnUtilitrios.setForeground(Color.BLUE);
		menuBar.add(mnUtilitrios);
		
		JMenuItem cpUsuarios = new JMenuItem("Usu\u00E1rios");
		mnUtilitrios.add(cpUsuarios);
		
		JMenuItem cpAlterarSenha = new JMenuItem("Alterar senha");
		mnUtilitrios.add(cpAlterarSenha);
		
		JMenu mnSair = new JMenu("Sair");
		mnSair.setForeground(Color.BLUE);
		menuBar.add(mnSair);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
	}

}
