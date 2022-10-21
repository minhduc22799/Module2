package thuc_hanh;

public class BinarySearch {
    static int[] list = {2,3,4,5,6,7,2,33,55,77,88,99};

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 3)); /* 4 */
        System.out.println(binarySearch(list, 77)); /*12 */
        System.out.println(binarySearch(list, 99));  /*-1 */
        System.out.println(binarySearch(list, 55));  /*-1 */
        System.out.println(binarySearch(list, 4)); /*-1 */
    }

    static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length -1;
        while (high>= low) {
            int mid = (high + low) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            }else if (key == list[mid]){
                return mid;
            }else {
                low = mid +1;
            }
        }
        return -1;
    }
}
