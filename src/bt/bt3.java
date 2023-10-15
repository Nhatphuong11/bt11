package bt;
import java.util.Scanner;
import java.util.Stack;
public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();

        System.out.print("Nhập số lượng phần tử: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String input = sc.nextLine();
            stack.push(input);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
