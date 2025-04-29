public class PermitHolder extends Person{
    int identity;

    public PermitHolder(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "PermitHolder{" +
                "identity=" + identity +
                '}';
    }
}
