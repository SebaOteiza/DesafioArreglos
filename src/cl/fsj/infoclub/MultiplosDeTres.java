package cl.fsj.infoclub;

import java.util.ArrayList;

public class MultiplosDeTres {

	public static void main(String[] args) {
		
		ArrayList <Integer> multiplos = new ArrayList <Integer>();
		for (int i=0;i<args.length;i++) {
			multiplos.add(Integer.parseInt(args[i]));
		}
		
		int sumafinal=suma(multiplos);
		if (sumafinal>0) {
			System.out.println("La suma de los multiplos de 3 es: "+sumafinal);
		}
		else {
			System.out.println("No hay numeros multiplos de 3.");
		}
	}
	   
	static int suma (ArrayList <Integer> valores) {
		int suma=0;
		
		for(int i=0;i<valores.size();i++) {
			if(valores.get(i)%3==0) {
				suma+=valores.get(i);
			}
		}
		return suma;
	}
}


