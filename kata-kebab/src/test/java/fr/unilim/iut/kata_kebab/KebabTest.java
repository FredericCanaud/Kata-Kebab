package fr.unilim.iut.kata_kebab;


import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import ingredient.Agneau;
import ingredient.Crevette;
import ingredient.Fromage;
import ingredient.Oignon;
import ingredient.Pain;
import ingredient.Sauce;
import ingredient.Thon;
import ingredient.Tomate;
import kebab.Assiette;
import kebab.Kebab;

public class KebabTest {

    private Kebab kebabAgneau;
    private Kebab kebabVegetarien;
    private Kebab kebabThon;
    private Kebab kebabCrevette;
    
    @Before
    public void setUp() {

        kebabAgneau = new Assiette()
        		.avec(new Pain("Pain viennois"))
        		.avec(new Oignon("Oignon"))
        		.avec(new Sauce("Sauce béarnaise"))
        		.avec(new Agneau("Gigot d'agneau"))
        		.avec(new Tomate("Coeur de beauf"))
        		.confectionnerKebab();
       
            
        kebabVegetarien = new Assiette()
        		.avec(new Pain("Pain viennois"))
        		.avec(new Sauce("Mayonnaise"))
        		.avec(new Oignon("oignon blanc"))
        		.avec(new Tomate("tomate rouge"))
        		.avec(new Fromage("gruyere"))
        		.confectionnerKebab();
        
        kebabThon = new Assiette()
        		.avec(new Thon("poisson"))
        		.avec(new Sauce("sauce algérienne"))
        		.avec(new Fromage("gruyere"))
        		.avec(new Oignon("oignon blanc"))
        		.avec(new Pain("Pain viennois"))
        		.confectionnerKebab();
        
        kebabCrevette = new Assiette()
        		.avec(new Tomate("tomate rouge"))
        		.avec(new Crevette ("petite crevette"))
        		.avec(new Sauce("sauce algérienne"))
        		.avec(new Fromage("cheddar"))
        		.avec(new Pain("Pain viennois"))
        		.confectionnerKebab(); 

    }
    
    @Test
    public void un_kebab_contient_bien_les_noms_de_tous_les_ingredients_ajoutes() {
    	assertThat(kebabAgneau.listerLesIngredients()).extracting("nom")
    	.containsExactly("Pain viennois","Oignon", "Sauce béarnaise", "Gigot d'agneau", "Coeur de beauf");

    	assertThat(kebabVegetarien.listerLesIngredients()).extracting("nom")
		.containsExactly("Pain viennois","Mayonnaise","oignon blanc","tomate rouge","gruyere");
    	
     	assertThat(kebabThon.listerLesIngredients()).extracting("nom")
		.containsExactly("poisson","sauce algérienne","gruyere","oignon blanc","Pain viennois");
    
     	assertThat(kebabCrevette.listerLesIngredients()).extracting("nom")
		.containsExactly("tomate rouge","petite crevette","sauce algérienne","cheddar","Pain viennois");
    }


    //Vegetarien
    @Test
    public void isVegetarien_devrait_retourner_vrai_pour_kebabVegetarien() {
        assertThat(kebabVegetarien.isVegetarien()).isTrue();
     }

    @Test
    public void isVegetarien_devrait_retourner_faux_pour_kebabAgneau() {
        assertThat(kebabAgneau.isVegetarien()).isFalse();
    }

    @Test
    public void isVegetarien_devrait_retourner_faux_pour_kebabThon() {
        assertThat(kebabThon.isVegetarien()).isFalse();
    }
    
    @Test
    public void isVegetarien_devrait_retourner_faux_pour_kebabCrevette() {
        assertThat(kebabCrevette.isVegetarien()).isFalse();
    }

    //Pescetarien
    @Test
    public void isPescetarien_devrait_retourner_faux_pour_kebabAgneau() {
        assertThat(kebabAgneau.isPescetarien()).isFalse();
    }

    @Test
    public void isPescetarien_devrait_retourner_vrai_pour_kebabVegetarien() {
        assertThat(kebabVegetarien.isPescetarien()).isTrue();
    }

    @Test
    public void isPescetarien_devrait_retourner_vrai_pour_kebabkebabThon() {
        assertThat(kebabThon.isPescetarien()).isTrue();
    }
    
    @Test
    public void isPescetarien_devrait_retourner_vrai_pour_kebabCrevette() {
        assertThat(kebabCrevette.isPescetarien()).isTrue();
    }

}

