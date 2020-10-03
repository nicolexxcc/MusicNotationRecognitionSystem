package sandbox;

import grafficsLib.G;
import grafficsLib.Window;
import music.Ink;
import music.Ink.List;
import music.UC;

import java.awt.*;
import java.awt.event.MouseEvent;

public class PaintInk extends Window {
    public static Ink.List inkList = new List();
    // static { inkList.add(new Ink());}

    public PaintInk() {
        super("PaintInk", UC.WINDOW_WIDTH, UC.WINDOW_HEIGHT);
    }

    @Override
    public void paintComponent(Graphics g) {
        G.fillBackground(g);
        inkList.show(g);
        Ink.BUFFER.show(g);
    }

    public void mousePressed(MouseEvent me) { Ink.BUFFER.dn(me.getX(), me.getY()); repaint();}
    public void mouseDragged(MouseEvent me) { Ink.BUFFER.drag(me.getX(), me.getY()); repaint();}
    public void mouseReleased(MouseEvent me) { inkList.add(new Ink()); repaint();}

}
