import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final String rs = "Rs. ";

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = null;
        try {
            stringTokenizer = new StringTokenizer(input.readLine(), " ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        int breadSlices = Integer.parseInt(stringTokenizer.nextToken());
        int cheeseSlices = Integer.parseInt(stringTokenizer.nextToken());
        boolean possible = false;
int maxIncome = 0;
int maxx = 0;
int maxy = 0;
        for (int x = 0; x <= breadSlices; x++) {
            int y = (breadSlices/2) - x;
            if (((2*x)+y) == cheeseSlices && y >= 0){
                possible = true;
                int income = (x*220) + (y*120);
                if (income > maxIncome){
                    maxIncome = income;
                    maxx = x;
                    maxy = y;
                }
                else {
                    continue;
                }
            }
        }
        if (possible){
            System.out.println(maxx+" "+maxy);

            System.out.println(rs + maxIncome);
        }
        else {
            System.out.println("-1");
        }

    }

}
