package net.demus_intergalactical.lanchat.frontend;

import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.fxmisc.richtext.InlineCssTextArea;

public class Controller {
	public TextField inputfield;
	public InlineCssTextArea chatlog;

	public void onInputBtnPressed() {
		UIController.appendToChat("#FF0000", System.getProperty("user.name"));
		UIController.appendToChat("#000000", ": " + inputfield.getText() + "\n");
		
		inputfield.setText("");
	}

	public void onInputKeyPressed(KeyEvent ke) {
		if (ke.getCode() == KeyCode.ENTER) {
			ke.consume();
			onInputBtnPressed();
		}
	}
}
