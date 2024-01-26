package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServicelmpl implements CarService {
    private List<Car> cars;

    {
        cars  = new ArrayList<>();

        cars.add(new Car("Mazda", 1, "blue"));
        cars.add(new Car("Toyota", 12, "red"));
        cars.add(new Car("Porshe", 78, "yellow"));
        cars.add(new Car("BMW", 456, "black"));
        cars.add(new Car("Nissan", 13, "white"));
    }

    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
