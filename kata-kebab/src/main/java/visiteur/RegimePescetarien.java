package visiteur;

import ingredient.Agneau;
import ingredient.Crevette;
import ingredient.Fromage;
import ingredient.Oignon;
import ingredient.Pain;
import ingredient.Salade;
import ingredient.Sauce;
import ingredient.Thon;
import ingredient.Tomate;

public class RegimePescetarien implements Regime {

	@Override
	public boolean visiter(Agneau angeau) {
		return false;
	}

	@Override
	public boolean visiter(Crevette crevette) {
		return true;
	}

	@Override
	public boolean visiter(Fromage fromage) {
		return true;
	}

	@Override
	public boolean visiter(Oignon oignon) {
		return true;
	}

	@Override
	public boolean visiter(Pain pain) {
		return true;
	}

	@Override
	public boolean visiter(Salade salade) {
		return true;
	}

	@Override
	public boolean visiter(Sauce sauce) {
		return true;
	}

	@Override
	public boolean visiter(Thon thon) {
		return true;
	}

	@Override
	public boolean visiter(Tomate tomate) {
		return true;
	}

	
}
