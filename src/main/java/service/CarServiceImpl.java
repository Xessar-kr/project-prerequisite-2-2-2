package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<Car>();
        cars.add(new Car("Hyundai Avanta", 2020, "White"));
        cars.add(new Car("Kia Carnival", 2021, "Black"));
        cars.add(new Car("BMW X5", 2022, "Red"));
        cars.add(new Car("Audi Q7", 2023, "Green"));
        cars.add(new Car("Toyota Crown", 2024, "Grey"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }

        if (count <= 0) {
            return new ArrayList<>();
        }
        return cars.subList(0, count);
    }
}

