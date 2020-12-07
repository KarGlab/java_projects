package com.company;
import java.util.*;


public class Laborki {

    public static void main(String[]args){

        Scanner scann = new Scanner(System.in);
        System.out.println("Podaj wartosc, o jaka chcesz szyfrowac tekst");
        int value = scann.nextInt();
        String x="abcDEFZ";
        String ceasar = "";
        int a = 0;
        for(int i = 0;i<x.length(); i++)
        {
            //szyfrowanie duzych liter 
            if((x.charAt(i)>=65&&x.charAt(i)<=90)) {
                if ((x.charAt(i) + value) > 90) {
                    a = 65 + x.charAt(i) + value - 90;
                    ceasar += (char) a;
                } else {
                    ceasar += (char) (x.charAt(i) + value);
                }
            }
            //szyfrowanie malych liter
            else if (x.charAt(i)>=97&&x.charAt(i)<=122) {
                //sprawdzanie czy kod literki plus wartosc bedzie wiekszy niz kod z
                if((x.charAt(i)+value)>122){
                    //jesli tak to a jest tu po to zeby wziac te wartosc, obliczyc roznice jaka dzieli wartosc z
                    //od wartosci char+podana a potem dodaje to do wartosci literki a
                    a = 97+x.charAt(i)+value-122;
                    ceasar+=(char)a;
                }
                else{
                    ceasar+=(char)(x.charAt(i)+value);
                }

            }
            }
        System.out.println(ceasar);
        }

    }
