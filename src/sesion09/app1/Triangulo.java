package sesion09.app1;

public class Triangulo extends Figura {

	public Triangulo(float d1, float d2) {
		super(d1, d2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float area() {
		// TODO Auto-generated method stub
		
		float area;
		
		area =  this.dim1 * this.dim2 / 2 ;
		
		return area;
	}

}
