package NaveEscapacial1;

import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelNave extends JPanel{
	
	//Atributos
	private Bala[] balas;
	private Nave nave;
	private Obstaculo[] obstaculos;
	
	//Constructor de la clase
	public PanelNave(Bala[] balas, Nave nave, Obstaculo[] obstaculos) {
		super();
		this.balas = balas;
		this.nave = nave;
		this.obstaculos = obstaculos;
	}//Fin del constrctor
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (Bala a : balas)
			a.dibujar(g);
		for (Obstaculo a : obstaculos)
			a.dibujar(g);
		nave.dibujar(g);		
	}

}
