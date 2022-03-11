import java.util.ArrayList;
import java.util.List;

public class Avis {

    List<Abonnent> abonnenter;
    String sidsteNyt;

    public Avis() {
        this.abonnenter = new ArrayList<>();
    }

    void abonner(Abonnent a) {
        abonnenter.add(a);
    }

    void setSidstNyt(String s) {
        sidsteNyt = s;
        adviserAbonnenter();
    }

    void adviserAbonnenter() {
        for (Abonnent abonnent : abonnenter) {
            abonnent.hentNyhed();
        }
    }

    String opdaterAbonnent() {
        return sidsteNyt;
    }

    public void fjernAbonnent(Abonnent abonnent) {
        abonnenter.remove(abonnent);
    }
}
