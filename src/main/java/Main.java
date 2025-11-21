import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        final int CARS_COUNTER = 3;
        int n = CARS_COUNTER;
        int carNumber = 1;
        while(n > 0) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите название машины №" + carNumber + ":");
            String name = s.nextLine();
            double speed;
            while(true){
                System.out.println("Введите скорость машины №" + carNumber + ":");
                speed = s.nextDouble();
                if(0 < speed && speed <= 250){
                    break;
                } else{
                    System.out.println("Неверная скорость");
                }
            }
            Car createdCar = new Car(name, speed);
            cars.add(createdCar);
            n--;
            carNumber++;
        }
        Race race = new Race(cars);
        Race.calculateWinner(cars);
    }
}