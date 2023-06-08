module com.example.evalutaion_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.evalutaion_java to javafx.fxml;
    exports com.example.evalutaion_java;
}