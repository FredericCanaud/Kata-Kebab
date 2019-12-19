package ingredient;

import visiteur.Regime;

public class Tomate extends Ingredient {

	protected String nom;
	
	public Tomate(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}

}
