package wk_dev_workshop.workshopService;

public interface WorkshopMoeglichkeiten {

    public boolean bestellen(String idUser,String idArtikel, int Menge);
    public boolean stoernieren(String idUser,String idArtikel, int Menge);
    public boolean artikelInWarenkorbHinzufügen(String idUser,String idArtikel, int Menge);
    public boolean artikelBewerten(String idUser,String idArtikel, int nombreDetoile);
    public boolean feedbackGeben(String idUser,String idArtikel, String message);


}
