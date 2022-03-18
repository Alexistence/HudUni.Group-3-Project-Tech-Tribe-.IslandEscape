package com.Story;

import com.GUI.MainWindowController;
import com.GUI.TypeWriter;
import javafx.fxml.FXML;

import java.io.IOException;
import java.util.Scanner;


public class IntroScript {
    @FXML
    public void runIntro(MainWindowController MainWindowController)  {

        CharacterNames Names = new CharacterNames();
        TypeWriter TypeWriter = new TypeWriter();

        String NameSelf = "What username do you prefer for yourself?";
//        TypeWriter.initialiseText();
        TypeWriter.typeWriterPrint(MainWindowController,NameSelf);

        Scanner scanner = new Scanner(System.in);
        String firstHeroCharacter = scanner.nextLine(); //He was in army before, has the treasure map

        //Starting first Script
        String LineOne = "Year 2021.....\nFive friends.....\nWanted to make their Summer Vacation thrilling.....\n";
        String LineTwo = firstHeroCharacter + "\n" + Names.secondHeroCharacter + "\n" + Names.thirdHeroCharacter + "\n" + Names.fourthHeroCharacter + "\n" + Names.fifthHeroCharacter + "\n";
        String LineThree = "They went to a unknown island .....\nTo enjoy their summer vacation..... \nNear to the Arab Sea.....";
        String LineFour = "But till that time,\nThey didn't know that.....\nThis tour will be their life's most thrilling and adventurous time.....";
        String LineFive = "They came to the island by renting a yacht from their country's sea shore.....";
        String LineSix = "They started to hunt wild animals and fishes to eat them.....\nMade a small tent near the beach and.....\nStarted exploring the island.....";
        String LineSeven = "And this is how their life was going.....\n\n";
        //End of the first script

        TypeWriter.typeWriterPrint(MainWindowController,LineOne);
        TypeWriter.typeWriterPrint(MainWindowController,LineTwo);
        TypeWriter.typeWriterPrint(MainWindowController,LineThree);
        TypeWriter.typeWriterPrint(MainWindowController,LineFour);
        TypeWriter.typeWriterPrint(MainWindowController,LineFive);
        TypeWriter.typeWriterPrint(MainWindowController,LineSix);
        TypeWriter.typeWriterPrint(MainWindowController,LineSeven);
    }
}
