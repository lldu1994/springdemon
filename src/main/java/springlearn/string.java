package springlearn;

public class string {
    public static void main(String[] args) {
        String str1="abc";
        String str2= new String("abc");
        String str3= new String("abc").intern();
        System.out.println(str1 == str2); //false   //false
        System.out.println(str2 == str3); //true    //false
        System.out.println(str1 == str3); //false   //true

        String a = "aaa";
        String b="aaa";
        System.out.println(a==b);

    }
}
