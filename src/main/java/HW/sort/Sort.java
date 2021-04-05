package HW.sort;

public class Sort {


    public int[] MySort(int[] arr) {
        return sort(arr, 0, arr.length-1);
    }


    public static int[] sort(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0) {
            return arr;
        }
        //分区（割指示器）
        int zoneIndex = partition(arr, start, end);

        if (zoneIndex > start) {
            sort(arr, start, zoneIndex - 1);
        }
        if (zoneIndex < end) {
            sort(arr, zoneIndex + 1, end);
        }
        return arr;
    }

    private static int partition(int[] arr, int start, int end) {
        //基准数
        //int pivot = (int) (start + Math.random() * (end - start + 1));
        int pivot =start;
        //内部分区指示器
        int zoneIndex = start - 1;
        //交换了基准数和尾元素所在的位置
        swap(arr, pivot, end);
        for (int i = start; i <= end; i++) {
            if (arr[i] <= arr[end]) {
                zoneIndex++;
                if(i > zoneIndex){
                    swap(arr, i, zoneIndex);
                }
            }
        }
        return zoneIndex;
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        int [] arr = new int[5];
        arr[0]= 5;
        arr[1]= 2;
        arr[2]= 3;
        arr[3]= 1;
        arr[4]= 4;
        int[] ints = sort.MySort(arr);
        System.out.println(ints);
    }

}
