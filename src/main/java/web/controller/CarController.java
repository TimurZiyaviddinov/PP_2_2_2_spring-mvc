package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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


//    @GetMapping(value = "/cars")
//    public String printSecondPage(ModelMap model) {
//        List<Car> carsList = new ArrayList<>();
//        carsList.add(new Car("Tesla", 225, 3));
//        carsList.add(new Car("Volvo", 250, 5));
//        carsList.add(new Car("KAMAZ", 875, 2));
//        model.addAttribute("cars", carsList);
//        return "cars";
//    }

//    @GetMapping("/cars")
//    public String helloPage(HttpServletRequest request) {
//        int count = Integer.parseInt(request.getParameter("count"));
//
//
//        return "/hello";
//    }
}
