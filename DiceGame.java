import java.util.Random;
// import java.util.Scanner; // この行はまだmasterブランチにはないはず

public class DiceGame {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in); // この行はまだmasterブランチにはないはず

        Random random = new Random();

        System.out.println("Rolling dice...");
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        int total = die1 + die2;

        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total value: " + total);

        // --- ここから追加 ---
        if (total > 7) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
        // --- ここまで追加 ---

        // scanner.close(); // この行はまだmasterブランチにはないはず
    }
}