// Gumawa ng class na pinangalanang dailyTempChecker
public class dailyTempChecker {
    // Ito ang main method, dito nagsisimula ang takbo ng program
    public static void main(String[] args) {
        // Mag-declare at mag-instantiate ng 1D double array na may eksaktong 5 na elemento
        double[] temperatures = new double[5];
        // Ilagay ang temperatura ng Day 1 sa index 0
        temperatures[0] = 32.5;
        // Ilagay ang temperatura ng Day 2 sa index 1
        temperatures[1] = 34.0;
        // Ilagay ang temperatura ng Day 3 sa index 2
        temperatures[2] = 31.8;
        // Ilagay ang temperatura ng Day 4 sa index 3
        temperatures[3] = 33.2;
        // Ilagay ang temperatura ng Day 5 sa index 4
        temperatures[4] = 35.1;
        // Mag-print ng heading bago ilabas ang mga temperatura
        System.out.println("Temperatures for 5 days:");
        // Standard for loop: magsisimula sa i = 0, tatakbo habang i ay mas maliit sa haba ng array, dagdag 1 bawat ikot
        for (int i = 0; i < temperatures.length; i++) {
            // I-print ang araw (i + 1) at ang temperatura sa index na i
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        } // Dulo ng for loop
        // Palitan ang temperatura ng ikatlong araw (index 2) mula 31.8 ay 32.0
        temperatures[2] = 32.0;
        // I-print ang bagong temperatura ng ikatlong araw
        System.out.println("Updated temperature for Day 3: " + temperatures[2]);
    } // Dulo ng main method
} // Dulo ng class