/**
 * 
 */
package de.inmediasp.nxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qri2
 *
 */
public class Importer {
	
	public List<String> convertTxtFileToInput(String filePath){
		try {
			return read(filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public List<String> read(String filePath) throws IOException {
		String line;
		List<String> ausgabe = new ArrayList<String>(); 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath))));
		try {			
			while ((line = br.readLine()) != null) {
				for(int i = 0 ; i< line.length();i++) {
					ausgabe.add(line.charAt(i)+"");
				}
			}
		} finally {
			br.close();
		}
		return ausgabe;
		
	}
}
