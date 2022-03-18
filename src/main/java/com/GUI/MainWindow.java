package com.GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.Main.*;
import com.Story.*;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/mainwindow_form.fxml"));
        primaryStage.setTitle("Island Escape v0.1");
        root.setId("mainWindow");
        Scene mainScene = new Scene(root, 1280, 720);
        primaryStage.setScene(mainScene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);

    }

}
