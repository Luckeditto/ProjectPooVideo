package pooProjetoFinalGuanabara;

public class ProjetoYoutube {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		
		
		User[] u = new User[2];
		u[0]= new User("Lucas", 19, "M", "lucked");
		u[1] = new User("Raissa", 20, "F", "raiss");
		
		Visualizacao vis[] = new Visualizacao[5];
		 vis[0] = new Visualizacao(u[0],v[2]);//assiste html5
		 vis[0].avaliar(); //avalia com nota 5
		System.out.println(vis[0].toString());
		
		
		vis[1] = new Visualizacao(u[0], v[1]);//assiste php
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("\nVIDEOS\n-----------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println("\nUSUARIOS\n-------------------");
		System.out.println(u[0].toString());
		System.out.println(u[1].toString());
		
		
		
	}

}
