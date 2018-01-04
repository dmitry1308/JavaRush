package ru.schepin.otherExercises.e;


public enum DaysOfWeekend {

    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;


    public boolean isWeekend() {
        switch (this) {
            case SUNDAY:
            case SATURDAY:
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        if (DaysOfWeekend.SATURDAY.isWeekend()) System.out.println("Выходной");
        else System.out.println("Не выходной");

        DaysOfWeekend[] values = DaysOfWeekend.values();

        int ordinal = DaysOfWeekend.FRIDAY.ordinal();
        System.out.println(ordinal);


        for (DaysOfWeekend value : values) {
            System.out.println(value);
        }
    }
}
