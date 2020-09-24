/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafic;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import javax.swing.JButton;

import javax.swing.JPanel;


class MyPanel extends JPanel{
    public MyPanel(){
        r = new Rectangle2D.Double();
        p = new Point2D[2];
        JButton rectangleButton = new JButton("прямоугольник");
        rectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r=new Rectangle2D.Double();
            }
        });
        JButton ellipseButton = new JButton("эллипс");
        ellipseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                r=new Ellipse2D.Double();
            }
        });
        add(rectangleButton);
        add(ellipseButton);
        addMouseListener(new MouseAdapter() {
            @Override
             public void mousePressed(MouseEvent arg0){
                 p[0] = arg0.getPoint();
             }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent arg0) {
                p[1]=arg0.getPoint();
                r.setFrameFromDiagonal(p[0],p[1]);
                repaint();
             }
        });
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D G = (Graphics2D)g;
        G.draw(r);
    }
    RectangularShape r;
    Point2D []p;
    
}
