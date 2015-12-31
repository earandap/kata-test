package org.globant.uy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by eduardo on 31/12/15.
 */
public class Element2DTest {

    private Element2D e1;

    private Element2D e2;

    private Point2D p1;

    private Point2D p2;


    @Before
    public void setUp() throws Exception {
        p1 = mock(Point2D.class);
        p2 = mock(Point2D.class);
        e1 = new Element2D(p1,p2);
        e2 = new Element2D(p1,p2);
    }

    @Test
    public void testNoCollision() throws Exception {
        when(p1.distance(any(Point2D.class))).thenReturn(4d, 3d, 1d);
        Assert.assertEquals(e1.collision(e2), true);
    }

    @Test
    public void testCollision() throws Exception {
        when(p1.distance(any(Point2D.class))).thenReturn(7d, 3d, 1d);
        Assert.assertEquals(e1.collision(e2), false);
    }




    @Test(expected = IllegalArgumentException.class)
    public void testCollisionException() {
        e1.collision(null);
    }

}
