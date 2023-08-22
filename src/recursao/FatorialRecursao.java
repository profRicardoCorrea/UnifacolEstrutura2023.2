package recursao;

public class FatorialRecursao {
	
	public static int fatorial(int n) {
		if(n>1)
			return n*fatorial(n-1);
		else
			return 1;
	}
	
	public static void main(String[] args) {
		int n=5;
		 
		System.out.println("Fatorial:"+fatorial(n));
	}
}
