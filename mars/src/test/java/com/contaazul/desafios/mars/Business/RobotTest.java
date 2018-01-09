package com.contaazul.desafios.mars.Business;

/**
 * Created by pablo on 09/01/18.
 */

import com.contaazul.desafios.mars.business.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RobotTest {

    @Test(expected = Exception.class)
    public void invalidMove() throws Exception {
        Command command = new Command("MMMMMM");
        Field field = new Field(5,5);
        Position position = new Position(CardinalDirection.N, new Coordinate(0,0));
        Robot robotTest = new Robot(field, position);

        robotTest.Move(command);
    }

    @Test
    public void validMove() throws Exception {
        Command command = new Command("MMM");
        Field field = new Field(5,5);
        Position position = new Position(CardinalDirection.N, new Coordinate(0,0));
        Robot robotTest = new Robot(field, position);

        Position current = robotTest.Move(command);
        Position expected = new Position(CardinalDirection.N, new Coordinate(0,3));

        Assert.assertEquals(expected, current);
    }

    @Test
    public void robotCurrentPositionMoveFuntioSameReturn() throws Exception {
        Command command = new Command("MMM");
        Field field = new Field(5,5);
        Position position = new Position(CardinalDirection.N, new Coordinate(0,0));
        Robot robotTest = new Robot(field, position);

        Position movereturn = robotTest.Move(command);
        Position robotposition = robotTest.get_position();

        Assert.assertEquals(robotposition, movereturn);
    }

    @Test
    public void testMoveMMRMMRMM()  throws Exception {
        Command command = new Command("MMRMMRMM");
        Field field = new Field(5,5);
        Position position = new Position(CardinalDirection.N, new Coordinate(0,0));
        Robot robotTest = new Robot(field, position);

        Position current = robotTest.Move(command);
        Position expected = new Position(CardinalDirection.S, new Coordinate(2,0));

        Assert.assertEquals(expected, current);
    }

    @Test
    public void testMoveMML()  throws Exception {
        Command command = new Command("MML");
        Field field = new Field(5,5);
        Position position = new Position(CardinalDirection.N, new Coordinate(0,0));
        Robot robotTest = new Robot(field, position);

        Position current = robotTest.Move(command);
        Position expected = new Position(CardinalDirection.W, new Coordinate(0,2));

        Assert.assertEquals(expected, current);
    }
}
