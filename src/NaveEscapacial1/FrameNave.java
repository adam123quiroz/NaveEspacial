package NaveEscapacial1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

	
public class FrameNave extends JFrame implements KeyListener{
		
	private Nave nave;
	private JLabel etiqueta;
	private Bala[] balas;
	private JPanel panel;
	private int contador;

	public FrameNave(Nave nave, String nombre, Bala[] balas, JPanel panel) throws HeadlessException {
		super("Juego Espacial");
		setLayout(new BorderLayout());
		setBackground(Color.GRAY);
		this.nave = nave;
		this.balas = balas;
		this.panel = panel;
		setContador(0);
		String s = String.format("Nombre: %s         Balas: %d", nombre,50-getContador());
		etiqueta = new JLabel(s);
		add(etiqueta, BorderLayout.SOUTH);
		addKeyListener(this);
		add(panel, BorderLayout.CENTER);
	}


	public int getContador() {
		return contador;
	}


	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public void keyTyped(KeyEvent evento) {
		String s = String.format("%s", evento.getKeyChar());
		if(s.equalsIgnoreCase(" ")) {
			if(contador < 50) {
				balas[contador].setIncy(9);
				nave.disparar(balas[contador]);
				setContador(getContador()+1);
				keyPressed(evento);
			}
		}
				
	}
 
	@Override
	public void keyPressed(KeyEvent e) {
		try {
			int v = e.getKeyCode();
			int x = panel.getWidth(), y = panel.getHeight();			
			switch (v) {
				case 68:
					nave.mover(x, y);
					for(Bala a : balas)
						a.mover(380, 600, nave.getX());
					break;
				case 65:
					nave.moverO(x, y);
					for(Bala a : balas)
						a.mover(380, 600, nave.getX());
					break;
				case 32:
					
					break;
				default:
					throw new Exception();
			
			}
		} catch (Exception e2) {
			System.out.println("COmando no permitido");
		}
			
	}


	@Override
	public void keyReleased(KeyEvent e) {
		
			
	}	

}


