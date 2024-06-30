package blolo.ci.cars_analysis;

// CarsService.java

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {

    public List<CarsRecord> getAllCars() {
        return List.of(new CarsRecord(1, "BMW", 18));
    }

    public CarsRecord getCarById() {
        return new CarsRecord(1, "BMW", 18);
    }
}

