package org.globant.uy;

/**
 * Created by eduardo on 31/12/15.
 */
public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point2D d){
        return  Math.hypot(this.x-d.getX(), this.y-d.getY());
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
