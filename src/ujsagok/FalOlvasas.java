package ujsagok;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FalOlvasas {
	
	public Ujsag[] fajlOlvas(String fajl, String elvalaszto) {
		Ujsag[] ujsagok = new Ujsag[sorokSzama(fajl)];
		Ujsag elem=null;
		int index=0;
		try (BufferedReader br = new BufferedReader(new FileReader(fajl))) {
			
			String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(elvalaszto);
		        
		        switch(values[0]) {
		        case "Napilap" -> ujsagok[index++] = new Napilap(Integer.parseInt( values[3]), values[1], values[2], Integer.parseInt( values[4]));
		        case "Hetilap" -> ujsagok[index++] = new Hetilap(Integer.parseInt( values[3]), values[2], values[2],Integer.parseInt(values[4]) );
		        case "Ujsag" -> ujsagok[index++] = new AltalanosUjsag(Integer.parseInt( values[3]), values[2], values[1]);
		        }
		        
		    }
		} catch (IOException e) {
			System.out.println("I/O hiba");
		}	
		return ujsagok;
	}
	
	
	private int sorokSzama(String fajlnev) {
		int noOfLines = 0;
	    try (BufferedReader reader = new BufferedReader(new FileReader(fajlnev))) {
	        while (reader.readLine() != null) {
	            noOfLines++;
	        }
	    }
	    catch (FileNotFoundException e) {
			System.out.println("Nincs ilyen fájl");
		}
	    catch (IOException e) {
			 System.out.println("I/O hiba");
		}
		return noOfLines;
		
	}

}
