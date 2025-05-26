package Exercice2;

public class Chien extends Animal implements Deplacable {
    public Chien(String nom, double poids) {
        super(nom, poids);
    }

    @Override
    public void seDeplacer() {
        System.out.println(getNom() + " court sur ses pattes !");
    }
}
