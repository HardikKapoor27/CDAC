package cdac2;
import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CalculatorGUI extends JFrame {	

    private JTextField display;

    public CalculatorGUI() {
        setupFrame();
        setupDisplay();
        setupButtons();
        setVisible(true);
    }

    private void setupFrame() {
        setTitle("Scientific Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
    }

    private void setupDisplay() {
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
    }

    private void setupButtons() {

        JPanel panel = new JPanel(new GridLayout(5, 4, 10, 10));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "H", "(", ")"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(e -> handleButton(text));
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
    }

    private void handleButton(String text) {

    	switch (text) {

    	case "=":
    		calculateResult();
    		break;

    	case "C":
    		clearDisplay();
    		break;

    	case "H":
    		showHistory();
    		break;

    	default:
    		appendText(text);
    	}
    }

    private void appendText(String text) {
        display.setText(display.getText() + text);
    }

    private void clearDisplay() {
        display.setText("");
    }

    private void calculateResult() {
        try {
            String expression = display.getText();
            double result = ExpressionEvaluator.evaluate(expression);
            display.setText(String.valueOf(result));
            HistoryManager.save(expression + " = " + result);
        } catch (Exception e) {
            display.setText("Error");
        }
    }

    private void showHistory() {

        List<String> history = HistoryManager.read();

        if (history.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No history available");
            return;
        }

        JTextArea area = new JTextArea();
        area.setEditable(false);

        for (String record : history) {
            area.append(record + "\n");
        }

        JScrollPane scroll = new JScrollPane(area);

        JOptionPane.showMessageDialog(
                this,
                scroll,
                "Calculation History",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}