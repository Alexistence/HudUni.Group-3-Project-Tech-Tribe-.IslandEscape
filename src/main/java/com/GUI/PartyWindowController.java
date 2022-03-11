package com.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

import java.io.IOException;

public class PartyWindowController extends MainWindowController {


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
            P1_Skilltree.setTitle("Abilities");
            P1_Skilltree.setScene(new Scene(root, 1280, 890));
            P1_Skilltree.show();
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @FXML
    private Button Btn_P1_equip;

    @FXML
    void handleP1Equipment(ActionEvent Event) {}

    @FXML
    private Button Btn_P2_abilities;

    @FXML
    void handleP2Abilities(ActionEvent Event) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/P2_skilltree_form.fxml"));
            Stage P2_Skilltree = new Stage();
            P2_Skilltree.setTitle("Abilities");
            P2_Skilltree.setScene(new Scene(root, 1353, 1021));
            P2_Skilltree.show();
        }
        catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @FXML
    private Button Btn_P2_equip;

    @FXML
    void handleP2Equipment(ActionEvent Event) {}

    @FXML
    private Button Btn_P3_abilities;

    @FXML
    void handleP3Abilities(ActionEvent Event) {}

    @FXML
    private Button Btn_P3_equip;

    @FXML
    void handleP3Equipment(ActionEvent Event) {}

    @FXML
    private Button Btn_P4_abilities;

    @FXML
    void handleP4Abilities(ActionEvent Event) {}

    @FXML
    private Button Btn_P4_equip;

    @FXML
    void handleP4Equipment(ActionEvent Event) {}

    @FXML
    private Button Btn_P5_abilities;

    @FXML
    void handleP5Abilities(ActionEvent Event) {}

    @FXML
    public Button Btn_P5_equip;

    @FXML
    void handleP5Equipment(ActionEvent Event) {}

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
