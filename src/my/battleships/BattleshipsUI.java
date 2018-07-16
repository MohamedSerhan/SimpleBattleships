/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.battleships;
import battleships.BattleshipsGame;
/**
 *
 * @author Mohamed Serhan
 */
public class BattleshipsUI extends javax.swing.JFrame {

    /**
     * Creates new form BattleshipsUI
     */
    private BattleshipsGame ship = new BattleshipsGame();
    private boolean gameStarted;
    private int hitCounter;
    private int shipCounter;
    
    
    public BattleshipsUI() {
        initComponents();
    }
    
    public String determineSunkShip(int i) {
        String sunkenShip = "";
        switch(i) {
            case 1:
                sunkenShip = "Ship one has been destroyed!";
            break;
            
            case 2:
                sunkenShip = "Ship two has been destroyed!";
            break;
            
            case 3:
                sunkenShip = "Ship three has been destroyed!";
            break;
            
            case 4:
                sunkenShip = "Ship four has been destroyed!";
            break;
        }
        return sunkenShip;
    }
    
    public void deselectAllButtons() {
            radioA1.setSelected(false);
            radioA2.setSelected(false);
            radioA3.setSelected(false);
            radioA4.setSelected(false);
            radioA5.setSelected(false);
            radioA6.setSelected(false);
            radioA7.setSelected(false);
            radioB1.setSelected(false);
            radioB2.setSelected(false);
            radioB3.setSelected(false);
            radioB4.setSelected(false);
            radioB5.setSelected(false);
            radioB6.setSelected(false);
            radioB7.setSelected(false);
            radioC1.setSelected(false);
            radioC2.setSelected(false);
            radioC3.setSelected(false);
            radioC4.setSelected(false);
            radioC5.setSelected(false);
            radioC6.setSelected(false);
            radioC7.setSelected(false);
            radioD1.setSelected(false);
            radioD2.setSelected(false);
            radioD3.setSelected(false);
            radioD4.setSelected(false);
            radioD5.setSelected(false);
            radioD6.setSelected(false);
            radioD7.setSelected(false);
            radioE1.setSelected(false);
            radioE2.setSelected(false);
            radioE3.setSelected(false);
            radioE4.setSelected(false);
            radioE5.setSelected(false);
            radioE6.setSelected(false);
            radioE7.setSelected(false);
            radioF1.setSelected(false);
            radioF2.setSelected(false);
            radioF3.setSelected(false);
            radioF4.setSelected(false);
            radioF5.setSelected(false);
            radioF6.setSelected(false);
            radioF7.setSelected(false);
            radioG1.setSelected(false);
            radioG2.setSelected(false);
            radioG3.setSelected(false);
            radioG4.setSelected(false);
            radioG5.setSelected(false);
            radioG6.setSelected(false);
            radioG7.setSelected(false);
    }
    
    public void enableAllButtons() {
            radioA1.setEnabled(true);
            radioA2.setEnabled(true);
            radioA3.setEnabled(true);
            radioA4.setEnabled(true);
            radioA5.setEnabled(true);
            radioA6.setEnabled(true);
            radioA7.setEnabled(true);
            radioB1.setEnabled(true);
            radioB2.setEnabled(true);
            radioB3.setEnabled(true);
            radioB4.setEnabled(true);
            radioB5.setEnabled(true);
            radioB6.setEnabled(true);
            radioB7.setEnabled(true);
            radioC1.setEnabled(true);
            radioC2.setEnabled(true);
            radioC3.setEnabled(true);
            radioC4.setEnabled(true);
            radioC5.setEnabled(true);
            radioC6.setEnabled(true);
            radioC7.setEnabled(true);
            radioD1.setEnabled(true);
            radioD2.setEnabled(true);
            radioD3.setEnabled(true);
            radioD4.setEnabled(true);
            radioD5.setEnabled(true);
            radioD6.setEnabled(true);
            radioD7.setEnabled(true);
            radioE1.setEnabled(true);
            radioE2.setEnabled(true);
            radioE3.setEnabled(true);
            radioE4.setEnabled(true);
            radioE5.setEnabled(true);
            radioE6.setEnabled(true);
            radioE7.setEnabled(true);
            radioF1.setEnabled(true);
            radioF2.setEnabled(true);
            radioF3.setEnabled(true);
            radioF4.setEnabled(true);
            radioF5.setEnabled(true);
            radioF6.setEnabled(true);
            radioF7.setEnabled(true);
            radioG1.setEnabled(true);
            radioG2.setEnabled(true);
            radioG3.setEnabled(true);
            radioG4.setEnabled(true);
            radioG5.setEnabled(true);
            radioG6.setEnabled(true);
            radioG7.setEnabled(true);
    }
    
