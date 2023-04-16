package com.zdmitrij.crosszero;

import java.util.Arrays;

public class Field {
    private final String[] values = new String[9];

    public String[] getValues() {
        return values;
    }

    public void showField() {
        System.out.println(Arrays.toString(values));
    }
}
