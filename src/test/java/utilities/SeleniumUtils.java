package utilities;

import java.awt.font.TextHitInfo;

public class SeleniumUtils {
    public static void waitForSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
        }
    }
}
