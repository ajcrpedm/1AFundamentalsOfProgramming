// Ito ang Java class na pinamagatan kong CoffeeShopAnalyzer
public class CoffeeShopAnalyzer {
    // Ito ang main method para magsimula ang pagproprogram
    public static void main(String[] args) {

        // Gumawa ako ng int array na may 7 sales kada araw mula Monday hanggang Sunday
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        // Gumawa ako ng String array na naglalaman ng bawat araw
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Mag-print ng pamagat para sa listahan ng benta kada araw
        System.out.println("--- Daily Sales ---");
        // Loop na magsisimula sa index 0 hanggang sa huling index ng array
        // gamit ang length para sa size ng weeklySales
        for (int i = 0; i < weeklySales.length; i++) {
            // Para maprint ang araw at ang benta
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }

        // Int ng totalSales na sinimulan kong iinitialize sa bilang ng 0
        int totalSales = 0;
        // Gagamit ako ng nhanced for-each looppara kunin isa-isa ang bawat sale sa array
        for (int dailySale : weeklySales) {
            // Para madagdag ang benta araw-araw sa totalSales
            totalSales += dailySale;
        }
        // Para kunin ang average: double para sa decimal ng totalSales, tapos idivide sa length ng weeklySaless
        double averageSales = (double) totalSales / weeklySales.length;
        // Mag-print ng pamagat para sa buod ng linggo
        System.out.println("\n--- Weekly Summary ---");
        // Para maprint ang kabuuang benta ng buong linggo
        System.out.println("Total Sales: " + totalSales + " cups");
        //Para maprint ang average na benta kada araw
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // Ilagay muna na ang unang araw ang may pinakamataas na benta
        int maxSales = weeklySales[0];
        // Ilagay din muna na ang unang araw ang may pinakamababang benta
        int minSales = weeklySales[0];
        // Itago ang pangalan ng araw na may pinakamataas na benta
        String bestDay = daysOfWeek[0];
        // Itago ang pangalan ng araw na may pinakamababang benta
        String worstDay = daysOfWeek[0];

        // Magsisimula sa index 1 dahil index 0 na ang ginamit nating panimulang halaga
        for (int i = 1; i < weeklySales.length; i++) {
            // Kung mas mataas ang benta ngayon kaysa sa maximum
            if (weeklySales[i] > maxSales) {
                // I-update ang maxSales gamit ang bagong mas mataas
                maxSales = weeklySales[i];
                // I-update din ang pangalan ng pinakamabentang araw
                bestDay = daysOfWeek[i];
            }
            // Kung mas mababa ang benta ngayon kaysa sa kasalukuyang minimum
            if (weeklySales[i] < minSales) {
                // I-update ang minSales gamit ang bagong mas mababang halaga
                minSales = weeklySales[i];
                // I-update din ang pangalan ng pinakamahinang araw
                worstDay = daysOfWeek[i];
            }
        }

        // Mag-print ng pamagat para sa pinakamabenta at pinakamahinang araw
        System.out.println("\n--- Bests and Worsts ---");
        // I-print kung anong araw ang pinakamabenta at ilang tasa ang nabenta
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        // I-print kung anong araw ang pinakamahina at ilang tasa ang nabenta
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
    }
}