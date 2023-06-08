package views;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import backend.Aluno;

public class AdmTelas {

	//static Aluno aluno1 = new Aluno();
	//static Professor professor1 = new Professor();
	
	public static void registrar_aluno () {
		
		//1° Criar componentes Classe Aluno(objetos)
		JLabel lbNomeAluno = new JLabel("Nome: ");
		JTextField txNomeAluno = new JTextField();
		
		JLabel lbCPFaluno = new JLabel("CPF: ");
		JTextField txCPFaluno = new JTextField();
		
		JLabel lbDataNascimentoAluno = new JLabel("Data de Nascimento: ");
		JTextField txDataNascimentoAluno = new JTextField();
		
		JLabel lbEnderecoAluno = new JLabel("Endereço: ");
		JTextField txEnderecoAluno = new JTextField();
		
		JLabel lbTelefoneAluno = new JLabel("Telefone: ");
		JTextField txTelefoneAluno = new JTextField();
		
		JLabel lbNomeResponsavel = new JLabel("Nome Responsavel: ");
		JTextField txNomeResponsavel = new JTextField();
		
		JLabel lbTelefoneResponsavel = new JLabel("Telefone Responsavel: ");
		JTextField txTelefoneResponsavel = new JTextField();
		
	//2° Crio conjunto de componentes
		Object[]cliente= {lbNomeAluno,txNomeAluno,
				lbCPFaluno,txCPFaluno,
				lbDataNascimentoAluno,txDataNascimentoAluno,
				lbEnderecoAluno,txEnderecoAluno,
				lbTelefoneAluno,txTelefoneAluno,
				lbNomeResponsavel,txNomeResponsavel,
				lbTelefoneResponsavel,txTelefoneResponsavel};
		
		//3° Criar uma janela
		Aluno aluno1 = new Aluno();
		do {
			JOptionPane.showMessageDialog(null, cliente, "Informe os dados do cliente",JOptionPane.OK_OPTION);
			
			//Leitura dos dados inseridos
			pessoa1.setNome(txNomeCliente.getText());
			pessoa1.setCpf(txCPFcliente.getText());
			pessoa1.setdataNascimento(txDataNascimento.getText());
			pessoa1.setEndereco(txEnderecoCliente.getText());
			pessoa1.setTelefone(txTelefoneCliente.getText());
			pessoa1.setCodigo(txCodigoCliente.getText());
			pessoa1.setRendaMensal(Float.parseFloat(txRendaMensalCliente.getText()));
			pessoa1.setEmpregado(txEmpregado.getText());
		
		}while(pessoa1==null);
}
}
