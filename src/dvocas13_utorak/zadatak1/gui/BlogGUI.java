package dvocas13_utorak.zadatak1.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dvocas13_utorak.zadatak1.poslovna_logika.Blog;
import dvocas13_utorak.zadatak1.poslovna_logika.BlogPost;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BlogGUI extends JFrame {

	private JPanel contentPane;
	private JTextField poljeNaslov;
	private JTextField poljeFajl;
	
	private Blog blog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlogGUI frame = new BlogGUI();
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
	public BlogGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				izadji();
			}
		});
		blog = new Blog();
		
		setMinimumSize(new Dimension(610, 470));
		setTitle("Program za pisanje blog-a");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 610, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea editorSadrzaj = new JTextArea();
		scrollPane.setViewportView(editorSadrzaj);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNaslovBlogPosta = new JLabel("Naslov blog post-a");
		panel.add(lblNaslovBlogPosta);
		
		poljeNaslov = new JTextField();
		panel.add(poljeNaslov);
		poljeNaslov.setColumns(40);
		
		JPanel panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(150, 10));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(null);
		
		JButton btnDodajPost = new JButton("Dodaj post");
		btnDodajPost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BlogPost post = new BlogPost();
					
					post.setNaslov(poljeNaslov.getText());
					
					post.setSadrzaj(editorSadrzaj.getText());
					
					blog.dodajPost(post);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane, e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnDodajPost.setBounds(10, 11, 130, 23);
		panel_1.add(btnDodajPost);
		
		JButton btnPrikaziSve = new JButton("Prikazi sve");
		btnPrikaziSve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<BlogPost> postovi = blog.getPostovi();
				
				poljeNaslov.setText("");
				editorSadrzaj.setText("");
				
				for(BlogPost post: postovi)
					editorSadrzaj.append(post.toString());
			}
		});
		btnPrikaziSve.setBounds(10, 45, 130, 23);
		panel_1.add(btnPrikaziSve);
		
		JLabel lblFajlputanja = new JLabel("Fajl (putanja)");
		lblFajlputanja.setBounds(10, 131, 130, 14);
		panel_1.add(lblFajlputanja);
		
		poljeFajl = new JTextField();
		poljeFajl.setBounds(10, 153, 130, 20);
		panel_1.add(poljeFajl);
		poljeFajl.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TXT", "BINARNI", "JSON"}));
		comboBox.setBounds(10, 188, 130, 20);
		panel_1.add(comboBox);
		
		JButton btnSacuvaj = new JButton("Sacuvaj");
		btnSacuvaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String putanja = poljeFajl.getText();
					
					String tipFajla = (String)comboBox.getSelectedItem();
					
					if (tipFajla.equals("TXT"))
						blog.sacuvajBlogTXT(putanja);
					
					if (tipFajla.equals("JSON"))
						blog.sacuvajBlogJSON(putanja);
					
					if (tipFajla.equals("BINARNI"))
						blog.serijalizujBlog(putanja);
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(contentPane, e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnSacuvaj.setBounds(10, 225, 130, 23);
		panel_1.add(btnSacuvaj);
		
		JButton btnIzadji = new JButton("Izadji");
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izadji();
			}
		});
		btnIzadji.setBounds(10, 259, 130, 23);
		panel_1.add(btnIzadji);
	}

	private void izadji() {
		int opcija = JOptionPane.showConfirmDialog(contentPane, "Da li zaista zelite da izadjete iz programa?",
				"Potvrda", JOptionPane.YES_NO_CANCEL_OPTION);
		
		if (opcija == JOptionPane.YES_OPTION)
			System.exit(0);
	}
}
