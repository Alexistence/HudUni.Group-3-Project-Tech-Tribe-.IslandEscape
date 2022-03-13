package com.GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class PartyWindowController extends MainWindowController {

    private double xOffset = 0;
    private double yOffset = 0;

    @FXML
    void handleDrag(MouseEvent event) {
//        Scene stage = (Stage) Anc_PartyWindow.getScene().getWindow();
//        xOffset = event.getSceneX();
//        yOffset = event.getSceneY();
//        stage.setX(event.getScreenX() - xOffset);
//        stage.setY(event.getScreenY() - yOffset);
    }

    @FXML
    private void openCharWindowFemale(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/equipwindow_female_form.fxml"));
            Stage EquipWindowFemale = new Stage();
            EquipWindowFemale.initStyle(StageStyle.TRANSPARENT);
            EquipWindowFemale.setTitle("Equipment");
            Scene EquipSceneFemale = new Scene(root, 800,800);
            EquipWindowFemale.setScene(EquipSceneFemale);
            EquipSceneFemale.setFill(Color.TRANSPARENT);
            EquipWindowFemale.show();
            EquipSceneFemale.setOnMousePressed(clickEvent -> {
                xOffset = EquipWindowFemale.getX() - clickEvent.getScreenX();
                yOffset = EquipWindowFemale.getY() - clickEvent.getScreenY();
            });
            EquipSceneFemale.setOnMouseDragged(dragEvent -> {
                EquipWindowFemale.setX(dragEvent.getScreenX() + xOffset);
                EquipWindowFemale.setY(dragEvent.getScreenY() + yOffset);
            });
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @FXML
    private void openCharWindowMale(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/equipwindow_male_form.fxml"));
            Stage EquipWindowMale = new Stage();
            EquipWindowMale.initStyle(StageStyle.TRANSPARENT);
            EquipWindowMale.setTitle("Equipment");
            Scene EquipSceneMale = new Scene(root, 800,800);
            EquipWindowMale.setScene(EquipSceneMale);
            EquipSceneMale.setFill(Color.TRANSPARENT);
            EquipWindowMale.show();
            EquipSceneMale.setOnMousePressed(clickEvent -> {
                xOffset = EquipWindowMale.getX() - clickEvent.getScreenX();
                yOffset = EquipWindowMale.getY() - clickEvent.getScreenY();
            });
            EquipSceneMale.setOnMouseDragged(dragEvent -> {
                EquipWindowMale.setX(dragEvent.getScreenX() + xOffset);
                EquipWindowMale.setY(dragEvent.getScreenY() + yOffset);
            });
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @FXML
    private AnchorPane Anc_PartyWindow;

    @FXML
    private ProgressBar Bar_P1_HP;

    @FXML
    private ProgressBar Bar_P1_MP;

    @FXML
    private ProgressBar Bar_P2_HP;

    @FXML
    private ProgressBar Bar_P2_MP;

    @FXML
    private ProgressBar Bar_P3_HP;

    @FXML
    private ProgressBar Bar_P3_MP;

    @FXML
    private ProgressBar Bar_P4_HP;

    @FXML
    private ProgressBar Bar_P4_MP;

    @FXML
    private ProgressBar Bar_P5_HP;

    @FXML
    private ProgressBar Bar_P5_MP;

    @FXML
    private Button Btn_P1_abilities;

    @FXML
    void handleP1Abilities(ActionEvent Event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/P1_skilltree_form.fxml"));
            Stage P1_Skilltree = new Stage();
            P1_Skilltree.initStyle(StageStyle.TRANSPARENT);
            P1_Skilltree.setTitle("Abilities");
            Scene P1_SkillScene = new Scene(root, 1450, 1020);
            P1_Skilltree.setScene(P1_SkillScene);
            P1_SkillScene.setFill(Color.TRANSPARENT);
            P1_Skilltree.show();
            P1_SkillScene.setOnMousePressed(clickEvent -> {
                xOffset = P1_Skilltree.getX() - clickEvent.getScreenX();
                yOffset = P1_Skilltree.getY() - clickEvent.getScreenY();
            });
            P1_SkillScene.setOnMouseDragged(dragEvent -> {
                P1_Skilltree.setX(dragEvent.getScreenX() + xOffset);
                P1_Skilltree.setY(dragEvent.getScreenY() + yOffset);
            });
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @FXML
    private Button Btn_P1_equip;

    @FXML
    void handleP1Equipment(ActionEvent Event) {
        openCharWindowMale();
    }

    @FXML
    private Button Btn_P2_abilities;

    @FXML
    void handleP2Abilities(ActionEvent Event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/P2_skilltree_form.fxml"));
            Stage P2_Skilltree = new Stage();
            P2_Skilltree.initStyle(StageStyle.TRANSPARENT);
            P2_Skilltree.setTitle("Abilities");
            Scene P2_SkillScene = new Scene(root, 1450, 1020);
            P2_Skilltree.setScene(P2_SkillScene);
            P2_SkillScene.setFill(Color.TRANSPARENT);
            P2_Skilltree.show();
            P2_SkillScene.setOnMousePressed(clickEvent -> {
                xOffset = P2_Skilltree.getX() - clickEvent.getScreenX();
                yOffset = P2_Skilltree.getY() - clickEvent.getScreenY();
            });
            P2_SkillScene.setOnMouseDragged(dragEvent -> {
                P2_Skilltree.setX(dragEvent.getScreenX() + xOffset);
                P2_Skilltree.setY(dragEvent.getScreenY() + yOffset);
            });
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @FXML
    private Button Btn_P2_equip;

    @FXML
    void handleP2Equipment(ActionEvent Event) {
        openCharWindowMale();
    }

    @FXML
    private Button Btn_P3_abilities;

    @FXML
    void handleP3Abilities(ActionEvent Event) {}

    @FXML
    private Button Btn_P3_equip;

    @FXML
    void handleP3Equipment(ActionEvent Event) {
        openCharWindowFemale();
    }

    @FXML
    private Button Btn_P4_abilities;

    @FXML
    void handleP4Abilities(ActionEvent Event) {}

    @FXML
    private Button Btn_P4_equip;

    @FXML
    void handleP4Equipment(ActionEvent Event) {
        openCharWindowMale();
    }

    @FXML
    private Button Btn_P5_abilities;

    @FXML
    void handleP5Abilities(ActionEvent Event) {}

    @FXML
    public Button Btn_P5_equip;

    @FXML
    void handleP5Equipment(ActionEvent Event) {
        openCharWindowFemale();
    }

    @FXML
    private Button Btn_PartyClose;

    @FXML
    void handlePartyClose(ActionEvent event) {
        Btn_PartyClose.getScene().getWindow().hide();
    }

    @FXML
    private GridPane Grid_Divider;

    @FXML
    private Label Lbl_P1_HP;

    @FXML
    private Label Lbl_P1_MP;

    @FXML
    private Label Lbl_P1_equip;

    @FXML
    private Label Lbl_P1_equip_held;

    @FXML
    private Label Lbl_P1_health;

    @FXML
    private Label Lbl_P1_mana;

    @FXML
    private Label Lbl_P1_name;

    @FXML
    private Label Lbl_P1_weap;

    @FXML
    private Label Lbl_P1_weap_held;

    @FXML
    private Label Lbl_P1_weap_offhand;

    @FXML
    private Label Lbl_P2_HP;

    @FXML
    private Label Lbl_P2_MP;

    @FXML
    private Label Lbl_P2_equip;

    @FXML
    private Label Lbl_P2_equip_held;

    @FXML
    private Label Lbl_P2_health;

    @FXML
    private Label Lbl_P2_mana;

    @FXML
    private Label Lbl_P2_name;

    @FXML
    private Label Lbl_P2_weap;

    @FXML
    private Label Lbl_P2_weap_held;

    @FXML
    private Label Lbl_P2_weap_offhand;

    @FXML
    private Label Lbl_P3_HP;

    @FXML
    private Label Lbl_P3_MP;

    @FXML
    private Label Lbl_P3_equip;

    @FXML
    private Label Lbl_P3_equip_held;

    @FXML
    private Label Lbl_P3_health;

    @FXML
    private Label Lbl_P3_mana;

    @FXML
    private Label Lbl_P3_name;

    @FXML
    private Label Lbl_P3_weap;

    @FXML
    private Label Lbl_P3_weap_held;

    @FXML
    private Label Lbl_P3_weap_offhand;

    @FXML
    private Label Lbl_P4_HP;

    @FXML
    private Label Lbl_P4_MP;

    @FXML
    private Label Lbl_P4_equip;

    @FXML
    private Label Lbl_P4_equip_held;

    @FXML
    private Label Lbl_P4_health;

    @FXML
    private Label Lbl_P4_mana;

    @FXML
    private Label Lbl_P4_name;

    @FXML
    private Label Lbl_P4_weap;

    @FXML
    private Label Lbl_P4_weap_held;

    @FXML
    private Label Lbl_P4_weap_offhand;

    @FXML
    private Label Lbl_P5_HP;

    @FXML
    private Label Lbl_P5_MP;

    @FXML
    private Label Lbl_P5_equip;

    @FXML
    private Label Lbl_P5_equip_held;

    @FXML
    private Label Lbl_P5_health;

    @FXML
    private Label Lbl_P5_mana;

    @FXML
    private Label Lbl_P5_name;

    @FXML
    private Label Lbl_P5_weap;

    @FXML
    private Label Lbl_P5_weap_held;

    @FXML
    private Label Lbl_P5_weap_offhand;

    @FXML
    private GridPane PMember1;

    @FXML
    private GridPane PMember2;

    @FXML
    private GridPane PMember3;

    @FXML
    private GridPane PMember4;

    @FXML
    private TilePane Tile_PartyWindow;

//    @FXML
//    void handlePartyInspect(ActionEvent event) {

//    }

}
