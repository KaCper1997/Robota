package com.company;

public class Main10 {

    public static void main(String[] args) {

        System.out.println(footballWin(0, 0, 0, 0));
    }
    public static String footballWin(int scr_A_in_A, int scr_B_in_A, int scr_A_in_B, int scr_B_in_B) {
        if(scr_A_in_A>scr_B_in_A && scr_A_in_B>scr_B_in_B){
            return "Win team A";
        }else if(scr_B_in_A>scr_A_in_A && scr_B_in_B>scr_A_in_B){
            return "Win team B";
        }else if(scr_A_in_A>scr_B_in_A && scr_A_in_B== scr_B_in_B){
            return "Win team A";
        }else if(scr_B_in_A>scr_A_in_A && scr_A_in_B == scr_B_in_B){
            return "Win team B";
        }else if(scr_A_in_A == scr_B_in_A && scr_A_in_B>scr_B_in_B){
            return "Win team A";
        }else  if(scr_A_in_A == scr_B_in_A && scr_B_in_B > scr_A_in_B){
            return "Win team B";
        }else if( scr_A_in_A>scr_B_in_A && scr_B_in_B>scr_A_in_B){
            if(scr_A_in_B>scr_B_in_A){
                return "Win team A ";
            }else if(scr_B_in_A>scr_A_in_B){
                return "Win team B ";
            }else{
                return "Remis";
            }
        }else if(scr_B_in_A>scr_A_in_A && scr_A_in_B>scr_B_in_B){
            if(scr_A_in_B>scr_B_in_A){
                return "Win team A ";
            }else if(scr_B_in_A>scr_A_in_B){
                return "Win team B ";
            }else{
                return "Remis";
            }
        }
        return "remis";
    }

}
/// kurwa to wiem generalnie że przejebanie to wygląda ale nie miałem innego pomysłu generalnie jak to zrobić krócej i lepiej.
/// podeślij pomysła jakbyś ty to teraz zrobił na moim miejscu.



