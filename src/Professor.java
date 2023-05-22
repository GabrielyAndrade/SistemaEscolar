import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;
/**Criação da classe professor onde iremos inserir os dados. <br>*/
public class Professor {
	/**Aqui iremos inserir os seguintes dados do professor. <br> Nome do professor.*/
	private String nome;
	/**<bSenha do professor*/
	private String senha;
	private String cpf;
	private String disciplinas;
	private Calendar dataNascimento;
	private String endereco;
	private String telefone;
	private float rendaMensal;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(!nome.isEmpty()) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, "Nome inválido!");
		}
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		/*if(senha.matches("?=^.{8,}$)(?=.*\\d)(?=.*[!@#$%^&*]+)(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$") {
		 * this.senha = senha;
		 * }*/
		this.senha = senha;
	}
	
	public boolean checkSenha(String senha) {
		if(senha.equals(this.senha)) {
			this.senha = senha;
			return true;
		}
		return false;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
		}
	}
	
	public String getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public String getDataNascimento() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "" + sdf.format(dataNascimento.getTime());
	}
	
	public void setDataNascimento(String dataNascimento) {
		String array[] = new String[3];
		
		if(dataNascimento.matches("\\d{2}/\\d{2}/\\d{4}")) {
			array = dataNascimento.split("/");
			Calendar data = Calendar.getInstance();
			
			int dia = Integer.parseInt(array[0]);
			int mes = Integer.parseInt(array[1]);
			int ano = Integer.parseInt(array[2]);
			
			data.set(ano, mes-1, dia);
			
			this.dataNascimento = data;
		} else {
			JOptionPane.showMessageDialog(null, "Data de nascimento inválida!");
		}
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public float getRendaMensal() {
		return rendaMensal;
	}
	
	public void setRendaMensal(float rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
}
