package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;


@Controller
public class CarController {
    @Autowired
    private CarServiceImpl carService;


    @GetMapping(value = "/cars")
    public String carsList(@RequestParam(value = "count", required = false) Integer count,
                           ModelMap model) {
        if (count == null) {
            count = 0;
        }

        model.addAttribute("cars", carService.getCarsList(count));
        return "cars";
    }
}
