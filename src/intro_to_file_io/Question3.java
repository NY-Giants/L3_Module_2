package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Question3 {
	public static void main (String []args) {
		Question3 q3 = new Question3();

	}
		Question3(){
			JFileChooser jfc = new JFileChooser();
			int returnVal = jfc.showOpenDialog(null);
			String fileName = "";
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				fileName = jfc.getSelectedFile().getAbsolutePath();
				
			}
		try {
			FileWriter fw = new FileWriter(fileName, true);
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			
			fw.write("\n//Copyright © 2017 by Steve Wozniak");
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
//Copyright © 2017 by Steve Wozniak