package NaveEscapacial1;

import javax.swing.JFrame;
import java.util.Random;

public class TestNaveEspacial {

	public static void main(String[] args) {
		
		String nombre = "Adam";
		Nave nave = new Nave (300/2, 500);
		Bala[] balas = new Bala[50];
		for(int i = 0; i < balas.length ; i++) {
			balas[i] = new Bala(nave.getX()+nave.getAncho()/3, nave.getY());
		}//fin del for inicializador
		Obstaculo[] obstaculos = new Obstaculo[10];
		for(int i = 0; i < obstaculos.length; i++) {
			obstaculos[i] = new Obstaculo(300, 600);
		}//fin del for inicializador
		PanelNave panel = new PanelNave(balas, nave, obstaculos);
		FrameNave ventana = new FrameNave (nave, nombre, balas, panel);	
		
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(350, 600);
		ventana.setVisible(true);
		
		while(ventana.getContador() < 50) {		
			
			for(Obstaculo o : obstaculos)
				o.mover(panel.getWidth(), panel.getHeight());
			for(Bala a : balas) {
				a.mover(panel.getWidth(), panel.getHeight());
				if(a.isEstado()) {
					for(Obstaculo o : obstaculos) {
						if(a.collision(o)) {
							o.desaparecer();
							a.setY(1200);
							a.setIncy(0);
						}//fin del primer if()
					}//fin del for
				}//fin del if()
			}//fin del for
			
			panel.repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//fin del try catch
		}//fin del while
		System.exit(10);
	}//fin del main()

}//fin de la clase
