package dvocas12_utorak.zadatak1.gui;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dvocas12_utorak.zadatak1.poslovna_logika.Osoba;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImenikGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5991401856907739035L;
	
	private JPanel contentPane;
	private JLabel lblIme;
	private JLabel lblAdresa;
	private JTextField poljeZaIme;
	private JTextField poljeZaAdresu;
	private JLabel lblPrezime;
	private JLabel lblTelefon;
	private JTextField poljeZaPrezime;
	private JTextField poljeZaTelefon;
	private JButton btnDodaj;
	private JButton btnPrikazi;
	private JButton btnObrisi;
	private JButton btnIzadji;
	private JScrollPane scrollPane;
	private JTextArea editor;
	
	private List<Osoba> osobe = new ArrayList<Osoba>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImenikGUI frame = new ImenikGUI();
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
	public ImenikGUI() {
		setResizable(false);
		setTitle("Telefonski imenik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 566, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIme());
		contentPane.add(getLblAdresa());
		contentPane.add(getPoljeZaIme());
		contentPane.add(getPoljeZaAdresu());
		contentPane.add(getLblPrezime());
		contentPane.add(getLblTelefon());
		contentPane.add(getPoljeZaPrezime());
		contentPane.add(getPoljeZaTelefon());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnPrikazi());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnIzadji());
		contentPane.add(getScrollPane());
	}
	private JLabel getLblIme() {
		if (lblIme == null) {
			lblIme = new JLabel("Ime");
			lblIme.setBounds(12, 12, 70, 15);
		}
		return lblIme;
	}
	private JLabel getLblAdresa() {
		if (lblAdresa == null) {
			lblAdresa = new JLabel("Adresa");
			lblAdresa.setBounds(190, 12, 70, 15);
		}
		return lblAdresa;
	}
	private JTextField getPoljeZaIme() {
		if (poljeZaIme == null) {
			poljeZaIme = new JTextField();
			poljeZaIme.setBounds(12, 39, 114, 19);
			poljeZaIme.setColumns(10);
		}
		return poljeZaIme;
	}
	private JTextField getPoljeZaAdresu() {
		if (poljeZaAdresu == null) {
			poljeZaAdresu = new JTextField();
			poljeZaAdresu.setBounds(190, 39, 114, 19);
			poljeZaAdresu.setColumns(10);
		}
		return poljeZaAdresu;
	}
	private JLabel getLblPrezime() {
		if (lblPrezime == null) {
			lblPrezime = new JLabel("Prezime");
			lblPrezime.setBounds(12, 78, 124, 15);
		}
		return lblPrezime;
	}
	private JLabel getLblTelefon() {
		if (lblTelefon == null) {
			lblTelefon = new JLabel("Telefon");
			lblTelefon.setBounds(190, 78, 70, 15);
		}
		return lblTelefon;
	}
	private JTextField getPoljeZaPrezime() {
		if (poljeZaPrezime == null) {
			poljeZaPrezime = new JTextField();
			poljeZaPrezime.setBounds(12, 105, 114, 19);
			poljeZaPrezime.setColumns(10);
		}
		return poljeZaPrezime;
	}
	private JTextField getPoljeZaTelefon() {
		if (poljeZaTelefon == null) {
			poljeZaTelefon = new JTextField();
			poljeZaTelefon.setBounds(190, 105, 114, 19);
			poljeZaTelefon.setColumns(10);
		}
		return poljeZaTelefon;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						Osoba o = new Osoba();
						
						String ime = poljeZaIme.getText();
						String prezime = poljeZaPrezime.getText();
						String adresa = poljeZaAdresu.getText();
						
						int telBroj = Integer.parseInt(poljeZaTelefon.getText());
						
						o.setImePrezime(ime + " " + prezime);
						o.setAdresa(adresa);
						o.setTelefon(telBroj);
						
						osobe.add(o);
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(contentPane, 
								e1.getMessage(), "GRESKA", JOptionPane.ERROR_MESSAGE);
					}
					
				}
			});
			btnDodaj.setBounds(12, 163, 117, 25);
		}
		return btnDodaj;
	}
	private JButton getBtnPrikazi() {
		if (btnPrikazi == null) {
			btnPrikazi = new JButton("Prikazi");
			btnPrikazi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					editor.setText("");
					
					for(Osoba o: osobe)
						editor.append( o.toString() + "\n");	
				}
			});
			btnPrikazi.setBounds(9, 209, 117, 25);
		}
		return btnPrikazi;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					poljeZaIme.setText("");
					poljeZaPrezime.setText("");
					poljeZaAdresu.setText("");
					poljeZaTelefon.setText("");
					editor.setText("");					
				}
			});
			btnObrisi.setBounds(190, 163, 117, 25);
		}
		return btnObrisi;
	}
	private JButton getBtnIzadji() {
		if (btnIzadji == null) {
			btnIzadji = new JButton("Izadji");
			btnIzadji.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnIzadji.setBounds(190, 209, 117, 25);
		}
		return btnIzadji;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(334, 12, 218, 222);
			scrollPane.setViewportView(getEditor());
		}
		return scrollPane;
	}
	private JTextArea getEditor() {
		if (editor == null) {
			editor = new JTextArea();
			editor.setWrapStyleWord(true);
			editor.setLineWrap(true);
			editor.setBackground(Color.WHITE);
		}
		return editor;
	}
}
