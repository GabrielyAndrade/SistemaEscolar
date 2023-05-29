import java.text.SimpleDateFormat;
import java.util.Calendar;
/**Criacao da classe aluno onde irá ser inserido os dados abaixo:<br>*/
public class Aluno {
	/**Inicio da declaração dos dados do aluno: <br>*/
	/**<br>Nome do Aluno:*/
	private String nome; 
	/**<br>CPF do Aluno:*/
	private String cpf;
	/**<br>Data de Nascimento de Aluno:*/
	private Calendar dataNascimento;
	/**<br>Endereco do Aluno:*/
	private String endereco;//(Rua,Número,Bairro,Cidade)
	/**<br>Telefone do Aluno:*/
    private String telefone_aluno;//(Telefone,E-mail)
    /**<br>Nome do Responsável:*/
    private String responsavel;
    /**<br>Telefone do Responsável:*/
    private String telefone_responsavel;
    
    /**<br> Agora a classe tera os seguintes metodos:*/
    /**<br> Metodo Construtor*/
    public Aluno(String nome,String CPF, String dataNascimento, String Endereco, String telefone_aluno,String responsavel,String telefone_responsavel) {
    	this.setNome(nome);
    	this.setCpf(CPF);
    	this.setdataNascimento(dataNascimento);
    	this.setEndereco(endereco);
    	this.setTelefone_aluno(telefone_aluno);
    	this.setResponsavel(responsavel);
    	this.setTelefone_responsavel(telefone_responsavel);
    }
    /**<br> Metodo para alterar/definir o Nome do Aluno:*/ 
    public void setNome(String nome1){
        if(nome1.length()>0) 
            this.nome = nome1;
        else{
            System.out.println("Digite um nome válido!"); // ADAPTAR PARA A TELA
        }
    }
    
    /**<br> Metodo para retornar o Nome do Aluno:*/
    public String getNome(){
        return this.nome;
    }
    
    /**<br>Metodo para alterar/definir o CPF do aluno:*/
    public void setCpf(String cpf1){
        if (cpf1.length()==11) {
            this.cpf=cpf1;
        }else{
            System.out.println("Digite um número de CPF válido!"); // ADAPTAR PARA A TELA
        }
    }
    
    /**<br>Metodo para retornar o CPF do Aluno*/
    public String getCpf(){
        return this.cpf;
    }
    
    /**<br>Metodo para alterar/definir a Data de Nascimento do Aluno*/
    public String setdataNascimento(String dataNascimento1) {
		int dia, mes, ano;
	    Calendar data = Calendar.getInstance();
	    if (dataNascimento1.matches("\\d{2}/\\d{2}/\\d{4}")) {
	    	String vetor[] = dataNascimento1.split("/");
	    	dia = Integer.parseInt(vetor[0]);
	    	mes = Integer.parseInt(vetor[1]);
	    	ano = Integer.parseInt(vetor[2]);
		if (dia>0 && dia<=31 && mes>0 && mes<=12 && ano>0 && ano<=2023) {
	    	data.set(ano, mes-1, dia);
	    	this.dataNascimento=data;
	    	return "OK";
		}else 
			return"Data de Nascimento fora da formatação esperada";
	    }
	    return "Erro desconhecido";
    }
    
    /**<br>Metodo que retorna a Data de Nascimento do Aluno*/
    public String getDataNascimento(){
    	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ""+ sdf.format(dataNascimento.getTime());
    }
    
    /**<br>Metodo que define/altera o Endereço do Aluno*/
    public void setEndereco(String endereco1){
        if (endereco1.length()>0) {
            this.endereco=endereco1;
           }
        else{
            System.out.println("Digite um endereço válido!");
        }
    }
    
    /**<br>Metodo que retorna o Endereço do Aluno*/
    public String getEndereco(){
        return this.endereco;
    }
    
    /**<br>Metodo que retorna o Telefone do Aluno*/
    public String getTelefone(){
        return this.telefone_aluno;
    }
    
    /**<br>Metodo que define/altera o Telefone do Aluno*/
	public String setTelefone_aluno(String telefonealuno) {
        if (telefonealuno.length()==11) {
            this.telefone_aluno=telefonealuno;
        	return "OK";
        }else{
            return("Digite um telefone no formato abaixo:\n 47912345678 (DDD 9 12345678)");
        }
	}
	
    /**<br>Metodo que define/altera o Nome do Responsável do Aluno*/
    public void setResponsavel(String responsavel1){
        if(responsavel1.length()>0) 
            this.responsavel = responsavel1;
        else{
            System.out.println("Digite um nome válido!"); // ADAPTAR PARA A TELA
        }
    }
    
    /**<br>Metodo que retorna o Nome do Responsável do Aluno*/
    public String getResponsavel(){
        return this.responsavel;
    }
    
    /**<br>Metodo que retorna o Telefone do Responsável do Aluno*/
	public String getTelefone_responsavel() {
		return telefone_responsavel;
	}
	
    /**<br>Metodo que define/altera o Telefone do Responsável do Aluno*/
	public String setTelefone_responsavel(String telefoneresponsavel) {
        if (telefoneresponsavel.length()==11) {
            this.telefone_aluno=telefoneresponsavel;
        	return "OK";
        }else{
            return("Digite um telefone no formato abaixo:\n 47912345678 (DDD 9 12345678)");
        }
	}
}
