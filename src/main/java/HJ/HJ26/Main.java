package HJ.HJ26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String readLine;
        while ((readLine = bufferedReader.readLine()) != "") {

            char[] chars = readLine.toCharArray();
            char[] newChars = new char[chars.length];
            int flag = 65;
            int j = 0;
            while (flag <= 90) {
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] == flag || chars[i] == flag + 32) {
                        newChars[j] = chars[i];
                        j++;
                    }
                }
                flag++;
            }
            j = 0;
            for (int x = 0; x < chars.length; x++) {
                if ((chars[x] >= 65 && chars[x] <= 90) || (chars[x] >= 97 && chars[x] <= 122)) {
                    chars[x] = newChars[j];
                    j++;
                }

            }
            System.out.println(String.valueOf(chars));
        }
    }

}
