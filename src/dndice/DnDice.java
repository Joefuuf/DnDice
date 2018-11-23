/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dndice;
import java.util.Scanner;
/**
 *
 * @author jasho9017
 */
public class DnDice {
    public static void d4(int n1){
        System.out.println("You have chosen to roll a d4");
        n1 = (int)Math.round(Math.random()*1+4);
        System.out.println(n1);
    }
    public static void d6(int n1){
        System.out.println("You have chosen to roll a d6");
        n1 = (int)Math.round(Math.random()*1+6);
        System.out.println(n1);
    }
    public static void d8(int n1){
        System.out.println("You have chosen to roll a d8");
        n1 = (int)Math.round(Math.random()*1+8);
        System.out.println(n1);
    }
    public static void d10(int n1){
        System.out.println("You have chosen to roll a d10");
        n1 = (int)Math.round(Math.random()*1+10);
        System.out.println(n1);
    }
    public static void d12(int n1){
        System.out.println("You have chosen to roll a d12");
        n1 = (int)Math.round(Math.random()*1+12);
        System.out.println(n1);
    }
    public static void d20(int n1){
        System.out.println("You have chosen to roll a d20");
        n1 = (int)Math.round(Math.random()*1+20);
        System.out.println(n1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        int diceRoll=0;
        int userAttBonus;
        int userChoice = 0;
        System.out.println("Welcome to DnDice");
        System.out.println("1: Roll a d4");
        System.out.println("2: Roll a d6");
        System.out.println("3: ROll a d8");
        System.out.println("4: Roll a d10");
        System.out.println("5: Roll a d12");
        System.out.println("6: Roll a d20");
        System.out.println("CHOOSE YOUR DICE");
        userChoice = keyedInput.nextInt();
        
        if (userChoice == 1){
            d4(diceRoll);
            System.out.println(diceRoll);
            System.out.println("Add your attribute bonus");
            userAttBonus = keyedInput.nextInt();
            System.out.println("This is the total amount");
            System.out.println(diceRoll + userAttBonus);
        }
            
    }
    
}
