module com.example.sumar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sumar to javafx.fxml;
    exports com.example.sumar;
}