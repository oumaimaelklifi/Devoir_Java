package Exercice2;

public class Main {
    public static void main(String[] args) {
        
        Chien chien1 = new Chien("Chien1", 25.0);
        Oiseau oiseau1 = new Oiseau("oisau", 1.2);
        Chien chien2 = new Chien("chien2", 30.0);

       
        chien1.afficherInfo();
        chien1.seDeplacer();

        oiseau1.afficherInfo();
        oiseau1.seDeplacer();

        chien2.afficherInfo();
        chien2.seDeplacer();

        // Affichage du nombre total d'animaux
        Animal.totalAnimaux();

        // Tableau d'animaux
        Animal[] animaux = {chien1, oiseau1, chien2};

        System.out.println("\nParcours du tableau :");
        for (Animal a : animaux) {
            a.afficherInfo();
            if (a instanceof Deplacable) {
                ((Deplacable) a).seDeplacer();
            }
        }
    }
}
