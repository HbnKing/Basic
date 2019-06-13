数组排序
1.             选择排序
数组排序之选择排序：从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处。
```
       public static void selectSort(int[] arr) {
              for(int i=0;i<arr.length-1;i++){
                     for(int j=i+1;j<arr.length;j++){
                            if(arr[i]>arr[j]){
                                   int temp = arr[i];
                                   arr[i] = arr[j];
                                   arr[j] = temp;
                            }
                     }
              }
       }
```     
 
2.             冒泡排序
冒泡排序法:相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处。
```
       public static void bubbleSort(int[] arr) {
              for(int i=0;i<arr.length-1;i++){
                     for(int j=0;j<arr.length-1-i;j++){
                            if(arr[j]>arr[j+1]){
                                   int temp = arr[j];
                                   arr[j] = arr[j+1];
                                   arr[j+1] = temp;
                            }
                     }
              }
}
```