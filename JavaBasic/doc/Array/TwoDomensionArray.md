## 数组的定义与使用(二维数组)
```
public class Array{
public static void main(String args[]){ int data[][]=new int[][]{
{1,2,3},
{4,5,6},
{7,8,9}
};
//外层循环是控制数组的行内容
for(int x=0;x<data.length;x++){
for(int y=0;y<data[x].length;y++){ System.out.print(data[x][y]+"\t"); }
System.out.println(); }
}
}
```