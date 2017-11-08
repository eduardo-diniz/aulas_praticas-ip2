package br.ufrpe.gui.jfx_samples;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class AbasScreenController {
    
    @FXML
    private TextField txtFieldNome;
    
    @FXML
    private TextField txtFieldEndereco;
    
    @FXML
    private TextField txtFieldResumo;
    
    @FXML
    private TextArea txtAreaDescricao;
    
    @FXML
    private Button btnEnviar;
    
    @FXML
    public void onBtnEnviarAction(ActionEvent e) {
        Alert info = new Alert(AlertType.INFORMATION);
        info.setTitle("Information for you");
        info.setHeaderText("Cabe�alho da informa��o");
        info.setContentText("Voc� pressionou o bot�o enviar e o conte�do de "
                + "txtFieldResumo �: " + txtFieldResumo.getText());
        info.showAndWait();
    }
    
    @FXML
    public void onBtnPeriodoAction(ActionEvent e) {
        Alert info = new Alert(AlertType.INFORMATION);
        info.setTitle("Information for you");
        info.setHeaderText("Per�odo em dias");
        info.setContentText("Per�odo calculado: 2");
        info.showAndWait();
    }
    
}
