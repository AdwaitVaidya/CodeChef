import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

    static int returnMaximumCoins(int num){
        int num1 = num/2;
        int num2 = num/3;
        int num3 = num/4;

        if ((num1+num2+num3)>=num){
            return (num1+num2+num3);
        }
        else {
            return (returnMaximumCoins(num1)+returnMaximumCoins(num2)+returnMaximumCoins(num3));
        }
    }


    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        BufferedReader input = new BufferedReader(new InputStreamReader(in));
        String string = "";
        while ((string = input.readLine()) != ""){
            int num = Integer.parseInt(string);

            int sum = returnMaximumCoins(num);
            System.out.println(sum);

        }

    }
}
