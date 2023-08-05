package algebra_linear;

import java.util.ArrayList;
import java.util.Collections;

public class PageRank {
	static public Vector vetorCentro(Matrix a) {
		Vector vector = new Vector(a.rows);
		for(int i=0;i<a.rows;i++) {
			int s=0;
			for(int j=0;j<a.cols;j++) {
				s+= a.elements[i][j];
			}
			vector.elements[i] = s;
		}
		return vector;
	}
	static public Vector vetorAutoridade(Matrix a) {
		return vetorCentro(LinearAlgebra.transpose(a));
	}
	static public Vector Hn(Matrix m,Vector a) {
		return LinearAlgebra.times(1/(LinearAlgebra.length((LinearAlgebra.dot(m, a)))),(LinearAlgebra.dot(m, a)));
	}
	static public Vector An(Matrix m,Vector h) {
		return LinearAlgebra.times(1/(LinearAlgebra.length((LinearAlgebra.dot(m, h)))),(LinearAlgebra.dot(m, h)));
	}
	static public Vector calcularAutoridade(Matrix A) {
		Vector inicial = PageRank.vetorAutoridade(A);
		
		Vector a0 = PageRank.An(A, inicial);
		double tolerancia = 0.000001;
		boolean continua = true;
		boolean maiorQueTolerancia = true;
		while(continua) {
			Vector a1 = PageRank.An(LinearAlgebra.dot(LinearAlgebra.transpose(A), A), a0);
			for(int i=0;i<inicial.dim;i++) {
				 maiorQueTolerancia = ((a1.get(i)-a0.get(i))>tolerancia);
				 if(maiorQueTolerancia) break;
			}
			a0 = a1;
			if(!maiorQueTolerancia) continua = false;
			
		}
		return a0;
	}
	static public String ordenarPorAutoridade(Matrix A) {
		
		Vector vector = PageRank.calcularAutoridade(A);
		ArrayList<Ordenavel> lista = new ArrayList<Ordenavel>();
		for(int i=0;i<vector.dim;i++) {
			Ordenavel site = new Ordenavel(i+1,vector.get(i));
			lista.add(site);
		}
		Collections.sort(lista);
		String s ="";
		for(int i=0;i<lista.size();i++) {
			s+=String.format("%d\n", lista.get(i).getPosição());
		}
		return s;
		
		
	}
	
}
