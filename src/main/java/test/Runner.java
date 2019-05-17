package test;

import org.testng.annotations.Test;
import swagger.petstore.controllers.PetCtrl;

public class Runner {

    private PetCtrl petCtrl;

    @Test
    public void firstTest() {
        petCtrl = new PetCtrl();
        petCtrl.addNewPet();
    }
}
