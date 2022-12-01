package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> mainList;

    {
        mainList = new ArrayList<>();
        mainList.add(new Car("Tesla", 225, 3));
        mainList.add(new Car("Volvo", 250, 5));
        mainList.add(new Car("KAMAZ", 875, 2));
        mainList.add(new Car("Kia", 134, 4));
        mainList.add(new Car("Audi", 495, 3));
    }


    @Override
    public List<Car> getCarsList(int count) {
        if (count > mainList.size() || count == 0) {
            return mainList;
        } else {
            List<Car> carsList = mainList.subList(0, count);
            return carsList;
        }
    }
}
