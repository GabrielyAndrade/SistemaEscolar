import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;
/**Criação da classe professor onde iremos inserir os dados. <br>*/
public class Professor {
	/**Aqui iremos inserir os seguintes dados do professor:<br> Nome do professor;*/
	private String nome;
	/**<br>Senha do professor;*/
	private String senha;
	/**<br>CPF do professor;*/
	private String cpf;
	/**<br>Disciplinas do professor;*/
	private String disciplinas;
	/**<br>Data de nascimento do professor;*/
	private Calendar dataNascimento;
	/**<br>Endereço do professor;*/
	private String endereco;
	/**<br>Telefone do professor;*/
	private String telefone;
	/**<br>Salário do professor;*/
	private float salario;
	
	/**<br>Agora, a classe terá os seguintes métodos:*/
	/**<br>Método para retornar o nome do professor;*/
	public String getNome() {
		return nome;
	}
	
	/**<br>Método para definir o nome do professor;*/
	public void setNome(String nome) {
		if(!nome.isEmpty()) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, "Nome inválido!");
		}
	}
	
	/**<br>Método para retornar a senha do professor;*/
	public String getSenha() {
		return senha;
	}
	
	/**<br>Método para definir a senha do professor;*/
	public void setSenha(String senha) {
		/*if(senha.matches("?=^.{8,}$)(?=.*\\d)(?=.*[!@#$%^&*]+)(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$") {
		 * this.senha = senha;
		 * }*/
		this.senha = senha;
	}
	
	/**<br>Método para comparar a senha atual do professor;*/
	public boolean checkSenha(String senha) {
		if(senha.equals(this.senha)) {
			this.senha = senha;
			return true;
		}
		return false;
	}
	
	/**<br>Método para retornar o CPF do professor;*/
	public String getCpf() {
		return cpf;
	}
	
	/**<br>Método para definir o CPF do professor;*/
	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
		}
	}
	
	/**<br>Método para retornar as disciplinas do professor;*/
	public String getDisciplinas() {
		return disciplinas;
	}
	
	/**<br>Método para definir as disciplinas do professor;*/
	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	/**<br>Método para retornar a data de nascimento do professor;*/
	public String getDataNascimento() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "" + sdf.format(dataNascimento.getTime());
	}
	
	/**<br>Método para definir a data de nascimento do professor;*/
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
	
	/**<br>Método para retornar o endereço do professor;*/
	public String getEndereco() {
		return endereco;
	}
	
	/**<br>Método para definir o endereço do professor;*/
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**<br>Método para retornar o número de telefone do professor;*/
	public String getTelefone() {
		return telefone;
	}
	
	/**<br>Método para definir o número de telefone do professor;*/
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**<br>Método para retornar o salário do professor;*/
	public float getSalario() {
		return salario;
	}
	
	/**<br>Método para definir o salário do professor;*/
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
