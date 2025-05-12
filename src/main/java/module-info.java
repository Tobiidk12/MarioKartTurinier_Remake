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
    requires annotations;

    opens de.nordakademie.mariokartturinier_remake to javafx.fxml;
    exports de.nordakademie.mariokartturinier_remake;
    exports de.nordakademie.mariokartturinier_remake.controller;
    opens de.nordakademie.mariokartturinier_remake.controller to javafx.fxml;
    exports de.nordakademie.mariokartturinier_remake.util;
    opens de.nordakademie.mariokartturinier_remake.util to javafx.fxml;
}