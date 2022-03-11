public class Main {

    public static void main(String[] args) {
	// write your code here

        Avis bt = new Avis();

        Abonnent p1 = new Abonnent(bt, "nik");
        Abonnent p2 = new Abonnent(bt, "niko");

        bt.setSidstNyt("Apple får nu ny direktør, Muneeb");

        p1.opsigAbonnement();

        bt.setSidstNyt("Muneeb");
    }
}
