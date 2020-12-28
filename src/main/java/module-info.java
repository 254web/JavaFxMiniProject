module JavaFxMiniProject {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires com.gluonhq.charm.glisten;

    exports sample to javafx.fxml, javafx.graphics, javafx.controls;
}