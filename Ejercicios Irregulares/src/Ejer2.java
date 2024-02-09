import java.util.Scanner;
import java.util.regex.*;

public class Ejer2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String dniNie;

		System.out.println("Ingrese el DNI o NIE");
		dniNie = sc.nextLine();

		 if (validarIdentificacion(dniNie)) {
	            System.out.println("LA IDENTIFICACION es válidA.");
	        } else {
	            System.out.println("LA IDENTIFICACION no es válidA.");
	        }

	        sc.close();

	}
	
	public static boolean validarIdentificacion(String identificacion) {
      
        String regex = "[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke]{1}";
      
        Pattern p = Pattern.compile(regex);
        
        
        Matcher m = p.matcher(identificacion);
        
        
        return m.matches();
    }

}
