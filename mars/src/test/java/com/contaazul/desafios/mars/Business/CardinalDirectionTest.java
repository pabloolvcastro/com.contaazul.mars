package com.contaazul.desafios.mars.Business;

/**
 * Created by pablo on 09/01/18.
 */

import com.contaazul.desafios.mars.business.CardinalDirection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CardinalDirectionTest {

    @Test
    public void rotateLeftN() {
        CardinalDirection current = CardinalDirection.N;
        CardinalDirection expected = CardinalDirection.W;
        Assert.assertEquals(expected, current.RotateLeft());
    }

    @Test
    public void rotateLeftE() {
        CardinalDirection current = CardinalDirection.E;
        CardinalDirection expected = CardinalDirection.N;
        Assert.assertEquals(expected, current.RotateLeft());
    }

    @Test
    public void rotateLeftS() {
        CardinalDirection current = CardinalDirection.S;
        CardinalDirection expected = CardinalDirection.E;
        Assert.assertEquals(expected, current.RotateLeft());
    }

    @Test
    public void rotateLeftW() {
        CardinalDirection current = CardinalDirection.W;
        CardinalDirection expected = CardinalDirection.S;
        Assert.assertEquals(expected, current.RotateLeft());
    }

    @Test
    public void rotateRightN() {
        CardinalDirection current = CardinalDirection.N;
        CardinalDirection expected = CardinalDirection.E;
        Assert.assertEquals(expected, current.RotateRight());
    }

    @Test
    public void rotateRightE() {
        CardinalDirection current = CardinalDirection.E;
        CardinalDirection expected = CardinalDirection.S;
        Assert.assertEquals(expected, current.RotateRight());
    }

    @Test
    public void rotateRightS() {
        CardinalDirection current = CardinalDirection.S;
        CardinalDirection expected = CardinalDirection.W;
        Assert.assertEquals(expected, current.RotateRight());
    }

    @Test
    public void rotateRightW() {
        CardinalDirection current = CardinalDirection.W;
        CardinalDirection expected = CardinalDirection.N;
        Assert.assertEquals(expected, current.RotateRight());
    }

}
