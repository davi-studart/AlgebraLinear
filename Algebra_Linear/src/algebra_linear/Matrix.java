package algebra_linear;

public class Matrix {
	
	int rows;
	int cols;
	double elements[][];
	
	Matrix(int rows, int cols) {
		
		this.rows = rows;
		this.cols = cols;
		this.elements = new double[this.rows][this.cols];
		for(int i=0;i<this.rows;i++) {
			for(int j=0;j<this.cols;j++) {
				this.elements[i][j] = 0;
			}
		}
		
	}
	Matrix(int rows, int cols, double elements[][]) {
		
		matrix(rows,cols);
		for(int i=0;i<elements.length;i++) {
			for(int j=0;j<elements[0].length;j++) {
				this.elements[i][j] = elements[i][j];
			}
		}
		
	}
	
	private void matrix(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		this.elements = new double[this.rows][this.cols];
		for(int i=0;i<this.rows;i++) {
			for(int j=0;j<this.cols;j++) {
				this.elements[i][j] = 0;
			}
		}
		
	}
	double get(int i,int j) {
		
		return this.elements[i][j];
		
	}
	void set(int i,int j,double value) {
		this.elements[i][j] = value;
	}
	
	void show() {
		for(int i=0;i<this.rows;i++) {
			for(int j=0;j<this.cols;j++) {
				System.out.print(this.get(i, j)+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	void rowSwap(int a,int b) {
		double aux[] = this.elements[a];
		this.elements[a] = this.elements[b];
		this.elements[b] = aux;
	}
	
}
