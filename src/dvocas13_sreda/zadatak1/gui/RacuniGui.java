package dvocas13_sreda.zadatak1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import dvocas9_sreda.zadatak3.Racun5;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class RacuniGui {

	private JFrame frmEvidencijaRacuna;
	private JTextArea editor = new JTextArea();
		
	private List<Racun5> racuni = new ArrayList<>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RacuniGui window = new RacuniGui();
					window.frmEvidencijaRacuna.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RacuniGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEvidencijaRacuna = new JFrame();
		frmEvidencijaRacuna.setTitle("Evidencija Racuna");
		frmEvidencijaRacuna.setBounds(100, 100, 1128, 621);
		frmEvidencijaRacuna.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(170, 10));
		frmEvidencijaRacuna.getContentPane().add(panel, BorderLayout.WEST);
		
		JButton btnNoviRacun = new JButton("Novi Racun");
		btnNoviRacun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NoviRacunDialog dialog = new NoviRacunDialog(frmEvidencijaRacuna, RacuniGui.this);
				dialog.setVisible(true);				
			}
		});
		btnNoviRacun.setPreferredSize(new Dimension(160, 41));
		panel.add(btnNoviRacun);
		
		JButton btnIzlaz = new JButton("Izlaz");
		btnIzlaz.setPreferredSize(new Dimension(160, 41));
		btnIzlaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int odgovor = JOptionPane.showConfirmDialog(frmEvidencijaRacuna, "Da li ste sigurni da hocete da izadjete iz aplikacije?", "Izlaz iz aplikacije", JOptionPane.YES_NO_OPTION);
				
				if (odgovor == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		
		JButton btnPrikaziSve = new JButton("Prikazi sve");
		btnPrikaziSve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(Racun5 racun : racuni) {
					editor.append(racun.toString());
				}
			}
		});
		btnPrikaziSve.setPreferredSize(new Dimension(160, 41));
		panel.add(btnPrikaziSve);
		
		JButton btnObrisiPrikaz = new JButton("Obrisi prikaz");
		btnObrisiPrikaz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				editor.setText("");
			}
		});
		btnObrisiPrikaz.setPreferredSize(new Dimension(160, 41));
		panel.add(btnObrisiPrikaz);
		panel.add(btnIzlaz);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setAutoscrolls(true);
		frmEvidencijaRacuna.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		editor = new JTextArea();
		scrollPane.setViewportView(editor);
	}
	
	public void dodajRacun(Racun5 noviRacun) {
		racuni.add(noviRacun);
	}

}
