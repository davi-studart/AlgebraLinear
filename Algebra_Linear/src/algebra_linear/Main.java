package algebra_linear;

public class Main {

	public static void main(String[] args) {

		double[][] questao5 = {
				{0,0,1,0},
				{1,0,0,0},
				{1,1,0,0},
				{0,1,0,0}
		};
		double[][] questao6 = {
				{0,1,1,0},
				{0,0,1,0},
				{1,0,0,1},
				{1,0,0,0}
		};
		double[][] questao7 = {
				{0,1,1,1,0},
				{1,0,0,0,1},
				{0,0,0,0,1},
				{0,1,0,0,0},
				{0,1,1,0,0}
		};
		double[][] questao8 = {
				{0,1,1,0,1,1,0,0,0,1},
				{0,0,1,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,1},
				{0,1,1,0,0,1,1,0,0,1},
				{0,0,0,1,0,0,0,0,0,0},
				{0,1,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,1,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,1,1,0,0,1,0,1,0,1},
				{0,0,0,0,0,1,0,0,0,0}
		};
		Matrix A = new Matrix(10, 10, questao8);
		
		System.out.println(PageRank.ordenarPorAutoridade(A));
		
	
		
		
		
		
		
	}

}
