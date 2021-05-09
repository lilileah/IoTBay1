/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.isd.controller;

import java.util.*;

/**
 *
 * @author Dean
 */
public class InputFilter {

    private String restrictedChars;
    private String disallowedChars;

    public InputFilter() {
        restrictedChars = "@.";
        disallowedChars = "\"";
    }

    public boolean validateInput(String input) //this will return true/false depending if "@. chars are in the parameter string
    {
        for (int i = 0; i < disallowedChars.length(); i++) {//loops through the string of chars
            char c = disallowedChars.charAt(i);
            if (!input.contains(String.valueOf(c)))//checks if the input contains a char listed in the above string.
            {
                return true;//if the string does not contain these chars.
            }
        }
        return false;
    }

    public boolean IsEmail(String input) //this will check is the string has @ or . in the userrname field. Then returns a bool based on the result. MUST CALL VALIDATEINPUT FIRST. might change it donno
    {
        for (int i = 0; i < restrictedChars.length(); i++) {
            char c = restrictedChars.charAt(i);
            if (input.contains(String.valueOf(c))) //checks if the input contains a char listed in the above string.
            {
                return true;
            }
        }

        return false;
    }
}