    public void disableAllButtons() {
            radioA1.setEnabled(false);
            radioA2.setEnabled(false);
            radioA3.setEnabled(false);
            radioA4.setEnabled(false);
            radioA5.setEnabled(false);
            radioA6.setEnabled(false);
            radioA7.setEnabled(false);
            radioB1.setEnabled(false);
            radioB2.setEnabled(false);
            radioB3.setEnabled(false);
            radioB4.setEnabled(false);
            radioB5.setEnabled(false);
            radioB6.setEnabled(false);
            radioB7.setEnabled(false);
            radioC1.setEnabled(false);
            radioC2.setEnabled(false);
            radioC3.setEnabled(false);
            radioC4.setEnabled(false);
            radioC5.setEnabled(false);
            radioC6.setEnabled(false);
            radioC7.setEnabled(false);
            radioD1.setEnabled(false);
            radioD2.setEnabled(false);
            radioD3.setEnabled(false);
            radioD4.setEnabled(false);
            radioD5.setEnabled(false);
            radioD6.setEnabled(false);
            radioD7.setEnabled(false);
            radioE1.setEnabled(false);
            radioE2.setEnabled(false);
            radioE3.setEnabled(false);
            radioE4.setEnabled(false);
            radioE5.setEnabled(false);
            radioE6.setEnabled(false);
            radioE7.setEnabled(false);
            radioF1.setEnabled(false);
            radioF2.setEnabled(false);
            radioF3.setEnabled(false);
            radioF4.setEnabled(false);
            radioF5.setEnabled(false);
            radioF6.setEnabled(false);
            radioF7.setEnabled(false);
            radioG1.setEnabled(false);
            radioG2.setEnabled(false);
            radioG3.setEnabled(false);
            radioG4.setEnabled(false);
            radioG5.setEnabled(false);
            radioG6.setEnabled(false);
            radioG7.setEnabled(false);
    }
    
