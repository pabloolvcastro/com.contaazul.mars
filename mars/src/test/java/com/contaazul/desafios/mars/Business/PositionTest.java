package com.contaazul.desafios.mars.Business;

/**
 * Created by pablo on 09/01/18.
 */

import com.contaazul.desafios.mars.business.CardinalDirection;
import com.contaazul.desafios.mars.business.Coordinate;
import com.contaazul.desafios.mars.business.Position;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PositionTest {

    @Test
    public void areEquals() {
        CardinalDirection directionCurrent = CardinalDirection.N;
        CardinalDirection directionExpected = CardinalDirection.N;
        Coordinate coordinateCurrent = new Coordinate(0,0);
        Coordinate coordinateExpected = new Coordinate(0,0);

        Position current = new Position(directionCurrent, coordinateCurrent);
        Position expected = new Position(directionExpected, coordinateExpected);

        Assert.assertEquals(expected,current);
    }

    @Test
    public void areNotEqualsDirection() {
        CardinalDirection directionCurrent = CardinalDirection.N;
        CardinalDirection directionExpected = CardinalDirection.S;
        Coordinate coordinateCurrent = new Coordinate(0,0);
        Coordinate coordinateExpected = new Coordinate(0,0);

        Position current = new Position(directionCurrent, coordinateCurrent);
        Position expected = new Position(directionExpected, coordinateExpected);

        Assert.assertNotEquals(expected,current);
    }

    @Test
    public void areNotEqualsCoordinate() {
        CardinalDirection directionCurrent = CardinalDirection.N;
        CardinalDirection directionExpected = CardinalDirection.N;
        Coordinate coordinateCurrent = new Coordinate(0,0);
        Coordinate coordinateExpected = new Coordinate(1,1);

        Position current = new Position(directionCurrent, coordinateCurrent);
        Position expected = new Position(directionExpected, coordinateExpected);

        Assert.assertNotEquals(expected,current);
    }

    @Test
    public void ToString() {
        CardinalDirection direction = CardinalDirection.N;
        Coordinate coordinate = new Coordinate(0,0);
        Position position = new Position(direction, coordinate);
        String expected = "(0,0,N)";

        Assert.assertEquals(expected, position.toString());
    }
}
