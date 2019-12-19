package ingredient;

import visiteur.Regime;

public class Salade extends Ingredient {

	protected String nom;
	
	public Salade(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}

}
