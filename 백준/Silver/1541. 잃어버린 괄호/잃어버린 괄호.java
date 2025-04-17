import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int sum;
        String[] mod = br.readLine().split("-");
        for (int i = 0; i < mod.length; i++) {
            String[] temp = mod[i].split("[+]");
            sum = 0;
            for (int j = 0; j < temp.length; j++) {
                sum += Integer.parseInt(temp[j]);
            }
            if(i == 0) answer += sum;
            else answer -= sum;
        }
        System.out.println(answer);
    }
}