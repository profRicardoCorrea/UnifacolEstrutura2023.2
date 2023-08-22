package recursao;

public class SomatorioRecursao {
	
	public static int somatorio(int n) {
		if(n>=1)
			return n+somatorio(n-1);
		else
			return 0;
	}
	
	public static void main(String[] args) {
		int n=230;
		 
		System.out.println("Somatorio:"+somatorio(n));
	}
}
