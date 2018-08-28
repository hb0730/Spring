package org.spring.day01.test;

import org.spring.day01.bean.Bean;
import org.spring.day01.bean.Paren;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * @className Test
 * @Description: 测试(这里用一句话描述这个类的作用)
 * @author: bing_huang
 * @Date: 2018/8/2121:14
 * @Version: 1.0
 *
 */
public class Test {

    public static void main(String[] args) {
        //解析bean.xml生成bean对象
        //ApplicationContext  是一个高级工厂的接口，能够维护不同bean及其依赖关系的注册表。 使
        //用方法 T getBean（String name，Class requiredType）  你可以检索bean的实例。
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("bean.xml");
////        BeanFactory
//        Bean   bean=(Bean)applicationContext.getBean("bean");
//        bean.setName("Spring");
//        bean.show();
        //getBean(String) 根据id获取name别名找到bean
//        Paren person =(Paren) applicationContext.getBean("paren");
//        person.getAllName();
        Paren paren=applicationContext.getBean("parenNoReference" ,Paren.class);
        paren.getAllName();
    }
}
