package web.dao;

import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CarDaoImp implements CarDao {
    @Autowired
    List<Car> carList;
    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarsByQuantity(int count) {
        if(count < 0)
            return null;
        else
        return carList.stream().limit(count).toList();
    }
}
