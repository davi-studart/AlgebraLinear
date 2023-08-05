package algebra_linear;

public class Ordenavel implements Comparable<Ordenavel> {
	
	private int posição;
	private double valor;
	
	
	Ordenavel(int pos,double val){
		this.setPosição(pos);
		this.setValor(val);
	}
	@Override
	public int compareTo(Ordenavel o) {
		
		if(this.getValor()>o.getValor()) {
			return -1;
		}else if(this.getValor()<o.getValor()) {
			return 1;
		}else return 0;
	}
	public int getPosição() {
		return posição;
	}
	public void setPosição(int posição) {
		this.posição = posição;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
