package exes;
public class Exe1 {

	public int[] inverteArray(int[] array) {
		int[] arrayInverso = new int[array.length];
		int index = 0;
		
		for (int i=array.length-1; i >=0; i--) {
			arrayInverso[index] = array[i];
			index++;
		}
		
		return arrayInverso;
	}
}
