package Exercice2;

public class Oiseau extends Animal implements Deplacable {
    public Oiseau(String nom, double poids) {
        super(nom, poids);
    }

    @Override
    public void seDeplacer() {
        System.out.println(getNom() + " vole dans le ciel !");
    }
}
