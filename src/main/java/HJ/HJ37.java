package HJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HJ37 {

    public static int getNum(int month) {
        int i = 1;
        int first = 0;
        int second = 1;
        int sum = 0;
        while (i < month) {
            sum = first + second;
            first = second;
            second = sum;
            i++;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(getNum(sc.nextInt()));
        }

        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line= bufferedReader.readLine())!=""){
            int i = Integer.parseInt(line);
            System.out.println(getNum(i));
        }

    }
}
