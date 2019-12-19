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

public interface Regime {
	
	public boolean visiter(Agneau angeau);
	public boolean visiter(Crevette crevette);
	public boolean visiter(Fromage fromage);
	public boolean visiter(Oignon oignon);
	public boolean visiter(Pain pain);
	public boolean visiter(Salade salade);
	public boolean visiter(Sauce sauce);
	public boolean visiter(Thon thon);
	public boolean visiter(Tomate tomate);
	
}
