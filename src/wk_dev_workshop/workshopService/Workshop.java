package wk_dev_workshop.workshopService;

public class Workshop implements WorkshopMoeglichkeiten {
    @Override
    public boolean bestellen(String idUser, String idArtikel, int Menge) {
        return false;
    }

    @Override
    public boolean stoernieren(String idUser, String idArtikel, int Menge) {
        return false;
    }

    @Override
    public boolean artikelInWarenkorbHinzufügen(String idUser, String idArtikel, int Menge) {
        return false;
    }

    @Override
    public boolean artikelBewerten(String idUser, String idArtikel, int nombreDetoile) {
        return false;
    }

    @Override
    public boolean feedbackGeben(String idUser, String idArtikel, String message) {
        return false;
    }
}
