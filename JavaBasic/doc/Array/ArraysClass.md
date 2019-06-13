### 组操作工具类Arrays
1.1. 操作数组的工具类型Arrays

Arrays类是Java提供的一个用于数组操作的工具类，里面包含了数组操作的各种方法。
在实际开发过程中，如果要进行数组排序，通常都会用工具类提供的排序方法进行排序。现在使用Arrays提供的排序方式进行排序，并且比较与上述例子中的冒泡排序的效率进行比较：

```
public static void compare() {
int[] arr = new int[20000];
Random r = new Random();
for(int i=0;i<arr.length;i++){
arr[i] = r.nextInt();
}
int[] arr1 = Arrays.copyOf(arr, arr.length);
int[] arr2 = Arrays.copyOf(arr, arr.length);
long start = System.currentTimeMillis();
Arrays.sort(arr1);
long end = System.currentTimeMillis();
System.out.println(end-start);
start = System.currentTimeMillis();
bubbleSort(arr2);
end = System.currentTimeMillis();
System.out.println(end-start);
}
```