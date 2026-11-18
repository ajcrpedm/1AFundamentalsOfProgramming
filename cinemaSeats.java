// Ini-import ang Arrays class para magamit ang Arrays.deepToString()
import java.util.Arrays;

// Gumawa ng class na pinangalanang cinemaSeats
public class cinemaSeats {

    // Ito ang main method, dito nagsisimula ang takbo ng program
    public static void main(String[] args) {

        // Gumawa ng 2D String array na "seats" at nilagyan agad ng laman (2 rows, 3 columns)
        String[][] seats = {
                // Unang row (index 0): Alice, Bob, at Charlie
                {"Alice", "Bob", "Charlie"},
                // Pangalawang row (index 1): David, Emma, at Frank
                {"David", "Emma", "Frank"}
        }; // Dito nagtatapos ang deklarasyon ng array

        // I-print ang nasa row 2, column 3 (index [1][2]) na si Frank
        System.out.println("Second row, third column: " + seats[1][2]);

        // Palitan ang "Bob" (row 1, column 2 = index [0][1]) ng "Vacant"
        seats[0][1] = "Vacant";

        // I-print ang buong seating arrangement sa isang linya gamit ang deepToString()
        System.out.println(Arrays.deepToString(seats));
    } // Dulo ng main method
} // Dulo ng class