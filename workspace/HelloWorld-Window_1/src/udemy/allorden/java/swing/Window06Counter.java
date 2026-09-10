package udemy.allorden.java.swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window06Counter extends JFrame {
	
	private int counter;
	private JButton button = new JButton("Count");
	private JButton buttonDecrement = new JButton("Decrement");
	private JButton buttonReset = new JButton("Reset");
	private JLabel result = new JLabel("Counter: 0");
	
	public Window06Counter() throws HeadlessException {
		super("Counter");
		
		Container panel = getContentPane();
		panel.add(button);
		panel.add(new JLabel(" - "));
		panel.add(buttonDecrement);
		panel.add(new JLabel(" - "));
		panel.add(buttonReset);
		panel.add(result);
		panel.setLayout(new FlowLayout());
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				result.setText("Counter: ".concat(String.valueOf(counter)));
			}
		});
		
		buttonDecrement.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter--;
				result.setText("Counter: ".concat(String.valueOf(counter)));
				
			}
		});
		
		buttonReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter = 0;
				result.setText("Counter: ".concat(String.valueOf(counter)));
				
			}
		});
		
		setVisible(true);
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Window06Counter();
	}
}
