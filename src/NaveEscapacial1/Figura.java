package NaveEscapacial1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Figura {
	
	//Atributos
	private int x, y;
	private int ancho, alto;
	private int incx, incy;
	private Color color;
	
	//Constructor de la clase
	public Figura(int x, int y, int ancho, int alto, int incx, int incy, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.incx = incx;
		this.incy = incy;
		this.color = color;
	}//Fin del Cosntructor	

	public int getIncx() {
		return incx;
	}

	public void setIncx(int incx) {
		this.incx = incx;
	}

	public int getIncy() {
		return incy;
	}

	public void setIncy(int incy) {
		this.incy = incy;
	}

	public int getX() {
		return x;
	}	

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public boolean collision(Obstaculo b) {
		boolean flag = false;
		int x = getX(), y = getY();
		/*if(y <= b.getY()+b.getAlto() && ((x>=b.getX()-getAncho() && x<=b.getX()+getAncho())))
			flag = true;*/
		if((y<=b.getY()+b.getAlto() || y<=b.getY()-b.getAlto()) && (x>=b.getX()-getAncho() && x<=b.getX()+getAncho())) {
			flag = true;
			System.out.println(flag);
		}
			
		return flag;		
	}
	
	public abstract void trazar(Graphics g);
	
	public abstract void mover(int xmax, int ymax);
	
	public void dibujar(Graphics g) {
		
		g.setColor(color);
		trazar(g);
	}

}//Fin de la clase 
