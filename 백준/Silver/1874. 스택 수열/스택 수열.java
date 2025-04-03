import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] seq = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        int num = 1;
        boolean result = true;
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if(seq[i] >= num) {
                while (seq[i] >= num) {
                    stack.push(num++);
                    str.append("+\n");
                }
                stack.pop();
                str.append("-\n");
            } else {
                int temp = stack.pop();
                if (temp > seq[i]) {
                    result = false;
                    System.out.println("NO");
                    break;
                } else {
                    str.append("-\n");
                }
            }
        }
        if(result) System.out.println(str);
    }
}