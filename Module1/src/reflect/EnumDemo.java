package reflect;

public class EnumDemo {
    private final String name;
    private final String dec;

    public EnumDemo(String name, String dec) {
        this.name = name;
        this.dec = dec;
    }
    public static final EnumDemo spring= new EnumDemo("frühling","warm");
    public static final EnumDemo sommer= new EnumDemo("frühling","heiß");
    public static final EnumDemo herbst= new EnumDemo("herbst","kool");
    public static final EnumDemo winter= new EnumDemo("winter","kalt");

    public String getName() {
        return name;
    }

    public String getDec() {
        return dec;
    }

    @Override
    public String toString() {
        return "EnumDemo{" +
                "name='" + name + '\'' +
                ", dec='" + dec + '\'' +
                '}';
    }
}
