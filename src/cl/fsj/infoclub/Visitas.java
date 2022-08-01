package cl.fsj.infoclub;

import java.util.ArrayList;

public class Visitas {

	public static void main(String[] args) {
		//Objeto Integer contiene metodo parse.Int: metodo estatico que devuelve int (Strings a int) 	
			ArrayList<Integer> visitas=new ArrayList<Integer>();
			for(int i=0;i<args.length;i++) {
				visitas.add(Integer.parseInt(args[i]));
			}
			Integer resultado=promedio(visitas);
			
			System.out.println("Su promedio de visitas es: "+resultado);
		}
		
		private static Integer promedio (ArrayList<Integer> arregloInt) {
			int suma=0;
			Integer promedio=0;
			
			for(Integer i:arregloInt) {
				suma+=i;
			}
			if(arregloInt.size()!=0) {
				promedio=suma/arregloInt.size();
			}
			else {
				System.out.println("No hay ingreso de visitas.");
			}
			return promedio;
		}

}