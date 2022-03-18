package com.GUI;

import com.Story.IntroScript;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.IOException;

public class MainWindowController {

    private double xOffset;
    private double yOffset;
    
    TypeWriter TypeWriter = new TypeWriter();

    @FXML
    private ProgressBar Bar_Health;

    @FXML
    private ProgressBar Bar_Mana;

    @FXML
    private Button Btn_Party;

    @FXML
    private Button Btn_East;

    @FXML
    private Button Btn_Load;

    @FXML
    private Button Btn_North;

    @FXML
    private Button Btn_Save;

    @FXML
    private Button Btn_South;

    @FXML
    private Button Btn_West;

    @FXML
    private GridPane Grid_Navigation;

    @FXML
    private Button Inventory;

    @FXML
    public Label Lbl_Output;

    @FXML
    private Button Map;

    @FXML
    private TextField Txt_Input;

    @FXML
    private MenuItem Menu_About;

    @FXML
    private MenuItem Menu_HowToPlay;

    @FXML
    private MenuItem Menu_New;

    @FXML
    private MenuItem Menu_Quit;

    @FXML
    void handlePartyButton(ActionEvent event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/PartyWindow_form.fxml"));
            Stage PartyWindow = new Stage();
            PartyWindow.initStyle(StageStyle.TRANSPARENT);
            PartyWindow.setTitle("Party");
            Scene PartyScene = new Scene(root, 430, 780);
            PartyWindow.setScene(PartyScene);
            PartyScene.setFill(Color.TRANSPARENT);
            PartyWindow.show();
            PartyScene.setOnMousePressed(clickEvent -> {
                xOffset = PartyWindow.getX() - clickEvent.getScreenX();
                yOffset = PartyWindow.getY() - clickEvent.getScreenY();
            });
            PartyScene.setOnMouseDragged(dragEvent -> {
                PartyWindow.setX(dragEvent.getScreenX() + xOffset);
                PartyWindow.setY(dragEvent.getScreenY() + yOffset);
            });
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @FXML
    void handleInventoryButton(ActionEvent event) throws IOException {
        TypeWriter.typeWriterPrint(this, "Inventory Pressed!\n");
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/inventoryduffel_form.fxml"));
        Stage InventoryWindow = new Stage();
        InventoryWindow.setTitle("Inventory");
        Scene InventoryScene = new Scene(root, 870, 614);
        InventoryWindow.setScene(InventoryScene);
        InventoryScene.setFill(Color.TRANSPARENT);
        InventoryWindow.show();
        InventoryScene.setOnMousePressed(clickEvent -> {
            xOffset = InventoryWindow.getX() - clickEvent.getScreenX();
            yOffset = InventoryWindow.getY() - clickEvent.getScreenY();
        });
        InventoryScene.setOnMouseDragged(dragEvent -> {
            InventoryWindow.setX(dragEvent.getScreenX() + xOffset);
            InventoryWindow.setY(dragEvent.getScreenY() + yOffset);
        });
    }

    @FXML
    void handleMapButton(ActionEvent event) {
        //Debug-Only Intended Code
        TypeWriter.typeWriterPrint(this,"Map Pressed!\n");
    }

    @FXML
    void handleSaveButton(ActionEvent event) {
        //Debug-Only Intended Code
        TypeWriter.typeWriterPrint(this,"Save Pressed!\n");
    }

    @FXML
    void handleLoadButton(ActionEvent event) {
        //Debug-Only Intended Code
        TypeWriter.typeWriterPrint(this,"Load Pressed!\n");
    }

    @FXML
    void handleNorthNavButton(ActionEvent event) {
        //Debug-Only Intended Code
        TypeWriter.typeWriterPrint(this,"North Pressed!\n");
    }

    @FXML
    void handleSouthNavButton(ActionEvent event) {
    //Debug-Only Intended Code
        TypeWriter.typeWriterPrint(this,"South Pressed!\n");
    }

    @FXML
    void handleEastNavButton(ActionEvent event) {
        //Debug-Only Intended Code
        TypeWriter.typeWriterPrint(this,"East Pressed!\n");
    }

    @FXML
    void handleWestNavButton(ActionEvent event) {
        //Debug-Only Intended Code
        TypeWriter.typeWriterPrint(this,"West Pressed!\n");
    }

    @FXML
    void handleGoButton(ActionEvent event) {
        //Debug-Only Intended Code
        TypeWriter.typeWriterPrint(this,"Go Pressed!\n");
    }

    @FXML
    void handleNewGame(ActionEvent event) {
        IntroScript Intro = new IntroScript();
        Intro.runIntro(this);
    }


    @FXML
    void handleCloseApplication(ActionEvent event) {
        Platform.exit();
    }


    @FXML
    void handleHowToPlay(ActionEvent event) {

    }

    @FXML
    void handleAbout(ActionEvent event) {

    }

    public void typeWriterPrint(String textInput) {
        String currentText = Lbl_Output.getText();

        final Animation typewriter = new Transition() {
            {
                setCycleDuration(Duration.millis(100));
            }

            protected void interpolate(double v) {
                final int length = textInput.length();
                final int n = Math.round(length * (float) v);
                Lbl_Output.setText(currentText + textInput.substring(0, n));
            }
        };
        typewriter.play();
    }
}

    //    @FXML
//    void handleControllerKeyPressed(KeyEvent event){
//        KeyCode keyCode = event.getCode();
//        switch (keyCode){
//            case LEFT -> {
//                TypeWriter.typeWriterPrint("West Pressed!\n");
//                break;
//            }
//            case RIGHT -> {
//                TypeWriter.typeWriterPrint("East Pressed!\n");
//                break;
//            }
//            case UP -> {
//                TypeWriter.typeWriterPrint("North Pressed!\n");
//                break;
//            }
//            case DOWN -> {
//                TypeWriter.typeWriterPrint("South Pressed!\n");
//                break;
//            }
//        }
//    }


