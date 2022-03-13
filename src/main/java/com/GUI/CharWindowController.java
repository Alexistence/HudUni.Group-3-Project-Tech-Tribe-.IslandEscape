package com.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

public class CharWindowController {

    @FXML
    private ProgressBar Bar_HP;

    @FXML
    private ProgressBar Bar_MP;

    @FXML
    private Button Btn_Close;

    @FXML
    private ImageView Img_1stWeap;

    @FXML
    private ImageView Img_2ndWeap;

    @FXML
    private ImageView Img_Background;

    @FXML
    private ImageView Img_Equip;

    @FXML
    private ImageView Img_Portrait;

    @FXML
    private Label Lbl_AbilityEffects;

    @FXML
    private Label Lbl_Accuracy;

    @FXML
    private Label Lbl_Attack;

    @FXML
    private Label Lbl_CharName;

    @FXML
    private Label Lbl_Defense;

    @FXML
    private Label Lbl_HP;

    @FXML
    private Label Lbl_Health;

    @FXML
    private Label Lbl_Health1;

    @FXML
    private Label Lbl_Health11;

    @FXML
    private Label Lbl_Health12;

    @FXML
    private Label Lbl_ItemEffects;

    @FXML
    private Label Lbl_Luck;

    @FXML
    private Label Lbl_MAttack;

    @FXML
    private Label Lbl_MDefense;

    @FXML
    private Label Lbl_MP;

    @FXML
    private Label Lbl_Mana;

    @FXML
    private Label Lbl_Speed;

    @FXML
    void handleClose(ActionEvent event) {
        Btn_Close.getScene().getWindow().hide();
    }

}
