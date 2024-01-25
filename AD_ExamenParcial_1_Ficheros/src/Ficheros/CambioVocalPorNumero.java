package Ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CambioVocalPorNumero {
	public static void main(String[] args) throws IOException {
		
			// TODO Auto-generated method stub
			//Creamos un String con la direccion del fichero
			String dir = "." + File.separator + "src" + File.separator +"Ejecicio2" + File.separator +"texto.txt";
			String dir2 = "." + File.separator + "src" + File.separator +"Ejecicio2" + File.separator +"cambioVocales.txt";
			// Realizamos una lectura del texto del fichero
			File f = new File (dir);
			if(!f.exists()) {
				System.out.println ("El fichero no existe");
			}
				try (FileReader fr = new FileReader(f)){
					
					File fic2 = new File(dir2);
					FileWriter fw = new FileWriter(fic2);
					//fw.write("prueba");
					int i = 1;
					char letra = 0;
					List<Character> listaChar = new ArrayList<Character>();
					//Leemos cada caracter del fichero y lo añadimos a una lista de caracteres
					System.out.println ("Este es el fichero con todas vocales cambiadas: ");
					while ((i = fr.read())!=-1) {
						letra = (char)i;
						if (letra >=97 && letra<= 101) {
							letra == 120;
						}else if (letra ==98) {
							
						}
							listaChar.add(letra);
							System.out.print (letra);
							fw.write(letra);
						}
						
						fr.close();
						
														
					}catch (IOException ex) {
				        ex.printStackTrace();
					} 
					
		}

	}
