import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class cos {
    public static void main(String[] args) {
        String widthParam = "4";
        String heightParam = "11";
        if (widthParam == null && heightParam == null) {
            int w = 5;
            int h = 10;
            System.out.format("");
            for (int i = 1; i <= w; i++) {
                System.out.format("%4d", i);
            }
            System.out.println();
            for (int i = 1; i <= h; i++) {
                System.out.print(i);
                for (int j = 1; j <= w; j++) {
                    int y = i * j;
                    System.out.format("%4d", i * j);
                }
                System.out.println();
            }
        } else {
            int w = Integer.parseInt(widthParam);
            int h = Integer.parseInt(heightParam);
            System.out.format("   ");
            for (int i = 1; i <= w; i++) {
                System.out.format("%5d", i);
            }
            System.out.println();
            for (int i = 1; i <= h; i++) {
                System.out.format("%3d", i);
                for (int j = 1; j <= w; j++) {
                    int y = i * j;
                    System.out.format("%5d", i * j);
                }
                System.out.println();
            }
        }
    }

}
