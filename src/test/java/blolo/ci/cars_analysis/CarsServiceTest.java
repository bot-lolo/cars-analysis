package blolo.ci.cars_analysis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CarsServiceTest {

    @Mock
    private CarsService carsService;

    @InjectMocks
    private CarsController carsController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllCars() {
        // Given
        when(carsService.getAllCars()).thenReturn(List.of(new CarsRecord(1, "BMW", 18)));

        // When
        List<CarsRecord> cars = carsController.search();

        // Then
        assertEquals(1, cars.size());
        assertEquals("BMW", cars.get(0).name());
        assertEquals(18, cars.get(0).horse());
    }

    @Test
    public void testGetCarById() {
        // Given
        when(carsService.getCarById()).thenReturn(new CarsRecord(1, "BMW", 18));

        // When
        CarsRecord car = carsController.searchNull();

        // Then
        assertEquals("BMW", car.name());
        assertEquals(18, car.horse());
    }
}