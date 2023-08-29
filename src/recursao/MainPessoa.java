package recursao;

public class MainPessoa {
	
	public static void imprimir_pai_filho(Pessoa p) {
		if(p!=null)
			System.out.print(">> Pai:"+p.nome );
		else
			System.out.println("Fim Lista");
		if(p.filho!=null) {
			System.out.println(" >> Filho:"+p.filho.nome);
			imprimir_pai_filho(p.filho);
		}		
	}
	
	
	public static void main(String[] args) {
		Pessoa p1=new Pessoa();
		p1.nome="Falono";		
		Pessoa p2=new Pessoa();
		p2.nome="Ciclano";
		p1.filho=p2;
		Pessoa p3=new Pessoa();
		p1.filho.filho=p3;
		p2.filho=p3;
		p1.filho.filho=p3;
		Pessoa p4= new Pessoa();
		p4.nome="Beltrano";
		p3.filho=p4;
		p1.filho.filho.filho=p4;
		Pessoa p5=new Pessoa();
		p5.nome="Fulano Filho";
		p4.filho=p5;
		p1.filho.filho.filho.filho=p5;
		imprimir_pai_filho(p1);
		
		/*System.out.println(p1.nome);
		System.out.println(p1.filho.nome);
		System.out.println(p1.filho.filho.nome);
		System.out.println(p1.filho.filho.filho.nome);
		System.out.println(p1.filho.filho.filho.filho.nome);
		*/
		//imprimir_pai_filho(p1);
		/* familia=null;
		Pessoa p1=new Pessoa();
		p1.nome="Falono";
		familia=add_filho(familia, p1);
		
		Pessoa p2=new Pessoa();
		p2.nome="Ciclano";
		familia=add_filho(familia, p2);
		
		Pessoa p3=new Pessoa();
		p3.nome="Fulana";
		familia=add_filho(familia, p3);
		
		Pessoa p4= new Pessoa();
		p4.nome="Beltrano";
		familia=add_filho(familia, p4);
		
		Pessoa p5=new Pessoa();
		p5.nome="Fulano Filho";
		familia=add_filho(familia, p5);
		imprimir_pai_filho(familia);*/
	}
}
