module exercisesmod {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens edu.schollj3.exercises00 to javafx.fxml;

    exports edu.schollj3.exercises00;
}
