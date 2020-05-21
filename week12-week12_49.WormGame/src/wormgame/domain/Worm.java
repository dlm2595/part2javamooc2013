/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import wormgame.Direction;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Denzel
 */
public class Worm {
    private final List<Piece> pieces;
    private Direction direction;
    private boolean toGrow;
    
    public Worm(int originalX, int originalY, Direction originalDirection) {
        
        this.pieces = new ArrayList();
        this.pieces.add(new Piece(originalX, originalY));
        this.direction = originalDirection;
        this.toGrow = false;
    }
    
    public Direction getDirection() {
        return this.direction;
    }
    
    public void setDirection(Direction dir) {
        this.direction = dir;
    }
    
    public int getLength() {
        return this.pieces.size();
    }
    
    public List<Piece> getPieces() {
        return this.pieces;
    }
    
    public void move() {
        if (this.pieces.size() < 3) this.grow();
        Piece head = this.pieces.get(this.getLength()-1);
        if (null != this.direction) switch (this.direction) {
            case RIGHT:{
                Piece updatedHead = new Piece(head.getX()+1,head.getY());
                this.pieces.add(updatedHead);
                    break;
                }
            case DOWN:{
                Piece updatedHead = new Piece(head.getX(),head.getY()+1);
                this.pieces.add(updatedHead);
                    break;
                }
            case LEFT:{
                Piece updatedHead = new Piece(head.getX()-1,head.getY());
                this.pieces.add(updatedHead);
                    break;
                }
            case UP:{
                Piece updatedHead = new Piece(head.getX(),head.getY()-1);
                this.pieces.add(updatedHead);
                    break;
                }
            default:
                break;
        }
        if (!this.toGrow) {
            this.pieces.remove(0);
        } else {
            this.toGrow = false;
        }
        
    }
    
    public boolean runsInto(Piece piece) {
        int check = 0;
        for (Piece i:this.pieces) {
            if (i.runsInto(piece)) {
               check++;
                break;
            }
        }
        return check>0;
    }
    
    public boolean runsIntoItself() {
        int sameSpot = 0;
        Piece head = this.pieces.get(this.getLength()-1);
        for (Piece i:this.pieces) {
            if (head.getX() == i.getX() && head.getY() == i.getY()) {
                sameSpot++;
            }
        }
        return sameSpot > 1;
    }
    
    public void grow() {
        this.toGrow = true;
    }
    
    public Piece getHead() {
        return this.pieces.get(this.pieces.size()-1);
    }
    
    @Override
    public String toString() {
        return this.pieces.toString();
    }
}
