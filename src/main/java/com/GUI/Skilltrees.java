package com.GUI;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.IOException;

public class Skilltrees {

    void openSkillWindow() {
//    void openSkillWindow(Object Skill){
//        String SkillName = Skill.Skillname;
//        String SkillDescription = Skill.Description;
//        String Element = Skill.Element;
//        String Targets = Skill.Target;
//        int manaCost = Skill.cost;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/skillwindow_template_form.fxml"));
            Stage SkillWindow = new Stage();
            SkillWindow.setTitle("Abilities");
//        P2_Skilltree.setTitle(SkillName);
            SkillWindow.setScene(new Scene(root, 600, 400));
            SkillWindow.show();
        } catch (IOException exception) {
            exception.printStackTrace();

        }
    }
}

//    }
//
//    void unlockOrUse(){
////    void unlockOrUse(Object Skill, boolean unlocked){
////        if(boolean unlocked == true)
////        {
//            .setText("Use");
////        }
////        if(boolean unlocked == false)
////        {
////            Character.setSkill("unlocked" || true || 1) //
//
//        }
//    }
////}
