package test;

import org.testng.annotations.Test;
import swagger.petstore.controllers.PetCtrl;

public class Runner {

    private PetCtrl petCtrl;

    public Runner() {
        this.petCtrl = new PetCtrl();
    }

    @Test
    public void firstTest() {
        petCtrl.addNewPet();
    }

    @Test public void addPetPrint() {
        petCtrl.addNewPetPrint();
    }
}
