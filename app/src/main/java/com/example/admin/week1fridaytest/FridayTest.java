package com.example.admin.week1fridaytest;

/**
 * Created by Admin on 9/1/2017.
 */

public class FridayTest {

    public static void main(String[] args) {




        //singleton class  new instance

        //1. Method to tell you if a string is a palindrome
        first("Pablo");
        //2. Create a singleton class and make it thread safe
        //get instance check if instance is null
        //if instance is null -create
        //if not get it
        //make constructor private
        second();

        //3. Create a function to find the most occurrence of a integer value given an integer array/list.
        //{2,3,4,5,5,6,7}
        third();

        //4: Simple Java Program to check or find if a number is Armstrong number or not.
        //An Armstrong number of three digit is a number whose sum of cubes of its digit is equal to its number.
        // For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or 1+125+27=153
        fourth(153);
    }

    private static void fourth(int checkArmStrong) {

        String  checkArmStrongWord= Integer.toString(checkArmStrong);
        int[][] multiCheckArmStrong = new int[checkArmStrongWord.length()][2];
        for(int q=0;q<checkArmStrongWord.length();q++)
        {
          multiCheckArmStrong[q][0]=  Character.getNumericValue(checkArmStrongWord.charAt(q));
              multiCheckArmStrong[q][1]= (int)Math.pow(Character.getNumericValue(checkArmStrongWord.charAt(q)), checkArmStrongWord.length());
        }

        int finalNumber=0;
        for(int i=0; i< multiCheckArmStrong.length;i++){
            finalNumber+=multiCheckArmStrong[i][1];
        }

        if(finalNumber==checkArmStrong)
            System.out.println(checkArmStrong + " is Armstrong");
        else
            System.out.println(checkArmStrong + " is not Armstrong");


    }

    private static void third() {

        int mostOccurrenceNumber=-1;
        int mostOccurrenceNumberCounter=-1;
        int testingMostOccurrenceNumber=0;
        int testingMostOccurrenceNumberCounter=0;
        int numArray[]={2,3,4,5,5,6,7};
        for(int i=0; i < numArray.length;i++){
            //System.out.println(numArray[i]);
            testingMostOccurrenceNumber= numArray[i];
            testingMostOccurrenceNumberCounter=0;
            for(int j=0;j<numArray.length;++j){
                if(testingMostOccurrenceNumber==numArray[j]){
                    testingMostOccurrenceNumberCounter+=1;
                }
            }

            System.out.println("most= "+mostOccurrenceNumber+ "     "+ "test most= "+ testingMostOccurrenceNumber);
            System.out.println("count= "+mostOccurrenceNumberCounter+ "    "+ "count= "+ testingMostOccurrenceNumberCounter);
            if(testingMostOccurrenceNumberCounter> mostOccurrenceNumberCounter){
                mostOccurrenceNumber=testingMostOccurrenceNumber;
                mostOccurrenceNumberCounter = testingMostOccurrenceNumberCounter;
            }

        }
        System.out.println("most occurrence interger: " +mostOccurrenceNumber);
    }


    private static void second() {


        Singleton singletonCreate = Singleton.getSingleton( );



    }


    private static void first(String wordCheck) {
        String[] a = new String[wordCheck.length()];

        String backwardsWord = "";
        for (int i = wordCheck.length() - 1; i >= 0; i--) {
            //System.out.println(wordCheck.charAt(i));
            backwardsWord += wordCheck.charAt(i);
        }

        //test if palindrome
        System.out.println("Word: "+ wordCheck);
        System.out.println("Backwards word: "+backwardsWord );
        if (backwardsWord.equals(wordCheck))
            System.out.println("is Palindrone");
        else
            System.out.println("is not Palindrone");
    }
}

