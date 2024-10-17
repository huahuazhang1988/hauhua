package reflect;

public enum Season {
    Spring("chuntian"), Sommer("xiatian"),
    Herbst("qiutian"), Winter("dongtian");
    private final String name;
    Season(String name) {
        this.name = name;
    }
}
