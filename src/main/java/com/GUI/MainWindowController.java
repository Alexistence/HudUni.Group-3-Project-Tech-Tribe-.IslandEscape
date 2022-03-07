package com.GUI;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class MainWindowController extends MainWindow{

    @FXML
    private Button Abilites;

    @FXML
    private ProgressBar Bar_Health;

    @FXML
    private ProgressBar Bar_Mana;

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
    private Label Lbl_Output;

    @FXML
    private Button Map;

    @FXML
    private TextField Txt_Input;

//    public void abilities(Stage abilitiesStage) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource(""));
//        abilitiesStage.setTitle("Character Abilities");
//        Popup abilityPopup = new Popup();
//        abilityPopup.setX(300);
//        abilityPopup.setY(200);
//        root.setId("abilitiesWindow");
//        Scene abilityScene = new Scene(root, 300, 200);
//        abilityScene.getStylesheets().add(String.valueOf(this.getClass().getResource("")));
//        abilitiesStage.setScene(abilityScene);
//    }

    @FXML
    void handlePartyButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("Party Pressed!\n");
//        abilityPopup.show
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/partywindow_form.fxml"));
            Stage partywindow = new Stage();
            partywindow.setTitle("Party");
            partywindow.setScene(new Scene(root, 400, 637));
            partywindow.show();
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

//    @FXML
//    void Btn_Abilities.setOnAction(new EventHandler<ActionEvent>()){
//        public void handleAbilityButton(ActionEvent event)
//        {
//
//        }
//    }

    @FXML
    void handleInventoryButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("Inventory Pressed!\n");
    }

    @FXML
    void handleMapButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("Map Pressed!\n");
    }

    @FXML
    void handleSaveButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("Save Pressed!\n");
    }

    @FXML
    void handleLoadButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("Load Pressed!\n");
    }

    @FXML
    void handleNorthNavButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("North Pressed!\n");
    }

    @FXML
    void handleSouthNavButton(ActionEvent event) {
    //Debug-Only Intended Code
        typeWriterPrint("South Pressed!\n");
    }

    @FXML
    void handleEastNavButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("East Pressed!\n");
    }

    @FXML
    void handleWestNavButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("West Pressed!\n");
    }

    @FXML
    void handleGoButton(ActionEvent event) {
        //Debug-Only Intended Code
        typeWriterPrint("Go Pressed!\n");
    }

//    @FXML
//    void handleControllerKeyPressed(KeyEvent event){
//        KeyCode keyCode = event.getCode();
//        switch (keyCode){
//            case LEFT -> {
//                typeWriterPrint("West Pressed!\n");
//                break;
//            }
//            case RIGHT -> {
//                typeWriterPrint("East Pressed!\n");
//                break;
//            }
//            case UP -> {
//                typeWriterPrint("North Pressed!\n");
//                break;
//            }
//            case DOWN -> {
//                typeWriterPrint("South Pressed!\n");
//                break;
//            }
//        }
//    }

    public void typeWriterPrint(String textInput) {
        String currentText = Lbl_Output.getText();
        final Animation typewriter = new Transition() {
            {
                setCycleDuration(Duration.millis(100));
            }
            protected void interpolate(double v) {
            final int length = textInput.length();
            final int n = Math.round(length * (float) v);
            Lbl_Output.setText(currentText+textInput.substring(0,n));
            }
        };
        typewriter.play();
    }
}


