/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;
import java.awt.Color;
import wormgame.game.WormGame;
import wormgame.domain.Piece;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 *
 * @author Denzel
 */
public class DrawingBoard extends JPanel implements Updatable {
    private final WormGame wormgame;
    private final int pieceLength;
    
    public DrawingBoard(WormGame wormgame, int pieceLength) {
        this.wormgame = wormgame;
        this.pieceLength = pieceLength;
        this.setBackground(Color.BLACK);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Piece p:this.wormgame.getWorm().getPieces()) {
            g.setColor(Color.WHITE);
            g.fill3DRect(p.getX()*this.pieceLength, p.getY()*this.pieceLength, this.pieceLength, this.pieceLength, true);
        }
        
        g.setColor(Color.RED);
        g.fillOval(this.wormgame.getApple().getX()*this.pieceLength, this.wormgame.getApple().getY()*this.pieceLength, this.pieceLength, this.pieceLength);
    }

    @Override
    public void update() {
        this.repaint();
    }
}
