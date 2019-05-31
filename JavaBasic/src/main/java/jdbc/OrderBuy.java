/*
package jdbc;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;


public class OrderBuy {

    public static BasicDataSource basicDataSource = null;

    public final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public final static String DB_URL = "jdbc:mysql://192.168.80.128/test";
    public final static String USER = "root";
    public final static String PASSWORD = "root";

    public void init()
    {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(DB_URL);
        basicDataSource.setDriverClassName(JDBC_DRIVER);
        basicDataSource.setUsername(USER);
        basicDataSource.setPassword(PASSWORD);
    }

    public void buyOne(String buyer,String productName) throws ClassNotFoundException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = basicDataSource.getConnection();
            //开启事务
            connection.setAutoCommit(false);
            //使用悲观锁
            String getproduct_sql = "SELECT Inventory FROM inventory WHERE(ProductName = ?) FOR UPDATE";
            preparedStatement = connection.prepareStatement(getproduct_sql);
            preparedStatement.setString(1,productName);
            resultSet = preparedStatement.executeQuery();
            int inventory = -1;
            while(resultSet.next())
                inventory = resultSet.getInt("Inventory");

            System.out.println("[inventory]:" + inventory);

            if(inventory <= 0)
            {
                System.out.println("没有库存");
                throw new SQLException();
            }
            else
            {
                //减少库存
                String subproduct_sql = "UPDATE inventory SET Inventory=? WHERE (ProductName = ?)";
                preparedStatement = connection.prepareStatement(subproduct_sql);
                preparedStatement.setInt(1,inventory - 1);
                preparedStatement.setString(2,productName);
                preparedStatement.execute();

                //新增订单
                String addorder_sql = "INSERT INTO `order` (`buyer`, `ProductName`) VALUES (?, ?)";
                preparedStatement = connection.prepareStatement(addorder_sql);
                preparedStatement.setString(1,buyer);
                preparedStatement.setString(2,productName);
                preparedStatement.execute();

                //提交事务
                connection.commit();
            }




        } catch (SQLException e) {
            // ignore
            System.out.println("[SQLException]:" + e.toString());
            //如果发生异常则回滚事务
            if(connection != null)
                try {
                    //发生异常回滚
                    connection.rollback();

                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
        } finally {
            if (preparedStatement != null)
            {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}*/
