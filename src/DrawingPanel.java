import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DrawingPanel extends JFrame implements ActionListener {
    private final int BACKGROUND_WIDTH = 506;
    private final int BACKGROUND_HEIGHT = 511;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart = 0;


    public DrawingPanel(int timerDelay) {
        setTitle("Drawing panel");
        setSize(498, 480);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Duck duck = new Duck();
/////////////////////////// Начало координат (8, 31)

        while (ticksFromStart % 4 == 1) {
            duck.draw1stFrame(g2d,498,480);
        }

        while (ticksFromStart % 4 == 2) {
            duck.draw2dFrame(g2d,498,480);
        }

        while (ticksFromStart % 4 == 3) {
            duck.draw3dFrame(g2d,498,480);
        }

        while (ticksFromStart % 4 == 0) {
            duck.draw4thFrame(g2d,498,480);
        }

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            ++ticksFromStart;
        }
    }
}