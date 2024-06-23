import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

public class panel extends JPanel implements ActionListener {
    Timer timer;
    int mouseX = 0;
    int mouseY = 0;
    boolean oWin = false;
    boolean xWin = false;
    boolean turn = false;
    int[] tiles = {0, 0, 0, 0, 0, 0, 0,0 ,0};
    panel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setBackground(Color.decode("#1f1e1e"));
        timer = new Timer(10, this);
        timer.start();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println(e.getX() + ", " + e.getY());
                mouseX = e.getX();
                mouseY = e.getY();
                //Column 1 Tiles
                    if (mouseX>100 && mouseX < 200) {
                        if (mouseY > 100 && mouseY < 175&& tiles[0] == 0) {
                            System.out.println("Tile 1");
                            if (turn == false) {
                                tiles[0] = 1;
                            }
                            else {
                                tiles[0]= 4;
                            }


                        }
                        if (mouseY > 175 && mouseY < 250 && tiles[3] == 0) {
                            System.out.println("Tile 4");
                            if (turn == false) {
                                tiles[3] = 1;
                            }
                            else {
                                tiles[3]= 4;
                            }

                        }
                        if (mouseY > 250 && mouseY < 338 && tiles[6] == 0) {
                            System.out.println("Tile 7");
                            if (turn == false) {
                                tiles[6] = 1;
                            }
                            else {
                                tiles[6]= 4;
                            }

                        }
                        turn = !turn;

                    }
                    // Column 2
                if (mouseX>200 && mouseX < 300 ) {
                    if (mouseY > 100 && mouseY < 175 && tiles[1] == 0) {
                        System.out.println("Tile 2");
                        if (turn == false) {
                            tiles[1] = 1;
                        }
                        else {
                            tiles[1]= 4;
                        }


                    }
                    if (mouseY > 175 && mouseY < 250 && tiles[4] == 0) {
                        System.out.println("Tile 5");
                        if (turn == false) {
                            tiles[4] = 1;
                        }
                        else {
                            tiles[4]= 4;
                        }

                    }
                    if (mouseY > 250 && mouseY < 338 && tiles[7] == 0) {
                        System.out.println("Tile 8");
                        if (turn == false) {
                            tiles[7] = 1;
                        }
                        else {
                            tiles[7]= 4;
                        }

                    }
                    turn = !turn;
                }
                // Column 3
                if (mouseX>300 && mouseX < 400) {
                    if (mouseY > 100 && mouseY < 175 && tiles[2] == 0) {
                        System.out.println("Tile 3");
                        if (turn == false) {
                            tiles[2] = 1;
                        }
                        else {
                            tiles[2]= 4;
                        }

                    }
                    if (mouseY > 175 && mouseY < 250 && tiles[5] == 0) {
                        System.out.println("Tile 6");
                        if (turn == false) {
                            tiles[5] = 1;
                        }
                        else {
                            tiles[5]= 4;
                        }

                    }
                    if (mouseY > 250 && mouseY < 338 && tiles[8] == 0) {
                        System.out.println("Tile 9");
                        if (turn == false) {
                            tiles[8] = 1;
                        }
                        else {
                            tiles[8]= 4;
                        }

                    }
                    turn = !turn;

                }
                System.out.println(Arrays.toString(tiles));

                //O Win Conditions

                //Horizontal Wins
                if (tiles[0]+ tiles[1]+ tiles[2] == 3) {
                    System.out.println("O Wins!!!");
                    oWin = true;
                }
                if (tiles[3]+ tiles[4]+ tiles[5] == 3) {
                    System.out.println("O Wins!!!");
                    oWin = true;
                }
                if (tiles[6]+ tiles[7]+ tiles[8] == 3) {
                    System.out.println("O Wins!!!");
                    oWin = true;
                }
                //Vertical Wins
                if (tiles[0]+ tiles[3]+ tiles[6] == 3) {
                    System.out.println("O Wins!!!");
                    oWin = true;
                }
                if (tiles[1]+ tiles[4]+ tiles[7] == 3) {
                    System.out.println("O Wins!!!");
                    oWin = true;
                }
                if (tiles[2]+ tiles[5]+ tiles[8] == 3) {
                    System.out.println("O Wins!!!");
                    oWin = true;
                }
                // Diagonal Wins
                if (tiles[0]+ tiles[4]+ tiles[8] == 3) {
                    System.out.println("O Wins!!!");
                    oWin = true;
                }
                if (tiles[2]+ tiles[4]+ tiles[6] == 3) {
                    System.out.println("O Wins!!!");
                    oWin = true;
                }

                // X Win Conditions

