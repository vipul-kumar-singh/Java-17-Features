package com.vkstech.java17features.returnSwitch;

/**
 * With the new switch expressions,
 * switch can return a value using yield keyword,
 * making it more concise and reducing boilerplate code
 */
public class SwitchReturnDemo {

    public static int getDayLength(Day day) {
        return switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY -> 7;
            default -> {
                int length = day.toString().length();
                yield length; // 'yield' returns a value in switch expressions
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(getDayLength(Day.MONDAY)); // Output: 6
    }

}
