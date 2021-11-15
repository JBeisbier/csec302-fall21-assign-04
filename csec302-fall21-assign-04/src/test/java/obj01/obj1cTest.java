package obj01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class obj1cTest {
    private obj1c Compliant;

    @BeforeEach
    void setUp() throws Exception {
        Compliant = new obj1c();
    }

    @Test
    public void cantBeNegative() throws  Exception {
        boolean thrown = false;
        try {
            Compliant.remove();
        }
        catch (java.lang.ArithmeticException e){
            thrown = true;
        }
        assertTrue(thrown);
    }


    @Test
    public void addBeforeInit() throws Exception {
        Compliant.add();
        assertTrue(Compliant.getTotal() == 1);
    }

}