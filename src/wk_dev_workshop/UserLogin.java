package wk_dev_workshop;

public class UserLogin {
        private String nom;
        private String prenom;
        private String mdp;

        public UserLogin (String nom, String prenom, String mdp) {
            this.nom = nom;
            this.prenom = prenom;
            this.mdp = mdp;
        }

    public UserLogin (String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;

    }

    public UserLogin () {

    }

    public void setNom( String nom) {
            this.nom = nom;
    }
    public void setPrenom( String prenom) {
        this.prenom = prenom;
    }
    public void setMdp( String mdp) {
        this.mdp = mdp;
    }

    public String getNom() {
            return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getMdp() {
        return mdp;
    }
}


