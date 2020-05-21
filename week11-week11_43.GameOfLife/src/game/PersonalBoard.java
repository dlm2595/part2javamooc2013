/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import gameoflife.GameOfLifeBoard;
import java.util.Random;
/**
 *
 * @author Denzel
 */
public class PersonalBoard extends GameOfLifeBoard {
    
    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                if (new Random().nextDouble() < d) {
                    turnToLiving(x, y);
                }
            }
        }
        
    }

    @Override
    public boolean isAlive(int i, int i1) {
        try {
            return this.getBoard()[i][i1];
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (insideTheBoard(i, i1)) this.getBoard()[i][i1] = true;
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (insideTheBoard(i, i1)) this.getBoard()[i][i1] = false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int living = 0;
        for (int x = i-1; x <= i+1; x++) {
            for (int y = i1 - 1; y <= i1+1; y++ ) {
                if (isAlive(x, y)) living++;
            }
        }
        
        if (isAlive(i, i1)) living--;
        
        return living;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if (i2 < 2 || i2 > 3) {
            turnToDead(i, i1);
        } else if (i2 == 3) {
            turnToLiving(i, i1);
        }
    }
    
    public boolean insideTheBoard(int x, int y) {
        if (x < 0 || y < 0 || x >= super.getWidth() || y >= super.getHeight()) { 
            return false;
        }
        
        return true;
    }
    
}
