package web.Dao;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.Model.Car;
import org.hibernate.SessionFactory;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDao implements Dao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addCar(Car car) {
        getSession().save(car);
    }

    @Override
    public List<Car> listCars() {
        TypedQuery<Car> query = getSession().createQuery("from mvc_Cars");
        return query.getResultList();
    }

    @Override
    public void saveOrUpdate(Car car) {
        getSession().saveOrUpdate(car);
    }
}
