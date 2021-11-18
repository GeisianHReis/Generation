package SistemadePonto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Validador {

	static ArrayList<String> matricula = new ArrayList <>(){{
		add("123");
		add("456");
		add("789");
	}};
	static ArrayList<String> senhaS = new ArrayList <>(){{
		add("123");
		add("456");
		add("789");
	}};
	
	private static boolean usuarioOK=false;
	private static boolean senhaOK=false;
	private static String usuario;
	private static String senha;
	private static int id=3;

	
	
	public static String getSenha() {
		return senha;
	}


	public static void setSenha(String senha) {
		Validador.senha = senha;
	}


	public static boolean getSenhaOK() {
		return senhaOK;
	}


	public static void setSenhaOK(boolean senhaOK) {
		Validador.senhaOK = senhaOK;
	}


	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		Validador.id = id;
	}


	public static String getsenha() {
		return senha;
	}


	public static void setsenha(String senha) {
		Validador.senha = senha;
	}


	public static String getUsuario() {
		return usuario;
	}


	public static void setUsuario(String usuario) {
		Validador.usuario = usuario;
	}


	public static  ArrayList<String> getMatricula() {
		return matricula;
	}


	public  void setMatricula(ArrayList<Object> matricula) {
		matricula = matricula;
	}


	public static boolean getUsuarioOK() {
		return usuarioOK;
	}


	public static void setUsuarioOK(boolean usuarioOK) {
		Validador.usuarioOK = usuarioOK;
	}


	public static boolean validadorMatricula() {
		
		for(int x=0;x<matricula.size();x++) {
			if(matricula.contains(usuario)) {
				setUsuarioOK(true);
				setId(matricula.indexOf(usuario));
			}	
		}
		return usuarioOK;
			}
	public static boolean validadorSenha() {
			if(getSenha() == "1") {
				setSenhaOK(true);
					
			}	
		return senhaOK;
			}
		
}
