package blolo.ci.cars_analysis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarsService carsService;

    @GetMapping
    public List<CarsRecord> search() {
        return carsService.getAllCars();
    }

    @GetMapping("/one")
    public CarsRecord searchNull() {
        return carsService.getCarById();
    }
}
