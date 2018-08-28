package org.spring.day02.test;

import org.spring.day02.bean.AnnontactionBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @className Test
 * @Description: (这里用一句话描述这个类的作用)
 * @author: bing_huang
 * @Date: 2018/8/2315:14
 * @Version: 1.0
 *
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        AnnontactionBean annontactionBean= (AnnontactionBean) applicationContext.getBean("annontactionBean");
        System.out.println(annontactionBean.toString());
    }
}
