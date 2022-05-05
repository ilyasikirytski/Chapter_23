package tasks.task_B_1;

/*
Паттерн Composite. Разработать структуру данных
для хранения информации о государствах,
их административных частях и городах.
 */
//try to initialize composite pattern
public class Main {
    public static void main(String[] args) {

        Composite composite = new Composite();
        composite.addCountry(new Country("Беларусь", new County("Гродненская", new City("Гродно", 2800000))));
        composite.addCountry(new Country("Беларусь", new County("Минская", new City("Минск", 9000000))));
        composite.addCountry(new Country("Беларусь", new County("Витебская", new City("Витебск", 3000000))));
        composite.showInfo();
    }
}
