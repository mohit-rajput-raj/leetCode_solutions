import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            int length = word.length();
            
            if (length > 10) {
                char first = word.charAt(0);
                char last = word.charAt(length - 1);
                int middleCount = length - 2;
                System.out.println("" + first + middleCount + last);
            } else {
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}