    public void handleRadioButton(char c, int i) {
        hitCounter++;
        System.out.println("Checking if ship got hit: ");
        if(ship.checkLocation(c,i)) {
            textDisplay.setText("Hit!");
            System.out.println("Hit!");
        }
        else {
            textDisplay.setText("Miss!");
            System.out.println("Miss!");
        }
        System.out.println("Checking if any ships got sunk: ");
        int checkShips = ship.checkSunkShips();
        System.out.println("checkShips returned: " + checkShips);
        if(checkShips != 0) {
            String sunkenShip = determineSunkShip(checkShips);
            textDisplay.setText(sunkenShip);
            System.out.println("Ship counter went up 1");
            shipCounter++;
            checkShips = 0;
        }
        else {
            System.out.println("No ship got sunk today");
        }
        if(shipCounter == 4) {
            textDisplay.setText("Congratulations! You won after " + hitCounter + " out of 49 shots.");
            disableAllButtons();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        battleshipTitle = new javax.swing.JLabel();
        battleshipIcon = new javax.swing.JLabel();
        endButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textDisplay = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        radioA5 = new javax.swing.JRadioButton();
        radioC7 = new javax.swing.JRadioButton();
        radioD4 = new javax.swing.JRadioButton();
        label7 = new javax.swing.JLabel();
        radioE5 = new javax.swing.JRadioButton();
        radioG2 = new javax.swing.JRadioButton();
        label3 = new javax.swing.JLabel();
        radioG1 = new javax.swing.JRadioButton();
        radioA4 = new javax.swing.JRadioButton();
        radioB1 = new javax.swing.JRadioButton();
        radioF6 = new javax.swing.JRadioButton();
        radioB6 = new javax.swing.JRadioButton();
        radioE1 = new javax.swing.JRadioButton();
        radioD6 = new javax.swing.JRadioButton();
        radioC6 = new javax.swing.JRadioButton();
        radioD5 = new javax.swing.JRadioButton();
        labelD = new javax.swing.JLabel();
        radioA2 = new javax.swing.JRadioButton();
        radioD1 = new javax.swing.JRadioButton();
        radioB2 = new javax.swing.JRadioButton();
        radioC3 = new javax.swing.JRadioButton();
        radioG7 = new javax.swing.JRadioButton();
        radioD2 = new javax.swing.JRadioButton();
        label6 = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        radioC2 = new javax.swing.JRadioButton();
        label5 = new javax.swing.JLabel();
        radioG6 = new javax.swing.JRadioButton();
        radioC1 = new javax.swing.JRadioButton();
        radioB7 = new javax.swing.JRadioButton();
        radioF4 = new javax.swing.JRadioButton();
        radioF1 = new javax.swing.JRadioButton();
        radioE4 = new javax.swing.JRadioButton();
        radioF7 = new javax.swing.JRadioButton();
        radioG5 = new javax.swing.JRadioButton();
        labelC = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        radioF5 = new javax.swing.JRadioButton();
        radioB4 = new javax.swing.JRadioButton();
        radioE6 = new javax.swing.JRadioButton();
        radioE2 = new javax.swing.JRadioButton();
        labelF = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        radioD3 = new javax.swing.JRadioButton();
        radioE3 = new javax.swing.JRadioButton();
        radioA6 = new javax.swing.JRadioButton();
        radioF2 = new javax.swing.JRadioButton();
        radioD7 = new javax.swing.JRadioButton();
        labelG = new javax.swing.JLabel();
        radioC5 = new javax.swing.JRadioButton();
        radioE7 = new javax.swing.JRadioButton();
        radioC4 = new javax.swing.JRadioButton();
        label1 = new javax.swing.JLabel();
        radioG3 = new javax.swing.JRadioButton();
        radioB3 = new javax.swing.JRadioButton();
        radioG4 = new javax.swing.JRadioButton();
        radioB5 = new javax.swing.JRadioButton();
        radioA7 = new javax.swing.JRadioButton();
        radioA3 = new javax.swing.JRadioButton();
        label4 = new javax.swing.JLabel();
        radioA1 = new javax.swing.JRadioButton();
        labelE = new javax.swing.JLabel();
        radioF3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startButton.setText("Start");
        startButton.setActionCommand("startButton");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        battleshipTitle.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        battleshipTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        battleshipTitle.setText("Battleships");
        jPanel1.add(battleshipTitle, java.awt.BorderLayout.CENTER);

        battleshipIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my/battleships/resources/battleshipicon.png"))); // NOI18N
        jPanel1.add(battleshipIcon, java.awt.BorderLayout.LINE_END);

        endButton.setText("End");
        endButton.setActionCommand("startButton");
        endButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endButtonActionPerformed(evt);
            }
        });

        textDisplay.setText("Welcome!");
        textDisplay.setFocusable(false);
        jScrollPane2.setViewportView(textDisplay);

        radioA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioA5ActionPerformed(evt);
            }
        });

        radioC7.setAlignmentY(0.0F);
        radioC7.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioC7ActionPerformed(evt);
            }
        });

        radioD4.setAlignmentY(0.0F);
        radioD4.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioD4ActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        label7.setText("7");

        radioE5.setAlignmentY(0.0F);
        radioE5.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioE5ActionPerformed(evt);
            }
        });

        radioG2.setAlignmentY(0.0F);
        radioG2.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioG2ActionPerformed(evt);
            }
        });

        label3.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        label3.setText("3");

        radioG1.setAlignmentY(0.0F);
        radioG1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioG1ActionPerformed(evt);
            }
        });

        radioA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioA4ActionPerformed(evt);
            }
        });

        radioB1.setAlignmentY(0.0F);
        radioB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioB1ActionPerformed(evt);
            }
        });

        radioF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioF6ActionPerformed(evt);
            }
        });

        radioB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioB6ActionPerformed(evt);
            }
        });

        radioE1.setAlignmentY(0.0F);
        radioE1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioE1ActionPerformed(evt);
            }
        });

        radioD6.setAlignmentY(0.0F);
        radioD6.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioD6ActionPerformed(evt);
            }
        });

        radioC6.setAlignmentY(0.0F);
        radioC6.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioC6ActionPerformed(evt);
            }
        });

        radioD5.setAlignmentY(0.0F);
        radioD5.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioD5ActionPerformed(evt);
            }
        });

        labelD.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        labelD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelD.setText("D");

        radioA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioA2ActionPerformed(evt);
            }
        });

        radioD1.setAlignmentY(0.0F);
        radioD1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioD1ActionPerformed(evt);
            }
        });

        radioB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioB2ActionPerformed(evt);
            }
        });

        radioC3.setAlignmentY(0.0F);
        radioC3.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioC3ActionPerformed(evt);
            }
        });

        radioG7.setAlignmentY(0.0F);
        radioG7.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioG7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioG7ActionPerformed(evt);
            }
        });

        radioD2.setAlignmentY(0.0F);
        radioD2.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioD2ActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        label6.setText("6");

        labelA.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        labelA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelA.setText("A");

        radioC2.setAlignmentY(0.0F);
        radioC2.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioC2ActionPerformed(evt);
            }
        });

        label5.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        label5.setText("5");

        radioG6.setAlignmentY(0.0F);
        radioG6.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioG6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioG6ActionPerformed(evt);
            }
        });

        radioC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioC1ActionPerformed(evt);
            }
        });

        radioB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioB7ActionPerformed(evt);
            }
        });

        radioF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioF4ActionPerformed(evt);
            }
        });

        radioF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioF1ActionPerformed(evt);
            }
        });

        radioE4.setAlignmentY(0.0F);
        radioE4.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioE4ActionPerformed(evt);
            }
        });

        radioF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioF7ActionPerformed(evt);
            }
        });

        radioG5.setAlignmentY(0.0F);
        radioG5.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioG5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioG5ActionPerformed(evt);
            }
        });

        labelC.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        labelC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelC.setText("C");

        label2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        label2.setText("2");

        radioF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioF5ActionPerformed(evt);
            }
        });

        radioB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioB4ActionPerformed(evt);
            }
        });

        radioE6.setAlignmentY(0.0F);
        radioE6.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioE6ActionPerformed(evt);
            }
        });

        radioE2.setAlignmentY(0.0F);
        radioE2.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioE2ActionPerformed(evt);
            }
        });

        labelF.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        labelF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelF.setText("F");

        labelB.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        labelB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelB.setText("B");

        radioD3.setAlignmentY(0.0F);
        radioD3.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioD3ActionPerformed(evt);
            }
        });

        radioE3.setAlignmentY(0.0F);
        radioE3.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioE3ActionPerformed(evt);
            }
        });

        radioA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioA6ActionPerformed(evt);
            }
        });

        radioF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioF2ActionPerformed(evt);
            }
        });

        radioD7.setAlignmentY(0.0F);
        radioD7.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioD7ActionPerformed(evt);
            }
        });

        labelG.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        labelG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelG.setText("G");

        radioC5.setAlignmentY(0.0F);
        radioC5.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioC5ActionPerformed(evt);
            }
        });

        radioE7.setAlignmentY(0.0F);
        radioE7.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioE7ActionPerformed(evt);
            }
        });

        radioC4.setAlignmentY(0.0F);
        radioC4.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioC4ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        label1.setText("1");

        radioG3.setAlignmentY(0.0F);
        radioG3.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioG3ActionPerformed(evt);
            }
        });

        radioB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioB3ActionPerformed(evt);
            }
        });

        radioG4.setAlignmentY(0.0F);
        radioG4.setMargin(new java.awt.Insets(2, 0, 2, 0));
        radioG4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioG4ActionPerformed(evt);
            }
        });

        radioB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioB5ActionPerformed(evt);
            }
        });

        radioA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioA7ActionPerformed(evt);
            }
        });

        radioA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioA3ActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        label4.setText("4");

        radioA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioA1ActionPerformed(evt);
            }
        });

        labelE.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        labelE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelE.setText("E");

        radioF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioF3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2)
                    .addComponent(label3)
                    .addComponent(label4)
                    .addComponent(label5)
                    .addComponent(label6)
                    .addComponent(label1)
                    .addComponent(label7))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioA7)
                    .addComponent(radioA6)
                    .addComponent(radioA5)
                    .addComponent(radioA4)
                    .addComponent(radioA3)
                    .addComponent(radioA2)
                    .addComponent(radioA1)
                    .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioB1)
                    .addComponent(labelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioB2)
                    .addComponent(radioB3)
                    .addComponent(radioB4)
                    .addComponent(radioB5)
                    .addComponent(radioB6)
                    .addComponent(radioB7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioC1)
                    .addComponent(radioC2)
                    .addComponent(radioC3)
                    .addComponent(radioC4)
                    .addComponent(radioC5)
                    .addComponent(radioC6)
                    .addComponent(radioC7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioD1)
                    .addComponent(radioD2)
                    .addComponent(radioD3)
                    .addComponent(radioD4)
                    .addComponent(radioD5)
                    .addComponent(radioD6)
                    .addComponent(radioD7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioE1)
                    .addComponent(radioE2)
                    .addComponent(radioE3)
                    .addComponent(radioE4)
                    .addComponent(radioE5)
                    .addComponent(radioE6)
                    .addComponent(radioE7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radioF1)
                    .addComponent(radioF2)
                    .addComponent(radioF3)
                    .addComponent(radioF4)
                    .addComponent(radioF5)
                    .addComponent(radioF6)
                    .addComponent(radioF7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(labelG)
                    .addComponent(radioG1)
                    .addComponent(radioG2)
                    .addComponent(radioG3)
                    .addComponent(radioG4)
                    .addComponent(radioG5)
                    .addComponent(radioG6)
                    .addComponent(radioG7))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioG1)
                    .addComponent(radioF1)
                    .addComponent(radioE1)
                    .addComponent(radioD1)
                    .addComponent(radioC1)
                    .addComponent(radioB1)
                    .addComponent(radioA1)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioA2)
                    .addComponent(radioB2)
                    .addComponent(radioE2)
                    .addComponent(radioD2)
                    .addComponent(radioG2)
                    .addComponent(radioC2)
                    .addComponent(radioF2)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioA3)
                    .addComponent(radioC3)
                    .addComponent(radioG3)
                    .addComponent(radioB3)
                    .addComponent(radioD3)
                    .addComponent(radioE3)
                    .addComponent(radioF3)
                    .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioA4)
                    .addComponent(radioF4)
                    .addComponent(radioB4)
                    .addComponent(radioE4)
                    .addComponent(radioD4)
                    .addComponent(radioG4)
                    .addComponent(radioC4)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioA5)
                    .addComponent(radioF5)
                    .addComponent(radioC5)
                    .addComponent(radioE5)
                    .addComponent(radioD5)
                    .addComponent(radioB5)
                    .addComponent(radioG5)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioE6)
                    .addComponent(radioF6)
                    .addComponent(radioB6)
                    .addComponent(radioD6)
                    .addComponent(radioC6)
                    .addComponent(radioA6)
                    .addComponent(radioG6)
                    .addComponent(label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(radioD7)
                    .addComponent(radioC7)
                    .addComponent(radioB7)
                    .addComponent(radioF7)
                    .addComponent(radioG7)
                    .addComponent(radioE7)
                    .addComponent(radioA7)
                    .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(endButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        startButton.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if(gameStarted == false) {
            ship.generateLocation();
            textDisplay.setText("Locations Generated!");
            deselectAllButtons();
            gameStarted = true;
        }
    }//GEN-LAST:event_startButtonActionPerformed

    private void endButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endButtonActionPerformed
        if(gameStarted) {
            textDisplay.setText("Thanks for playing!     (By: Mohamed Serhan)");
            gameStarted = false;
            ship.clearLocation();
            enableAllButtons();
            deselectAllButtons();
        }
    }//GEN-LAST:event_endButtonActionPerformed

    private void radioA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioA1ActionPerformed
        if(gameStarted) {
            radioA1.setEnabled(false);
            handleRadioButton('A',1);
        }
    }//GEN-LAST:event_radioA1ActionPerformed

    private void radioB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioB1ActionPerformed
        if(gameStarted) {
            radioB1.setEnabled(false);
            handleRadioButton('B',1);
        }
    }//GEN-LAST:event_radioB1ActionPerformed

    private void radioC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioC1ActionPerformed
        if(gameStarted) {
            radioC1.setEnabled(false);
            handleRadioButton('C',1);
        }
    }//GEN-LAST:event_radioC1ActionPerformed

    private void radioD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioD1ActionPerformed
        if(gameStarted) {
            radioD1.setEnabled(false);
            handleRadioButton('D',1);
        }
    }//GEN-LAST:event_radioD1ActionPerformed

    private void radioF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioF1ActionPerformed
        if(gameStarted) {
            radioF1.setEnabled(false);
            handleRadioButton('F',1);
        }
    }//GEN-LAST:event_radioF1ActionPerformed

    private void radioG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioG1ActionPerformed
        if(gameStarted) {
            radioG1.setEnabled(false);
            handleRadioButton('G',1);
        }
    }//GEN-LAST:event_radioG1ActionPerformed

    private void radioE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioE1ActionPerformed
        if(gameStarted) {
            radioE1.setEnabled(false);
            handleRadioButton('E',1);
        }
    }//GEN-LAST:event_radioE1ActionPerformed

    private void radioG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioG2ActionPerformed
        if(gameStarted) {
            radioG2.setEnabled(false);
            handleRadioButton('G',2);
        }
    }//GEN-LAST:event_radioG2ActionPerformed

    private void radioF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioF2ActionPerformed
        if(gameStarted) {
            radioF2.setEnabled(false);
            handleRadioButton('F',2);
        }
    }//GEN-LAST:event_radioF2ActionPerformed

    private void radioD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioD2ActionPerformed
        if(gameStarted) {
            radioD2.setEnabled(false);
            handleRadioButton('D',2);
        }
    }//GEN-LAST:event_radioD2ActionPerformed

    private void radioC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioC2ActionPerformed
        if(gameStarted) {
            radioC2.setEnabled(false);
            handleRadioButton('C',2);
        }
    }//GEN-LAST:event_radioC2ActionPerformed

    private void radioB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioB2ActionPerformed
        if(gameStarted) {
            radioB2.setEnabled(false);
            handleRadioButton('B',2);
        }
    }//GEN-LAST:event_radioB2ActionPerformed

    private void radioE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioE2ActionPerformed
        if(gameStarted) {
            radioE2.setEnabled(false);
            handleRadioButton('E',2);
        }
    }//GEN-LAST:event_radioE2ActionPerformed

    private void radioA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioA2ActionPerformed
        if(gameStarted) {
            radioA2.setEnabled(false);
            handleRadioButton('A',2);
        }
    }//GEN-LAST:event_radioA2ActionPerformed

    private void radioG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioG3ActionPerformed
        if(gameStarted) {
            radioG3.setEnabled(false);
            handleRadioButton('G',3);
        }
    }//GEN-LAST:event_radioG3ActionPerformed

    private void radioF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioF3ActionPerformed
        if(gameStarted) {
            radioF3.setEnabled(false);
            handleRadioButton('F',3);
        }
    }//GEN-LAST:event_radioF3ActionPerformed

    private void radioD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioD3ActionPerformed
        if(gameStarted) {
            radioD3.setEnabled(false);
            handleRadioButton('D',3);
        }
    }//GEN-LAST:event_radioD3ActionPerformed

    private void radioC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioC3ActionPerformed
        if(gameStarted) {
            radioC3.setEnabled(false);
            handleRadioButton('C',3);
        }
    }//GEN-LAST:event_radioC3ActionPerformed

    private void radioB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioB3ActionPerformed
       if(gameStarted) {
            radioB3.setEnabled(false);
            handleRadioButton('B',3);
        }
    }//GEN-LAST:event_radioB3ActionPerformed

    private void radioE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioE3ActionPerformed
        if(gameStarted) {
            radioE3.setEnabled(false);
            handleRadioButton('E',3);
        }
    }//GEN-LAST:event_radioE3ActionPerformed

    private void radioA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioA3ActionPerformed
        if(gameStarted) {
            radioA3.setEnabled(false);
            handleRadioButton('A',3);
        }
    }//GEN-LAST:event_radioA3ActionPerformed

    private void radioA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioA4ActionPerformed
        if(gameStarted) {
            radioA4.setEnabled(false);
            handleRadioButton('A',4);
        }
    }//GEN-LAST:event_radioA4ActionPerformed

    private void radioE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioE4ActionPerformed
        if(gameStarted) {
            radioE4.setEnabled(false);
            handleRadioButton('E',4);
        }
    }//GEN-LAST:event_radioE4ActionPerformed

    private void radioB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioB4ActionPerformed
        if(gameStarted) {
            radioB4.setEnabled(false);
            handleRadioButton('B',4);
        }
    }//GEN-LAST:event_radioB4ActionPerformed

    private void radioC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioC4ActionPerformed
        if(gameStarted) {
            radioC4.setEnabled(false);
            handleRadioButton('C',4);
        }
    }//GEN-LAST:event_radioC4ActionPerformed

    private void radioD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioD4ActionPerformed
        if(gameStarted) {
            radioD4.setEnabled(false);
            handleRadioButton('D',4);
        }
    }//GEN-LAST:event_radioD4ActionPerformed

    private void radioF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioF4ActionPerformed
        if(gameStarted) {
            radioF4.setEnabled(false);
            handleRadioButton('F',4);
        }
    }//GEN-LAST:event_radioF4ActionPerformed

    private void radioG4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioG4ActionPerformed
        if(gameStarted) {
            radioG4.setEnabled(false);
            handleRadioButton('G',4);
        }
    }//GEN-LAST:event_radioG4ActionPerformed

    private void radioA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioA5ActionPerformed
        if(gameStarted) {
            radioA5.setEnabled(false);
            handleRadioButton('A',5);
        }
    }//GEN-LAST:event_radioA5ActionPerformed

    private void radioF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioF5ActionPerformed
        if(gameStarted) {
            radioF5.setEnabled(false);
            handleRadioButton('F',5);
        }
    }//GEN-LAST:event_radioF5ActionPerformed

    private void radioB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioB5ActionPerformed
        if(gameStarted) {
            radioB5.setEnabled(false);
            handleRadioButton('B',5);
        }
    }//GEN-LAST:event_radioB5ActionPerformed

    private void radioE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioE5ActionPerformed
        if(gameStarted) {
            radioE5.setEnabled(false);
            handleRadioButton('E',5);
        }
    }//GEN-LAST:event_radioE5ActionPerformed

    private void radioD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioD5ActionPerformed
        if(gameStarted) {
            radioD5.setEnabled(false);
            handleRadioButton('D',5);
        }
    }//GEN-LAST:event_radioD5ActionPerformed

    private void radioG5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioG5ActionPerformed
        if(gameStarted) {
            radioG5.setEnabled(false);
            handleRadioButton('G',5);
        }
    }//GEN-LAST:event_radioG5ActionPerformed

    private void radioC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioC5ActionPerformed
        if(gameStarted) {
            radioC5.setEnabled(false);
            handleRadioButton('C',5);
        }
    }//GEN-LAST:event_radioC5ActionPerformed

    private void radioA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioA6ActionPerformed
        if(gameStarted) {
            radioA6.setEnabled(false);
            handleRadioButton('A',6);
        }
    }//GEN-LAST:event_radioA6ActionPerformed

    private void radioF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioF6ActionPerformed
        if(gameStarted) {
            radioF6.setEnabled(false);
            handleRadioButton('F',6);
        }
    }//GEN-LAST:event_radioF6ActionPerformed

    private void radioC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioC6ActionPerformed
        if(gameStarted) {
            radioC6.setEnabled(false);
            handleRadioButton('C',6);
        }
    }//GEN-LAST:event_radioC6ActionPerformed

    private void radioE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioE6ActionPerformed
        if(gameStarted) {
            radioE6.setEnabled(false);
            handleRadioButton('E',6);
        }
    }//GEN-LAST:event_radioE6ActionPerformed

    private void radioD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioD6ActionPerformed
        if(gameStarted) {
            radioD6.setEnabled(false);
            handleRadioButton('D',6);
        }
    }//GEN-LAST:event_radioD6ActionPerformed

    private void radioB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioB6ActionPerformed
        if(gameStarted) {
            radioB6.setEnabled(false);
            handleRadioButton('B',6);
        }
    }//GEN-LAST:event_radioB6ActionPerformed

    private void radioG6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioG6ActionPerformed
        if(gameStarted) {
            radioG6.setEnabled(false);
            handleRadioButton('G',6);
        }
    }//GEN-LAST:event_radioG6ActionPerformed

    private void radioA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioA7ActionPerformed
        if(gameStarted) {
            radioA7.setEnabled(false);
            handleRadioButton('A',7);
        }
    }//GEN-LAST:event_radioA7ActionPerformed

    private void radioF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioF7ActionPerformed
        if(gameStarted) {
            radioF7.setEnabled(false);
            handleRadioButton('F',7);
        }
    }//GEN-LAST:event_radioF7ActionPerformed

    private void radioC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioC7ActionPerformed
        if(gameStarted) {
            radioC7.setEnabled(false);
            handleRadioButton('C',7);
        }
    }//GEN-LAST:event_radioC7ActionPerformed

    private void radioE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioE7ActionPerformed
        if(gameStarted) {
            radioE7.setEnabled(false);
            handleRadioButton('E',7);
        }
    }//GEN-LAST:event_radioE7ActionPerformed

    private void radioD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioD7ActionPerformed
        if(gameStarted) {
            radioD7.setEnabled(false);
            handleRadioButton('D',7);
        }
    }//GEN-LAST:event_radioD7ActionPerformed

    private void radioB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioB7ActionPerformed
        if(gameStarted) {
            radioB7.setEnabled(false);
            handleRadioButton('B',7);
        }
    }//GEN-LAST:event_radioB7ActionPerformed

    private void radioG7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioG7ActionPerformed
        if(gameStarted) {
            radioG7.setEnabled(false);
            handleRadioButton('G',7);
        }
    }//GEN-LAST:event_radioG7ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BattleshipsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BattleshipsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BattleshipsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattleshipsUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleshipsUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel battleshipIcon;
    private javax.swing.JLabel battleshipTitle;
    private javax.swing.JButton endButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel labelE;
    private javax.swing.JLabel labelF;
    private javax.swing.JLabel labelG;
    private javax.swing.JRadioButton radioA1;
    private javax.swing.JRadioButton radioA2;
    private javax.swing.JRadioButton radioA3;
    private javax.swing.JRadioButton radioA4;
    private javax.swing.JRadioButton radioA5;
    private javax.swing.JRadioButton radioA6;
    private javax.swing.JRadioButton radioA7;
    private javax.swing.JRadioButton radioB1;
    private javax.swing.JRadioButton radioB2;
    private javax.swing.JRadioButton radioB3;
    private javax.swing.JRadioButton radioB4;
    private javax.swing.JRadioButton radioB5;
    private javax.swing.JRadioButton radioB6;
    private javax.swing.JRadioButton radioB7;
    private javax.swing.JRadioButton radioC1;
    private javax.swing.JRadioButton radioC2;
    private javax.swing.JRadioButton radioC3;
    private javax.swing.JRadioButton radioC4;
    private javax.swing.JRadioButton radioC5;
    private javax.swing.JRadioButton radioC6;
    private javax.swing.JRadioButton radioC7;
    private javax.swing.JRadioButton radioD1;
    private javax.swing.JRadioButton radioD2;
    private javax.swing.JRadioButton radioD3;
    private javax.swing.JRadioButton radioD4;
    private javax.swing.JRadioButton radioD5;
    private javax.swing.JRadioButton radioD6;
    private javax.swing.JRadioButton radioD7;
    private javax.swing.JRadioButton radioE1;
    private javax.swing.JRadioButton radioE2;
    private javax.swing.JRadioButton radioE3;
    private javax.swing.JRadioButton radioE4;
    private javax.swing.JRadioButton radioE5;
    private javax.swing.JRadioButton radioE6;
    private javax.swing.JRadioButton radioE7;
    private javax.swing.JRadioButton radioF1;
    private javax.swing.JRadioButton radioF2;
    private javax.swing.JRadioButton radioF3;
    private javax.swing.JRadioButton radioF4;
    private javax.swing.JRadioButton radioF5;
    private javax.swing.JRadioButton radioF6;
    private javax.swing.JRadioButton radioF7;
    private javax.swing.JRadioButton radioG1;
    private javax.swing.JRadioButton radioG2;
    private javax.swing.JRadioButton radioG3;
    private javax.swing.JRadioButton radioG4;
    private javax.swing.JRadioButton radioG5;
    private javax.swing.JRadioButton radioG6;
    private javax.swing.JRadioButton radioG7;
    private javax.swing.JButton startButton;
    private javax.swing.JTextPane textDisplay;
    // End of variables declaration//GEN-END:variables
}
