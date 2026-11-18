// Ito ang class na pinangalanan kong QuizGrader
public class QuizGrader {
    // Dito ang main method para magsimula ang programa
    public static void main(String[] args) {

        // char array na naglalaman ng tamang sagot (answer key) sa 10 tanong
        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'};
        // char array na naglalaman ng mga sagot ng estudyante
        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'};

        // Variable na magbibilang ng tamang sagot, nagsisimula sa 0
        int correctCount = 0;

        // Para maprint ng pamagat para sa mga maling sagot
        System.out.println("--- Missed Questions ---");
        // Loop mula index 0 hanggang sa huling tanong gamit ang haba ng answerKey
        for (int i = 0; i < answerKey.length; i++) {
            // Icompare ang sagot ng estudyante sa tamang sagot;
            // toUpperCase para tanggapin din ang maliit na letra para sa Case Insensitivity
            if (Character.toUpperCase(studentAnswers[i]) == answerKey[i]) {
                // Kung magkapareho, dagdagan ng 1 ang tama
                correctCount++;
            } else {
                // Kung hindi magkapareho, i-print kung aling tanong ang mali,
                // yung sagot ng estudyante, at yung tamang sagot
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + studentAnswers[i]
                        + "', correct answer is '" + answerKey[i] + "'");
            }
        }

        // Kunin ang porsyento at ilagay sa double para sa decimal, tapos i-multiply sa 100
        double scorePercentage = ((double) correctCount / answerKey.length) * 100;
        // Para maprint ng pamagat para sa resulta
        System.out.println("\n--- Quiz Result ---");
        // Para maprint ang bilang ng tamang sagot mula sa kabuuang tanong
        System.out.println("Correct Answers: " + correctCount + "/" + answerKey.length);
        // Para maprint ang porsyentong nakuha
        System.out.println("Score: " + scorePercentage + "%");

        // Kung 70.0 o higit pa ang porsyento
        if (scorePercentage >= 70.0) {
            // Para maprint na PASS ang estudyante
            System.out.println("Result: PASS");
        } else {
            // Kung mas mababa sa 70.0, i-print na FAIL ang estudyante
            System.out.println("Result: FAIL");
        }
    }
}