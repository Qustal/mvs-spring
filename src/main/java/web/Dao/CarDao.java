package web.Dao;

import web.Model.Car;
import org.hibernate.SessionFactory;

import javax.persistence.TypedQuery;
import java.util.List;

public class CarDao implements Dao {

    private SessionFactory sessionFactory;


    @Override
    public void addCar(Car car) {
        sessionFactory.getCurrentSession().save(car);
    }

    @Override
    public List<Car> listCars() {
        TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("from Cars");
        return query.getResultList();
    }
}
