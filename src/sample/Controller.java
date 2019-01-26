package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.text.Text;

import java.util.Random;

public class Controller {

    @FXML Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @FXML Text turnoPlayer = new Text();
    @FXML Button start;
    @FXML private RadioButton hvc, hvh, cvc;

    private char letra;
    private char turnotext;
    Random random = new Random();
    private boolean turno = random.nextBoolean();


    public void clickButton(ActionEvent event) {

       if (start.) {
           if (hvh.isSelected()) {
               hvh(event);

           } else if (hvc.isSelected()) {
               hvc(event);
           }
       }
    }

    public void start(){




    }

    public void hvh(ActionEvent event){
        if (turno == true) {
            letra ='X';
            turnotext = 'O';
            turnoPlayer.setText("Es el turno de: " + turnotext);
            turno = false;
        }else {
            letra ='O';
            turnotext = 'X';
            turnoPlayer.setText("Es el turno de: "+ turnotext);
            turno = true;
        }
        Button b = (Button) event.getSource();
        b.setText(String.valueOf(letra));
    }

    public void hvc(ActionEvent event){
        if (turno == true) {
            letra ='X';
            turnotext = 'O';
            turnoPlayer.setText("Es el turno del ordenador: " + turnotext);
            turno = false;
        }else {
            letra ='O';
            turnotext = 'X';
            turnoPlayer.setText("Es el turno del jugador: "+ turnotext);
            turno = true;
        }
        Button b = (Button) event.getSource();
        b.setText(String.valueOf(letra));
    }

}
