package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton view;
	
	String list = "";
	
	ArrayList<String> names = new ArrayList<String>();
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String[] args) {
		GuestBook GuestBook = new GuestBook();
		GuestBook.setup();
	}
	
	void setup() {
		frame = new JFrame();
		panel = new JPanel();
		add = new JButton("Add Names");
		view = new JButton("View Names");
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(add == e.getSource()) {
			String answer = JOptionPane.showInputDialog("Enter a name");
			names.add(answer); 
		}
		if(view == e.getSource()) {
			for(int i = 0; i < names.size(); i++) {
				list = list + "Guest#" + (i + 1) + ": " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, list);
		}
	}
}
