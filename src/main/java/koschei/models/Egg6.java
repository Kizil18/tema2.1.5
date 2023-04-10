package koschei.models;

public class Egg6 {
    private Deth8 deth8;

    public Egg6(Deth8 deth8) {
        this.deth8 = deth8;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + deth8.toString();
    }
}
