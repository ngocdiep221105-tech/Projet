package test_fonctionnel;

import personnages.Gaulois;

public class TestGaulois {
	public static void main(String[] args){
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois obelix = new Gaulois("Ob�lix",16);
		asterix.parler("Bonjour Ob�lix.");
		obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers ?)");
		asterix.parler("Oui tr�s bonne id�e.");
	}
}
