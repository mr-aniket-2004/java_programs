import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * <applet code="SimpleCalculatorApplet.class" width=300 height=200></applet>
 */
public class SimpleCalculatorApplet extends Applet implements ActionListener {
    private TextField number1Field;
    private TextField number2Field;
    private TextField resultField;
    private Button addButton, subtractButton, multiplyButton, divideButton;

    public void init() {
        setLayout(null);
        
        Label number1Label = new Label("Number 1:");
        number1Label.setBounds(20, 30, 80, 20);
        add(number1Label);
        
        number1Field = new TextField();
        number1Field.setBounds(100, 30, 100, 20);
        add(number1Field);

        Label number2Label = new Label("Number 2:");
        number2Label.setBounds(20, 60, 80, 20);
        add(number2Label);
        
        number2Field = new TextField();
        number2Field.setBounds(100, 60, 100, 20);
        add(number2Field);
        
        addButton = new Button("Add");
        addButton.setBounds(20, 100, 50, 30);
        addButton.addActionListener(this);
        add(addButton);
        
        subtractButton = new Button("Subtract");
        subtractButton.setBounds(80, 100, 80, 30);
        subtractButton.addActionListener(this);
        add(subtractButton);

        multiplyButton = new Button("Multiply");
        multiplyButton.setBounds(170, 100, 80, 30);
        multiplyButton.addActionListener(this);
        add(multiplyButton);
        
        divideButton = new Button("Divide");
        divideButton.setBounds(260, 100, 60, 30);
        divideButton.addActionListener(this);
        add(divideButton);
        
        Label resultLabel = new Label("Result:");
        resultLabel.setBounds(20, 140, 80, 20);
        add(resultLabel);
        
        resultField = new TextField();
        resultField.setBounds(100, 140, 100, 20);
        resultField.setEditable(false);
        add(resultField);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(number1Field.getText());
            double num2 = Double.parseDouble(number2Field.getText());
            double result = 0;
            
            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    resultField.setText("Error");
                    return;
                }
            }
            
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid Input");
        }
    }
}
