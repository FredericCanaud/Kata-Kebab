package ingredient;

import visiteur.Regime;

public class Crevette extends Ingredient {

	protected String nom;
	
	public Crevette(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}
	
}