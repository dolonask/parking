package kg.megacom.services.impl;

import kg.megacom.enums.OperationStatus;
import kg.megacom.models.Car;
import kg.megacom.models.Operation;
import kg.megacom.services.OperationService;

import java.util.ArrayList;
import java.util.Date;

public class OperationServiceImpl implements OperationService {

    private ArrayList<Car> cars =new ArrayList<>();
    private ArrayList<Operation> operations = new ArrayList<>();


    @Override
    public void enter(String carNumber) {
        Car car = findCarByNumber(carNumber);

        Operation operation = new Operation(car);

        operations.add(operation);
    }

    private Car findCarByNumber(String carNumber) {

        for (Car item: cars) {
            if (item.getNumber().equals(carNumber)){
                return item;
            }
        }

        Car newCar = new Car(carNumber);
        cars.add(newCar);

        return newCar;

    }

    @Override
    public Operation exit(String carNumber, int hour, int minutes) {

        Car car = findCarByNumber(carNumber);

        Operation operation = findOpenOperationByCar(car);
        operation.setEndDate();
        operation.setStatus(OperationStatus.CLOSED);
        
        operation.setPrice();

        // первые 15 минут
        //следующие 2 часа стоят 50 сомов
        //после каждый час  стоит по 30 сомов
        return null;
    }

    private Operation findOpenOperationByCar(Car car) {

        for (Operation item:operations) {
            if (item.getCar().getId() == car.getId() && item.getStatus().equals(OperationStatus.OPEN)){
                return item;
            }
        }

        throw new RuntimeException("Операция не найдена!");
    }


}
