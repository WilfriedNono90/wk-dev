package wk_dev_workshop.userService;

//WD-1 : le nom inter n'Est pas parlant, il ne respecte pas le cleanCode
//WD-1 : enlever l'implementation on l'utilisera ailleur
public class Client extends User implements activites {
    public Client(String nom, String prenom, String email, String ville, int age, String adresse1, int plz) {
        super(nom, prenom, email, ville, age, adresse1, plz);
    }


    public static void main(String[] args) {
        Client client = new Client("Priso", "Jacques", "jackevepriso@yahoo.fr", "Linden",
                26, "Bahnhofstrasse 25", 35440);
        System.out.println(client.getEmail() + " "+ client.getVille());

    }


        @Override
    public void bestellen() {

    }



    @Override
    public void stoernieren() {

    }

    @Override
    public void artikelHinzufügen() {

    }

    @Override
    public void bewerten() {

    }
}
