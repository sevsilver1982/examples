package structure.decorator;

import structure.decorator.decorators.*;

/**
 *  Декоратор (Decorator)
 *  Позволяет динамически добавлять объектам новую функциональность, оборачивая их в полезные «обёртки».
 */
public class Example {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new StringDataSource(salaryRecords)
                )
        );

        /*DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")
                )
        );*/

        encoded.writeData(salaryRecords);
        DataSource plain = new StringDataSource(salaryRecords);

        System.out.println("Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(encoded.readData());
        System.out.println("- Decoded --------------");
        System.out.println(plain.readData());
    }

}