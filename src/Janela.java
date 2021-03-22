import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;

import java.lang.annotation.Repeatable;

public class Janela {

    @FXML
    private VBox painel;

    @FXML
    private CheckBox chkCafe;

    @FXML
    private TextField tfIdade;

    private int estilo=0;

    @FXML
    private void mudaArquivoEstilo(){
        System.out.println(painel.getStylesheets());
        if(estilo == 0){
            painel.getStylesheets().remove(getClass().getResource("/css/estilo.css").toExternalForm());
            painel.getStylesheets().add(getClass().getResource("/css/outroestilo.css").toExternalForm());
            estilo = 1;
        }else{
            painel.getStylesheets().add(getClass().getResource("/css/estilo.css").toExternalForm());
            painel.getStylesheets().remove(getClass().getResource("/css/outroestilo.css").toExternalForm());
            estilo = 0;
        }
    }


    @FXML
    private void mudaCafe(){

        if(chkCafe.isSelected()){
            chkCafe.getStyleClass().add("gosta_cafe");
        }else{
            chkCafe.getStyleClass().remove("gosta_cafe");
        }

    }


}
