
public class Math {
	public String convertDecToBin(Integer numero) {
		String retorno = "";
		int resto = 0;
		
		while (numero > 0) {
			resto = numero % 2;
			numero = (numero - resto) / 2;
			
			switch (numero) {
				case 1:
				case 0:
					retorno = Integer.toString(numero) + retorno;
					break;	
				default:
					retorno = Integer.toString(resto) + retorno;
					break;
			}
				
		}
		return retorno;
	}
}