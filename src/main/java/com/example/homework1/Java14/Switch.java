package com.example.homework1.Java14;

public class Switch {

    public static String isLightingOn(String position) {
        boolean isLightOn = switch (position){
            case "On" -> true;
            case "Off" -> false;
            default -> throw new IllegalStateException("The light switch is broken");
        };
        if (isLightOn) {
            return ("Light on");
        }
        else return ("Light off");
    }
}
