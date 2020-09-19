import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	    String empty = "";
        int counter = 0;
        StringTokenizer stringTokenizer = null;
        try {
            stringTokenizer = new StringTokenizer(input.readLine(), " ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (stringTokenizer.hasMoreTokens()){
            counter++;
            String string = stringTokenizer.nextToken();
            if (string.charAt(0) == 'a' || string.charAt(0) == 'e' || string.charAt(0) == 'i' || string.charAt(0) == 'o' || string.charAt(0) == 'u' ){
                string = string + "d";
            }
            else {
                char c = string.charAt(0);
                string = string.substring(1);
                string = string + c + "d";
            }
            for (int i = 0; i < counter; i++) {
                string += "u";
            }
            empty= empty + string + " ";
        }

        System.out.println(empty);


    }
}
