import java.util.Scanner;
import java.util.regex.*;

public class Ejer4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fecha;

		System.out.println("Ingrese la fecha dd/mm/aaaa");
		fecha = sc.nextLine();

		 if (validarFecha(fecha)) {
	            System.out.println("LA fecha es válidA.");
	        } else {
	            System.out.println("LA fecha no es válidA.");
	        }

	        sc.close();

	}
	
	public static boolean validarFecha(String formato) {
      
        String regex = "^\\d{2}\\-\\d{2}\\-\\d{4}$";
      
        Pattern p = Pattern.compile(regex);
        
        
        Matcher m = p.matcher(formato);
        
        
        return m.matches();
    }

}