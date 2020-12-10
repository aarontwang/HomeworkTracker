import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class assignmentAdded extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					assignmentAdded frame = new assignmentAdded();
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
	public assignmentAdded() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 140);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel creationSuccess = new JLabel("Assignment Successfully Created");
		creationSuccess.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_creationSuccess = new GridBagConstraints();
		gbc_creationSuccess.insets = new Insets(0, 0, 5, 5);
		gbc_creationSuccess.gridx = 5;
		gbc_creationSuccess.gridy = 1;
		contentPane.add(creationSuccess, gbc_creationSuccess);
		
		JButton OKButton = new JButton("OK");
		GridBagConstraints gbc_OKButton = new GridBagConstraints();
		gbc_OKButton.insets = new Insets(0, 0, 0, 5);
		gbc_OKButton.gridx = 5;
		gbc_OKButton.gridy = 2;
		contentPane.add(OKButton, gbc_OKButton);
	}

}
