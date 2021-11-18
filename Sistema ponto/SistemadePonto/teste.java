package SistemadePonto;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class teste {

    public static void main(String args[]) throws IOException {
    	String entrada,saida,temp;
    	int x,sec,min,hour;
    	long inicio,fim,total,totalPausa,pausaE,pausaS;
    	
    	Scanner leia = new Scanner(System.in);
    	
    	inicio = System.currentTimeMillis();//inicia contador jornada de trabalho
    	entrada = new SimpleDateFormat("HH:mm:ss").format(new Date());//guardar hora de inicio
        System.out.println("Entrou: "+entrada);
        x = leia.nextInt();
        
        pausaE = System.currentTimeMillis();//inicio contador pausa
        x = leia.nextInt();
        
        pausaS = System.currentTimeMillis();//fim contador pausa
        
        
        totalPausa = pausaS - pausaE;//calculo para achar total de pausa
        //formatação pausa
        sec = (int) ((totalPausa/1000) % 60);
        min = (int) (((totalPausa/1000) / 60) % 60);
        hour = (int) (((totalPausa/1000) / 60) / 60);
        System.out.println("\nVocê ficou: "+hour+":"+min+":"+sec+" de pausa");

        x = leia.nextInt();

      fim = System.currentTimeMillis();//fim jornada de trabalho
      
      saida = new SimpleDateFormat("HH:mm:ss").format(new Date());
      System.out.println("Saiu: "+saida);//fim jornada de trabalho
      
      total = fim - inicio;
      sec = (int) ((total/1000) % 60);
      min = (int) (((total/1000) / 60) % 60);
      hour = (int) (((total/1000) / 60) / 
      System.out.println("\nVocê trabalhou: "+hour+":"+min+":"+se60);c);
      
}

}
	
