import mmn.DateUtil;
import org.junit.Assert;
import org.junit.Test;

public class JunitDateUtilTestForYear {

    @Test
    public void testForDateUtil(){

        int [] years = new int[]{-100, 1000, 20000, 2020, 2019, 2000, 1900};
        boolean [] yearMach = new boolean[]{false ,false,false,true,false,true,false};
        for(int i = 0 ; i  < years.length ;i++){
            Assert.assertEquals(yearMach[i],new DateUtil().isLeapYear(years[i]));
        }

    }
}
