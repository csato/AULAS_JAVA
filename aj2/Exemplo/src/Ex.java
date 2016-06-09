
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Cristine";
		System.out.println(nome);
		
		StringBuffer sb = new StringBuffer();
		sb.append(nome+nome+nome);
		System.out.println(sb);
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		Date date = new Date();
		//SimpleDateFormat f= new SimpleDateFormat("'Sao jose dos campos, 'dd/MM/yyyy");
		SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(f.format(date));
		
		try {
			date = f.parse("22/02/1978 22:45");
			System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
			
	}

}
