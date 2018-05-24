package exes;

public class Exe5 {

	public int fatorial(int num) {
		int acumulado = 1;
		
		for (int i = num; i > 0; i--) {
			acumulado *= num;
			num--;
		}
		
		return acumulado;
	}
}
