package Exercice2;

public abstract class Animal {
    private String nom;
    private double poids;
    private static int compteur = 0;

    public Animal(String nom, double poids) {
        this.nom = nom;
        this.poids = poids;
        compteur++;
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

 
    public final void afficherInfo() {
        System.out.println("Nom : " + nom + ", Poids : " + poids + " kg");
    }

    public static void totalAnimaux() {
        System.out.println("Nombre total d'animaux : " + compteur);
    }
}
