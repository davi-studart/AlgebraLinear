package algebra_linear;

public class LinearAlgebra {

	
	public static Matrix transpose(Matrix a) {
		Matrix aux = new Matrix(a.cols,a.rows);
		
		for(int i=0;i<a.rows;i++) {
			for(int j=0;j<a.cols;j++) {
				aux.set(j, i, a.get(i, j));
			}
		}
		return aux;
	}
	
	public static Matrix transpose(Vector a) {
		Matrix aux = new Matrix(1,a.dim);
		
			for(int j=0;j<a.dim;j++) {
				aux.set(0, j, a.get(j));
			}
	
		return aux;
	}
	
	public static Vector sum(Vector a,Vector b) {
		if(a.dim == b.dim) {
			Vector aux = new Vector(a.dim);
			
			for(int i=0;i<a.dim;i++) {
				aux.set(i, (a.get(i)+b.get(i)));
			}
				
			return aux;
		}
		else {
			Vector aux = new Vector(1);
			System.out.println("ORDENS INCOMPATIVEIS");
			return aux;
		}
	}
	public static Matrix sum(Matrix a,Matrix b) {
		
		if(a.rows==b.rows && a.cols==b.cols) {
			Matrix aux = new Matrix(a.rows,a.cols);
			
			for(int i=0;i<a.rows;i++) {
				for(int j=0;j<a.cols;j++) {
					aux.set(i, j, (a.get(i, j)+b.get(i, j)));
				}
			}
			return aux;
		}else {
			Matrix aux = new Matrix(1,1);
			System.out.println("ORDENS INCOMPATIVEIS");
			return aux;
		}
		
	}
	
	public static Matrix times(double a,Matrix b) {
		
		Matrix aux = new Matrix(b.rows,b.cols);
		
		for(int i=0;i<b.rows;i++) {
			for(int j=0;j<b.cols;j++) {
				aux.set(i, j, (a*b.get(i, j)));
			}
		}
		return aux;
		
	}
	public static Vector times(double a,Vector b) {
		
		Vector aux = new Vector(b.dim);
		
		for(int i=0;i<b.dim;i++) {
			aux.set(i, (a*b.get(i)));
		}
		return aux;
		
	}
	public static Matrix times(Matrix a,Matrix b) {
		
		if(a.rows==b.rows && a.cols==b.cols) {
			Matrix aux = new Matrix(a.rows,a.cols);
			
			for(int i=0;i<a.rows;i++) {
				for(int j=0;j<a.cols;j++) {
					aux.set(i, j, (a.get(i, j)*b.get(i, j)));
				}
			}
			return aux;
		}else {
			Matrix aux = new Matrix(1,1);
			System.out.println("ORDENS INCOMPATIVEIS");
			return aux;
		}
		
		
	}
	public static Vector times(Vector a,Vector b) {
		
		if(a.dim == b.dim) {
			Vector aux = new Vector(b.dim);
			
			for(int i=0;i<b.dim;i++) {
				aux.set(i, (a.get(i)*b.get(i)));
			}
			return aux;
		}else {
			Vector aux = new Vector(1);
			System.out.println("ORDENS INCOMPATIVEIS");
			return aux;
		}
		
	}
	
	public static Matrix dot(Matrix a,Matrix b) {
		if(a.cols==b.rows) {
			Matrix aux = new Matrix(a.rows,b.cols);
			
			for(int i=0;i<aux.rows;i++) {
				for(int j=0;j<aux.cols;j++) {
					double soma =0;
					for(int k=0;k<a.cols;k++) {
						soma+= (a.get(i, k)*b.get(k, j));
					}
					aux.set(i, j, soma);
				}
			}
			return aux;
		}else {
			Matrix aux = new Matrix(1,1);
			System.out.println("ORDENS INCOMPATIVEIS");
			return aux;
		}
		
	}
	
	public static Vector dot(Matrix a,Vector b) {
		if(a.cols==b.dim) {
			Vector aux = new Vector(a.rows);
			
			for(int i=0;i<a.rows;i++) {
				for(int j=0;j<a.cols;j++) {
					double soma =0;
					for(int k=0;k<a.cols;k++) {
						soma+= (a.get(i, k)*b.get(k));
					}
					aux.set(i,soma);
				}
			}
			return aux;
		}else {
			Vector aux = new Vector(1);
			System.out.println("ORDENS INCOMPATIVEIS");
			return aux;
		}
	}
	
	
	
	public static Matrix gauss(Matrix a) {
		Matrix aux = new Matrix(a.rows,a.cols);
		
		for(int i=0;i<aux.rows;i++) {
			for(int j=0;j<aux.cols;j++) {
				aux.set(i, j, a.get(i, j));

			}
		}
		
		
		
		for(int i=0;i<aux.cols;i++) {
			for(int j=0;j<aux.rows;j++) {
			if(i<j) {
				double konst = aux.get(j, i)/aux.get(i, i);
				for(int k=0;k<aux.cols;k++) {
						aux.set(j, k, (aux.get(j, k)-konst*(aux.get(i, k))));
					}
				}
			}
		}
		return aux;
	}
	
	public static Vector solve(Matrix a) {
		Matrix aux = gauss(a);
		
		for(int i=aux.cols-2;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				double divide = aux.get(i, i);
				
				for(int k=0;k<aux.cols;k++) {
					aux.set(j, k, (aux.get(j, k)/divide));
				}
				if(i>j) {
					double konst = aux.get(j, i)/aux.get(i, i);
					for(int k=0;k<aux.cols;k++) {
						aux.set(j, k, (aux.get(j, k)-konst*(aux.get(i, k))));
					}
				}
			}
		}
		Vector vector = new Vector(aux.rows);
		for(int i=0;i<vector.dim;i++) {
			vector.set(i, aux.get(i, aux.cols-1));
			if(aux.get(i, i)==0) {
				System.out.println("SEM SOLUCAO");
				Vector temp = new Vector(1);
				return temp;
			}
		}
		return vector;
	}
	
	public static double length(Vector a) {
		return Math.sqrt(LinearAlgebra.dot(LinearAlgebra.transpose(a), a).get(0));
	}
	
	
	
}
