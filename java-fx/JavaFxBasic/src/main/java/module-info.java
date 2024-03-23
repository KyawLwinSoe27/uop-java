module org.example.javafxbasic {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens org.example.javafxbasic to javafx.fxml;
    exports org.example.javafxbasic;
}