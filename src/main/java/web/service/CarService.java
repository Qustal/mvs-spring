package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.Dao.CarDao;
import web.Model.Car;


import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
@Transactional
public class CarService implements Service {

    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public List<Car> ListCars() {
        return carDao.listCars();
    }

    @Override
    public void saveOrUpdate(Car car) {
        carDao.saveOrUpdate(car);
    }
}
