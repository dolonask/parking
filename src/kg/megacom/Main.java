package kg.megacom;

import kg.megacom.services.OperationService;
import kg.megacom.services.impl.OperationServiceImpl;

public class Main {

    public static void main(String[] args) {
        OperationService operationService = new OperationServiceImpl();

        operationService.enter("01kg070AAA");
        operationService.exit("01kg070AAA", 14, 30);
    }
}
