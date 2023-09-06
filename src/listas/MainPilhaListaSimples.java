package listas;

public class MainPilhaListaSimples {
	
	public static ListaSimplesEncadeada add(ListaSimplesEncadeada lista,Pessoa p) {
		if(lista==null) {
			ListaSimplesEncadeada l=new ListaSimplesEncadeada();
			l.informacao=p;
			lista=l;
		}
			
		else {
			lista.proximo = add(lista.proximo,p);
		}
		return lista;
	}
	public static void main(String[] args) {
		ListaSimplesEncadeada lse1=new ListaSimplesEncadeada();
		
		add(lse1, new Pessoa("A",1));
		
		
	}

}
