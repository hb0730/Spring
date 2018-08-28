package org.spring.day01.bean;

/**
 * @className Son
 * @Description: (这里用一句话描述这个类的作用)
 * @author: bing_huang
 * @Date: 2018/8/2214:18
 * @Version: 1.0
 *
 */
public class Son {
    /*描述*/
    private String name;

    public Son() {
        System.out.println("son 无参构造");
    }

//    public Son(String name) {
//        this.name = name;
//        System.out.println("son 有参构造");
//    }


    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
