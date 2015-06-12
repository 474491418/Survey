package edu.sust.test.dataSource;



import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by envy15 on 2015/4/7 0007.
 */

/**
 * 测试数据源
 */
public class TestDataSource {
    @Test
    public void getConnection(){
        ApplicationContext context= null;
        try {
            context = new ClassPathXmlApplicationContext("config/Application.xml");
        } catch (BeansException e) {
            e.printStackTrace();
        }
        DataSource ds= (DataSource) context.getBean("dataSource");
        try {
            System.out.println(ds.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
