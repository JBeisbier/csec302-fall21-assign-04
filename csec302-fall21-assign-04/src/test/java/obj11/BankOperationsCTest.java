package obj11;

import obj01.obj1c;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankOperationsCTest {

    @Test
    void cantInit() throws Exception{
        boolean thrown = false;
        try {
            BankOperationsC i = new BankOperationsC();
        } catch (SecurityException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }


}