package NaveEscapacial1;

import java.awt.Color;
import java.awt.Graphics;

public class Bala extends Figura{
	
	private boolean estado;
	

	public Bala(int x, int y) {
		super(x, y, 10, 10, 0, 0, Color.BLACK);
		setEstado(false);
	}
	
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public void trazar(Graphics g) {
		g.fillOval(getX(), getY(), getAncho(), getAlto());
		
	}

	public void mover(int xmax, int ymax, int xVave) {
		if(!isEstado())
			setX(xVave);		
	}

	@Override
	public void mover(int xmax, int ymax) {		
		if(getIncy() != 0) {
			int y = getY();
			y -= getIncy();
			setY(y);
			setEstado(true);
		}
	}
	
	

}
