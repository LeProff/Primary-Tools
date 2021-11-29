package utils;

public class Debug {

    public static void println(Object value) {
        CC.println("DEBUG: " + value, CC.ITALICS + CC.DARK_CYAN);
    }

    public static void println(Object value, int id) {
        CC.println("DEBUG " + id + ": " + value, CC.ITALICS + CC.DARK_CYAN);
    }
}
