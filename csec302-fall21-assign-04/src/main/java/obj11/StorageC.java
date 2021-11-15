package obj11;

public class StorageC {
    private static BankOperationsC bop;

    public static void store(BankOperationsC bo) {
        // Store only if it is initialized
        if (bop == null) {
            if (bo == null) {
                System.out.println("Invalid object!");
                System.exit(1);
            }
            bop = bo;
        }
    }
}
