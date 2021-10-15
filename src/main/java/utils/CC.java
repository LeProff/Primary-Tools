package utils;

import java.awt.*;

public class CC {

    public static String RESET = "\033[0m";
    public static String BOLD = "\033[1m";
    public static String ITALICS = "\033[3m";
    public static String UNDERLINE = "\033[4m";
    public static String STRIKETHROUGH = "\033[9m";

    public static String RED = "\033[31m";
    public static String GREEN = "\033[32m";
    public static String YELLOW = "\033[33m";
    public static String BLUE = "\033[34m";
    public static String PURPLE = "\033[35m";
    public static String CYAN = "\033[36m";
    public static String GRAY = "\033[37m";
    public static String DARK_RED = "\033[91m";
    public static String DARK_GREEN = "\033[92m";
    public static String DARK_YELLOW = "\033[93m";
    public static String DARK_BLUE = "\033[94m";
    public static String PINK = "\033[95m";
    public static String DARK_CYAN = "\033[96m";
    public static String LIGHT_GRAY = "\033[97m";

    public static String RED_HIGHLIGHT = "\033[41m";
    public static String GREEN_HIGHLIGHT = "\033[42m";
    public static String YELLOW_HIGHLIGHT = "\033[43m";
    public static String BLUE_HIGHLIGHT = "\033[44m";
    public static String PURPLE_HIGHLIGHT = "\033[45m";
    public static String CYAN_HIGHLIGHT = "\033[46m";
    public static String GRAY_HIGHLIGHT = "\033[47m";
    public static String DARK_RED_HIGHLIGHT = "\033[101m";
    public static String DARK_GREEN_HIGHLIGHT = "\033[102m";
    public static String DARK_YELLOW_HIGHLIGHT = "\033[103m";
    public static String DARK_BLUE_HIGHLIGHT = "\033[104m";
    public static String PINK_HIGHLIGHT = "\033[105m";
    public static String DARK_CYAN_HIGHLIGHT = "\033[106m";
    public static String LIGHT_GRAY_HIGHLIGHT = "\033[107m";

    public static String custom(int r, int g, int b) {
        return String.format("\033[38;2;%1s;%1s;%1sm", r, g, b);
    }

    public static String custom(Color c) {
        return String.format("\033[38;2;%1s;%1s;%1sm", c.getRed(), c.getGreen(), c.getBlue());
    }

    public static String customHighlight(int r, int g, int b) {
        return String.format("\033[48;2;%1s;%1s;%1sm" + CC.RESET, r, g, b);
    }

    public static String customHighlight(Color c) {
        return String.format("\033[48;2;%1s;%1s;%1sm" + CC.RESET, c.getRed(), c.getGreen(), c.getBlue());
    }

    public static String customHighlightedText(int red1, int green1, int blue1, int red2, int green2, int blue2) {
        return String.format("\033[38;2;%1s;%1s;%1s;48;2;%1s;%1s;%1sm" + CC.RESET, red1, green1, blue1, red2, green2, blue2);
    }

    public static String customHighlightedText(Color text, Color highlight) {
        return String.format("\033[38;2;%1s;%1s;%1s;48;2;%1s;%1s;%1sm" + CC.RESET,
                text.getRed(), text.getGreen(), text.getBlue(), highlight.getRed(), highlight.getGreen(), highlight.getBlue());
    }

    public static void println(String text, String colour) {
        System.out.println(colour + text + CC.RESET);
    }
}
