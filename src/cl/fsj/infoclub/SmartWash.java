package cl.fsj.infoclub;

import java.util.ArrayList;

public class SmartWash {

	
	public static void main(String[] args) {
    int suma=0, promedio=0;
		
		ArrayList<Integer> pasos=new ArrayList<Integer>();
		for(int i=0;i<args.length;i++) {
			pasos.add(Integer.parseInt(args[i]));
		}
		ArrayList <Integer> resultado=clearSteps(pasos);
		
		for(int i=0;i<resultado.size();i++) {
		suma+=resultado.get(i);	
		}
		if(resultado.size()!=0) {
			promedio=suma/resultado.size();
			
			System.out.println("Su promedio de pasos es: "+promedio);
		}
		else {
			System.out.println("No hay valores permitidos.");
		}
	}
	
	private static ArrayList<Integer> clearSteps (ArrayList<Integer> arregloInt) {
		
		ArrayList<Integer> valorespermitidos = new ArrayList <Integer>();	
		
		for(Integer i:arregloInt) {	
			if(i>=200 && i<=100000) {
				valorespermitidos.add(i);
			}
						
		}
		
		return valorespermitidos;
	}
	
}
