package obj01;

public class obj1 {
    public int total; // Number of elements

    void add() {
        if (total < Integer.MAX_VALUE) {
            total++;
            // ...
        } else {
            throw new ArithmeticException("Overflow");
        }
    }

    void remove() {
        if (total > 0) {
            total--;
            // ...
        } else {
            throw new ArithmeticException("Overflow");
        }
    }
}
