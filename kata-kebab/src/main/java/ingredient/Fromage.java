package ingredient;

import visiteur.Regime;

public class Fromage extends Ingredient {

	protected String nom;
	
	public Fromage(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}

}
