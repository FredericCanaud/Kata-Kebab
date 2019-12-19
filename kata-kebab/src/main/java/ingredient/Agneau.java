package ingredient;

import visiteur.Regime;

public class Agneau extends Ingredient {

	protected String nom;
	
	public Agneau(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}
    
}
