package com.onjava.housekeeping;

import com.onjava.onjava.Nap;

/**
 * @Author: Sandwich
 * @Description: 使用finalize()删除一个无法被回收的对象
 * @Date: Created in 10:14 下午 2022/9/8
 */


class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if (checkedOut) {
            System.out.println("Error: check out");
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
        new Nap(1);
    }
}
