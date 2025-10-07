class Que6 {
  public static void main(String[] args) {
    int[][] a={{1,2,3},{4,5,6},{7,8,9}};
    int maxRow=0, sum=0;
    for(int i=0;i<a.length;i++){
      int s=0;
      for(int j:a[i]) s+=j;
      if(s>sum){sum=s;maxRow=i;}
    }
    System.out.println("Row "+(maxRow+1)+" (sum="+sum+")");
  }
}
