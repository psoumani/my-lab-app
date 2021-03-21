package com.patrick.lab;

import java.util.ArrayList;
//import java.util.LinkedList;

public class Appweek10 {

    public static void main(String[] args) {

        //Execution of the method isPalindrome
        String str1 = "Esope, reste ici et se repose!!!";
        String str2 = "Je suis tres fatigue";
        String str3 = "Madam";

        Appweek10 nAppweek10 = new Appweek10();
        nAppweek10.isPalindrome(str1);
        nAppweek10.isPalindrome(str2);
        nAppweek10.isPalindrome(str3);

        //Execution of the method minimumElement
         ArrayList<Integer> numList = new ArrayList<>();
         numList.add(5);
         numList.add(7);
         numList.add(4);
         numList.add(9); 
         numList.add(13);
         numList.add(3);
         numList.add(0);
         numList.add(5);

         nAppweek10.minimumElement(numList);

        
    }

    public Boolean isPalindrome(String sentence) {

        //Remove any special character in sentence
        String modifiedSentence = sentence.replaceAll("[^a-zA-Z0-9]", " ");
        
        //Remove any space in the sentence
        modifiedSentence = modifiedSentence.replaceAll(" ", "");

        //Get the reverse of the updated sentence
        String reverseSentence = new StringBuilder(modifiedSentence).reverse().toString();

        //Ckeck if we have a palindrome or not
        if (modifiedSentence.equalsIgnoreCase(reverseSentence)) {
            System.out.println("The sentence \"" +sentence +"\" is a palindrome");
            return true;

        } else {
            System.out.println("The sentence \"" +sentence +"\" is not a palindrome");
            return false;
            
        }

    }

    public int minimumElement(ArrayList<Integer> list) {
        int minElt = list.get(0);

        for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= minElt) {
                    minElt = list.get(i);
                }
        }
        System.out.println("The minimum element in the list is: " +minElt);
        return minElt;
        
    }

    
}