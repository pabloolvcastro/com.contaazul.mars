package com.contaazul.desafios.mars.Business;

/**
 * Created by pablo on 08/01/18.
 */

import com.contaazul.desafios.mars.business.CardinalDirection;
import com.contaazul.desafios.mars.business.Command;
import com.contaazul.desafios.mars.business.Coordinate;
import com.contaazul.desafios.mars.business.Position;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommandTests {

    @Test(expected = Exception.class)
    public void invalidNewCommand() throws Exception {
        new Command("AAA");
    }

    @Test
    public void executionPosition() throws Exception {
        Command commandTest = new Command("MMM");
        Position current = new Position(CardinalDirection.N, new Coordinate(0,0));
        Position expected = new Position(CardinalDirection.N, new Coordinate(0,3));

        Position result = commandTest.Execute(current);

        Assert.assertEquals(expected, result);
    }
}
