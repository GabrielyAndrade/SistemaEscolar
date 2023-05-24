/**Criação da classe Administrador que terá a permissão para registrar professores e alunos.*/
public class Administrador {
	/**<br>Os seguintes dados serão de login: */
	private String usuario = "admin";
	private String senha = "admin";
	
	/**<br>Função para retornar o usuário do Administrador.*/
	public String getUsuario() {
		return usuario;
	}
	
	/**<br>Função para retornar a senha do usuário Administrador.*/
	public String getSenha() {
		return senha;
	}
}