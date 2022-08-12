package com.stackroute.basics;

import java.util.Scanner;

public class StringFinder {
    String searchString,firstString, secondString;
    //Create Scanner object as instance variable
    Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user

        StringFinder sf= new StringFinder();
        sf.searchString=sf.getInput();
        sf.firstString=sf.getInput();
        sf.secondString=sf.getInput();
        sf.displayResult(sf.findString(sf.searchString, sf.firstString, sf.secondString));
    }

    public String getInput() {
        return s.nextLine();
    }

    public void displayResult(int result) {
        //displays the result
        if(result==1) System.out.println("Found as expected");
        else if(result==0) System.out.println("Not found");
        else if(result==-1) System.out.println("Empty string or null");
    }

    public int findString(String searchString, String firstString, String secondString) {
        int f=-1, s=-1;
        if(searchString==""||firstString==""||secondString==""||searchString==null|firstString==null||secondString==null||firstString.length()==0||searchString.length()==0||secondString.length()==0)
            return -1;
        else{
            f=searchString.indexOf(firstString);
            s=searchString.indexOf(secondString);
            if(f>=0&&s>=0)
            {
                if(f<=s)
                    return 1;
                else
                    return 0;
            }
            else
                return 0;
        }
    }

    public void closeScanner() {
        s.close();
    }
}
