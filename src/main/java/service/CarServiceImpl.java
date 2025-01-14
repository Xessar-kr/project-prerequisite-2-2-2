package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Hyndai Avanta", 2020, "White"));
        cars.add(new Car("Kia Carnival", 2021, "Black"));
        cars.add(new Car("BMW X5", 2022, "Red"));
        cars.add(new Car("Audi Q7", 2023, "Green"));
        cars.add(new Car("Toyota Crown", 2024, "Grey"));
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }
}

