public class Tax  extends Consequence{
    public Tax(int id, String label, int cost) {
        super(id, label, cost,0);
    }

    @Override
    public String onLand() {
        return super.onLand() + ", du skal betale skat!";
    }
}
