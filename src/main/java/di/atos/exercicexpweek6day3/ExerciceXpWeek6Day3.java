/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package di.atos.exercicexpweek6day3;

import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author ezekielkouassi
 */
public class ExerciceXpWeek6Day3 {

    public static void main(String[] args) {
        
        System.out.println("============= Exercie 1 ===========");
        
        String triangle = "";
        
        for(int i = 1; i <= 4; i++) {
            triangle += "*";
            System.out.println(triangle);
        }
        
        System.out.println("========== Fin Exercice 1 ==========");
        
        System.out.println("=========== Exercice 2 ===========");
        
        triangle = "";
        
        for(int i = 1; i <= 7; i++) {
            for(int j = 1; j <= i; j++) {
                triangle += String.valueOf(i);
            }
            System.out.println(triangle);
            triangle = "";
        }
        
        System.out.println("=========== Fin Exercice 2 =======");
        
        System.out.println("======= Exercice 3 =========");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un numéro : ");
        int userEntry = sc.nextInt();
        
        String userEntryToString = String.valueOf(userEntry);
        String userEntryToStringReverse = "";
        
        for(int i = userEntryToString.length() - 1; i >= 0; i--) {
            userEntryToStringReverse += userEntryToString.charAt(i);
        }
        
        System.out.println("userEntry is : " + userEntry + " userEntryReverse is: " + userEntryToStringReverse);
        
        System.out.println("======= Fin exercice 3 ========");
        
        System.out.println("======== Exercice 4 =========");
        
        
        for(int i = 1; i<500; i++) {
            String value = String.valueOf(i);
            
            if(value.length() > 1) {
                int sum = 0;
                for(int j = 0; j<value.length(); j++) {
                    int el = Integer.parseInt(String.valueOf(value.charAt(j)));
                    sum += Math.pow(el, 3);
                }
                
                if(sum == Integer.parseInt(value)) {
                    System.out.println(value + " is a number of Armstrong");
                }
            }
        }
        
        System.out.println("======== Fin Exercice 4 ========");
    }
}
