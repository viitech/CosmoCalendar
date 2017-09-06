package com.applikeysolutions.cosmocalendar.settings.appearance;

public class AppearanceModel implements AppearanceInterface {

    //Background color of whole calendar
    private int calendarBackgroundColor;

    //Text color of month title
    private int monthTextColor;

    //Text color of day that month doesn't include
    private int otherDayTextColor;

    //Text color of day
    private int dayTextColor;

    //Text color of weekend day (ex. Saturday, Sunday)
    private int weekendDayTextColor;

    //Text color of week day titles
    private int weekDayTitleTextColor;

    //Text color of selected days
    private int selectedDayTextColor;

    //Background color of selected days
    private int selectedDayBackgroundColor;

    //Background color of START day from selected range
    private int selectedDayBackgroundStartColor;

    //Background color of END day from selected range
    private int selectedDayBackgroundEndColor;

    //Text color of current day
    private int currentDayTextColor;

    //Icon resource of current day
    private int currentDayIconRes;

    //Icon resource of current day selected
    private int currentDaySelectedIconRes;

    //Text color of connected day
    private int connectedDayTextColor;

    //Text color of connected day selected
    private int connectedDaySelectedTextColor;

    //Text color of disabled day
    private int disabledDayTextColor;

    //Text color of month titles in selection bar
    private int selectionBarMonthTextColor;

    //Icon resource of previous month navigation button
    private int previousMonthIconRes;

    //Icon resource of next month navigation button
    private int nextMonthIconRes;

    /**
     * Orientation of calendar
     * possible values:
     * HORIZONTAL - left/right swipable months, navigation buttons
     * VERTICAL - top/bottom swipable months
     */
    private int calendarOrientation;

    //Defines if we need to display week day titles for every month
    private boolean showDaysOfWeek;

    //Defines if we need to display week day title for whole calendar
    private boolean showDaysOfWeekTitle;


    @Override
    public int getCalendarBackgroundColor() {
        return calendarBackgroundColor;
    }

    @Override
    public int getMonthTextColor() {
        return monthTextColor;
    }

    @Override
    public int getOtherDayTextColor() {
        return otherDayTextColor;
    }

    @Override
    public int getDayTextColor() {
        return dayTextColor;
    }

    @Override
    public int getWeekendDayTextColor() {
        return weekendDayTextColor;
    }

    @Override
    public int getWeekDayTitleTextColor() {
        return weekDayTitleTextColor;
    }

    @Override
    public int getSelectedDayTextColor() {
        return selectedDayTextColor;
    }

    @Override
    public int getSelectedDayBackgroundColor() {
        return selectedDayBackgroundColor;
    }

    @Override
    public int getSelectedDayBackgroundStartColor() {
        return selectedDayBackgroundStartColor;
    }

    @Override
    public int getSelectedDayBackgroundEndColor() {
        return selectedDayBackgroundEndColor;
    }

    @Override
    public int getCurrentDayTextColor() {
        return currentDayTextColor;
    }

    @Override
    public int getCurrentDayIconRes() {
        return currentDayIconRes;
    }

    @Override
    public int getCurrentDaySelectedIconRes() {
        return currentDaySelectedIconRes;
    }

    @Override
    public int getCalendarOrientation() {
        return calendarOrientation;
    }

    @Override
    public int getConnectedDayTextColor() {
        return connectedDayTextColor;
    }

    @Override
    public int getConnectedDaySelectedTextColor() {
        return connectedDaySelectedTextColor;
    }

    @Override
    public int getDisabledDayTextColor() {
        return disabledDayTextColor;
    }

    @Override
    public int getSelectionBarMonthTextColor() {
        return selectionBarMonthTextColor;
    }

    @Override
    public int getPreviousMonthIconRes() {
        return previousMonthIconRes;
    }

    @Override
    public int getNextMonthIconRes() {
        return nextMonthIconRes;
    }

    @Override
    public boolean isShowDaysOfWeek() {
        return showDaysOfWeek;
    }

    @Override
    public boolean isShowDaysOfWeekTitle() {
        return showDaysOfWeekTitle;
    }

    @Override
    public void setCalendarBackgroundColor(int calendarBackgroundColor) {
        this.calendarBackgroundColor = calendarBackgroundColor;
    }

    @Override
    public void setMonthTextColor(int monthTextColor) {
        this.monthTextColor = monthTextColor;
    }

    @Override
    public void setOtherDayTextColor(int otherDayTextColor) {
        this.otherDayTextColor = otherDayTextColor;
    }

    @Override
    public void setDayTextColor(int dayTextColor) {
        this.dayTextColor = dayTextColor;
    }

    @Override
    public void setWeekendDayTextColor(int weekendDayTextColor) {
        this.weekendDayTextColor = weekendDayTextColor;
    }

    @Override
    public void setWeekDayTitleTextColor(int weekDayTitleTextColor) {
        this.weekDayTitleTextColor = weekDayTitleTextColor;
    }

    @Override
    public void setSelectedDayTextColor(int selectedDayTextColor) {
        this.selectedDayTextColor = selectedDayTextColor;
    }

    @Override
    public void setSelectedDayBackgroundColor(int selectedDayBackgroundColor) {
        this.selectedDayBackgroundColor = selectedDayBackgroundColor;
    }

    @Override
    public void setSelectedDayBackgroundStartColor(int selectedDayBackgroundStartColor) {
        this.selectedDayBackgroundStartColor = selectedDayBackgroundStartColor;
    }

    @Override
    public void setSelectedDayBackgroundEndColor(int selectedDayBackgroundEndColor) {
        this.selectedDayBackgroundEndColor = selectedDayBackgroundEndColor;
    }

    @Override
    public void setCurrentDayTextColor(int currentDayTextColor) {
        this.currentDayTextColor = currentDayTextColor;
    }

    @Override
    public void setCurrentDayIconRes(int currentDayIconRes) {
        this.currentDayIconRes = currentDayIconRes;
    }

    @Override
    public void setCurrentDaySelectedIconRes(int currentDaySelectedIconRes) {
        this.currentDaySelectedIconRes = currentDaySelectedIconRes;
    }

    @Override
    public void setCalendarOrientation(int calendarOrientation) {
        this.calendarOrientation = calendarOrientation;
    }

    @Override
    public void setConnectedDayTextColor(int connectedDayTextColor) {
        this.connectedDayTextColor = connectedDayTextColor;
    }

    @Override
    public void setConnectedDaySelectedTextColor(int connectedDaySelectedTextColor) {
        this.connectedDaySelectedTextColor = connectedDaySelectedTextColor;
    }

    @Override
    public void setDisabledDayTextColor(int disabledDayTextColor) {
        this.disabledDayTextColor = disabledDayTextColor;
    }

    @Override
    public void setSelectionBarMonthTextColor(int selectionBarMonthTextColor) {
        this.selectionBarMonthTextColor = selectionBarMonthTextColor;
    }

    @Override
    public void setPreviousMonthIconRes(int previousMonthIconRes) {
        this.previousMonthIconRes = previousMonthIconRes;
    }

    @Override
    public void setNextMonthIconRes(int nextMonthIconRes) {
        this.nextMonthIconRes = nextMonthIconRes;
    }

    @Override
    public void setShowDaysOfWeek(boolean showDaysOfWeek) {
        this.showDaysOfWeek = showDaysOfWeek;
    }

    @Override
    public void setShowDaysOfWeekTitle(boolean showDaysOfWeekTitle) {
        this.showDaysOfWeekTitle = showDaysOfWeekTitle;
    }
}