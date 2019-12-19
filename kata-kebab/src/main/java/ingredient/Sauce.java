package ingredient;

import visiteur.Regime;

public class Sauce extends Ingredient {

	protected String nom;
	
	public Sauce(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}

}
