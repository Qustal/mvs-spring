package web.service;

import web.Dao.CarDao;
import web.Model.Car;


import java.util.List;

public class CarService implements Service {

    private CarDao carDao;

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public List<Car> ListCars() {
        return carDao.listCars();
    }
}
