package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		
	}
	if(e.getSource()==b4) {
		
	}
	}

}
