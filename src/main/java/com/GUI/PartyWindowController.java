package com.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PartyWindowController extends MainWindowController {

    @FXML
    private Button Btn_P1_Equipment;

    @FXML
    private Button Btn_P1_abilities;

    @FXML
    private Button Btn_P2_Equipment;

    @FXML
    private Button Btn_P2_abilities;

    @FXML
    private Button Btn_P3_Equipment;

    @FXML
    private Button Btn_P3_abilities;

    @FXML
    private Button Btn_P4_Equipment;

    @FXML
    private Button Btn_P4_abilities;

    @FXML
    private Button Btn_P5_Equipment;

    @FXML
    private Button Btn_P5_abilities;

    @FXML
    private Button Btn_PartyClose;

    @FXML
    private Button Btn_PartyInspect;

    @FXML
    private Label Lbl_P1_Overview;

    @FXML
    private Label Lbl_P2_Overview;

    @FXML
    private Label Lbl_P3_Overview;

    @FXML
    private Label Lbl_P4_Overview;

    @FXML
    private Label Lbl_P5_Overview;

    @FXML
    void handlePartyClose(ActionEvent event) {
        Btn_PartyClose.getScene().getWindow().hide();
    }

    @FXML
    void handlePartyInspect(ActionEvent event) {

    }

}
