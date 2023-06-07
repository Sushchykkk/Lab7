import java.util.*;
import static Car.biggerPrice;
import static Car.morePower;
import static Driver.courses;

import java.util.Random;

class Taxi{
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(Car.Mazda);
        cars.add(Car.Skoda);
        cars.add(Car.Suzuki);
        cars.add(Car.Toyota);
        cars.add(Car.Tesla);
        cars.add(Car.Subaru);
        cars.add(Car.Mazda5);
        cars.add(Car.Mazda3);
        cars.add(Car.Skoda2);
        cars.add(Car.MazdaM);

        ArrayList<Driver> drivers = new ArrayList<>();
        drivers.add(Driver.Roman);
        drivers.add(Driver.Valentin);
        drivers.add(Driver.Pavlo);
        drivers.add(Driver.Victor);
        drivers.add(Driver.Oleg);
        drivers.add(Driver.Artem);
        drivers.add(Driver.Oles);
        drivers.add(Driver.Max);
        drivers.add(Driver.Anton);
        drivers.add(Driver.Igor);
        drivers.add(Driver.Yaroslav);
        drivers.add(Driver.Olexander);
        drivers.add(Driver.Ivan);
        drivers.add(Driver.Marian);
        drivers.add(Driver.John);
        drivers.add(Driver.Dmytro);
        drivers.add(Driver.Alex);
        drivers.add(Driver.Yuriy);
        drivers.add(Driver.Vasyl);
        drivers.add(Driver.Olexiy);

        //Ремонт моторів. Підвищення потужності половини машин на 10% та переприсвоєння поля водія
        for (int i = 0; i != cars.size() / 2; i++) {
            cars.get(i).power = morePower(cars.get(i).power);
            cars.get(i).driver = drivers.get(drivers.size() - i - 1).name;
        }

        // Підвищення потужності та ціни кожного другого автомобіля на 10 та 5 відсотків відповідно.
        for (int i = 0; i != cars.size(); i += 2) {
            cars.get(i).power = morePower(cars.get(i).power);
            cars.get(i).price = biggerPrice(cars.get(i).price);
        }

        // Підвищення кваліфікації водіїв
        for (int i = 0; i != drivers.size(); i++) {
            if (drivers.get(i).experience < 5 & drivers.get(i).age > 25) {
                while (drivers.get(i).experience < 5) {
                    drivers.get(i).experience = courses(drivers.get(i).experience);
                }
            }
        }
        Random rand = new Random();
        int randomIndex = rand.nextInt(cars.size());
        System.out.println("Автомобіль моделі " + cars.get(randomIndex).model + " з водієм на ім`я " +
                cars.get(randomIndex).driver + " виїхав за вами.");
        System.out.println("Водій " + cars.get(randomIndex).driver + " прибув на місце.");
    }
}
