package kg.megacom.services;

import kg.megacom.models.Operation;

public interface OperationService {

    void enter(String carNumber);
    Operation exit(String carNumber, int house, int minutes);


}
