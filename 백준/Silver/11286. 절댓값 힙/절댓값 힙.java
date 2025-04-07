import java.io.IOException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            //절댓값이 같으면 음수 우선
            if (Math.abs(o1) == Math.abs(o2)) return o1 > o2 ? 1 : -1;
            //절댓값이 작은 수 우선
            else return Math.abs(o1) - Math.abs(o2);
        });
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            if(input != 0) queue.add(input);
            else {
                if(queue.isEmpty()) System.out.println(0);
                else System.out.println(queue.poll());
            }
        }
    }
}