package structure.decorator.decorators;

public interface DataSource {
        void writeData(String data);
        String readData();
}