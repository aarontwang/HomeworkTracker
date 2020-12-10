import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class Planner {

	private JFrame mainPage;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Planner window = new Planner();
					window.mainPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Planner() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainPage = new JFrame();
		mainPage.setBounds(100, 100, 600, 300);
		mainPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Homework To Do");
		lblNewLabel.setBounds(10, 11, 110, 14);
		mainPage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Due Date");
		lblNewLabel_1.setBounds(150, 11, 70, 14);
		mainPage.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add Homework");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addHomework homework = new addHomework();
				homework.setVisible(true);
			}
		});
		btnNewButton.setBounds(429, 7, 130, 23);
		mainPage.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(60, 118, 89, -81);
		mainPage.getContentPane().add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Overdue Assignments");
		lblNewLabel_2.setBounds(266, 11, 130, 14);
		mainPage.getContentPane().add(lblNewLabel_2);
	}
}
