package obj11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
    private Storage Compliant;

    @BeforeEach
    void setUp() throws Exception {
        Compliant = new Storage();
    }

    @Test
    void cantInputNull() throws Exception{
        boolean thrown = false;
        try {
            Compliant.store(null);
        } catch (SecurityException e) {
            thrown = true;
        }
        assertTrue(thrown);

    }

}