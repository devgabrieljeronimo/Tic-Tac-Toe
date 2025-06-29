package graphic_interface;

public class Wait {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
