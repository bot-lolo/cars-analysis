package blolo.ci.cars_analysis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public List<Object> search(){
        return List.of(new CarsRecord(1,"BMW",18));
    }
}
