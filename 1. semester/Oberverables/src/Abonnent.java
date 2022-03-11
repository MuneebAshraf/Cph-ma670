public class Abonnent {

    private Avis avis;
    private String navn;

    Abonnent(Avis avis, String navn) {
        this.avis = avis;
        this.navn = navn;
        avis.abonner(this);
    }

    void hentNyhed() {
        System.out.println(avis.opdaterAbonnent());
    }

    public void opsigAbonnement() {
        avis.fjernAbonnent(this);
    }
}
