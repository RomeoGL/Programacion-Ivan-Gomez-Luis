/***************************
*Autor:Ivan Gomez Luis
*Main: BonusCalculator.java
*Description: This program prints and calculates a person's work bonus.
**************/
public class BonusCalculator{
    public static void main(String[] args) {
        int salary; // a person salary
        String message;//specifies work bonus
        salary=5000;
        message="Bonus=$"+(salary * 0.08);
        System.out.println (message);
    }//end main
} //end BonusCalculator
