import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data  the elements to be sorted.
  */

  public static void bubbleSort(int[] data){
    for(int j=0;j<data.length-1;j++){
      boolean swap=false;
    for(int i=0;i<data.length-j-1;i++){
      if(data[i]>data[i+1]){
        int x = data[i];
        data[i]=data[i+1];
        data[i+1]=x;
        swap=true;
      }
    }
    if(swap==false){
      j=data.length;
    }

  }
}

/**selection sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */
   public static void selectionSort(int[] data){
     
   }

   /**insertion sort of an int array.
  *@postcondition The array will be modified such that the elements will be in increasing order.
  *@param data - the elements to be sorted.
  */
   public static void insertionSort(int[] data){
   }
}
