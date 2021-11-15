package obj01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class obj1Test {
    private obj1 nonCompliant;

    @BeforeEach
    void setUp() throws Exception {
        nonCompliant = new obj1();
    }

    @Test
    public void setTotal() throws Exception {
        nonCompliant.total = 10;

    }

    @Test
    public void addOverflow() throws Exception {
        nonCompliant.total = Integer.MAX_VALUE;
        nonCompliant.add();

    }

    @Test
    public void addUnderflow() throws Exception {
        nonCompliant.total = 0;
        nonCompliant.remove();

    }


    @Test
    public void addBeforeInit() throws Exception {
        nonCompliant.add();
        System.out.println(nonCompliant.total);
    }

    @Test
    public void cantBeNegative() throws  Exception {
        nonCompliant.total = -10;
        assertFalse(nonCompliant.total < 0);
    }

}