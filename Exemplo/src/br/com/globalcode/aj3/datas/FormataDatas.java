package br.com.globalcode.aj3.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// a) importacao de bibliotecas

/**
 * Classe que realiza a formatacao de datas
 * 
 * @author Globalcode
 */
public class FormataDatas {

	public static void main(String[] args) {

		// b) Criacao do objeto Calendar
		Calendar cal = Calendar.getInstance();

		// c) Alteracao dos dados do calendario para
		// 03 de mar�o de 1997, �s 18h57m0s
		cal.set(1997, 2, 3,18,57,0);
		// d) Obtencao do Date a partir do Calendar
		Date data = cal. getTime();
		System.out.println("data: " + data);

		// e) Construcao do objeto para formatacao especifica
		SimpleDateFormat formatador = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy, HH'h'mm'm's's'") ;
		System.out.println("data formatada com SimpleDateFormat: "
				+ formatador.format(data));
		System.out.println("data atual formatada com SimpleDateFormat: "
				+ formatador.format(new Date()));

		// f) Construcao do objeto para formatacao pater
		DateFormat formatador2 = DateFormat.getDateInstance();
		System.out.println("data formatada com DateFormat: "
				+ formatador2.format(data));
		System.out.println("data atual formatada com DateFormat: "
				+ formatador2.format(new Date()));

	}
}
