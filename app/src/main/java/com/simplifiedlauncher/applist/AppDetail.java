package com.simplifiedlauncher.applist;

import android.graphics.drawable.Drawable;

/**
 * Created by Maurizio on 19/01/2017.
 */

public class AppDetail {

    public CharSequence getLabel() {
        return label;
    }

    public void setLabel(CharSequence label) {
        this.label = label;
    }

    public CharSequence getName() {
        return name;
    }

    public void setName(CharSequence name) {
        this.name = name;
    }

    public Drawable getIcon() {
        return icon;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    private CharSequence label;
    private CharSequence name;
    private Drawable icon;
}
