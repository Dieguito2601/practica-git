import java.util.Scanner;

public class calculadoraNotas {

	public static void main(String[] args) {
    	pedirNotas();
    }

	public static void pedirNotas() {
    	System.out.println("Introduce tu Nombre");
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();

        System.out.println("Introduce una nota entre 0 y 10");

        int numero1 = teclado.nextInt();

        while (numero1 < 0 || numero1 > 10) {
        	System.out.println("El numero no es correcto, tiene que ser un valor entre 0 y 10");
        	numero1 = teclado.nextInt();
        }  	
           	System.out.println("Introduce la segunda nota, tiene que ser un valor entre 0 y 10");
      	int numero2 = teclado.nextInt();
      	
        while (numero2 < 0 || numero2 > 10) {
     		System.out.println("El numero no es correcto, tiene que ser un valor entre 0 y 10");
     		numero2 = teclado.nextInt();
        }
        	System.out.println("Introduce la ultima nota, tiene que ser un valor entre 0 y 10");
    	int numero3 = teclado.nextInt();	
    	
    	while (numero3 < 0 || numero3 > 10) {
 		System.out.println("El numero no es correcto, tiene que ser un valor entre 0 y 10");
 		numero3 = teclado.nextInt();
    	}	
    	
        double notaMedia = (numero1 + numero2 + numero3)/ 3.0;    	
        System.out.println ("Su nota media es " + notaMedia);    	
        
		 if (notaMedia < 5) {
				System.out.println("Ha suspendido el modulo");	
		 } else if (notaMedia <= 7)  
			 System.out.println("Su nota es buena, has aprobado el modulo");
			 	
		  else if (notaMedia <= 9.99)  
			 System.out.println("Su nota es alta, has aprobado el modulo");
		 
	   	 else if (notaMedia == 10)  {
		 System.out.println("Su nota es excelente, Tienes la nota maxima");
	
}		

}

}      
	
	

