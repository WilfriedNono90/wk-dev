package wk_dev_workshop.userService;


public class Client extends User implements Inter {
    public Client(String nom, String prenom, String email, String ville, int age, String adresse1, int plz) {
        super(nom, prenom, email, ville, age, adresse1, plz);
    }


    public static void main(String[] args) {
        Client client = new Client("Priso", "Jacques", "jackevepriso@yahoo.fr", "Linden",
                26, "Bahnhofstrasse 25", 35440);
        System.out.println(client.email + " "+ client.ville);

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
