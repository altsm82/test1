import javafx.scene.paint.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

/**
 * Created by root on 3/27/15.
 */
public class PingPongTable extends JPanel implements PingPongConstants {

    JLabel label;

    public Point point = new Point(0,0);

    private int computerRacketX = 15;

    private int kidRacketY = KID_RACKET_Y_START;

    Dimension preferredSize = new Dimension(TABLE_WIDTH,TABLE_HEIGHT);

    public Dimension getPreferredSize() {

        return preferredSize;

    }

    public PingPongTable() {

        PingPongGameEngine gameEngine = new PingPongGameEngine(this);

        addMouseListener(gameEngine);

        addMouseMotionListener(gameEngine);

    }

    void addPanelToFrame(Container container) {

        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        container.add(this);

        label = new JLabel("Click to see coordinates");

        container.add(label);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.GREEN);

        g.fillRect(0,0,TABLE_WIDTH, TABLE_HEIGHT);

        g.setColor(Color.YELLOW);

        g.fillRect(KID_RACKET_X_START, KID_RACKET_Y_START, 5, 30);

        g.setColor(Color.BLUE);

        g.fillRect(computerRacketX, 100, 5, 30);

        g.setColor(Color.RED);

        g.fillOval(25, 110, 10, 10);

        g.setColor(Color.WHITE);

        g.drawRect(10, 10, 300, 200);

        g.drawLine(160, 10, 160, 210);

        if (point != null) {

            label.setText("Coordinates (x, y): " + point.x + ", " + point.y);

            g.fillRect(point.x, point.y, 2, 2);

        }

    }

    public void setKidRacketY(int xCoordinate) {

        this.kidRacketY = xCoordinate;

    }

    public int getKidRacketY() {

        return  kidRacketY;

    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Ping Pong Table");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PingPongTable table = new PingPongTable();

        table.addPanelToFrame(frame.getContentPane());

        frame.pack();

        frame.setVisible(true);

    }

}
