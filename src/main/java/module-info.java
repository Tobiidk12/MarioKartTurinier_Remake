module de.nordakademie.mariokartturinier_remake {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens de.nordakademie.mariokartturinier_remake to javafx.fxml;
    exports de.nordakademie.mariokartturinier_remake;
}