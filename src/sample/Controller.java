package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.util.Random;

public class Controller {

    @FXML Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @FXML Text turnoPlayer = new Text();
    @FXML Button start;

    private char letra;
    Random random = new Random();

    private boolean turno = random.nextBoolean();


    @FXML public void clickButton(ActionEvent event) {
        turno();
        Button b = (Button) event.getSource();
        b.setText(String.valueOf(letra));
    }

    public void start(){

        turnoPlayer.setText("Es el turno de: "+letra);
    }

    public boolean turno(){
        if (turno == true) {
            letra ='X';
            turnoPlayer.setText("Es el turno de: "+letra);
            turno = false;
        }else {
            letra ='O';
            turnoPlayer.setText("Es el turno de: "+letra);
            turno = true;
        }
        return true;
    }

}
