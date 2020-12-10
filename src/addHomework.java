import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class addHomework extends JFrame {

	private JPanel contentPane;
	private JTextField homeworkName;
	private JTextField dueDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addHomework frame = new addHomework();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addHomework() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel homeworkNameLabel = new JLabel("Homework Assignment Name");
		homeworkNameLabel.setBounds(10, 11, 200, 14);
		contentPane.add(homeworkNameLabel);
		
		JLabel dueDateLabel = new JLabel("Due Date");
		dueDateLabel.setBounds(240, 11, 100, 14);
		contentPane.add(dueDateLabel);
		
		homeworkName = new JTextField();
		homeworkName.setBounds(10, 29, 200, 20);
		contentPane.add(homeworkName);
		homeworkName.setColumns(10);
		
		JButton addAssignment = new JButton("Add Assignment");
		addAssignment.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				assignmentAdded frame1 = new assignmentAdded();
				frame1.setVisible(true);
			}
		});
		addAssignment.setBounds(10, 60, 150, 23);
		contentPane.add(addAssignment);
		
		dueDate = new JTextField();
		dueDate.setBounds(238, 29, 86, 20);
		contentPane.add(dueDate);
		dueDate.setColumns(10);
	}
}
