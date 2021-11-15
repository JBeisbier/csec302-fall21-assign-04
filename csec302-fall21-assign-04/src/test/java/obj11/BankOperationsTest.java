package obj11;

import obj01.obj1c;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankOperationsTest {


    @Test
    void cantExtend() throws Exception{
        boolean thrown = false;
        try {
            class Interceptor extends BankOperations {
            }
        } catch (Exception e) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void cantInit() throws Exception{
        boolean thrown = false;
        try {
            BankOperations i = new BankOperations();
        } catch (SecurityException e) {
            thrown = true;
        }
        assertTrue(thrown);
    }
}