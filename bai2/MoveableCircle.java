/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12.newpackage;

/**
 *
 * @author TH
 */
class MoveableCircle implements Moveable{
public int radius;
public MoveablePoint center;
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
public MoveableCircle(int radius, MoveablePoint center) {
    super();
    this.radius = radius;
    this.center = center;
}
public MoveableCircle() {}
public String toString() {
    return "MoverableCircle [radius=" + radius + ", center=" + center + "]";
    }
}

