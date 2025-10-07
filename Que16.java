import java.util.Scanner;

class Que16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4; // length of array
        int[] arr = {2, 5, 7, 8};
        int key = sc.nextInt(); // key to search

        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
