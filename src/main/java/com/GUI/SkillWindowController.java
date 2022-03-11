package com.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

    public class SkillWindowController {

        @FXML
        private Button Btn_Close;

        @FXML
        private Button Btn_UnlockUse;

        @FXML
        private GridPane Grid_Stats;

        @FXML
        private Label Lbl_Cost;

        @FXML
        private Label Lbl_DescriptionText;

        @FXML
        private Label Lbl_Element;

        @FXML
        private Label Lbl_SkillName;

        @FXML
        private Label Lbl_Targets;

        @FXML
        void handleCloseButton(ActionEvent event) {
            Btn_Close.getScene().getWindow().hide();
        }

        @FXML
        void handleUnlockUseButton(ActionEvent event) {

        }

    }