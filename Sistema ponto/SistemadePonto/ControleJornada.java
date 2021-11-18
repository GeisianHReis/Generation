package SistemadePonto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControleJornada {
	
	private static String horaI;
	private static boolean jornada=false;
	private static long inicio;
	private static long fim;
	private static long total;
	private static int segundos;
	private static int minutos;
	private static int horas;
	private static String entrada;
	private static String saida;
	
	

	
	public static void IniciarJ() {
		if(jornada == false) {
			entrada = new SimpleDateFormat("HH:mm:ss").format(new Date());
			inicio = System.currentTimeMillis();//inicia contador jornada de trabalho
			System.out.println("Jornada iniciada com sucesso as: "+entrada);
			System.out.println("\t\tBom trabalho!!");
			jornada = true;
		}
		else {
			System.out.println("A jornada já foi iniciada as: "+entrada);
		}
	}
	
	public static void EncerrarJ() {
		if(jornada == true) {
			saida = new SimpleDateFormat("HH:mm:ss").format(new Date());
			fim = System.currentTimeMillis();//fim jornada de trabalho
			System.out.println("Jornada finalizada com sucesso as: "+saida);
			total = fim - inicio;
		    segundos = (int) ((total/1000) % 60);
		    minutos = (int) (((total/1000) / 60) % 60);
		    horas = (int) (((total/1000) / 60) / 60);
		    System.out.println("Você trabalhou por: "+horas+":"+minutos+":"+segundos);
			jornada = false;
		}
		else {
			System.out.println("Não pode encerrar jornada. \nVocê não esta trabalhando no momento.");
		}
	}
}
