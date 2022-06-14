module com.toba.scenebuilder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.toba.scenebuilder to javafx.fxml;
    exports com.toba.scenebuilder;
}