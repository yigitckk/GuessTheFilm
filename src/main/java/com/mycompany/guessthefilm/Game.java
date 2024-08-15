/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessthefilm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author YiğitÇELİK
 */
public class Game{
    public static void writeFilms() throws FileNotFoundException {
        File file = new File("C:\\Users\\YiğitÇELİK\\Documents\\NetBeansProjects\\GuessTheFilm\\src\\main\\java\\com\\mycompany\\guessthefilm\\movies.txt");
        Scanner sc = new Scanner(file);
        
        ArrayList<String> list = new ArrayList<>();
        while(sc.hasNext()){
        String line = sc.nextLine();
        list.add(line);  
        }
        
        Random rnd = new Random();
        int index = rnd.nextInt(list.size());
        String randomOne = list.get(index);
        List<Character> words = new ArrayList<>();
        StringBuilder hiddenName = new StringBuilder(randomOne);
        for(int i=0; i<randomOne.length();i++){
           hiddenName.setCharAt(i, '_');
        }
        System.out.println(hiddenName);
        
         for (int i = 10; i > 0; i--) {
            System.out.println("You have "+ i + "chances left");
            System.out.print("Enter a character: ");
            Scanner input = new Scanner(System.in);
            String guess = input.nextLine();
            
            
            if (guess.length() != 1) {
                System.out.println("Please enter a single character.");
                continue; // Ask for input again
            }
            
            char guessedChar = guess.charAt(0); // Get the character input
            
            for (int j = 0; j < randomOne.length(); j++) {
                if (guessedChar == randomOne.charAt(j)) {
                    hiddenName.setCharAt(j, guessedChar);
                    
                }
            }   
            
            if(!randomOne.contains(guess)){
                if(words.contains(guessedChar)){
                    
                }else{
                     words.add(guessedChar);
                }
            }
            
             System.out.println(hiddenName);
             System.out.println("You have guessed " + words.size() + "wrong letters: " + words.toString());
             System.out.println("Do you have a clue about what's the movie - if so, type Yes or yes");
             Scanner answer = new Scanner(System.in);
             String Answer = answer.nextLine();
             
             if(Answer.equalsIgnoreCase("Yes")){
               System.out.print("text: ");
               Scanner finalg = new Scanner(System.in);
               String Final = finalg.nextLine();
               if(Final.equals(randomOne)){
                   System.out.println("Congrats! You won.");
                   break;
               }
               else{
                   continue;
               }
            }
        }
         if(hiddenName.equals(randomOne)){
                System.out.println(hiddenName);
            }else{
                System.out.println(randomOne);
            }
    }
}
