import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Base {

	private JFrame frame;
	private JPanel hauptmenue;
	private JPanel wettspielerAnlegen;
	private JPanel mannschaftAnlegen;
	private JTextField textFieldMS1;
	private JTextField textFieldMS2;
	private JTextField textFieldMS3;
	private JTextField textFieldName;
	private JTextField textFieldAlter;
	private JTextField textFieldBetrag;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Base window = new Base();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Base() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel hauptmenue = new JPanel();
		frame.getContentPane().add(hauptmenue, "name_515988382784334");
		hauptmenue.setLayout(null);
		hauptmenue.setVisible(true);
		
		JPanel mannschaftAnlegen = new JPanel();
		frame.getContentPane().add(mannschaftAnlegen, "name_515995156018694");
		mannschaftAnlegen.setLayout(null);
		mannschaftAnlegen.setVisible(false);
		
		JPanel wettspielerAnlegen = new JPanel();
		frame.getContentPane().add(wettspielerAnlegen, "name_515996200911175");
		wettspielerAnlegen.setLayout(null);
		wettspielerAnlegen.setVisible(false);
		JButton btnStart = new JButton("Start");
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
			}
		});
		btnStart.setBounds(316, 216, 108, 23);
		btnStart.setEnabled(false);
		hauptmenue.add(btnStart);
		
		JButton btnWSAnlegen = new JButton("Wettspieler anlegen");
		btnWSAnlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				wettspielerAnlegen.setVisible(true);
				hauptmenue.setVisible(false);
			}
		});
		btnWSAnlegen.setBounds(10, 216, 193, 23);
		hauptmenue.add(btnWSAnlegen);
		
		JButton btnMSAnlegen = new JButton("Mannschaft anlegen");
		btnMSAnlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mannschaftAnlegen.setVisible(true);
				hauptmenue.setVisible(false);
			}
		});
		btnMSAnlegen.setBounds(10, 170, 193, 23);
		hauptmenue.add(btnMSAnlegen);
		
		JLabel labelHauptmenue = new JLabel("Hauptmen\u00FC");
		labelHauptmenue.setBounds(159, 11, 128, 31);
		labelHauptmenue.setFont(new Font("Tahoma", Font.PLAIN, 25));
		hauptmenue.add(labelHauptmenue);
		
		JCheckBox checkBoxMSAnlegen = new JCheckBox("");
		checkBoxMSAnlegen.setEnabled(false);
		checkBoxMSAnlegen.setBounds(209, 170, 97, 23);
		hauptmenue.add(checkBoxMSAnlegen);
		
		JCheckBox checkBoxWSAnlegen = new JCheckBox("");
		checkBoxWSAnlegen.setEnabled(false);
		checkBoxWSAnlegen.setBounds(209, 216, 97, 23);
		hauptmenue.add(checkBoxWSAnlegen);
		
		
		
		JButton btnGenerieren = new JButton("Generieren");
		btnGenerieren.setBounds(270, 99, 133, 23);
		mannschaftAnlegen.add(btnGenerieren);
		
		JLabel labelMSAnlegen = new JLabel("Mannschaft anlegen");
		labelMSAnlegen.setBounds(118, 9, 150, 14);
		mannschaftAnlegen.add(labelMSAnlegen);
		
		JButton btnAnwenden = new JButton("Anwenden");
		btnAnwenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Bedingung schreiben, bei der das Feld nur geswitcht wird, wenn mind. 2 MS angelegt sind
				//sonst Fehlermeldung
				hauptmenue.setVisible(true);
				mannschaftAnlegen.setVisible(false);
				checkBoxMSAnlegen.setSelected(true);
				if(checkBoxMSAnlegen.isSelected() && checkBoxWSAnlegen.isSelected()) {
					btnStart.setEnabled(true);
				}
				
			}
		});
		btnAnwenden.setBounds(270, 215, 133, 23);
		mannschaftAnlegen.add(btnAnwenden);
		
		JLabel labelNr1 = new JLabel("1");
		labelNr1.setBounds(10, 53, 52, 14);
		mannschaftAnlegen.add(labelNr1);
		
		textFieldMS1 = new JTextField();
		textFieldMS1.setBounds(72, 50, 86, 20);
		textFieldMS1.setText("Mannschaft1");
		textFieldMS1.setColumns(10);
		mannschaftAnlegen.add(textFieldMS1);
		
		textFieldMS2 = new JTextField();
		textFieldMS2.setBounds(72, 100, 86, 20);
		textFieldMS2.setText("Mannschaft2");
		textFieldMS2.setColumns(10);
		mannschaftAnlegen.add(textFieldMS2);
		
		textFieldMS3 = new JTextField();
		textFieldMS3.setBounds(72, 160, 86, 20);
		textFieldMS3.setText("Mannschaft3");
		textFieldMS3.setColumns(10);
		mannschaftAnlegen.add(textFieldMS3);
		
		JLabel labelNr2 = new JLabel("2");
		labelNr2.setBounds(10, 103, 52, 14);
		mannschaftAnlegen.add(labelNr2);
		
		JLabel labelNr3 = new JLabel("3");
		labelNr3.setBounds(10, 163, 52, 14);
		mannschaftAnlegen.add(labelNr3);
		
		
		
		JButton buttonZurueck = new JButton("Zur\u00FCck");
		buttonZurueck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hauptmenue.setVisible(true);
				wettspielerAnlegen.setVisible(false);
			}
		});
		buttonZurueck.setBounds(335, 11, 89, 23);
		wettspielerAnlegen.add(buttonZurueck);
		
		textFieldName = new JTextField();
		textFieldName.setText("Name...");
		textFieldName.setColumns(10);
		textFieldName.setBounds(10, 47, 86, 20);
		wettspielerAnlegen.add(textFieldName);
		
		JLabel labelName = new JLabel("Name");
		labelName.setBounds(10, 36, 46, 14);
		wettspielerAnlegen.add(labelName);
		
		JLabel labelAlter = new JLabel("Alter");
		labelAlter.setBounds(10, 74, 46, 14);
		wettspielerAnlegen.add(labelAlter);
		
		textFieldAlter = new JTextField();
		textFieldAlter.setText("Alter...");
		textFieldAlter.setColumns(10);
		textFieldAlter.setBounds(10, 91, 86, 20);
		wettspielerAnlegen.add(textFieldAlter);
		
		JButton buttonSpielerVerwalten = new JButton("Spieler verwalten");
		buttonSpielerVerwalten.setBounds(309, 106, 115, 23);
		wettspielerAnlegen.add(buttonSpielerVerwalten);
		
		JButton buttonAnlegen = new JButton("Anlegen");
		buttonAnlegen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hauptmenue.setVisible(true);
				wettspielerAnlegen.setVisible(false);
				checkBoxWSAnlegen.setSelected(true);
				if(checkBoxMSAnlegen.isSelected() && checkBoxWSAnlegen.isSelected()) {
					btnStart.setEnabled(true);
				}
				
			}
		});
		buttonAnlegen.setBounds(335, 208, 89, 23);
		wettspielerAnlegen.add(buttonAnlegen);
		
		JButton buttonWettspiel = new JButton("Wettspiel");
		buttonWettspiel.setBounds(10, 131, 89, 23);
		wettspielerAnlegen.add(buttonWettspiel);
		
		JLabel labelWetsumme = new JLabel("Wettsumme");
		labelWetsumme.setBounds(10, 162, 86, 14);
		wettspielerAnlegen.add(labelWetsumme);
		
		textFieldBetrag = new JTextField();
		textFieldBetrag.setText("Betrag...");
		textFieldBetrag.setColumns(10);
		textFieldBetrag.setBounds(10, 180, 86, 20);
		wettspielerAnlegen.add(textFieldBetrag);
		
		JLabel labelEuro = new JLabel("\u20AC");
		labelEuro.setBounds(99, 183, 46, 14);
		wettspielerAnlegen.add(labelEuro);
		
		
	}
}
