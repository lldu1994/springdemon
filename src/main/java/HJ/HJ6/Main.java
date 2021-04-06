package HJ.HJ6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine;
        while ((readLine = bufferedReader.readLine()) != null) {
            int num = Integer.parseInt(readLine);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 2; i < num; i++){
                if(num % i ==0){
                    stringBuffer.append(i).append(" ");
                    num = num / i;
                    i--;
                }
            }
            stringBuffer.append(num).append(" ");
            System.out.println(stringBuffer.toString());
        }
    }
}
