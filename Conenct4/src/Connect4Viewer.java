/**
    File name: Connect4Viewer.java
    Short description: Main class for the ConnectBoardFrame
    IST 140 Assignment:  Enter Assignment # PP3: GUI Application - First Submission
    @author Ashish Kumbhardare
    @version 1.01 2014-08-25
    date of last revision: 04-25-2018
    details of the revision: comments
*/

import javax.swing.JFrame;

public class Connect4Viewer {
    public static void main(String[] args){
        // The GUI for the Connect 4 Game
        ConnectBoardFrame frame = new ConnectBoardFrame();
        frame.setSize(700,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
