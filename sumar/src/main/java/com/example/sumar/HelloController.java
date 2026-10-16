package com.example.sumar;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btn_sum;

    @FXML
    private TextField pr_n;

    @FXML
    private Label primer_n_lbl;

    @FXML
    private Label result;

    @FXML
    private Label seg_n_lbl1;

    @FXML
    private TextField sg_n;




    @FXML
    private void suma(){
        int p_num=Integer.parseInt(pr_n.getText());
        int s_num=Integer.parseInt(sg_n.getText());
        Alert alert =new Alert(Alert.AlertType.INFORMATION);
        String sum=String.valueOf(p_num+s_num);
        result.setText(sum);
    }


}
