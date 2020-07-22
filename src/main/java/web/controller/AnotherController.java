package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.Model.Car;
import web.service.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class AnotherController {

    @Autowired
    CarService carService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView("cars/list");
        List<Car> list = carService.ListCars();
        modelAndView.addObject("list",list);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView("cars/form");
        Car car = new Car();
        modelAndView.addObject("CarForm",car);
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("CarForm") Car car) {
        carService.saveOrUpdate(car);
        return new ModelAndView("redirect:/cars/list");
    }




}
