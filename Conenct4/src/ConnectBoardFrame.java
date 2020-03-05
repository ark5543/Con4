/**
    File name: ConncectBoardFrame.java
    Short description: Frame for the Connect4Viewer.java file to run.
    IST 242 Assignment:PP3: GUI Application - First Submission
    @author Ashish Kumbhardare, Sidney Farhat, and Jordan Knecht
    @version 1.01 04-25-2018
*/

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.*;

public class ConnectBoardFrame extends JFrame implements ActionListener{
    
    // GUI variables
    private JPanel panel, northPanel, centerPanel, southPanel, spanel;
    private JButton startButton, startGameButton, redButton, yellowButton, switchButton, tempButton;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    private JButton button11, button12, button13, button14, button15, button16, button17, button18, button19, button20;
    private JButton button21, button22, button23, button24, button25, button26, button27, button28, button29, button30;
    private JButton button31, button32, button33, button34, button35, button36, button37, button38, button39, button40, button41, button42;
    private JButton btnDrop1, btnDrop2, btnDrop3, btnDrop4, btnDrop5, btnDrop6, btnDrop7;
    private JLabel lblWelcome, lblStartGame, lblYellow, lblRed, lblP1, lblP2, lblTurn, lblWins;
    private ImageIcon red, yellow;
    private JMenuBar menuBar;
    private JMenu fileMenu, settingsMenu;
    private JMenuItem mnuRestart, mnuClose;
    private Queue<JButton> col1, col2, col3, col4, col5, col6, col7;
    
    // private variables
    private boolean player1red, player1turn;
    private int[][] table;
    private int count1, count2, count3, count4, count5, count6, count7, p1wins, p2wins;
    
    /**
     * Constructor, makes the frame
     */
    public ConnectBoardFrame(){
        goToMainMenu();
        table = new int[6][7];
        lblWins = new JLabel("");
        count1 = count2 = count3 = count4 = count5 = count6 = count7 = 5;
        
    }
    
    /**
     * creates the main menu
     */
    public void goToMainMenu(){
        lblWelcome = new JLabel("CONNECT 4!");
        startButton = new JButton("Play");
        startButton.addActionListener(this);
        
        northPanel = new JPanel();
        centerPanel = new JPanel();
        spanel = new JPanel();
        
        northPanel.add(lblWelcome);
        centerPanel.add(startButton);
        
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        
        player1turn = true;
    }
    
    /**
     * Opens the settings menu
     */
    public void settingsMenu(){        
        remove(centerPanel);
        remove(northPanel);
        //remove(southPanel);
        
        //northPanel.remove(lblWelcome);
        //centerPanel.remove(startButton);
                
        northPanel = new JPanel();
        centerPanel = new JPanel(new GridLayout(2,2));
        southPanel = new JPanel();
        
        lblStartGame = new JLabel("Pick your colors. Player 1 will start game. ");
        
        red = new ImageIcon(getClass().getResource("red.jpg"));
        yellow = new ImageIcon(getClass().getResource("yellow.jpg"));
        
        lblYellow = new JLabel(yellow);
        lblRed = new JLabel(red);
        
        redButton = new JButton();
        yellowButton = new JButton();
        
        switchButton = new JButton("Switch Color");
        switchButton.addActionListener(this);
        startGameButton = new JButton("Start Game!");
        startGameButton.addActionListener(this);
        
        redButton.setIcon(red);
        yellowButton.setIcon(yellow);
        
        player1red = true;
        
        lblP1 = new JLabel("Player 1 Color: ");
        lblP2 = new JLabel("Player 2 Color: ");
        
        northPanel.add(lblStartGame);        

        centerPanel.add(lblP1);
        centerPanel.add(redButton);
        centerPanel.add(lblP2);
        centerPanel.add(yellowButton);
        
        southPanel.add(switchButton);
        southPanel.add(startGameButton);
        
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

    }    
    
    /**
     * Switches colors
     */
    public void switchColors(){
        remove(centerPanel);
        remove(southPanel);
        centerPanel = new JPanel(new GridLayout(2,2));
        
        if(player1red){
            centerPanel.add(lblP1);
            centerPanel.add(yellowButton);
            centerPanel.add(lblP2);
            centerPanel.add(redButton);
        }
        else{
            centerPanel.add(lblP1);
            centerPanel.add(redButton);
            centerPanel.add(lblP2);
            centerPanel.add(yellowButton);
        }
        
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        
        player1red ^= true;
    }
    
