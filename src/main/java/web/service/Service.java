package web.service;

import web.Model.Car;

import java.util.List;

public interface Service {

    void addCar(Car car);

    List<Car> listCars();

    void saveOrUpdate(Car car);

    public Car findCarById (int id);

    public void deleteCar(int id);

}
