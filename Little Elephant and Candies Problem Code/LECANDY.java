//Little Elephant and Candies Problem Code: LECANDY

package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(input.readLine());
        for (int i = 0; i < tc; i++) {
            StringTokenizer stringTokenizer01 = new StringTokenizer(input.readLine(), " ");
            int N = Integer.parseInt(stringTokenizer01.nextToken());
            int C = Integer.parseInt(stringTokenizer01.nextToken());
            int sum  = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(input.readLine());
            while (stringTokenizer.hasMoreTokens()){
                sum+=Integer.parseInt(stringTokenizer.nextToken());
            }

            if (C>=sum) System.out.println("Yes");
            else System.out.println("No");

        }
    }
}
