package com.example.f15003938.smartmouse;

import android.graphics.Typeface;
import android.widget.RelativeLayout;

public class Parametres {
    private RelativeLayout rl;
    private static String fond = "#FFFFFF";
    private static float font_size = 15;
    private static Typeface font = Typeface.DEFAULT;

    public static String get_fond() {
        return fond;
    }
    public static void set_fond(String f) {
        fond = f;
    }

    public static float get_font_size() {
        return font_size;
    }
    public static void set_font_size(float fs) {font_size = fs; }

    public static Typeface get_font() {
        return font;
    }
    public static void set_font(Typeface f) { font = f; }
}
