package kebab;

import java.util.LinkedList;
import java.util.List;

import ingredient.Ingredient;

public class Assiette {

	List<Ingredient> ingredients =  new LinkedList<>();

	public Assiette avec(Ingredient ingredient) {
		this.ingredients.add(ingredient);
		return this;
	}

	public Kebab confectionnerKebab() {
		return new Kebab(ingredients);
	}

}
