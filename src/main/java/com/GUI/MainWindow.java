package com.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/mainwindow_form.fxml"));
        primaryStage.setTitle("Island Escape v0.1");
        root.setId("mainWindow");
        Scene mainScene = new Scene(root, 1280, 720);
        mainScene.getStylesheets().add(String.valueOf(this.getClass().getResource("/CSS/BasicUI")));
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}
