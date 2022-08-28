package com.onjava.control;

import static com.onjava.onjava.Range.*;

/**
 * @Author: Sandwich
 * @Description:
 * @Date: Created in 2:57 下午 2022/8/27
 */


public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) break;
            if (i % 9 != 0) continue;       // 0 / 9 = 0 输出0
            System.out.print(i + " ");
        }
        System.out.println();
        // 使用for-in循环
        for (int i : range(100)) {
            if (i == 74) break;
            if (i % 9 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) break;
            if (i % 10 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
