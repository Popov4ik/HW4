package com.example.test_1;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Controller {

    @FXML
    TextArea textArea;

    @FXML
    TextField textField;

    public void sendClick() {
//       textArea.appendText(textField.getText() + "\n");  *** вариант без вывода даты и времени
        textArea.appendText(new SimpleDateFormat("Дата / время: dd.MM.yyyy / HH:mm:ss\nСообщение: ").format(Calendar.getInstance().getTime()) + " " + textField.getText() + "\n");
        textField.clear();
    }

    public void enter(KeyEvent e) {
        if (e.getCode() == KeyCode.ENTER) {
            sendClick();
        }
    }
}
