import java.util.Random;
import java.util.Scanner; // experimentalブランチからの変更を統合

public class DiceGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // experimentalブランチからの変更を統合

        System.out.println("What is your name?");
        System.out.print("> ");
        String name = scanner.nextLine(); // ユーザー名を取得
        System.out.println("Hello, " + name + "!"); // 挨拶

        Random random = new Random();

        System.out.println("Rolling dice..."); // 両ブランチに存在
        int die1 = random.nextInt(6) + 1; // 両ブランチに存在
        int die2 = random.nextInt(6) + 1; // 両ブランチに存在
        int total = die1 + die2; // 両ブランチに存在

        System.out.println("Die 1: " + die1); // 両ブランチに存在
        System.out.println("Die 2: " + die2); // 両ブランチに存在
        System.out.println("Total value: " + total); // 両ブランチに存在

        // masterブランチの勝敗判定とexperimentalブランチのnameを統合
        if (total > 7) {
            System.out.println(name + " won!"); // ここを修正
        } else {
            System.out.println(name + " lost!"); // ここを修正
        }

        scanner.close(); // experimentalブランチからの変更を統合
    }
}