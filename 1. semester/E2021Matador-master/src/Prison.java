public class Prison extends Consequence {
    public Prison(int id, String label, int cost) {
        super(id, label, cost,0);
    }

    @Override
    public String onLand() {
        return super.onLand() + ", du ryger bag tremmer!";
    }
}
