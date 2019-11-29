package NaveEscapacial1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Obstaculo extends Figura{
	
	private static final Random PA = new Random();

	

	public Obstaculo(int xmax, int ymax) {
		super(PA.nextInt(xmax-50),PA.nextInt(600-40)*(-1), 10, 30, 1, 1, Color.BLUE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trazar(Graphics g) {
		g.fillRect(getX(), getY(), getAncho(), getAlto());
		
	}

	@Override
	public void mover(int xmax, int ymax) {
		int y = getY();
		if(y < ymax) {
			y += getIncy();
			setY(y);
		}else {
			setY(-30);
			setX(PA.nextInt(xmax));
		}
			
		
	}
	
	public void desaparecer() {
		setY(-50);
	}

}
