package mysql;

/**
 * @author wangheng
 * @date 2019-06-12 下午4:41
 * @description
 **/
public class Test {
    public static void main(String[] args) {
        String a = "aa";
        Test  t = new Test();
        t.changeData(a);
        System.out.println(a);  //输出结果没变

    }

    public void changeData(String a){
        a = a+"b";
    }
}
