package oop;


import java.util.ArrayList;
import java.util.List;

/**
 * Java  内部类的测试
 * 使用List<T></>
 * 泛型 来测试其效果
 *
 */
public class Inner {

    public static void main(String[] args) {
        Inners  inner11 = new Inner().new Inners();
        Inners  inner22 = new Inner().new Inners();

        List<Inners> test = new ArrayList<>();
        test.add(inner11);
        test.add(inner22);

        /**
         * 两个对象的子类都可以添加成功
         */



    }

    class  Inners {

    }
}



