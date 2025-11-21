import java.util.ArrayList;
import java.util.Iterator;

public class Race {
    ArrayList<Car> cars = new ArrayList<>();

    Race(ArrayList<Car> cars){
        this.cars = cars;
    }


    public static void calculateWinner(ArrayList<Car> cars1){
        Iterator<Car> iteratorOfCars = cars1.iterator();
        String winner = "";
        double max = 0;

        while(iteratorOfCars.hasNext()){
            Car currentIteratorOfCars = iteratorOfCars.next();
            double currSpeed = currentIteratorOfCars.speed * 24;
//            System.out.println(currentIteratorOfCars.name + "\n");
            if(currSpeed > max){
                max = currSpeed;
                winner = currentIteratorOfCars.name;
            }
        }

//        version with forEach:
//        for(Car car: cars1){
//            double max = 0;
//            if(car.speed > max){
//                max = car.speed;
//                winner = car.name;
//            }
//        }
        System.out.println("Победитель в гонке: " + winner);
    }
}
