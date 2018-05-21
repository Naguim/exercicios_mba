import java.util.Arrays;

public class ArrayFunc {
	private int[] sequencia;
	
	ArrayFunc(int[] sequencia){
		this.sequencia = sequencia;
	}
	
	public int sum() {
		int soma = 0;
		for(int i=0;i<sequencia.length;i++) {
			soma += sequencia[i];
		}
		return soma;
	}
	
	public double avg() {
		return (double) this.sum()/sequencia.length;
	}
	
	public void order() {
		Arrays.sort(this.sequencia);
	}
	
	public int min() {
		this.order();
		return sequencia[0];
	}
	
	public int max() {
		this.order();
		return sequencia[sequencia.length-1];
	}
	
	public int[] getSequencia() {
		return sequencia;
	}
	public void setSequencia(int[] sequencia) {
		this.sequencia = sequencia;
	}
	
	public String toString() {
		System.out.println("Soma: " + Integer.toString(this.sum()));
		System.out.println("Média: " + Double.toString(this.avg()));
		System.out.println("Min: " + Integer.toString(this.min()));
		System.out.println("Max: " + Double.toString(this.max()));
		
		return super.toString();
	}
}