                //Horizontal Wins
                if (tiles[0]+ tiles[1]+ tiles[2] == 12) {
                    System.out.println("X Wins!!!");
                    xWin = true;
                }
                if (tiles[3]+ tiles[4]+ tiles[5] == 12) {
                    System.out.println("X Wins!!!");
                    xWin = true;
                }
                if (tiles[6]+ tiles[7]+ tiles[8] == 12) {
                    System.out.println("X Wins!!!");
                    xWin = true;
                }
                //Vertical Wins
                if (tiles[0]+ tiles[3]+ tiles[6] == 12) {
                    System.out.println("X Wins!!!");
                    xWin = true;
                }
                if (tiles[1]+ tiles[4]+ tiles[7] == 12) {
                    System.out.println("X Wins!!!");
                    xWin = true;
                }
                if (tiles[2]+ tiles[5]+ tiles[8] == 12) {
                    System.out.println("X Wins!!!");
                    xWin = true;
                }
                // Diagonal Wins
                if (tiles[0]+ tiles[4]+ tiles[8] == 12) {
                    System.out.println("X Wins!!!");
                    xWin = true;
                }
                if (tiles[2]+ tiles[4]+ tiles[6] == 12) {
                    System.out.println("X Wins!!!");
                    xWin = true;
                }


            }
        });

    }


    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;



        super.paint(g);
        g2D.setColor(Color.white);
        g2D.setFont(new Font("Comic Sans MS", Font.BOLD, 50));
        g2D.drawString("Tic Tac Toe", 125, 50);
        g2D.setStroke(new BasicStroke(3f));
        g2D.setPaint(Color.white);
        //Vertical Borders
        g2D.drawLine(200, 101, 200, 338); // Left Line
        g2D.drawLine(300, 101, 300, 338); // Right Line
        //Horizonatal Borders
        g2D.drawLine(100, 175, 400, 175); //Top line
        g2D.drawLine(100,  250, 400, 250); //Bottom Line

        // O PLACEMENTS

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(10));

        if (tiles[0] == 1) {
            g2D.drawOval(115, 90, 70, 70);
        }
        if (tiles[1] == 1) {
            g2D.drawOval(215, 90, 70, 70);
        }
        if (tiles[2] == 1) {
            g2D.drawOval(315, 90, 70, 70);
        }
        if (tiles[3] == 1) {
            g2D.drawOval(115, 180, 70, 70);
        }
        if (tiles[4] == 1) {
            g2D.drawOval(215, 180, 70, 70);
        }
        if (tiles[5] == 1) {
            g2D.drawOval(315, 180, 70, 70);
        }
        if (tiles[6] == 1) {
            g2D.drawOval(115, 265, 70, 70);
        }
        if (tiles[7] == 1) {
            g2D.drawOval(215, 265, 70, 70);
        }
        if (tiles[8] == 1) {
            g2D.drawOval(315, 265, 70, 70);
        }
        // X Placements
        g2D.setPaint(Color.red);
        if (tiles[0] == 4) {
            //g2D.drawOval(115, 90, 70, 70);
            g2D.drawLine(110, 110, 190, 160);
            g2D.drawLine(190, 110, 110, 160);
        }
        if (tiles[1] == 4) {
            g2D.drawLine(210, 110, 290, 160);
            g2D.drawLine(290, 110, 210, 160);

        }
        if (tiles[2] == 4) {
            g2D.drawLine(310, 110, 390, 160);
            g2D.drawLine(390, 110, 310, 160);
        }
        if (tiles[3] == 4) {
            g2D.drawLine(110, 190, 190, 240);
            g2D.drawLine(190, 190, 110, 240);
        }
        if (tiles[4] == 4) {
            g2D.drawLine(210, 190, 290, 240);
            g2D.drawLine(290, 190, 210, 240);
        }
        if (tiles[5] == 4) {
            g2D.drawLine(310, 190, 390, 240);
            g2D.drawLine(390, 190, 310, 240);
        }
        if (tiles[6] == 4) {
            g2D.drawLine(110, 270, 190, 330);
            g2D.drawLine(190, 270, 110, 330);
        }
        if (tiles[7] == 4) {
            g2D.drawLine(210, 270, 290, 330);
            g2D.drawLine(290, 270, 210, 330);
        }
        if (tiles[8] == 4) {
            g2D.drawLine(310, 270, 390, 330);
            g2D.drawLine(390, 270, 310, 330);
        }

        // Draw Some Info Text on the Bottom lolololo
        g2D.setPaint(Color.white);


        if (turn == false && xWin == false && oWin == false) {
            g2D.drawString("O's turn", 150, 400);
        }
        else if (turn == true && xWin == false && oWin == false) {
            g2D.drawString("X's turn", 150, 400);
        }





    }

    @Override
    public void actionPerformed(ActionEvent e) {

        repaint();

    }
}
