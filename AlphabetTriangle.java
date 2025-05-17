public class AlphabetTriangle {
    public static void main(String[] args) {
        int rows = 3; 

        for (int i = 1; i <= rows; i++) {
            char letter = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
    }
}