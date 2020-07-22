package web.Dao;

import web.Model.Car;

import java.util.List;

public interface Dao {
    void addCar(Car car);

    List<Car> listCars();

    public void saveOrUpdate(Car car);
}
