package thuc_hanh;

public class BubbleSort {
    static int list[] = {2,3,4,1,3,5,7,8,11,10};

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.println(list[i]+" ");
        }

    }

    public static void bubbleSort(int[] list){

        for (int i = 1; i < list.length  ; i++) {
            for (int j = 0; j < list.length -i;j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                }
            }
        }
    }
}
