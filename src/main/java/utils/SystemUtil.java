package utils;

import com.google.gson.JsonObject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SystemUtil {

    public static JsonObject getSystemStats() {
        JsonObject specs = new JsonObject();
        specs.addProperty("os", getOperatingSystem());
        specs.addProperty("memory", getSystemMemory());
        specs.addProperty("date", getDate(false));

        return specs;
    }

    public static String getOperatingSystem() {
        return System.getProperty("os.name");
    }

    public static long getSystemMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    public static String getDate(boolean verbose) {
        if (verbose) return DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss").format(LocalDateTime.now());
        return DateTimeFormatter.ofPattern("yyyy/MM/dd").format(LocalDateTime.now());
    }
}
