package org.spring.day01.bean;

/**
 * @className Paren
 * @Description: (这里用一句话描述这个类的作用)
 * @author: bing_huang
 * @Date: 2018/8/2214:19
 * @Version: 1.0
 *
 */
public class Paren {
    private Son son;
    private  String name;

    public Paren() {
        System.out.println("paren 无参构造");
    }

    public Paren(String name,Son son) {
        this.name = name;
        this.son=son;
        System.out.println("paren 有参构造");
    }

    public void setSon(Son son) {
        this.son = son;
    }

    public void getAllName(){
        System.out.println("son Name is"+son.getName());
        System.out.println("Paren Name is"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
