package com.example.ejemplo_jfx;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class HelloController {
 @FXML
 private Button btn_sal;

 @FXML
 private Button sal_con_nombre;

 @FXML
 private TextField txt_ing_nombre;

 @FXML
 private VBox txtnombre;

 @FXML
 private Label lbl_sal_2;




 @FXML
 private void Saludar(){
  lbl_sal_2.setText("Hola desde boton");

 }

 @FXML
 private void SaludarConNombre(){
  String nombre =txt_ing_nombre.getText();
  //acá no se ponen sout porque solo imprime en la consola
  lbl_sal_2.setText("hola "+nombre);
  Alert alerta=new Alert(Alert.AlertType.INFORMATION);
  alerta.setTitle("Este es un mensaje");
  alerta.setHeaderText("hola "+ nombre);
  alerta.setContentText("Ejemplo alerta JAva FX");
  alerta.showAndWait();
 }
}
