package generating.builder;

import generating.builder.builders.CarBuilder;
import generating.builder.builders.CarManualBuilder;
import generating.builder.director.Director;

/**
 *  Строитель (Builder)
 *  Позволяет создавать сложные объекты пошагово. Строитель даёт возможность использовать один и тот же код строительства для получения разных представлений объектов.
 *  Строитель позволяет производить различные продукты, используя один и тот же процесс строительства.
 */
public class Example {

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор получает объект конкретного строителя от клиента (приложения).
        // Приложение само знает какой строитель использовать, чтобы получить нужный продукт.
        // Готовый продукт возвращает строитель, так как Директор не зависит от конкретных классов строителей и продуктов.
        Director director = new Director();
        director.constructCityCar(builder);
        System.out.printf("Car built: %s%n\n", builder.getResult().getCarType());
        director.constructSportsCar(builder);
        System.out.printf("Car built: %s%n\n", builder.getResult().getCarType());
        director.constructSUV(builder);
        System.out.printf("Car built: %s%n\n", builder.getResult().getCarType());

        director.constructCityCar(manualBuilder);
        System.out.printf("Car manual built:\n%s%n", manualBuilder.getResult().print());
        director.constructSportsCar(manualBuilder);
        System.out.printf("Car manual built:\n%s%n", manualBuilder.getResult().print());
        director.constructSUV(manualBuilder);
        System.out.printf("Car manual built:\n%s%n", manualBuilder.getResult().print());
    }

}