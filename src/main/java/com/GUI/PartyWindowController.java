package com.GUI;

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
    private void openCharWindowFemale(int charNum){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/equipwindow_P" + charNum + "_form.fxml"));
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
    private void openCharWindowMale(int charNum){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/equipwindow_P" + charNum + "_form.fxml"));
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
    private void openAbilityWindow(int charNum){
    try{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/P" + charNum + "_skilltree_form.fxml"));
        Stage Skilltree_Stage = new Stage();
        Skilltree_Stage.initStyle(StageStyle.TRANSPARENT);
        Skilltree_Stage.setTitle("Abilities");
        Scene P1_SkillScene = new Scene(root, 1450, 1020);
        Skilltree_Stage.setScene(P1_SkillScene);
        P1_SkillScene.setFill(Color.TRANSPARENT);
        Skilltree_Stage.show();
        P1_SkillScene.setOnMousePressed(clickEvent -> {
            xOffset = Skilltree_Stage.getX() - clickEvent.getScreenX();
            yOffset = Skilltree_Stage.getY() - clickEvent.getScreenY();
        });
        P1_SkillScene.setOnMouseDragged(dragEvent -> {
            Skilltree_Stage.setX(dragEvent.getScreenX() + xOffset);
            Skilltree_Stage.setY(dragEvent.getScreenY() + yOffset);
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
        openAbilityWindow(1);
    }

    @FXML
    private Button Btn_P1_equip;

    @FXML
    void handleP1Equipment(ActionEvent Event) {
        openCharWindowMale(1);
    }

    @FXML
    private Button Btn_P2_abilities;

    @FXML
    void handleP2Abilities(ActionEvent Event) {
        openAbilityWindow(2);
    }

    @FXML
    private Button Btn_P2_equip;

    @FXML
    void handleP2Equipment(ActionEvent Event) {
        openCharWindowMale(2);
    }

    @FXML
    private Button Btn_P3_abilities;

    @FXML
    void handleP3Abilities(ActionEvent Event) {
        openAbilityWindow(3);
    }
    @FXML
    private Button Btn_P3_equip;

    @FXML
    void handleP3Equipment(ActionEvent Event) {
        openCharWindowFemale(3);
    }

    @FXML
    private Button Btn_P4_abilities;

    @FXML
    void handleP4Abilities(ActionEvent Event) {
        openAbilityWindow(4);
    }

    @FXML
    private Button Btn_P4_equip;

    @FXML
    void handleP4Equipment(ActionEvent Event) {
        openCharWindowMale(4);
    }

    @FXML
    private Button Btn_P5_abilities;

    @FXML
    void handleP5Abilities(ActionEvent Event) {
        openAbilityWindow(5);
    }

    @FXML
    public Button Btn_P5_equip;

    @FXML
    void handleP5Equipment(ActionEvent Event) {
        openCharWindowFemale(5);
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
