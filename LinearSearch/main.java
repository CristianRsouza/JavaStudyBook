package LinearSearch;



public class main {


  public static int Search(int[] list, int target) {
    for (int i = 0; i < list.length; i++) {
        if (list[i] == target) {
            return i;
        }
    }
    return -1;
}

  public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6 , 7, 8 , 9 }; 
    int target = 6;

    int index = Search(arr, target);
    System.out.println("O indice é " + index);
  }
}
