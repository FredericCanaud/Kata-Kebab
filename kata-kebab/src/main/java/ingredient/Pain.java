
package ingredient;

import visiteur.Regime;

public class Pain extends Ingredient {

	protected String nom;
	
	public Pain(String nom) {
		this.nom = nom;
	}
	
	public boolean accept(Regime regime) {
		return regime.visiter(this);
	}

}
