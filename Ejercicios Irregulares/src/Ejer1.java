import java.util.Scanner;
import java.util.regex.*;

public class Ejer1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombUsur;

		System.out.println("Ingrese un nombre de usuario (Debe tener 3-20 char");
		nombUsur = sc.nextLine();

		 if (validarNombUsur(nombUsur)) {
	            System.out.println("El nombre de usuario es válido.");
	        } else {
	            System.out.println("El nombre de usuario no es válido.");
	        }

	        sc.close();

	}
	
	public static boolean validarNombUsur(String nombreUsuario) {
      
        String regex = "^[a-zA-Z][a-zA-Z0-9_#$%?=+\\-]{2,19}$";
      
        Pattern p = Pattern.compile(regex);
        
        
        Matcher m = p.matcher(nombreUsuario);
        
        
        return m.matches();
    }

}
