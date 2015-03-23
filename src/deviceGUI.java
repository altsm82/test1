import javax.swing.*;
import java.awt.*;

/**
 * Created by
 */
public class deviceGUI {

    private JPanel centerPanel;

    private JPanel editPanel;

    private JTable tableDevice;

    private JTextField tfDevModel;

    private JTextField tfDevNumber;

    private JTextField tfUser;

    private JLabel lbDevModel;

    private JLabel lbDevNumber;

    private JLabel lbUser;

    deviceGUI() {

        initTable();

        initEditPanel();

        initCenterPanel();

        JFrame frame = new JFrame();

        frame.setContentPane(centerPanel);

        frame.pack();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }

    private void initEditPanel() {

        tfDevModel = new JTextField(20);

        lbDevModel = new JLabel("Device model");

        tfDevNumber = new JTextField(5);

        lbDevNumber = new JLabel("№");

        tfUser = new JTextField(20);

        lbUser = new JLabel("User name");

        editPanel = new JPanel();

        GridLayout gl = new GridLayout(2,3);

        editPanel.setLayout(gl);

        editPanel.add(lbDevModel);

        editPanel.add(lbDevNumber);

        editPanel.add(lbUser);

        editPanel.add(tfDevModel);

        editPanel.add(tfDevNumber);

        editPanel.add(tfUser);

    }

    private void initCenterPanel() {

        centerPanel = new JPanel();

        BorderLayout bl = new BorderLayout();

        centerPanel.setLayout(bl);

        centerPanel.add(tableDevice, bl.CENTER);

        centerPanel.add(editPanel,bl.SOUTH);

    }

    private void initTable() {

        String[] columnNames = {"Device model","№","User name"};

        Object[][] data = {{"iphone 6", new Integer(142), "User1"},
                {"iphone 5", new Integer(140), "User3"},
                {"iphone 7", new Integer(146), "User2"}};

        tableDevice = new JTable(data, columnNames);

    }

    public static void main(String[] args) {

        new deviceGUI();

    }

}
