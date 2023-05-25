package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {
    @Autowired
    CarService carService;
    @GetMapping(value = "/cars")
    public String getAllCars(ModelMap model) {
        model.addAttribute("cars", carService.getAllCars());
        return "car";
    }
    @GetMapping(value = "/cars", params = "count")
    public String getCarsByQuantity(@RequestParam int count, ModelMap model) {
        model.addAttribute("cars", carService.getCarsByQuantity(count));
        return "car";
    }
}
