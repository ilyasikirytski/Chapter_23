package tasks.task_1;

/*
Выполнить описание логики системы и использовать шаблоны проектирования
для определения организации классов разрабатываемой системы. Использовать
объекты классов и подклассов для моделирования реальных ситуаций и взаимодействий объектов.

1. Создать суперкласс Транспортное средство и подклассы Автомобиль, Велосипед, Повозка.
Подсчитать время и стоимость перевозки пассажиров и грузов каждым транспортным средством.
 */
//try to initialize facade pattern
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(
                new Car(120, 5, 3),
                new Carriage(45, 3, 2),
                new Bicycle(30, 1, 1));
        facade.sendTransportOrder(1345);
    }
}
