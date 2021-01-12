package structure.decorator.decorators;

public class StringDataSource implements DataSource {
    private String buffer;

    public StringDataSource(String buffer) {
        this.buffer = buffer;
    }

    @Override
    public void writeData(String data) {
        this.buffer = data;
    }

    @Override
    public String readData() {
        return buffer;
    }

}