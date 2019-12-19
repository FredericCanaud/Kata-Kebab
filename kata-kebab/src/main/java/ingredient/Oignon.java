package ingredient;

import visiteur.Regime;

public class Oignon extends Ingredient {

	protected String nom;
	
	public Oignon(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}

}
