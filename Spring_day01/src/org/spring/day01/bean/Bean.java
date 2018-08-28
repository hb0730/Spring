package org.spring.day01.bean;

/**
 * @className Bean
 * @Description: (这里用一句话描述这个类的作用)
 * @author: bing_huang
 * @Date: 2018/8/2120:59
 * @Version: 1.0
 *
 */
public class Bean {

    public Bean() {
        super();
    }

    private String name;



    /**
     * setName
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 显示show
     */
    public void show(){
        System.out.println("hello "+name);
    }

}
