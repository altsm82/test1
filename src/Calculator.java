import javax.swing.*;
import java.awt.*;

/**
 * Created on 17.03.2015.
 */
public class Calculator {

    private JPanel windowContent;
    private JTextField displayField;
    private JButton btnPoint;
    private JButton btnEqual;
    private JButton[] digitBtn;
    private JPanel pl;
    private JPanel plSign;

    //Constructor create the components and adds it
    //to the frame using combination of Grid and BorderLayouts

    public Calculator() {
        windowContent = new JPanel();
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        displayField = new JTextField(30);
        windowContent.add(displayField,bl.NORTH);
        initDigitBtn();
        windowContent.add("Center",pl);
        windowContent.add(plSign,bl.SOUTH);

        JFrame frame = new JFrame();
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    private void initDigitBtn() {

        pl = new JPanel();
        pl.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        GridLayout gl = new GridLayout(4,3);
        pl.setLayout(gl);
        digitBtn = new JButton[10];

        for (int i = 9; i > 0; i--) {
            digitBtn[i] = new JButton(String.valueOf(i));
            pl.add(digitBtn[i]);
        }

        plSign = new JPanel();
        plSign.setLayout(new GridLayout(1,3));
        digitBtn[0] = new JButton("0");
        btnPoint = new JButton(".");
        btnEqual = new JButton("=");
        plSign.add(digitBtn[0]);
        plSign.add(btnPoint);
        plSign.add(btnEqual);

    }

}
