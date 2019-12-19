package kebab;

import java.util.ArrayList;
import java.util.List;

import ingredient.Ingredient;
import visiteur.RegimePescetarien;
import visiteur.RegimeVegetarien;

public class Kebab {
	
	List<Ingredient> ingredients = new ArrayList<Ingredient>();
	public Kebab(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	public List<Ingredient> listerLesIngredients(){
		return this.ingredients;
	}
	public boolean isVegetarien() {
		RegimeVegetarien vegetarien = new RegimeVegetarien();
		for(Ingredient ingredient : ingredients) {
			if(!ingredient.accept(vegetarien)) {
				return false;
			}
		}
		return true;
	}
	public boolean isPescetarien() {
		RegimePescetarien pescetarien = new RegimePescetarien();
		for(Ingredient ingredient : ingredients) {
			if(!ingredient.accept(pescetarien)) {
				return false;
			}
		}
		return true;
	}
}
