package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Question4 implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton b1 = new JButton("Add Task");
	JButton b2 = new JButton("Remove Task");
	JButton b3 = new JButton("Save");
	JButton b4 = new JButton("Load");
	static String at;
	public static void main(String[] args) {
		Question4 q4 = new Question4();
		ArrayList<String> TaskList = new ArrayList<String>();
		TaskList.add(at);
	}
	
	
	Question4(){
		frame.setSize(800,800);
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		frame.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
		 at = JOptionPane.showInputDialog("Which Task Would you Like to Add?");
		}
	if(e.getSource()==b2) {
			
		}
	if(e.getSource()==b3) {
		try {
			JOptionPane.showMessageDialog(b3, "Saving Task(s)");
			FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);

			fw.write(at +"\n");
				
			fw.close();
			} catch (IOException e3) {
				e3.printStackTrace();
			}
	}
	if(e.getSource()==b4) {
		try {
			JOptionPane.showMessageDialog(b3, "Loading Tasks...");
			BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test2.txt"));
			
			String line = br.readLine();
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
	}

}
