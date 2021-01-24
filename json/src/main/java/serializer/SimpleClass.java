package serializer;

public class SimpleClass {
    private final Boolean param1;
    private final Boolean param2;
    private final Boolean param3;
    private final Boolean param4;
    private final boolean param5;

    public SimpleClass(Boolean param1, Boolean param2, Boolean param3, Boolean param4, boolean param5) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                ", param3=" + param3 +
                ", param4=" + param4 +
                ", param5=" + param5 +
                '}';
    }

}
