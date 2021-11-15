package obj11;

public class Storage {
    private static BankOperations bop;

    public static void store(BankOperations bo) {
        // Store only if it is initialized
        if (bop == null) {
            if (bo == null) {
                throw new SecurityException("Invalid object!");
            }
            bop = bo;
        }
    }
}