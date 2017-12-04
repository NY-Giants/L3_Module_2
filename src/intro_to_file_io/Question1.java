package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Question1 {
	public static void main (String [] args) {
		Question1 q1 = new Question1();
	}
	Question1(){
	String x = JOptionPane.showInputDialog("Input Statement Here");	

	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");
		
		/*
		NOTE: To append to a file that already exists, add true as a second parameter when calling the
		      FileWriter constructor.
		      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
		*/
		
		fw.write(x);
			
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}

