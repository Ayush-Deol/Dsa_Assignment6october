class Que2 {
  public static void main(String[] args) {
    int[] arr = {0,1,2,4,5};
    int n = 5, sum = n*(n+1)/2, s = 0;
    for (int x : arr) s += x;
    System.out.println(sum - s);
  }
}
