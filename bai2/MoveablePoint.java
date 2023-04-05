/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12.newpackage;

/**
 *
 * @author TH
 */
class MoveablePoint implements Moveable{
    int x,y;
    int xSpeed;
    int ySpeed;
public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
    super();
    this.x = x;
    this.y = y;
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
}
public MoveablePoint() {}
@Override
public void moveUp() {
    System.out.println("move up");
}
@Override
public void moveDown() {
    System.out.println("move Down");
}
@Override
public void moveLeft() {
    System.out.println("move left");
}
@Override
public void moveRight() {
    System.out.println("move Right");
}


@Override
public String toString() {
    return "MovereablePoint=" +x+"y="+xSpeed+ySpeed;
}


}

