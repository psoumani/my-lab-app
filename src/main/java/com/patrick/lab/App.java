package com.patrick.lab;

public class App 
{
    public static void main( String[] args )
    {
        int a = 5;
        
        App nApp = new App();

        nApp.dayInWord(a);

        nApp.sumAverageRunningInt();

        nApp.numDivisibleByThreeAndFive(a);
        System.out.println(a +" is divisible by 3 and 5: " +nApp.numDivisibleByThreeAndFive(a));
    }

    public String dayInWord(int num) {
        
        int day = num;
        String dayWritten = "default";

        switch (day) {

            case 0: dayWritten = "Sunday";
                    System.out.println(dayWritten);
                    break;
            case 1: dayWritten = "Monday";
                    System.out.println(dayWritten);
                    break; 
            case 2: dayWritten = "Tuesday";
                    System.out.println(dayWritten);
                    break;
            case 3: dayWritten = "Wednesday";
                    System.out.println(dayWritten);
                    break;
            case 4: dayWritten = "Thursday";
                    System.out.println(dayWritten);
                    break;
            case 5: dayWritten = "Friday";
                    System.out.println(dayWritten);
                    break;
            case 6: dayWritten = "Saturday";
                    System.out.println(dayWritten);
                    break;
            default: dayWritten = "Not a valid day";
            System.out.println(dayWritten); 
        
        }
        return dayWritten;
    }

    public int sumAverageRunningInt() {
            int sum = 0;
            for (int i = 1; i <= 100; i++) {
                    sum = sum + i;
            }
            System.out.println("The sum of 1,2,...,100 is: " +sum );
            return sum;
            
    }

    public boolean numDivisibleByThreeAndFive(int num) {
            boolean result = true;
            if ((num % 3 == 0) && (num % 5 == 0)) {
                    return result;
            } else {
                    return !result;
                    
            }
            
    }
}
