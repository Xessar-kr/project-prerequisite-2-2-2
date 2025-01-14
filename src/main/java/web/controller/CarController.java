package web.controller;

import org.springframework.stereotype.Controller;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarController {
    private final CarService carService = new CarServiceImpl();
}
