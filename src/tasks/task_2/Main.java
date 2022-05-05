package tasks.task_2;

/*
Создать суперкласс Пассажироперевозчик и подклассы Самолет, Поезд,
Автомобиль. Задать правила выбора транспорта в зависимости от расстояния и наличия путей сообщения
 */
public class Main {
    public static void main(String[] args) {
        PassengerCarrier passengerCarrier = new PassengerCarrier();
        Trip trip = new Trip(Trips.MINSK_BREST);
        Trip trip1 = new Trip(Trips.MINSK_GOMEL);
        Trip trip2 = new Trip(Trips.MINSK_VITEBSK);
        passengerCarrier.setTrip(trip2);
        passengerCarrier.startTrip();
    }
}
