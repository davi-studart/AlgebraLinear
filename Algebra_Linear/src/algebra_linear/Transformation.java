package algebra_linear;

public class Transformation {
	public static void translate2D(Vector vector, double dx, double dy) {
		double[][] elements = {{1,0,dx},{0,1,dy},{0,0,1}};
		Matrix aux = new Matrix(3,3,elements);
		vector.add(1);
			
		vector.update(LinearAlgebra.dot(aux, vector));
			
		vector.pop();
			
		}
	public static void translate3D(Vector vector,double dx,double dy,double dz) {
		
		double[][] elements = {{1,0,0,dx},{0,1,0,dy},{0,0,1,dz},{0,0,0,1}};
		
		Matrix aux = new Matrix(4,4,elements);
		
		vector.add(1);
		
		vector.update(LinearAlgebra.dot(aux, vector));
		
		vector.pop();
		
	}
	
	public static void rotation2D(Vector vector, double angle) {
		double[][] aux = {{Math.cos(angle),-Math.sin(angle),0},{Math.sin(angle),Math.cos(angle),0},{0,0,1}};
		Matrix aux1 = new Matrix(3,3,aux);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux1, vector));
		vector.pop();
	}
	
	public static void rotation3DX(Vector vector,double angle) {
		double[][] aux = {{1,0,0,0},{0,Math.cos(angle),-Math.sin(angle),0},{0,Math.sin(angle),Math.cos(angle),0},{0,0,0,1}};
		Matrix aux1 = new Matrix(4,4,aux);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux1, vector));
		vector.pop();
	}
	
	public static void rotation3DY(Vector vector,double angle) {
		double[][] aux = {{Math.cos(angle),0,-Math.sin(angle),0},{0,1,0,0},{Math.sin(angle),0,Math.cos(angle),0},{0,0,0,1}};
		Matrix aux1 = new Matrix(4,4,aux);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux1, vector));
		vector.pop();
	}
	
	public static void rotation3DZ(Vector vector,double angle) {
		double[][] aux = {{Math.cos(angle),-Math.sin(angle),0,0},{Math.sin(angle),Math.cos(angle),0,0},{0,0,1,0},{0,0,0,1}};
		Matrix aux1 = new Matrix(4,4,aux);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux1, vector));
		vector.pop();
	}
	
	public static void reflection2DX(Vector vector) {
		double[][] elements = {{1,0,0},{0,-1,0},{0,0,1}};
		Matrix aux = new Matrix(3,3,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void reflection2DY(Vector vector) {
		double[][] elements = {{-1,0,0},{0,1,0},{0,0,1}};
		Matrix aux = new Matrix(3,3,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void reflection3DX(Vector vector) {
		double[][] elements = {{1,0,0,0},{0,-1,0,0},{0,0,-1,0},{0,0,0,1}};
		Matrix aux = new Matrix(4,4,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void reflection3DY(Vector vector) {
		double[][] elements = {{-1,0,0,0},{0,1,0,0},{0,0,-1,0},{0,0,0,1}};
		Matrix aux = new Matrix(4,4,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void reflection3DZ(Vector vector) {
		double[][] elements = {{-1,0,0,0},{0,-1,0,0},{0,0,1,0},{0,0,0,1}};
		Matrix aux = new Matrix(4,4,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void projection2DX(Vector vector) {
		double[][] elements = {{1,0,0},{0,0,0},{0,0,1}};
		Matrix aux = new Matrix(3,3,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	public static void projection2DY(Vector vector) {
		double[][] elements = {{0,0,0},{0,1,0},{0,0,1}};
		Matrix aux = new Matrix(3,3,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void projection3DX(Vector vector) {
		double[][] elements = {{1,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,1}};
		Matrix aux = new Matrix(4,4,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void projection3DY(Vector vector) {
		double[][] elements = {{0,0,0,0},{0,1,0,0},{0,0,0,0},{0,0,0,1}};
		Matrix aux = new Matrix(4,4,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void projection3DZ(Vector vector) {
		double[][] elements = {{0,0,0,0},{0,0,0,0},{0,0,1,0},{0,0,0,1}};
		Matrix aux = new Matrix(4,4,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	
	public static void shearingX(Vector vector,double ky) {
		
		double[][] elements = {{1,0,0},{ky,1,0},{0,0,1}};
		
		Matrix aux = new Matrix(3,3,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
	public static void shearingY(Vector vector,double kx) {
		
		double[][] elements = {{1,kx,0},{0,1,0},{0,0,1}};
		
		Matrix aux = new Matrix(3,3,elements);
		vector.add(1);
		vector.update(LinearAlgebra.dot(aux, vector));
		vector.pop();
	}
}
