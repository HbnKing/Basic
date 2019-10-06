package mmn;

/**
 *
 * 一个判断 闰年的 工具类
 *
 */
public class DateUtil {

    public boolean isLeapYear(int year){
        //先判断 时间范围
        if(year <=0 || year >10000){
            return false ;
        }
        /**
         * 符合时间范围的
         * 再判断年份是否复合要求
         */
        if((year %100 !=0 && year%4==0 ) || ( year %100==0 && year%400 == 0 )){
            return true ;
        }
        return false ;


    }
}
