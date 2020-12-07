package com.company;
import java.util.*;


public class Laborki {

    public static boolean endsWith(String word, String suffix){

        String x = "";
        int counter = suffix.length();
        int wordLength = word.length()-1;
        while(counter>0){
            x=word.charAt(wordLength)+x;
            counter--;
            wordLength--;
        }
        if(suffix.equals(x))
            return true;
        else return false;
    }
    public static void main(String[]args){

        System.out.println(endsWith("Ala ma kota","kota"));
        }

    }
