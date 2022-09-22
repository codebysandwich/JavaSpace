package com.onjava.hiding.cookie2;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 12:54 上午 2022/9/23
 */


public class Cookie {
    public Cookie() {
        System.out.println("Cookie constructor");
    }

    protected void bite() {
        System.out.println("bite");
    }
}
