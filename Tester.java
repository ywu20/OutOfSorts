public class Tester{
  public static void main(String[] args){
    int[] a = {1,2,4,3};
    Sorts.BubbleSort(a);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}
