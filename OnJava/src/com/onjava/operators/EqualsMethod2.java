package com.onjava.operators;

import java.util.Objects;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 3:19 下午 2022/8/21
 */

class Value {
    int i;

    /**
     * 重写equals方法
     * @param o 比较对象
     * @return 返回比较结果
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value = (Value) o;
        return i == value.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}

public class EqualsMethod2 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 1;
        System.out.println(v1.equals(v2));
    }
}
