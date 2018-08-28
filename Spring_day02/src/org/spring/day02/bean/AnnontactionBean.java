package org.spring.day02.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @className AnnontactionBean
 * @Description: (这里用一句话描述这个类的作用)
 * @author: bing_huang
 * @Date: 2018/8/2314:09
 * @Version: 1.0
 *
 */
@Component(value ="annontactionBean")
public class AnnontactionBean {

    private org.spring.day02.bean.AnnontactionBean2 bean2;

    private  String str;
    @Autowired
    @Qualifier(value = "annontactionBean2")
    public void setBean2(AnnontactionBean2 bean2) {
        this.bean2 = bean2;
    }
    @Autowired
    @Value("李四")
    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "AnnontactionBean{" +
                "bean2=" + bean2.getStr() +
                ", str='" + str + '\'' +
                '}';
    }
}
