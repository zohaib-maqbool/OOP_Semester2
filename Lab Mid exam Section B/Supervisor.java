public class Supervisor extends Person {
    private int xp;

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Supervisor(String name, int xp) {
        super(name);
        this.xp = xp;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "xp=" + xp +
                '}';
    }
}
