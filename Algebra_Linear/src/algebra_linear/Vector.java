package algebra_linear;

public class Vector {

	int dim;
	double elements[];
	
	Vector(int dim, double elements[]){
		
		this.dim = dim;
		this.elements = elements;
		
	}
	Vector(int dim){
		
		this.dim = dim;
		this.elements = new double[dim];
		for(int i=0;i<this.dim;i++) {
			this.elements[i] = 0;
		}
		
		
	}
	
	double get(int i) {
		return this.elements[i];
	}
	
	void set(int i, double value) {
		this.elements[i] = value;
	}
	void show() {
		for(int i=0;i<this.dim;i++) {
			System.out.printf("%.5f\n",this.elements[i]);
		}
	}
	public void add(double i) {
		double[] aux1 = new double[this.dim+1];
		for(int j=0;j<this.dim;j++) {
			aux1[j] = this.elements[j];
		}
		aux1[this.dim] = i;
		this.elements = aux1;
		this.dim++;
	}
	
	public void pop() {
		double[] aux = new double[this.dim-1];
		for(int i=0;i<this.dim-1;i++) {
			aux[i] = this.elements[i];
		}this.elements = aux;
		this.dim--;
	}
	
	public void update(Vector vector) {
		this.dim = vector.dim;
		this.elements = vector.elements;
	}
	
}
