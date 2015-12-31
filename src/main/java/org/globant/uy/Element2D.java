package org.globant.uy;

/**
 * Created by eduardo on 31/12/15.
 */
public class Element2D {

    private Point2D ptCenter;
    private Point2D ptRadio;

    public Element2D(Point2D ptCenter, Point2D ptRadio) {
        this.ptCenter = ptCenter;
        this.ptRadio = ptRadio;
    }

    public boolean collision(Element2D e1) {
        if(e1 == null)
            throw new IllegalArgumentException();
        double distance = e1.getPtCenter().distance(this.getPtCenter());
        double radio = e1.getRadio() + this.getRadio();
        return distance <= radio;
    }

    public double getRadio() {
        return ptCenter.distance(ptRadio);
    }

    public Point2D getPtCenter() {
        return ptCenter;
    }

    public void setPtCenter(Point2D ptCenter) {
        this.ptCenter = ptCenter;
    }

    public Point2D getPtRadio() {
        return ptRadio;
    }

    public void setPtRadio(Point2D ptRadio) {
        this.ptRadio = ptRadio;
    }
}
