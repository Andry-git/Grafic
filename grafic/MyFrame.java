/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafic;

import javax.swing.JFrame;

/**
 *
 * @author aabondal
 */
class MyFrame extends JFrame{
MyFrame(){
    MyPanel panel =new MyPanel();
    add(panel);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500, 500);
    setVisible(true);
}

}
