package com.applikeysolutions.cosmocalendar.selection;

import android.support.annotation.NonNull;

import com.applikeysolutions.cosmocalendar.model.Day;

public abstract class BaseSingleSelectionManager {

    protected OnSingleDaySelectedListener onSingleDaySelectedListener;

    public abstract void toggleDay(@NonNull Day day);

    public abstract boolean isDaySelected(@NonNull Day day);

    public abstract void clearSelections();

    public BaseSingleSelectionManager() {
    }

    public void setDay(Day day) {
    }
}
