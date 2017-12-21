import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class TratadorEventosBotaoOK implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Aten��o");
        alert.setContentText("Evento original de " + event.getSource().getClass() + " lan�ado");
        alert.showAndWait();
    }

}
