import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.List;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AIConnect4 extends JFrame {
   private static final char EMPTY = '-';
    private static final char COMPUTER = 'O';
    public static final char PLAYER = 'X';
    private static final int COLUMN_COUNT = 7;
    private static final int ROW_COUNT = 6;
    private static final int DEPTH = 4;
    private static char[][] board = new char[ROW_COUNT][COLUMN_COUNT];
    private JLabel statusLabel = new JLabel("Your turn!");
    //private JPanel jPanel1 = new JPanel();
    private int selectedColumn = -1;

    public AIConnect4() {
    initComponents();
        setTitle("Connect 4");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel1.setLayout(new GridLayout(ROW_COUNT, COLUMN_COUNT));

        initializeBoard();
        displayB();

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(jPanel2, BorderLayout.NORTH);
        contentPane.add(jPanel1, BorderLayout.CENTER);
        contentPane.add(statusLabel, BorderLayout.SOUTH);

        setVisible(true);
}


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setText("drop(1)");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setText("drop(2)");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setText("drop(3)");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setText("drop(4)");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setText("drop(5)");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setText("drop(7)");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setText("drop(6)");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(846, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        handleButtonAction(5);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        handleButtonAction(6);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        handleButtonAction(4);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        handleButtonAction(3);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        handleButtonAction(2);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        handleButtonAction(1);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        handleButtonAction(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
 
    public static void initializeBoard() {
        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {
                board[i][j] = EMPTY;
            }
        }
    }





    private boolean playerMove() {
    if (selectedColumn >= 0 && selectedColumn < COLUMN_COUNT && board[0][selectedColumn] == EMPTY) {
        
        updateBoard(selectedColumn, PLAYER);
        displayB();
        selectedColumn = -1;
        if (isWinningPosition(board, PLAYER) || getAllAvailableColumns(board).isEmpty()) {
            end();
            return false;
        }
        return true;
    } else {
        JOptionPane.showMessageDialog(this, "the column is full. Try another.");
        return false;
    }
}
    private void handleButtonAction(int column) {
        selectedColumn = column;
        if (playerMove()) {
            sounds("C:\\games\\Counter-Strike Source\\cstrike\\sound\\weapons\\awp\\awp1.wav");
            if (!Terminal(board)) {
                computerMove();
            }
            if (Terminal(board)) {
                end();
            }
        }
    }



    public static void updateBoard(int column, char playerOrComputerMove) {
        for (int i = ROW_COUNT - 1; i >= 0; i--) {
            if (board[i][column] == EMPTY) {
                board[i][column] = playerOrComputerMove;
                break;
            }
        }
    }

    private void computerMove() {
    int column = getAIMove();
    updateBoard(column, COMPUTER);
     
    displayB();
    statusLabel.setText("Your turn!");
    if (isWinningPosition(board, COMPUTER) || getAllAvailableColumns(board).isEmpty()) {
        end();
    }
}

    private int random() {
        List<Integer> validColumns = getAllAvailableColumns(board);
        return validColumns.get((int) (Math.random() * validColumns.size()));
    }

    private static int getAIMove() {
        double next = minimax(board, DEPTH, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, true).get(1);
        return (int) next;
    }

    private static List<Double> minimax(char[][] B, int depth, double alpha, double beta, boolean maximizing) {
        List<Double> ret = new ArrayList<>();
        if (Terminal(B)) {
            if (isWinningPosition(B, COMPUTER)) {
                ret.add(1000000.0);
            } else if (isWinningPosition(B, PLAYER)) {
                ret.add(-1000000.0);
            } else {
                ret.add(0.0);
            }
        } else if (depth == 0) {
            double x = scorePosition(B);
            ret.add(x);
        } else {
            double value;
            int nextMove = 0;
            List<Integer> validColumns = getAllAvailableColumns(B);
            if (maximizing) {
                value = Double.NEGATIVE_INFINITY;
                for (int c : validColumns) {
                    char[][] tempBoard = tryDropPiece(B, c, COMPUTER);
                    double newValue = minimax(tempBoard, depth - 1, alpha, beta, false).get(0);
                    if (newValue > value) {
                        value = newValue;
                        nextMove = c;
                    }
                    if (value > alpha) {
                        alpha = value;
                    }
                    if (alpha >= beta) {
                        break;
                    }
                }
            } else {
                value = Double.POSITIVE_INFINITY;
                for (int c : validColumns) {
                    char[][] tempBoard = tryDropPiece(B, c, PLAYER);
                    double newValue = minimax(tempBoard, depth - 1, alpha, beta, true).get(0);
                    if (newValue < value) {
                        value = newValue;
                        nextMove = c;
                    }
                    if (value < beta) {
                        beta = value;
                    }
                    if (alpha >= beta) {
                        break;
                    }
                }
            }
            ret.add(value);
            ret.add((double) nextMove);
        }
        return ret;
    }
    
       
 private void end() {
    if (isWinningPosition(board, PLAYER)) {
        JOptionPane.showMessageDialog(this, "You win!");
    } else if (isWinningPosition(board, COMPUTER)) {
         sounds("C:\\games\\Counter-Strike Source\\cstrike\\sound\\radio\\terwin.wav");
        JOptionPane.showMessageDialog(this, "Computer wins!");
       
    } else {
        JOptionPane.showMessageDialog(this, "It's a draw!");
    }
    initializeBoard(); // Reset the board
    displayB(); // Update the display with the reset board
}

    private static boolean Terminal(char[][] B) {
        return isWinningPosition(B, PLAYER) || isWinningPosition(B, COMPUTER) || getAllAvailableColumns(B).isEmpty();
    }

    private static boolean isWinningPosition(char[][] board, char piece) {
        for (int i = 0; i < ROW_COUNT; i++)
            for (int j = 0; j < COLUMN_COUNT - 3; j++)
                if (board[i][j] == piece && board[i][j + 1] == piece && board[i][j + 2] == piece && board[i][j + 3] == piece)
                    return true;

        for (int i = 0; i < ROW_COUNT - 3; i++)
            for (int j = 0; j < COLUMN_COUNT; j++)
                if (board[i][j] == piece && board[i + 1][j] == piece && board[i + 2][j] == piece && board[i + 3][j] == piece)
                    return true;

        for (int i = 0; i < ROW_COUNT - 3; i++)
            for (int j = 0; j < COLUMN_COUNT - 3; j++)
                if (board[i][j] == piece && board[i + 1][j + 1] == piece && board[i + 2][j + 2] == piece && board[i + 3][j + 3] == piece)
                    return true;

        for (int i = 3; i < ROW_COUNT; i++)
            for (int j = 0; j < COLUMN_COUNT - 3; j++)
                if (board[i][j] == piece && board[i - 1][j + 1] == piece && board[i - 2][j + 2] == piece && board[i - 3][j + 3] == piece)
                    return true;

        return false;
    }

    private static List<Integer> getAllAvailableColumns(char[][] B) {
        List<Integer> validCols = new ArrayList<>();
        for (int i = 0; i < COLUMN_COUNT; i++) {
            if (B[0][i] == EMPTY) {
                validCols.add(i);
            }
        }
        return validCols;
    }

    private static char[][] tryDropPiece(char[][] B, int column, char piece) {
        char[][] tempBoard = copyBoard(B);
        for (int i = ROW_COUNT - 1; i >= 0; i--) {
            if (tempBoard[i][column] == EMPTY) {
                tempBoard[i][column] = piece;
                break;
            }
        }
        return tempBoard;
    }

    private static char[][] copyBoard(char[][] B) {
        char[][] newBoard = new char[ROW_COUNT][COLUMN_COUNT];
        for (int i = 0; i < ROW_COUNT; i++) {
            System.arraycopy(B[i], 0, newBoard[i], 0, COLUMN_COUNT);
        }
        return newBoard;
    }

    private static int scorePosition(char[][] board) {
        int score = 0;

        for (int i = 0; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT - 3; j++) {
                score += evaluate(new char[]{board[i][j], board[i][j + 1], board[i][j + 2], board[i][j + 3]});
            }
        }

        for (int i = 0; i < ROW_COUNT - 3; i++) {
            for (int j = 0; j < COLUMN_COUNT; j++) {
                score += evaluate(new char[]{board[i][j], board[i + 1][j], board[i + 2][j], board[i + 3][j]});
            }
        }

        for (int i = 0; i < ROW_COUNT - 3; i++) {
            for (int j = 0; j < COLUMN_COUNT - 3; j++) {
                score += evaluate(new char[]{board[i][j], board[i + 1][j + 1], board[i + 2][j + 2], board[i + 3][j + 3]});
            }
        }

        for (int i = 3; i < ROW_COUNT; i++) {
            for (int j = 0; j < COLUMN_COUNT - 3; j++) {
                score += evaluate(new char[]{board[i][j], board[i - 1][j + 1], board[i - 2][j + 2], board[i - 3][j + 3]});
            }
        }

        return score;
    }

    private static int evaluate(char[] window) {
        int score = 0;
        int playerCount = 0;
        int computerCount = 0;
        int emptyCount = 0;

        for (char cell : window) {
            if (cell == PLAYER) {
                playerCount++;
            } else if (cell == COMPUTER) {
                computerCount++;
            } else if (cell == EMPTY) {
                emptyCount++;
            }
        }

        if (computerCount == 4) {
            score += 100;
        } else if (computerCount == 3 && emptyCount == 1) {
            score += 5;
        } else if (computerCount == 2 && emptyCount == 2) {
            score += 2;
        }

        if (playerCount == 3 && emptyCount == 1) {
            score -= 4;
        }

        return score;
    }
    private void setButtonHoverEffect(JButton button) {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button.setBackground(Color.LIGHT_GRAY);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                button.setBackground(UIManager.getColor("control"));
            }
        });
    }
    
     public static void main(String[] args) {
        new AIConnect4();
    }

    public void sounds(String soundName){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
           Clip clip = AudioSystem.getClip();
           clip.open(audioInputStream);
           clip.start();
            
        } catch (Exception ex) {
            System.out.println("Error"+ex.getMessage());
        }
        }
    
    
    
public class CellPanel extends JPanel {
    private char content;

    public CellPanel(char content) {
        this.content = content;
        setPreferredSize(new Dimension(80, 80));
        setBorder(new LineBorder(Color.darkGray,2 )); // Set the border with a small line
    }

    public void setContent(char content) {
        this.content = content;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        // Draw border
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(4));
        g2d.drawOval(2, 2, width - 5, height - 5);

        // Draw content
        if (content == 'X') {
            g2d.setColor(Color.RED);
            g2d.fillOval(5, 5, width - 10, height - 10);
        } else if (content == 'O') {
            g2d.setColor(Color.BLUE);
            g2d.fillOval(5, 5, width - 10, height - 10);
        }

        g2d.dispose();
    }
}



  private void displayB() {
    jPanel1.removeAll();
    for (int i = 0; i < ROW_COUNT; i++) {
        for (int j = 0; j < COLUMN_COUNT; j++) {
            char content = board[i][j];
            CellPanel cellPanel = new CellPanel(content);
            jPanel1.add(cellPanel);
        }
    }
    jPanel1.revalidate();
    jPanel1.repaint();
}
    
    
    
    
    
    
   
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
