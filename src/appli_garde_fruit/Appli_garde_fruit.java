package appli_garde_fruit;

public class Appli_garde_fruit {

	public static void main(String[] args) {


		// Définir directement la quantité de pommes en stock
		int stockPommes = 80; 

		// Vérifier si le stock est suffisant
		if (stockPommes > 100) {
			System.out.println("Le stock de pommes est suffisant pour demain.");
		} else {
			System.out.println("Le stock de pommes est insuffisant. Il faut en commander.");
		}
	}

}


