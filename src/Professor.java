import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;
/**Criacao da classe professor onde iremos inserir os dados. <br>*/
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
	/**<br>Endereco do professor;*/
	private String endereco;
	/**<br>Telefone do professor;*/
	private String telefone;
	/**<br>Salario do professor;*/
	private float salario;
	
	/**<br>Agora, a classe terá os seguintes Metodos:*/
	/**<br>Esse Metodo é um Metodo construtor da classe Professor.*/
	public void Professor(String nome, String senha, String cpf, String disciplinas, String dataNascimento, String endereco, 
			String telefone, float salario) {
		setNome(nome);
		setSenha(senha);
		setCpf(cpf);
		setDisciplinas(disciplinas);
		setDataNascimento(dataNascimento);
		setEndereco(endereco);
		setTelefone(telefone);
		setSalario(salario);
	}
	/**<br>Metodo para retornar o nome do professor;*/
	public String getNome() {
		return nome;
	}
	
	/**<br>Metodo para definir o nome do professor;*/
	public void setNome(String nome) {
		if(!nome.isEmpty()) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, "Nome inválido!");
		}
	}
	
	/**<br>Metodo para retornar a senha do professor;*/
	public String getSenha() {
		return senha;
	}
	
	/**<br>Metodo para definir a senha do professor;*/
	public void setSenha(String senha) {
		/*if(senha.matches("?=^.{8,}$)(?=.*\\d)(?=.*[!@#$%^&*]+)(?![.\\n])(?=.*[A-Z])(?=.*[a-z]).*$") {
		 * this.senha = senha;
		 * }*/
		this.senha = senha;
	}
	
	/**<br>Metodo para comparar a senha atual do professor;*/
	public boolean checkSenha(String senha) {
		if(senha.equals(this.senha)) {
			this.senha = senha;
			return true;
		}
		return false;
	}
	
	/**<br>Metodo para retornar o CPF do professor;*/
	public String getCpf() {
		return cpf;
	}
	
	/**<br>Metodo para definir o CPF do professor;*/
	public void setCpf(String cpf) {
		if(cpf.length() == 11) {
			this.cpf = cpf;
		}
	}
	
	/**<br>Metodo para retornar as disciplinas do professor;*/
	public String getDisciplinas() {
		return disciplinas;
	}
	
	/**<br>Metodo para definir as disciplinas do professor;*/
	public void setDisciplinas(String disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	/**<br>Metodo para retornar a data de nascimento do professor;*/
	public String getDataNascimento() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return "" + sdf.format(dataNascimento.getTime());
	}
	
	/**<br>Metodo para definir a data de nascimento do professor;*/
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
	
	/**<br>Metodo para retornar o endereco do professor;*/
	public String getEndereco() {
		return endereco;
	}
	
	/**<br>Metodo para definir o endereco do professor;*/
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**<br>Metodo para retornar o número de telefone do professor;*/
	public String getTelefone() {
		return telefone;
	}
	
	/**<br>Metodo para definir o número de telefone do professor;*/
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/**<br>Metodo para retornar o salario do professor;*/
	public float getSalario() {
		return salario;
	}
	
	/**<br>Metodo para definir o salario do professor;*/
	public void setSalario(float salario) {
		this.salario = salario;
	}
}
