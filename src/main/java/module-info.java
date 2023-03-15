module Projets.morpion {
    requires javafx.controls;
    requires javafx.fxml;

    opens Projets.morpion to javafx.fxml;
    exports Projets.morpion;
}
