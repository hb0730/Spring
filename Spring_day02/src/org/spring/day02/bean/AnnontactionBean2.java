package org.spring.day02.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value ="annontactionBean2")
public class AnnontactionBean2 {

    private  String str;

    @Autowired
    @Value("王五")
    public void setStr(String str) {
        this.str = str;
    }
    public String getStr() {
        return str;
    }
}
