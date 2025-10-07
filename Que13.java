import java.util.Scanner;

class Que13 {
    static void reverse(String str) {
        if(str.length() == 0) {
            return;
        }
        reverse(str.substring(1));
        System.out.print(str.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        reverse(input);
    }
}
