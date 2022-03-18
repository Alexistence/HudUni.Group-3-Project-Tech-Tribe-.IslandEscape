package com.GUI;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.util.Duration;

import java.io.IOException;

public class TypeWriter {

//    public void typeWriterPrint(String textInput) {
//        try {
//            String currentText = MainWindowController.Lbl_Output.getText();
//
//            final Animation typewriter = new Transition() {
//                {
//                    setCycleDuration(Duration.millis(100));
//                }
//
//                protected void interpolate(double v) {
//                    final int length = textInput.length();
//                    final int n = Math.round(length * (float) v);
//                    MainWindowController.Lbl_Output.setText(currentText + textInput.substring(0, n));
//                }
//            };
//            typewriter.play();
//        }
//        catch(InvocationTargetException nullText){
//            String currentText = "";
//        }
//    }

//    public void initialiseText() {
//        MainWindowController.Lbl_Output.setText(" ");
//    }

    public void typeWriterPrint(MainWindowController Controller, String textInput) {
            String currentText = Controller.Lbl_Output.getText();

            final Animation typewriter = new Transition() {
                {
                    setCycleDuration(Duration.millis(100));
                }

                protected void interpolate(double v) {
                    final int length = textInput.length();
                    final int n = Math.round(length * (float) v);
                    Controller.Lbl_Output.setText(currentText + textInput.substring(0, n));
                }
            };
            typewriter.play();
        }
    }
