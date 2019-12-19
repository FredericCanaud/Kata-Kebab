package ingredient;

import visiteur.Regime;

public class Thon extends Ingredient {

	protected String nom;
	
	public Thon(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}


}
