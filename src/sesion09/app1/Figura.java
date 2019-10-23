package sesion09.app1;

/**
 * 
 * @author mactecsup
 *
 */
public abstract class Figura {

	protected float dim1;
	protected float dim2;
	
	/**
	 * 
	 * @param d1
	 * @param d2
	 */
	public Figura(float d1, float d2) {
		this.dim1 = d1;
		this.dim2 = d2;
	}
	
	
	public abstract float area();
	
}
