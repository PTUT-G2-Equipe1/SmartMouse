package com.example.f15003938.smartmouse;

import android.widget.RelativeLayout;

public class Parametres {
    private RelativeLayout rl;
    private static String fond = "#FFFFFF";

    public static String get_fond() {
        return fond;
    }

    public static void set_fond(String f) {
        fond = f;
    }
}
