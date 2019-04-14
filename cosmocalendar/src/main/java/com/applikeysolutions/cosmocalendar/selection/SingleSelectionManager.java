package com.applikeysolutions.cosmocalendar.selection;

import android.support.annotation.NonNull;

import com.applikeysolutions.cosmocalendar.model.Day;

public class SingleSelectionManager extends BaseSingleSelectionManager {

    private Day day;

    public SingleSelectionManager(OnSingleDaySelectedListener onSingleDaySelectedListener) {
        this.onSingleDaySelectedListener = onSingleDaySelectedListener;
    }

    @Override
    public void toggleDay(@NonNull Day day) {
        this.day = day;
        onSingleDaySelectedListener.onDaySelected(day);
    }

    @Override
    public boolean isDaySelected(@NonNull Day day) {
        return day.equals(this.day);
    }

    @Override
    public void clearSelections() {
        day = null;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
