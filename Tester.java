import java.util.Arrays;
import java.util.Random;
public class Tester{
  public static boolean DEBUG = true;

  public static void dp(String s){
    if(DEBUG){
      System.out.println(s);
    }
  }

  public static void dp(int[] s){
    if(DEBUG){
      System.out.println(Arrays.toString(s));
    }
  }

  public static void main(String[] args){
    int[] a = {1,2,4,3};
    Sorts.bubbleSort(a);
    //dp(a);

    int[] b={1,1,1,1};
    Sorts.bubbleSort(b);

int[] c = {4,3,2,1};
Sorts.bubbleSort(c);

int[] d= new int[10];

Random rng = new Random(50);//seed of 100 is stored.
for(int i =  0; i < 10; i++ ){
  d[i]=rng.nextInt() % 1000;
}

Sorts.bubbleSort(d);
dp(d);
  }
}
