package dvocas13_sreda.zadatak1.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import dvocas3_sreda.zadatak1.NacinPlacanja;
import dvocas9_sreda.zadatak3.Racun5;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import net.miginfocom.swing.MigLayout;

public class NoviRacunDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField nazivField1;
	private JTextField nazivField2;
	private JTextField nazivField3;
	private JTextField cenaField1;
	private JTextField cenaField2;
	private JTextField cenaField3;
	private JTextField kolField1;
	private JTextField kolField2;
	private JTextField kolField3;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private RacuniGui racuniGui;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NoviRacunDialog dialog = new NoviRacunDialog(null, null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NoviRacunDialog(JFrame parent, RacuniGui racuniGui) {
		super(parent);
		setResizable(false);
		setModal(true);
		this.racuniGui = racuniGui;
		setTitle("Novi Racun");
		setBounds(100, 100, 690, 379);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[37px][236px][169px][155px]", "[33px][39px][39px][39px][39px][41px]"));
		
		JLabel lblNazivArtikla = new JLabel("Naziv artikla");
		contentPanel.add(lblNazivArtikla, "cell 1 0,alignx left,aligny top");
		
		nazivField1 = new JTextField();
		contentPanel.add(nazivField1, "cell 1 1,alignx left,aligny top");
		nazivField1.setColumns(10);
		
		nazivField2 = new JTextField();
		contentPanel.add(nazivField2, "cell 1 2,alignx left,aligny top");
		nazivField2.setColumns(10);
		
		nazivField3 = new JTextField();
		contentPanel.add(nazivField3, "cell 1 3,alignx left,aligny top");
		nazivField3.setColumns(10);
		
		JLabel lblCena = new JLabel("Cena");
		contentPanel.add(lblCena, "cell 2 0,growx,aligny top");
		
		JLabel lblKolicina = new JLabel("Kolicina");
		contentPanel.add(lblKolicina, "cell 3 0,alignx center,aligny top");
		
		cenaField1 = new JTextField();
		contentPanel.add(cenaField1, "cell 2 1,growx,aligny top");
		cenaField1.setColumns(10);
		
		cenaField2 = new JTextField();
		contentPanel.add(cenaField2, "cell 2 2,growx,aligny top");
		cenaField2.setColumns(10);
		
		cenaField3 = new JTextField();
		contentPanel.add(cenaField3, "cell 2 3,growx,aligny top");
		cenaField3.setColumns(10);
		
		kolField1 = new JTextField();
		contentPanel.add(kolField1, "cell 3 1,growx,aligny top");
		kolField1.setColumns(10);
		
		kolField2 = new JTextField();
		contentPanel.add(kolField2, "cell 3 2,growx,aligny top");
		kolField2.setColumns(10);
		
		kolField3 = new JTextField();
		contentPanel.add(kolField3, "cell 3 3,growx,aligny top");
		kolField3.setColumns(10);
		
		JLabel lblNacinPlacanja = new JLabel("Nacin placanja:");
		contentPanel.add(lblNacinPlacanja, "cell 1 4,alignx left,aligny center");
		
		JComboBox nacinPlacanjaBox = new JComboBox();
		nacinPlacanjaBox.setModel(new DefaultComboBoxModel(NacinPlacanja.values()));
		contentPanel.add(nacinPlacanjaBox, "cell 2 4 2 1,growx,aligny top");
		
		label = new JLabel("1.");
		contentPanel.add(label, "cell 0 1,growx,aligny center");
		
		label_1 = new JLabel("2.");
		contentPanel.add(label_1, "cell 0 2,growx,aligny center");
		
		label_2 = new JLabel("3.");
		contentPanel.add(label_2, "cell 0 3,growx,aligny center");
		
		JCheckBox checkNagrada = new JCheckBox("Nagrada");
		contentPanel.add(checkNagrada, "cell 2 5 2 1,growx,aligny top");
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					try {	
							String naziv1 = nazivField1.getText();
							String jedCenaStr1 = cenaField1.getText();
							String kolStr1 = kolField1.getText();
							
							double cena1 = Double.parseDouble(jedCenaStr1);
							int kol1 = Integer.parseInt(kolStr1);
							
							String naziv2 = nazivField2.getText();
							String jedCenaStr2 = cenaField2.getText();
							String kolStr2 = kolField2.getText();
							
							double cena2 = Double.parseDouble(jedCenaStr2);
							int kol2 = Integer.parseInt(kolStr2);
							
							String naziv3 = nazivField3.getText();
							String jedCenaStr3 = cenaField3.getText();
							String kolStr3 = kolField3.getText();
							
							double cena3 = Double.parseDouble(jedCenaStr3);
							int kol3 = Integer.parseInt(kolStr3);		
							
							NacinPlacanja nacinPlacanja = (NacinPlacanja)nacinPlacanjaBox.getSelectedItem();
							
							boolean nagrada = checkNagrada.isSelected();
													
							Racun5 noviRacun = new Racun5();
							noviRacun.dodajArtikal(naziv1, cena1, kol1);
							noviRacun.dodajArtikal(naziv2, cena2, kol2);
							noviRacun.dodajArtikal(naziv3, cena3, kol3);
							noviRacun.setNacinPlacanja(nacinPlacanja);
							
							noviRacun.setNagradnaIgra(nagrada);
							
							//System.out.println(noviRacun);
							racuniGui.dodajRacun(noviRacun);
							NoviRacunDialog.this.setVisible(false);
						} catch(NumberFormatException nex) {
							JOptionPane.showMessageDialog(NoviRacunDialog.this, "Uneta vredost nije broj. Molim proverite unete vrednosti.", "Greska", JOptionPane.ERROR_MESSAGE);
						}
						
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						NoviRacunDialog.this.setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
