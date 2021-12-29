package dvocas12.sreda.zadatak1.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dvocas12.sreda.zadatak1.poslovna_logika.Osoba;

import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ImenikGUI extends JFrame {

	private JPanel contentPane;
	private JTextField poljeIme;
	private JTextField poljePrezime;
	private JTextField poljeAdresa;
	private JTextField poljeTelefon;
	private JTextArea editor;
	
	private List<Osoba> osobe = new ArrayList<>();

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
		setTitle("Telefonski imenik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 461);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		poljeIme = new JTextField();
		poljeIme.setBounds(23, 52, 131, 20);
		contentPane.add(poljeIme);
		poljeIme.setColumns(10);
		
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIme.setBounds(27, 27, 46, 14);
		contentPane.add(lblIme);
		
		JLabel lblPrezime = new JLabel("Prezime:");
		lblPrezime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrezime.setBounds(23, 104, 77, 14);
		contentPane.add(lblPrezime);
		
		poljePrezime = new JTextField();
		poljePrezime.setBounds(23, 129, 131, 20);
		contentPane.add(poljePrezime);
		poljePrezime.setColumns(10);
		
		JLabel lblAdresa = new JLabel("Adresa:");
		lblAdresa.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAdresa.setBounds(186, 27, 46, 14);
		contentPane.add(lblAdresa);
		
		JLabel lblTelefon = new JLabel("Telefon:");
		lblTelefon.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTelefon.setBounds(186, 104, 46, 14);
		contentPane.add(lblTelefon);
		
		poljeAdresa = new JTextField();
		poljeAdresa.setBounds(186, 52, 131, 20);
		contentPane.add(poljeAdresa);
		poljeAdresa.setColumns(10);
		
		poljeTelefon = new JTextField();
		poljeTelefon.setBounds(186, 129, 131, 20);
		contentPane.add(poljeTelefon);
		poljeTelefon.setColumns(10);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				// uzmi vrednosti iz polja za unos
				String ime = poljeIme.getText();
				String prezime = poljePrezime.getText();
				String adresa = poljeAdresa.getText();
				String telefonStr = poljeTelefon.getText();
			
				try {
					// napravi objekat osoba sa unetim podacima
					Osoba novaOsoba = new Osoba();
					novaOsoba.setImePrezime(ime + " " + prezime);
					novaOsoba.setAdresa(adresa);
					int telefon = Integer.parseInt(telefonStr);
					novaOsoba.setTelefon(telefon);
					
					// ubaci osobu u listu
					if (!osobe.contains(novaOsoba)) {
					 osobe.add(novaOsoba);
					} else {
						throw new RuntimeException("Osoba vec postoji u imeniku");
					}
					
					poljeIme.setText("");
					poljePrezime.setText("");
					poljeAdresa.setText("");
					poljeTelefon.setText("");					
					
					JOptionPane.showMessageDialog(ImenikGUI.this, "Kontakt uspesno dodat u imenik", "Info", JOptionPane.INFORMATION_MESSAGE);
				} catch (NumberFormatException nex) {
					JOptionPane.showMessageDialog(ImenikGUI.this, "Polje telefon mora biti validan broj", "Greska", JOptionPane.ERROR_MESSAGE);
				} catch(Exception ex) {
					JOptionPane.showMessageDialog(ImenikGUI.this, ex.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		btnDodaj.setBounds(23, 205, 89, 23);
		contentPane.add(btnDodaj);
		
		JButton btnObrisi = new JButton("Obrisi");
		btnObrisi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poljeIme.setText("");
				poljePrezime.setText("");
				poljeAdresa.setText("");
				poljeTelefon.setText("");
				editor.setText("");
				
			}
		});
		btnObrisi.setBounds(186, 205, 89, 23);
		contentPane.add(btnObrisi);
		
		JButton btnPrikazi = new JButton("Prikazi");
		btnPrikazi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Osoba osoba : osobe) {
					editor.append(osoba.toString()+"\r\n");
				}
			}
		});
		btnPrikazi.setBounds(23, 254, 89, 23);
		contentPane.add(btnPrikazi);
		
		JButton btnIzadji = new JButton("Izadji");
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnIzadji.setBounds(186, 254, 89, 23);
		contentPane.add(btnIzadji);
		
		editor = new JTextArea();
		editor.setBounds(339, 22, 382, 389);
		contentPane.add(editor);
	}
}
