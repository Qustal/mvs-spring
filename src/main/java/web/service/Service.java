package web.service;

import web.Model.Car;

import java.util.List;

public interface Service {

    void addCar(Car car);

    List<Car> ListCars();

    public void saveOrUpdate(Car car);


}
