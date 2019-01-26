package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.util.ArrayList;

public class Controller {

    public char turno = 'O';

    int z = 0;
    int i = 0;

    @FXML
    public Label turnoPlayer;

    @FXML
    public RadioButton cvc, hvh, hvc;

    @FXML
    public Button
            btn1, btn2, btn3,
            btn4, btn5, btn6,
            btn7, btn8, btn9;

    public ArrayList<Button> AllButtons = new ArrayList<>();

    public void initialize() {
        AllButtons.add(btn1);
        AllButtons.add(btn2);
        AllButtons.add(btn3);
        AllButtons.add(btn4);
        AllButtons.add(btn5);
        AllButtons.add(btn6);
        AllButtons.add(btn7);
        AllButtons.add(btn8);
        AllButtons.add(btn9);
    }

    @FXML
    public void start(ActionEvent event) {

        if (cvc.isSelected()) {
            z = 0;
            BorrarTaula();
            while ((btn1.getText().equals("") || btn2.getText().equals("") || btn3.getText().equals("")
                    || btn4.getText().equals("") || btn5.getText().equals("") || btn6.getText().equals("")
                    || btn7.getText().equals("") || btn8.getText().equals("") || btn9.getText().equals(""))
                    && z == 0) {
                int aleatori = (int) (Math.random() * 9);

                if (AllButtons.get(aleatori).getText().equals("")) {
                    AllButtons.get(aleatori).setText(String.valueOf(turno));
                    if (turno == 'X') {
                        turno = 'O';
                    } else
                        turno = 'X';
                }
                Comprobacio();
            }
        }

        if (hvh.isSelected()) {
            BorrarTaula();
            clickButton(event);
        } else if (hvc.isSelected()) {
            BorrarTaula();
            clickButton(event);
        }
    }

    @FXML
    public void clickButton(ActionEvent event) {
        if (hvh.isSelected()) {
            Button butt = (Button) event.getSource();
            while (butt.getText().equals("")) {
                if (butt.getText().equals("")) {
                    butt.setText(String.valueOf(turno));
                    if (turno == 'X') {
                        turno = 'O';
                    } else
                        turno = 'X';
                }
                Comprobacio();
            }
        }else if (hvc.isSelected()) {
            Button butt = (Button) event.getSource();
            while (butt.getText().equals("")) {
                if (butt.getText().equals("")) {
                    butt.setText(String.valueOf(turno));
                    if (turno == 'X') {
                        turno = 'O';
                    } else
                        turno = 'X';
                }
                Comprobacio();
            }
        }

    }

    public void Comprobacio() {

        if ((btn1.getText().equals(btn2.getText()) &&
                (btn1.getText().equals(btn3.getText()))) && !btn1.getText().equals("")) {
            System.out.println("Guanyador: " + btn1.getText());
            if (btn1.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X");

            } else if (btn1.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O");
            }
            z = 1;
            return;

        } else if ((btn1.getText().equals(btn4.getText()) &&
                (btn1.getText().equals(btn7.getText()))) && !btn1.getText().equals("")) {
            System.out.println("Guanyador: " + btn1.getText());
            if (btn1.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X");

            } else if (btn1.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O");
            }
            z = 1;
            return;

        } else if ((btn1.getText().equals(btn5.getText()) &&
                (btn1.getText().equals(btn9.getText()))) && !btn1.getText().equals("")) {
            System.out.println("Guanyador: " + btn1.getText());
            if (btn1.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X");
            } else if (btn1.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O");
            }
            z = 1;
            return;

        } else if ((btn1.getText().equals(btn5.getText()) &&
                (btn1.getText().equals(btn9.getText()))) && !btn1.getText().equals(""))
        {
            System.out.println("Guanyador: " + btn1.getText());
            if (btn1.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X");

            } else if (btn1.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O");
            }
            z = 1;
            return;

        } else if ((btn4.getText().equals(btn5.getText()) &&
                (btn4.getText().equals(btn6.getText()))) && !btn4.getText().equals("")) {

            System.out.println("Guanyador: " + btn4.getText());
            if (btn4.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X");

            } else if (btn4.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O");
            }
            z = 1;
            return;

        } else if ((btn2.getText().equals(btn5.getText()) &&
                (btn2.getText().equals(btn8.getText()))) && !btn2.getText().equals("")) {

            System.out.println("Guanyador: " + btn2.getText());
            if (btn2.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X");

            } else if (btn2.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O");
            }
            z = 1;
            return;

        } else if ((btn7.getText().equals(btn8.getText()) &&
                (btn7.getText().equals(btn9.getText()))) && !btn7.getText().equals("")) {

            System.out.println("Guanyador: " + btn7.getText());
            if (btn7.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X");

            } else if (btn7.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O");
            }
            z = 1;
            return;
        } else if ((btn7.getText().equals(btn5.getText()) &&
                (btn7.getText().equals(btn3.getText()))) && !btn7.getText().equals(""))

        {
            System.out.println("Guanyador: " + btn7.getText());
            if (btn7.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X" );

            } else if (btn7.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O");
            }
            z = 1;
            return;

        } else if ((btn3.getText().equals(btn6.getText()) &&
                (btn3.getText().equals(btn9.getText()))) && !btn3.getText().equals(""))

        {
            System.out.println("Guanyador: " + btn3.getText());
            if (btn3.getText().equals("X")) {
                turnoPlayer.setText("Guanyador: X");
            } else if (btn3.getText().equals("O")) {
                turnoPlayer.setText("Guanyador: O" );
            }
            z = 1;
            return;

        } else if (!btn1.getText().equals("") && !btn2.getText().equals("") && !btn3.getText().equals("")
                && !btn4.getText().equals("") && !btn5.getText().equals("") && !btn6.getText().equals("")
                && !btn7.getText().equals("") && !btn8.getText().equals("") && !btn9.getText().equals(""))
        {
            z = 1;
            return;
        }
        turnoPlayer.setText("Iguals");
        z = 0;
    }
    public void BorrarTaula() {
        for (Button AllButton : AllButtons) {
            AllButton.setText("");
        }
    }

}
