package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage; //importa el stage tmb

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application { // se hereda de aplication
    public static void main(String[] args) {
        launch(args); //se ejecuta este metodo LANZA LA APP
    }

    @Override
    public void start(Stage stage) throws Exception { // detodo de AQUI PARTE LA APP
        stage.setTitle("Hola mundo Java Fx a mano"); // el staje es cono el canvas donde trabajar
        VBox contenedor= new VBox(); // esto es como un contenedor
        Scene scene= new Scene(contenedor, 1280,720); // se genera un contenedor (en este caso stack pane) y se setea el tamaño de la escena
        Label mensaje= new Label("HOLA MADAFAKERS");
        Button btn= new Button("haca click aquí");
        contenedor.getChildren().add(mensaje);
        contenedor.getChildren().add(btn); //se le añade etiqueta a la lista
        // para evitar hacer muchos contenedor.getChildren().add, se puede poner un addAll
        contenedor.setAlignment(Pos.TOP_CENTER);
        stage.setScene(scene);

        stage.show(); // indica que muestre el stage

    }
}
