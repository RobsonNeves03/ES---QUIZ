import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JPanel {
	private JLabel lbP1, lbP2, lbP3, lbP4, lbP5, lbP6, lbSc, lbImg;
	private ImageIcon im;

	private JRadioButton P1R1, P1R2, P1R3, P1R4, P1R5;
	private JRadioButton P2R1, P2R2, P2R3, P2R4, P2R5;
	private JRadioButton P3R1, P3R2, P3R3, P3R4, P3R5;
	private JRadioButton P4R1, P4R2, P4R3, P4R4, P4R5;
	private JRadioButton P5R1, P5R2, P5R3, P5R4, P5R5;
	private JRadioButton P6R1, P6R2, P6R3, P6R4, P6R5;

	private ButtonGroup bgP1, bgP2, bgP3, bgP4, bgP5, bgP6;
	
	private JButton btFim;
	
	private int point = 0;

	public Quiz() {
		inicializarComponentes();
		definirEventos();
	}

	public void inicializarComponentes() {
		setLayout(null);

		im = new ImageIcon("C:\\Users\\Robson\\Desktop\\photo_2021-04-09_04-02-35.jpg");
		lbImg = new JLabel(im);
		
		lbP1 = new JLabel("<html>No filme Coringa de 2019, qual foi o ator que deu vida ao personagem Coringa?</html>");
		lbP2 = new JLabel("<html>Segundo a bíblia, quantos pares de cada animal entrou na arca construída por Moisés?</html>");
		lbP3 = new JLabel("<html>Qual dos intelectuais abaixo criou a teoria da relatividade?</html>");
		lbP4 = new JLabel("<html>Qual filósofo é autor da célebre frase: \"Penso, logo existo\"</html>");
		lbP5 = new JLabel("<html>Qual foi o modelo da arma usada no assassinato de Francisco Ferdinando?</html>");
		lbP6 = new JLabel("<html>Qual time foi o grande vencedor da copa do mundo em 2010?</html>");
		//lbSc = new JLabel("Sua pontuação foi: " + point);

		P1R1 = new JRadioButton("Joaquin Phoenix");
		P1R2 = new JRadioButton("Chris Hemsworth");
		P1R3 = new JRadioButton("Richard Gere");
		P1R4 = new JRadioButton("Heath Ledger");
		P1R5 = new JRadioButton("Jared Leto");

		P2R1 = new JRadioButton("1");
		P2R2 = new JRadioButton("3");
		P2R3 = new JRadioButton("5");
		P2R4 = new JRadioButton("7");
		P2R5 = new JRadioButton("N.D.A");

		P3R1 = new JRadioButton("Galileu Galilei");
		P3R2 = new JRadioButton("Isaac Newton");
		P3R3 = new JRadioButton("Albert Einstein");
		P3R4 = new JRadioButton("Karl Max");
		P3R5 = new JRadioButton("Stephen Hawking");

		P4R1 = new JRadioButton("Émile Durkheim");
		P4R2 = new JRadioButton("René Descartes ");
		P4R3 = new JRadioButton("Agostinho Carrara");
		P4R4 = new JRadioButton("Max Weber");
		P4R5 = new JRadioButton("Sócrates");

		P5R1 = new JRadioButton("FN Model 1900");
		P5R2 = new JRadioButton("Taurus G2C");
		P5R3 = new JRadioButton("Derringer");
		P5R4 = new JRadioButton("FN Model 1910");
		P5R5 = new JRadioButton("Colt M1873");

		P6R1 = new JRadioButton("Argentina");
		P6R2 = new JRadioButton("Alemanha");
		P6R3 = new JRadioButton("Brasil");
		P6R4 = new JRadioButton("Japão");
		P6R5 = new JRadioButton("Espanha");
		
		btFim = new JButton("Finalizar");

		bgP1 = new ButtonGroup();
		bgP2 = new ButtonGroup();
		bgP3 = new ButtonGroup();
		bgP4 = new ButtonGroup();
		bgP5 = new ButtonGroup();
		bgP6 = new ButtonGroup();

		bgP1.add(P1R1);
		bgP1.add(P1R2);
		bgP1.add(P1R3);
		bgP1.add(P1R4);
		bgP1.add(P1R5);

		bgP2.add(P2R1);
		bgP2.add(P2R2);
		bgP2.add(P2R3);
		bgP2.add(P2R4);
		bgP2.add(P2R5);

		bgP3.add(P3R1);
		bgP3.add(P3R2);
		bgP3.add(P3R3);
		bgP3.add(P3R4);
		bgP3.add(P3R5);

		bgP4.add(P4R1);
		bgP4.add(P4R2);
		bgP4.add(P4R3);
		bgP4.add(P4R4);
		bgP4.add(P4R5);

		bgP5.add(P5R1);
		bgP5.add(P5R2);
		bgP5.add(P5R3);
		bgP5.add(P5R4);
		bgP5.add(P5R5);

		bgP6.add(P6R1);
		bgP6.add(P6R2);
		bgP6.add(P6R3);
		bgP6.add(P6R4);
		bgP6.add(P6R5);

		lbP1.setBounds(10, 0, 300, 100);
		P1R1.setBounds(10, 80, 200, 30);
		P1R2.setBounds(10, 104, 200, 30);
		P1R3.setBounds(10, 128, 200, 30);
		P1R4.setBounds(10, 152, 200, 30);
		P1R5.setBounds(10, 176, 200, 30);

		lbP2.setBounds(400, 0, 300, 100);
		P2R1.setBounds(400, 80, 200, 30);
		P2R2.setBounds(400, 104, 200, 30);
		P2R3.setBounds(400, 128, 200, 30);
		P2R4.setBounds(400, 152, 200, 30);
		P2R5.setBounds(400, 176, 200, 30);
		
		lbP3.setBounds(10, 200, 300, 100);
		P3R1.setBounds(10, 280, 200, 30);
		P3R2.setBounds(10, 304, 200, 30);
		P3R3.setBounds(10, 328, 200, 30);
		P3R4.setBounds(10, 352, 200, 30);
		P3R5.setBounds(10, 376, 200, 30);
		
		lbP4.setBounds(400, 200, 300, 100);
		P4R1.setBounds(400, 280, 200, 30);
		P4R2.setBounds(400, 304, 200, 30);
		P4R3.setBounds(400, 328, 200, 30);
		P4R4.setBounds(400, 352, 200, 30);
		P4R5.setBounds(400, 376, 200, 30);
		
		lbP5.setBounds(10, 400, 300, 100);
		P5R1.setBounds(10, 480, 200, 30);
		P5R2.setBounds(10, 504, 200, 30);
		P5R3.setBounds(10, 528, 200, 30);
		P5R4.setBounds(10, 552, 200, 30);
		P5R5.setBounds(10, 576, 200, 30);
		
		lbP6.setBounds(400, 400, 300, 100);
		P6R1.setBounds(400, 480, 200, 30);
		P6R2.setBounds(400, 504, 200, 30);
		P6R3.setBounds(400, 528, 200, 30);
		P6R4.setBounds(400, 552, 200, 30);
		P6R5.setBounds(400, 576, 200, 30);
		
		btFim.setBounds(10, 640, 100, 30);
		lbImg.setBounds(800,200,300,300);
		

		add(lbImg);
		add(lbP1);
		add(lbP2);
		add(lbP3);
		add(lbP4);
		add(lbP5);
		add(lbP6);

		add(P1R1);
		add(P1R2);
		add(P1R3);
		add(P1R4);
		add(P1R5);

		add(P2R1);
		add(P2R2);
		add(P2R3);
		add(P2R4);
		add(P2R5);

		add(P3R1);
		add(P3R2);
		add(P3R3);
		add(P3R4);
		add(P3R5);

		add(P4R1);
		add(P4R2);
		add(P4R3);
		add(P4R4);
		add(P4R5);

		add(P5R1);
		add(P5R2);
		add(P5R3);
		add(P5R4);
		add(P5R5);

		add(P6R1);
		add(P6R2);
		add(P6R3);
		add(P6R4);
		add(P6R5);
		
		add(btFim);
	}

	public void definirEventos() {
		btFim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(P1R1.isSelected()) {
					point = point + 1;
				}
				
				if(P2R5.isSelected()) {
					point = point + 1;
				}
				
				if(P3R3.isSelected()) {
					point = point + 1;
				}
				if(P4R2.isSelected()) {
					point = point + 1;
				}
				if(P5R4.isSelected()) {
					point = point + 1;
				}
				if(P6R5.isSelected()) {
					point = point + 1;
				}
				
				
				lbSc = new JLabel("Sua pontuação foi: " + point);
				lbSc.setBounds(400, 634, 400, 30);
				add(lbSc);
				lbSc.setFont(new Font("Arial", Font.BOLD, 20));
				lbSc.setVisible(true);
				btFim.setVisible(false);

				}
		});

	}

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Quiz());
		frame.setBounds(200, 5, 1000, 720);
		frame.setVisible(true);
		frame.setResizable(false);

	}
}
