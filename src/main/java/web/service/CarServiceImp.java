package web.service;

import web.dao.CarDaoImp;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImp implements CarService{
    @Autowired
    CarDaoImp carDAOImp;
    @Override
    public List<Car> getAllCars() {
        return carDAOImp.getAllCars();
    }

    @Override
    public List<Car> getCarsByQuantity(int count) {
        return carDAOImp.getCarsByQuantity(count);
    }
}
