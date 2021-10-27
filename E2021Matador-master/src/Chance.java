public class Chance extends Consequence {
    public Chance(int id, String label) {
        super(id, label, 0,0);    }

    @Override
    public String onLand() {
        return super.onLand() + ", træk et kort";
    }

}
