
public class ExamenED {
	
	
	public static void main(String[] args) {
			//Declaramos los Strings
			String mensaje="Paquito es el tio mas guapo que conozco";
			String mensajeCodificado="";
			String mensajetemporal="";

			mensajeCodificado=mensaje.toUpperCase(); /*Cambiamos de minusculas a mayusculas/*

			/*Cambiamos el orden de las letras*/

			for(int i=0;i<mensaje.length();i=i+2){

				if(i+1==mensaje.length()){

					mensajetemporal=mensajetemporal+mensajeCodificado.charAt(i);

				}else{

					mensajetemporal=mensajetemporal+mensajeCodificado.charAt(i+1)+mensajeCodificado.charAt(i);

					}

					}

				mensajeCodificado=mensajetemporal;
	
				System.out.println(mensajeCodificado);/*Imprimimos el mensajeCodificado*/

		}

	}

