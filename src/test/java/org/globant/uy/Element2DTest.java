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

    private Element2D e3;

    @Mock
    private Point2D p1;
    @Mock
    private Point2D p2;
    @Mock
    private Point2D p3;
    @Mock
    private Point2D p4;
    @Mock
    private Point2D p5;

    @Before
    public void setUp() throws Exception {
        when(p1.distance(any(Point2D.class))).thenReturn(4d, 3d, 1d);
    }

    @Test
    public void testNoCollision() throws Exception {
        Assert.assertEquals(e1.collision(e1), false);
    }

    @Test
    public void testCollision() throws Exception {
        Assert.assertEquals(e1.collision(e3), true);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCollisionException() {
        e1.collision(null);
    }

}