    /**
     * Sets up connect 4 game
     */
    public void setUpGame(){
        remove(centerPanel);
        remove(northPanel);
        remove(southPanel);
        
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        fileMenu = new JMenu("File");
        
        mnuRestart = new JMenuItem("Restart");
        mnuClose = new JMenuItem("Close");
        
        mnuRestart.addActionListener(this);
        mnuClose.addActionListener(this);
        
        fileMenu.add(mnuRestart);
        fileMenu.add(mnuClose);
        menuBar.add(fileMenu);
        
        addButtons();
        
        centerPanel = new JPanel(new GridLayout(6,7));
        northPanel = new JPanel(new GridLayout(1,7));
        southPanel = new JPanel();
        
        lblTurn = new JLabel("Player 1 Turn");
        
        centerPanel.add(button1);
        centerPanel.add(button2);
        centerPanel.add(button3);
        centerPanel.add(button4);
        centerPanel.add(button5);
        centerPanel.add(button6);
        centerPanel.add(button7);
        centerPanel.add(button8);
        centerPanel.add(button9);
        centerPanel.add(button10);
        centerPanel.add(button11);
        centerPanel.add(button12);
        centerPanel.add(button13);
        centerPanel.add(button14);
        centerPanel.add(button15);
        centerPanel.add(button16);
        centerPanel.add(button17);
        centerPanel.add(button18);
        centerPanel.add(button19);
        centerPanel.add(button20);
        centerPanel.add(button21);
        centerPanel.add(button22);
        centerPanel.add(button23);
        centerPanel.add(button24);
        centerPanel.add(button25);
        centerPanel.add(button26);
        centerPanel.add(button27);
        centerPanel.add(button28);
        centerPanel.add(button29);
        centerPanel.add(button30);
        centerPanel.add(button31);
        centerPanel.add(button32);
        centerPanel.add(button33);
        centerPanel.add(button34);
        centerPanel.add(button35);
        centerPanel.add(button36);
        centerPanel.add(button37);
        centerPanel.add(button38);
        centerPanel.add(button39);
        centerPanel.add(button40);
        centerPanel.add(button41);
        centerPanel.add(button42);
        
        northPanel.add(btnDrop1);
        northPanel.add(btnDrop2);
        northPanel.add(btnDrop3);
        northPanel.add(btnDrop4);
        northPanel.add(btnDrop5);
        northPanel.add(btnDrop6);
        northPanel.add(btnDrop7);
        
        southPanel.add(lblTurn);
        southPanel.add(lblWins);
        
        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);

    }
    
    /**
     * adds all the buttons
     */
    public void addButtons(){
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        button18 = new JButton();
        button19 = new JButton();
        button20 = new JButton();
        button21 = new JButton();
        button22 = new JButton();
        button23 = new JButton();
        button24 = new JButton();
        button25 = new JButton();
        button26 = new JButton();
        button27 = new JButton();
        button28 = new JButton();
        button29 = new JButton();
        button30 = new JButton();
        button31 = new JButton();
        button32 = new JButton();
        button33 = new JButton();
        button34 = new JButton();
        button35 = new JButton();
        button36 = new JButton();
        button37 = new JButton();
        button38 = new JButton();
        button39 = new JButton();
        button40 = new JButton();
        button41 = new JButton();
        button42 = new JButton();
        
        btnDrop1 = new JButton("Drop 1");
        btnDrop2 = new JButton("Drop 2");
        btnDrop3 = new JButton("Drop 3");
        btnDrop4 = new JButton("Drop 4");
        btnDrop5 = new JButton("Drop 5");
        btnDrop6 = new JButton("Drop 6");
        btnDrop7 = new JButton("Drop 7");
        
        button1.setPreferredSize(new Dimension(40,40));
        button2.setPreferredSize(new Dimension(40,40));
        button3.setPreferredSize(new Dimension(40,40));
        button4.setPreferredSize(new Dimension(40,40));
        button5.setPreferredSize(new Dimension(40,40));
        button6.setPreferredSize(new Dimension(40,40));
        button7.setPreferredSize(new Dimension(40,40));
        button8.setPreferredSize(new Dimension(40,40));
        button9.setPreferredSize(new Dimension(40,40));
        button10.setPreferredSize(new Dimension(40,40));
        button11.setPreferredSize(new Dimension(40,40));
        button12.setPreferredSize(new Dimension(40,40));
        button13.setPreferredSize(new Dimension(40,40));
        button14.setPreferredSize(new Dimension(40,40));
        button15.setPreferredSize(new Dimension(40,40));
        button16.setPreferredSize(new Dimension(40,40));
        button17.setPreferredSize(new Dimension(40,40));
        button18.setPreferredSize(new Dimension(40,40));
        button19.setPreferredSize(new Dimension(40,40));
        button20.setPreferredSize(new Dimension(40,40));
        button21.setPreferredSize(new Dimension(40,40));
        button22.setPreferredSize(new Dimension(40,40));
        button23.setPreferredSize(new Dimension(40,40));
        button24.setPreferredSize(new Dimension(40,40));
        button25.setPreferredSize(new Dimension(40,40));
        button26.setPreferredSize(new Dimension(40,40));
        button27.setPreferredSize(new Dimension(40,40));
        button28.setPreferredSize(new Dimension(40,40));
        button29.setPreferredSize(new Dimension(40,40));
        button30.setPreferredSize(new Dimension(40,40));
        button31.setPreferredSize(new Dimension(40,40));
        button32.setPreferredSize(new Dimension(40,40));
        button33.setPreferredSize(new Dimension(40,40));
        button34.setPreferredSize(new Dimension(40,40));
        button35.setPreferredSize(new Dimension(40,40));
        button36.setPreferredSize(new Dimension(40,40));
        button37.setPreferredSize(new Dimension(40,40));
        button38.setPreferredSize(new Dimension(40,40));
        button39.setPreferredSize(new Dimension(40,40));
        button40.setPreferredSize(new Dimension(40,40));
        button41.setPreferredSize(new Dimension(40,40));
        button42.setPreferredSize(new Dimension(40,40));
        
        btnDrop1.setPreferredSize(new Dimension(40,40));
        btnDrop2.setPreferredSize(new Dimension(40,40));
        btnDrop3.setPreferredSize(new Dimension(40,40));
        btnDrop4.setPreferredSize(new Dimension(40,40));
        btnDrop5.setPreferredSize(new Dimension(40,40));
        btnDrop6.setPreferredSize(new Dimension(40,40));
        btnDrop7.setPreferredSize(new Dimension(40,40));
        
        btnDrop1.addActionListener(this);
        btnDrop2.addActionListener(this);
        btnDrop3.addActionListener(this);
        btnDrop4.addActionListener(this);
        btnDrop5.addActionListener(this);
        btnDrop6.addActionListener(this);
        btnDrop7.addActionListener(this);
        
        createQueues();
    }
    
    /**
     * creates the queues for the buttons
     */
    public void createQueues(){
        col1 = new LinkedList<JButton>();
        col2 = new LinkedList<JButton>();
        col3 = new LinkedList<JButton>();
        col4 = new LinkedList<JButton>();
        col5 = new LinkedList<JButton>();
        col6 = new LinkedList<JButton>();
        col7 = new LinkedList<JButton>();
        
        button1.setIcon(null);
        button1.setEnabled(true);
        button2.setIcon(null);
        button2.setEnabled(true);
        button3.setIcon(null);
        button3.setEnabled(true);
        button4.setIcon(null);
        button4.setEnabled(true);
        button5.setIcon(null);
        button5.setEnabled(true);
        button6.setIcon(null);
        button6.setEnabled(true);
        button7.setIcon(null);
        button7.setEnabled(true);
        button8.setIcon(null);
        button8.setEnabled(true);
        button9.setIcon(null);
        button9.setEnabled(true);
        button10.setIcon(null);
        button10.setEnabled(true);
        button11.setIcon(null);
        button11.setEnabled(true);
        button12.setIcon(null);
        button12.setEnabled(true);
        button13.setIcon(null);
        button13.setEnabled(true);
        button14.setIcon(null);
        button14.setEnabled(true);
        button15.setIcon(null);
        button15.setEnabled(true);
        button16.setIcon(null);
        button16.setEnabled(true);
        button17.setIcon(null);
        button17.setEnabled(true);
        button18.setIcon(null);
        button18.setEnabled(true);
        button19.setIcon(null);
        button19.setEnabled(true);
        button20.setIcon(null);
        button20.setEnabled(true);
        button21.setIcon(null);
        button21.setEnabled(true);
        button22.setIcon(null);
        button22.setEnabled(true);
        button23.setIcon(null);
        button23.setEnabled(true);
        button24.setIcon(null);
        button24.setEnabled(true);
        button25.setIcon(null);
        button25.setEnabled(true);
        button26.setIcon(null);
        button26.setEnabled(true);
        button27.setIcon(null);
        button27.setEnabled(true);
        button28.setIcon(null);
        button28.setEnabled(true);
        button29.setIcon(null);
        button29.setEnabled(true);
        button30.setIcon(null);
        button30.setEnabled(true);
        button31.setIcon(null);
        button31.setEnabled(true);
        button32.setIcon(null);
        button32.setEnabled(true);
        button33.setIcon(null);
        button33.setEnabled(true);
        button34.setIcon(null);
        button34.setEnabled(true);
        button35.setIcon(null);
        button35.setEnabled(true);
        button36.setIcon(null);
        button36.setEnabled(true);
        button37.setIcon(null);
        button37.setEnabled(true);
        button38.setIcon(null);
        button38.setEnabled(true);
        button39.setIcon(null);
        button39.setEnabled(true);
        button40.setIcon(null);
        button40.setEnabled(true);
        button41.setIcon(null);
        button41.setEnabled(true);
        button42.setIcon(null);
        button42.setEnabled(true);
        
        btnDrop1.setEnabled(true);
        btnDrop2.setEnabled(true);
        btnDrop3.setEnabled(true);
        btnDrop4.setEnabled(true);
        btnDrop5.setEnabled(true);
        btnDrop6.setEnabled(true);
        btnDrop7.setEnabled(true);
        
        
        col1.add(button36);
        col1.add(button29);
        col1.add(button22);
        col1.add(button15);
        col1.add(button8);
        col1.add(button1);
        
        col2.add(button37);
        col2.add(button30);
        col2.add(button23);
        col2.add(button16);
        col2.add(button9);
        col2.add(button2);
        
        col3.add(button38);
        col3.add(button31);
        col3.add(button24);
        col3.add(button17);
        col3.add(button10);
        col3.add(button3);
        
        col4.add(button39);
        col4.add(button32);
        col4.add(button25);
        col4.add(button18);
        col4.add(button11);
        col4.add(button4);
        
        col5.add(button40);
        col5.add(button33);
        col5.add(button26);
        col5.add(button19);
        col5.add(button12);
        col5.add(button5);
        
        col6.add(button41);
        col6.add(button34);
        col6.add(button27);
        col6.add(button20);
        col6.add(button13);
        col6.add(button6);
        
        col7.add(button42);
        col7.add(button35);
        col7.add(button28);
        col7.add(button21);
        col7.add(button14);
        col7.add(button7);
    }
    
    /**
     * prints the array. Just to test it out
     */
    public void printArray(){ 
        System.out.println(Arrays.deepToString(table));
    }
    
    /**
     * Tests for a winner
     * @return 0 for no winner, 1 for player 1 is winner, 2 for player 2 is winner, and 3 if there is a tie
     */
    public int ifWinner(){
        int count = 0;
        for (int i=0;i<table[0].length;i++){
            count = 0;
            for(int x = 0; x < table.length; x++){
                if (table[x][i]==1){
                    count++;
                }
                else{
                    count=0;
                }
                
                if (count>=4){
                    return 1;
                } 
            }
        }
        
        count = 0;
        for (int i=0;i<table[0].length;i++){
            count = 0;
            for(int x = 0; x < table.length; x++){
                if (table[x][i]==2){
                    count++;
                }
                else{
                    count=0;
                }
                
                if (count>=4){
                    return 2;
                } 
            }
        }
        
        count = 0;
        for (int i=0;i<table.length;i++){
            count = 0;
            for(int x = 0; x < table[0].length; x++){
                if (table[i][x]==1){
                    count++;
                }
                else{
                    count=0;
                }
                if (count>=4){
                    return 1;
                }
            } 
        }
        
        count = 0;
        for (int i=0;i<table.length;i++){
            count = 0;
            for(int x = 0; x < table[0].length; x++){
                if (table[i][x]==2){
                    count++;
                }
                else{
                    count=0;
                }
                if (count>=4){
                    return 2;
                }
            } 
        }
        
        //System.out.println("table[1][6] == table[2][5] && table[2][5] == table[3][4] && table[3][4] == table[4][3]" +table[1][6] + table[2][5] + table[3][4] + table[4][3]);
        //printArray();
        // Diagonal goes here.
        if(table[5][0] == table[4][1] && table[4][1] == table[3][2] && table[3][2] == table[2][3]){
            if(table[5][0] == 0){
                
            }
            else{
                return table[5][0];
            }
        }
        if(table[4][1] == table[3][2] && table[3][2] == table[2][3] && table[2][3] == table[1][4]){
            if(table[4][1] == 0){
                
            }
            else{
                return table[4][1];
            }
        }
        if(table[3][2] == table[2][3] && table[2][3] == table[1][4] && table[1][4] == table[0][5]){
            if(table[3][2] == 0){
                
            }
            else{
                return table[3][2];
            }
        }
        if(table[0][6] == table[1][5] && table[1][5] == table[2][4] && table[2][4] == table[3][3]){
            if(table[0][6] == 0){
                
            }
            else{
                return table[0][6];
            }
        }
        if(table[1][5] == table[2][4] && table[2][4] == table[3][3] && table[3][3] == table[4][2]){
            if(table[1][5] == 0){
                
            }
            else{
                return table[1][5];
            }
        }
        if(table[2][4] == table[3][3] && table[3][3] == table[4][2] && table[4][2] == table[5][1]){
            if(table[2][4] == 0){
                
            }
            else{
                return table[2][4];
            }
        }
        if(table[1][6] == table[2][5] && table[2][5] == table[3][4] && table[3][4] == table[4][3]){
            if(table[1][6] == 0){
                
            }
            else{
                return table[1][6];
            }
        }
        if(table[2][5] == table[3][4] && table[3][4] == table[4][3] && table[4][3] == table[5][2]){
            if(table[2][5] == 0){
                
            }
            else{
                return table[2][5];
            }
        }
        if(table[2][6] == table[3][5] && table[3][5] == table[4][4] && table[4][4] == table[5][3]){
            if(table[2][6] == 0){
                
            }
            else{
                return table[2][6];
            }
        }
        if(table[0][4] == table[1][3] && table[1][3] == table[2][2] && table[2][2] == table[3][1]){
            if(table[0][4] == 0){
                
            }
            else{
                return table[0][4];
            }
        }
        if(table[1][3] == table[2][2] && table[2][2] == table[3][1] && table[3][1] == table[4][0]){
            if(table[1][3] == 0){
                
            }
            else{
                return table[1][3];
            }
        }
        if(table[0][3] == table[1][2] && table[1][2] == table[2][1] && table[2][1] == table[3][0]){
            if(table[0][3] == 0){
                
            }
            else{
                return table[0][3];
            }
        }
        if(table[0][3] == table[1][4] && table[1][4] == table[2][5] && table[2][5] == table[3][6]){
            if(table[0][3] == 0){
                
            }
            else{
                return table[0][3];
            }
        }
        if(table[0][2] == table[1][3] && table[1][3] == table[2][4] && table[2][4] == table[3][5]){
            if(table[0][2] == 0){
                
            }
            else{
                return table[0][2];
            }
        }
        if(table[1][3] == table[2][4] && table[2][4] == table[3][5] && table[3][5] == table[4][6]){
            if(table[1][3] == 0){
                
            }
            else{
                return table[1][3];
            }
        }
        if(table[0][1] == table[1][2] && table[1][2] == table[2][3] && table[2][3] == table[3][4]){
            if(table[0][1] == 0){
                
            }
            else{
                return table[0][1];
            }
        }
        if(table[1][2] == table[2][3] && table[2][3] == table[3][4] && table[3][4] == table[4][5]){
            if(table[1][2] == 0){
                
            }
            else{
                return table[1][2];
            }
        }
        if(table[2][3] == table[3][4] && table[3][4] == table[4][5] && table[4][5] == table[5][6]){
            if(table[2][3] == 0){
                
            }
            else{
                return table[2][3];
            }
        }
        if(table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] == table[3][3]){
            if(table[0][0] == 0){
                
            }
            else{
                return table[0][0];
            }
        }
        if(table[3][3] == table[4][4] && table[1][1] == table[2][2] && table[2][2] == table[3][3]){
            if(table[3][3] == 0){
                
            }
            else{
                return table[3][3];
            }
        }
        if(table[3][3] == table[4][4] && table[4][4] == table[5][5] && table[2][2] == table[3][3]){
            if(table[3][3] == 0){
                
            }
            else{
                return table[3][3];
            }
        }
        if(table[1][0] == table[2][1] && table[2][1] == table[3][2] && table[3][2] == table[4][3]){
            if(table[1][0] == 0){
                
            }
            else{
                return table[1][0];
            }
        }
        if(table[4][3] == table[5][4] && table[2][1] == table[3][2] && table[3][2] == table[4][3]){
            if(table[4][3] == 0){
                
            }
            else{
                return table[5][3];
            }
        }
        if(table[2][0] == table[3][1] && table[3][1] == table[4][2] && table[4][2] == table[5][3]){
            if(table[2][0] == 0){
                
            }
            else{
                return table[2][0];
            }
        }
        
        return 0;
    }
    
    /**
     * Disables all buttons
     */
    public void disableAllRemButtons(){
        for(int x = 0; x < col1.size(); x++){
            col1.peek().setEnabled(false);
            col1.remove();
        }
        for(int x = 0; x < col2.size(); x++){
            col2.peek().setEnabled(false);
            col2.remove();
        }
        for(int x = 0; x < col3.size(); x++){
            col3.peek().setEnabled(false);
            col3.remove();
        }
        for(int x = 0; x < col4.size(); x++){
            col4.peek().setEnabled(false);
            col4.remove();
        }
        for(int x = 0; x < col5.size(); x++){
            col5.peek().setEnabled(false);
            col5.remove();
        }
        for(int x = 0; x < col6.size(); x++){
            col6.peek().setEnabled(false);
            col6.remove();
        }
        for(int x = 0; x < col7.size(); x++){
            //System.out.println(col7.size());
            col7.peek().setEnabled(false);
            col7.remove();
        }
        
        btnDrop1.setEnabled(false);
        btnDrop2.setEnabled(false);
        btnDrop3.setEnabled(false);
        btnDrop4.setEnabled(false);
        btnDrop5.setEnabled(false);
        btnDrop6.setEnabled(false);
        btnDrop7.setEnabled(false);
        
    }
    
    /**
     * restarts the game
     */
    public void restart(){
        setUpGame();
        createQueues();
        table = new int[6][7];
    }
    
    /**
     * ActionListener
     * @param event the event
     */
    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        int winnercheck;
        
        if(source == startButton){
            settingsMenu();
            validate();
            repaint();
        }
        if(source == switchButton){
            switchColors();
            validate();
            repaint();
        }
        if(source == startGameButton){
            setUpGame();
            validate();
            repaint();
        }
        if(source == btnDrop1){
            if(col1.isEmpty()){
            
            }
            else{
                if(player1turn){
                    if(player1red){
                        col1.peek().setIcon(red);
                    }
                    else{
                        col1.peek().setIcon(yellow);
                    }
                    table[count1][0] = 1;
                    lblTurn.setText("Player 2 Turn!");
                }
                else{
                    if(player1red){
                        col1.peek().setIcon(yellow);
                    }
                    else{
                        col1.peek().setIcon(red);
                    }
                    table[count1][0] = 2;
                    lblTurn.setText("Player 1 Turn!");
                }
                count1--;
                col1.remove();
                player1turn ^= true;
            }
        }
        if(source == btnDrop2){
            if(col2.isEmpty()){
            
            }
            else{
                if(player1turn){
                    if(player1red){
                        col2.peek().setIcon(red);
                    }
                    else{
                        col2.peek().setIcon(yellow);
                    }
                    table[count2][1] = 1;
                    lblTurn.setText("Player 2 Turn!");
                }
                else{
                    if(player1red){
                        col2.peek().setIcon(yellow);
                    }
                    else{
                        col2.peek().setIcon(red);
                    }
                    table[count2][1] = 2;
                    lblTurn.setText("Player 1 Turn!");
                }
                count2--;
                col2.remove();
                player1turn ^= true;
            }
        }
        if(source == btnDrop3){
            if(col3.isEmpty()){
            
            }
            else{
                if(player1turn){
                    if(player1red){
                        col3.peek().setIcon(red);
                    }
                    else{
                        col3.peek().setIcon(yellow);
                    }
                    table[count3][2] = 1;
                    lblTurn.setText("Player 2 Turn!");
                }
                else{
                    if(player1red){
                        col3.peek().setIcon(yellow);
                    }
                    else{
                        col3.peek().setIcon(red);
                    }
                    table[count3][2] = 2;
                    lblTurn.setText("Player 1 Turn!");
                }
                count3--;
                col3.remove();
                player1turn ^= true;
            }
        }
        if(source == btnDrop4){
            if(col4.isEmpty()){
            
            }
            else{
                if(player1turn){
                    if(player1red){
                        col4.peek().setIcon(red);
                    }
                    else{
                        col4.peek().setIcon(yellow);
                    }
                    table[count4][3] = 1;
                    lblTurn.setText("Player 2 Turn!");
                }
                else{
                    if(player1red){
                        col4.peek().setIcon(yellow);
                    }
                    else{
                        col4.peek().setIcon(red);
                    }
                    table[count4][3] = 2;
                    lblTurn.setText("Player 1 Turn!");
                }
                count4--;
                col4.remove();
                player1turn ^= true;
            }
        }
        if(source == btnDrop5){
            if(col5.isEmpty()){
            
            }
            else{
                if(player1turn){
                    if(player1red){
                        col5.peek().setIcon(red);
                    }
                    else{
                        col5.peek().setIcon(yellow);
                    }
                    table[count5][4] = 1;
                    lblTurn.setText("Player 2 Turn!");
                }
                else{
                    if(player1red){
                        col5.peek().setIcon(yellow);
                    }
                    else{
                        col5.peek().setIcon(red);
                    }
                    table[count5][4] = 2;
                    lblTurn.setText("Player 1 Turn!");
                }
                count5--;
                col5.remove();
                player1turn ^= true;
            }
        }
        if(source == btnDrop6){
            if(col6.isEmpty()){
            
            }
            else{
                if(player1turn){
                    if(player1red){
                        col6.peek().setIcon(red);
                    }
                    else{
                        col6.peek().setIcon(yellow);
                    }
                    table[count6][5] = 1;
                    lblTurn.setText("Player 2 Turn!");
                }
                else{
                    if(player1red){
                        col6.peek().setIcon(yellow);
                    }
                    else{
                        col6.peek().setIcon(red);
                    }
                    table[count6][5] = 2;
                    lblTurn.setText("Player 1 Turn!");
                }
                count6--;
                col6.remove();
                player1turn ^= true;
            }
        }
        if(source == btnDrop7){
            if(col7.isEmpty()){
            
            }
            else{
                if(player1turn){
                    if(player1red){
                        col7.peek().setIcon(red);
                    }
                    else{
                        col7.peek().setIcon(yellow);
                    }
                    table[count7][6] = 1;
                    lblTurn.setText("Player 2 Turn!");
                }
                else{
                    if(player1red){
                        col7.peek().setIcon(yellow);
                    }
                    else{
                        col7.peek().setIcon(red);
                    }
                    table[count7][6] = 2;
                    lblTurn.setText("Player 1 Turn!");
                }
                count7--;
                col7.remove();
                player1turn ^= true;
            }
        }
        
        winnercheck = ifWinner();
        
        if(winnercheck == 0){
            
        }
        else if(winnercheck == 1){
            disableAllRemButtons();
            p1wins++;
            lblTurn.setText("Congrats! Player 1 Won!");
            lblWins.setText("P1 wins: " +p1wins +"  P2 wins: " +p2wins);
            p1wins--;
            winnercheck =0;
        }
        else if (winnercheck == 2){
            disableAllRemButtons();
            p2wins++;
            lblTurn.setText("Congrats! Player 2 Won!");
            lblWins.setText("P1 wins: " +p1wins +"  P2 wins: " +p2wins);
            p2wins--;
            winnercheck = 0;
        }
        else if(winnercheck == 3){
            disableAllRemButtons();
            lblTurn.setText("It's a Tie");
            lblWins.setText("P1 wins: " +p1wins +"  P2 wins: " +p2wins);
            winnercheck = 0;
        }
        
        if(source == mnuClose){
            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
        if(source == mnuRestart){
            restart();
            goToMainMenu();
            validate();
            repaint();
            table = new int[6][7];
            lblTurn.setText("");
            lblWins.setText("");
            count1 = count2 = count3 = count4 = count5 = count6 = count7 = 5;
            
        }
    }
    
}