public class Main {                           // Opens class

    public static void main(String[] args) {  // Opens main method
        printNums(1, 3);
    }                                         // Closes main method

    public static void printNums(int start, int end) { // printNums method

        for (int i = start; i <= end; i++) {   // Opens i loop

            for (int j = start; j <= end; j++) { // Opens j loop

                for (int k = start; k <= end; k++) { // Opens k loop
                    System.out.println(i + "," + j + "," + k);
                }                             // Closes k loop

                System.out.println("------------------");

            }                                 // Closes j loop

        }                                     // Closes i loop

    }                                         // Closes printNums method

}                                             // Closes class