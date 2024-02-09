import java.util.Scanner;
import java.util.regex.*;

public class Ejer3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String ipv4;

		System.out.println("Ingrese la dirección IPv4");
		ipv4 = sc.nextLine();

		 if (validarDireccion(ipv4)) {
	            System.out.println("LA dirección IPv4 es válidA.");
	        } else {
	            System.out.println("LA dirección IPv4 no es válidA.");
	        }

	        sc.close();

	}
	
	public static boolean validarDireccion(String direccion) {
      
        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
      
        Pattern p = Pattern.compile(regex);
        
        
        Matcher m = p.matcher(direccion);
        
        
        return m.matches();
    }

}