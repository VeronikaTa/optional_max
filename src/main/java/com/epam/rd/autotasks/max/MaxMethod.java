package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        OptionalInt maxOptional = OptionalInt.empty();
        if(values != null && values.length != 0) {
            int maxValue = values[0];
            for (int value : values) {
                if (maxValue < value) {
                    maxValue = value;
                }
                maxOptional = OptionalInt.of(maxValue);
            }
        }
        return maxOptional;
    }
}
