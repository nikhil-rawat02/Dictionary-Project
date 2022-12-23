module com.example.mini_project_dictonary {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mini_project_dictonary to javafx.fxml;
    exports com.example.mini_project_dictonary;
}