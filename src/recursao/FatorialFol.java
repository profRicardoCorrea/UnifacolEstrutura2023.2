package recursao;

public class FatorialFol {
	public static void main(String[] args) {
		int n=135;
		long fatorial=1;
		for(int i=n;i>=1;i--) {
			fatorial=fatorial*(long)i;
			System.out.println(i);
		}
		System.out.println("Fatorial:"+fatorial);
	}
}
