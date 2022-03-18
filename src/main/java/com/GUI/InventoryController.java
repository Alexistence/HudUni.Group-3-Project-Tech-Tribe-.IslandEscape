package com.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class InventoryController {

    @FXML
    private AnchorPane Anc_Inventory;

    @FXML
    private Button Btn_Close;

    @FXML
    private Button Btn_Use;

    @FXML
    private ImageView Img_Background;

    @FXML
    private ImageView Img_Type;

    @FXML
    private Label Lbl_Attack;

    @FXML
    private Label Lbl_AttackVal;

    @FXML
    private Label Lbl_Close;

    @FXML
    private Label Lbl_Defense;

    @FXML
    private Label Lbl_DefenseVal;

    @FXML
    private Label Lbl_Name;

    @FXML
    private Label Lbl_Quantity;

    @FXML
    private Label Lbl_QuantityVal;

    @FXML
    private Label Lbl_SpecialEffect;

    @FXML
    private Label Lbl_Type;

    @FXML
    private Label Lbl_TypeVal;

    @FXML
    private Label Lbl_Use;

    @FXML
    private Label Lbl_Value;

    @FXML
    private Label Lbl_ValueAmount;

    @FXML
    private Pane Pane_Container;

    @FXML
    private Tab Tab_Equip;

    @FXML
    private TabPane Tab_Inventory;

    @FXML
    private Tab Tab_Items;

    @FXML
    private Tab Tab_Weap;

    @FXML
    void handleClose(ActionEvent event) {
        Btn_Close.getScene().getWindow().hide();
    }

    @FXML
    void handleUse(ActionEvent event) {

    }

}
