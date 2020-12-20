public class Sorts{
  public static void bubbleSort(int[] arrayy){
    if(arrayy.length < 2){
      return;
    }
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

  public static void selectionSort(int[] data){
    if(data.length < 2){
      return;
    }
    for(int i = 0; i < data.length; i++){
      int minimum = data[i];
      int indy = i;
      for(int j = i; j < data.length; j++){
        if(minimum > data[j]){
          minimum = data[j];
          indy = j;
        }
      }
      int hold = data[i];
      data[i] = minimum;
      data[indy] = hold;
    }
  }

  public static void insertionSort(int[] data){
    if(data.length < 2){
      return;
    }
    for(int i = 1; i < data.length; i++){
      int here = data[i];
      int b4 = data[i-1];
      if(here < b4){
        for(int j = i; j > 0; j--){
          if(here < data[j-1]){
            data[j] = data[j-1];
          }
          else{
            data[j] = here;
          }
        }
      }

    }
  }
}
