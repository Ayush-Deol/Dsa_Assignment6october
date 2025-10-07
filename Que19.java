import java.util.Scanner;

class Que19 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        
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
