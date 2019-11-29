package NaveEscapacial1;

import java.awt.Color;
import java.awt.Graphics;

public class Nave extends Figura{
	

	public Nave(int x, int y) {
		super(x, y, 20, 40, 6, 6, Color.GREEN);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trazar(Graphics g) {		
		g.fillRect(getX(), getY(), getAncho(), getAlto());
		
	}// fin del metodo trazar()
	
	public void disparar(Bala b) {
		b.mover(0, 0);
	}

	@Override
	public void mover(int xmax, int ymax) {
		int x = getX();
		if(x < xmax) {
			x += getIncx();
			setX(x);
		}else
			System.out.println("Limite Alcanzado");
	}
	
	public void moverO(int xmax, int ymax) {		
		int x = getX();
		if(x > 0) {
			x -= getIncx();
			setX(x);
		}else
			System.out.println("Limite Alcanzado");
	}

}
