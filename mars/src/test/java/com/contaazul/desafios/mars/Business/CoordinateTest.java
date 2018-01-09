package com.contaazul.desafios.mars.Business;

/**
 * Created by pablo on 09/01/18.
 */

import com.contaazul.desafios.mars.business.Coordinate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoordinateTest {

    @Test
    public void areEquals() {
        Coordinate current = new Coordinate(0,0);
        Coordinate expected = new Coordinate(0,0);

        Assert.assertEquals(expected,current);
    }

    @Test
    public void areNotEqualsX() {
        Coordinate current = new Coordinate(0,0);
        Coordinate expected = new Coordinate(1,0);

        Assert.assertNotEquals(expected,current);
    }

    @Test
    public void areNotEqualsY() {
        Coordinate current = new Coordinate(0,0);
        Coordinate expected = new Coordinate(0,1);

        Assert.assertNotEquals(expected,current);
    }

    @Test
    public void areNotEqualsBoth() {
        Coordinate current = new Coordinate(0,0);
        Coordinate expected = new Coordinate(1,1);

        Assert.assertNotEquals(expected,current);
    }
}
