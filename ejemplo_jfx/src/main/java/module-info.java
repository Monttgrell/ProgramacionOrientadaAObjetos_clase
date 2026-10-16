module com.example.ejemplo_jfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplo_jfx to javafx.fxml;
    exports com.example.ejemplo_jfx;
}