import java.util.Calendar;

public class Aluno {
	//Atributos da classe Aluno:
	private String nome; // equivalente a "char nome[30]" utilizado em C
	private String cpf;
	private Calendar dataNascimento;
	private String endereco;//(Rua,Número,Bairro,Cidade)
    private String telefone_aluno;//(Telefone,E-mail) ]
    private String responsavel;
    private String telefone_responsavel;
    
    //Criação dos Getters e Setters 
    public void setNome(String nome1){
        if(nome1.length()>0) 
            this.nome = nome1;
        else{
            System.out.println("Digite um nome válido!"); // ADAPTAR PARA A TELA
        }
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(String cpf1){
        if (cpf1.length()==11) {
            this.cpf=cpf1;
        }else{
            System.out.println("Digite um número de CPF válido!"); // ADAPTAR PARA A TELA
        }
    }
    public String getCpf(){
        return this.cpf;
    }
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone_aluno() {
		return telefone_aluno;
	}
	public void setTelefone_aluno(String telefone) {
		this.telefone_aluno = telefone;
	}
    public void setResponsavel(String responsavel1){
        if(responsavel1.length()>0) 
            this.responsavel = responsavel1;
        else{
            System.out.println("Digite um nome válido!"); // ADAPTAR PARA A TELA
        }
    }
    public String getResponsavel(){
        return this.responsavel;
    }
	public String getTelefone_responsavel() {
		return telefone_responsavel;
	}
	public void setTelefone_responsavel(String telefone) {
		this.telefone_responsavel = telefone;
	}

}
