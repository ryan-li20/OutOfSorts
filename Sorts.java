public class Sorts{
  public static void bubbleSort(int[] arrayy){
    for(int i = 0; i < arrayy.length; i++){
      for(int j = 0; j < arrayy.length-1; j++){
        int here = arrayy[j];
        int next = arrayy[j+1];
        if(here > next){
          arrayy[j] = next;
          arrayy[j+1] = here;
        }
      }
    }
  }
}
