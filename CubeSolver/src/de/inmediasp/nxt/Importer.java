/**
 * 
 */
package de.inmediasp.nxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author qri2
 *
 */
public class Importer {

	public List<String> convertTxtFileToInput(String filePath) {
		try {
			return read(filePath);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<String> read(String filePath) throws Exception {
		String line;
		List<String> output = new ArrayList<String>();
		char currentLetter;
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(filePath))));
		try {
			while ((line = br.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					currentLetter = line.charAt(i);

					if (currentLetter == 'R' || currentLetter == 'r' || currentLetter == 'L' || currentLetter == 'l'
							|| currentLetter == 'U' || currentLetter == 'u' || currentLetter == 'D'
							|| currentLetter == 'd' || currentLetter == 'F' || currentLetter == 'f'
							|| currentLetter == 'B' || currentLetter == 'b' || currentLetter == 'X'
							|| currentLetter == 'x' || currentLetter == 'Y' || currentLetter == 'y') {
						output.add(currentLetter + "");
					}
					else {
						throw new Exception("Ungueltige Rotationsfolge! " + currentLetter + " ist keine valide Rotationsrichtung");
					}
				}
			}
		} finally {
			br.close();
		}
		return output;

	}
}
