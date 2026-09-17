package udemy.allorden.java.swing;

import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class Window13TableModel extends JFrame {

	
	public Window13TableModel() throws HeadlessException {
		super("Tabla con registros o Grilla");
		
		JTable table = new JTable(new UserTableModel());
		
		JScrollPane scroll = new JScrollPane(table);
		
		JPanel panel = new JPanel();
		panel.add(scroll);
		
		getContentPane().add(panel);
		setVisible(true);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private static class UserTableModel extends AbstractTableModel {

		private String[] columns = {"Id", "Name", "Lastname", "Email"};
		private Object[][] rows;
		
		public UserTableModel() {
			super();
			
			this.rows = new Object[5][4];
			
			rows[0] = new Object []{1, "Alejandro", "Llordén", "allorden@gmail.com"};
			rows[1] = new Object []{2, "Aaron", "Ramírez", "aaronramirez@gmail.com"};
			rows[2] = new Object []{3, "Diego", "García", "diegogarcia@gmail.com"};
			rows[3] = new Object []{4, "Nacho", "Romero", "nachoromero@gmail.com"};
			rows[4] = new Object []{5, "Félix", "Fuertes", "felixfuertes@gmail.com"};
		}

		@Override
		public int getRowCount() {
			return rows.length;
		}

		@Override
		public int getColumnCount() {
			return columns.length;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			return rows[rowIndex][columnIndex];
		}

		@Override
		public String getColumnName(int column) {
			return columns[column];
		}
	}
	
	public static void main(String[] args) {
		new Window13TableModel();
	}
}
