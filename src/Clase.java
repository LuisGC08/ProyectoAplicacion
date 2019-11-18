
public class Clase {


public static void main (String[]args) {
	String LuisGarciaClavel;
	int CalEsperada=10;
	int CalReal=10;
	System.out.println("La calificacion de Luis Garcia Clavel es: " + args[0] + " : ");
	if ((CalEsperada)==(CalReal)) {
	    System.out.println( "Perfecto. Has tenido buen criterio.");
	}
	if (Integer.valueOf(CalEsperada) < Integer.valueOf(CalReal)){
	   System.out.println( "Has mejorado, o te ha llegado el éxito inesperado.");
	}
	System.out.println("Te has confiado. Falta realismo.");
}
}