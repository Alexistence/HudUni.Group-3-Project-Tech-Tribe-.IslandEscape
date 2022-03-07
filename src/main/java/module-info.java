module com.islandescapegui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.GUI to javafx.fxml;
    exports com.GUI;
}