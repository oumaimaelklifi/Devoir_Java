public class Etudiant {
    private String nom;
    private String prenom;
    private double note1;
    private double note2;

    private static int nombreEtudiants = 0;


    public Etudiant(String nom, String prenom, double note1, double note2) {
        this.nom = nom;
        this.prenom = prenom;
        this.note1 = note1;
        this.note2 = note2;
        nombreEtudiants++;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getNote1() {
        return note1;
    }

    public double getNote2() {
        return note2;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    // Moyenne
    public double getMoyenne() {
        return (note1 + note2) / 2;
    }

    //Nombre d'étudiants
    public static void afficherNombreEtudiants() {
        System.out.println("Nombre total d'étudiants : " + nombreEtudiants);
    }

  
    
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("El Khlifi", "Oumaima", 19.5, 17.0);
        Etudiant e2 = new Etudiant("Ben Moukhtar", "Yousra", 19.0, 15.5);
        Etudiant e3 = new Etudiant("Allali", "Mohamed", 16.0, 19.5);

        System.out.println("Liste des étudiants :");
        System.out.println("-------------------------------------------------");
        System.out.println(e1.getPrenom() + " " + e1.getNom() + " - Moyenne : " + e1.getMoyenne());
        System.out.println(e2.getPrenom() + " " + e2.getNom() + " - Moyenne : " + e2.getMoyenne());
        System.out.println(e3.getPrenom() + " " + e3.getNom() + " - Moyenne : " + e3.getMoyenne());

        Etudiant.afficherNombreEtudiants();
    }
}






