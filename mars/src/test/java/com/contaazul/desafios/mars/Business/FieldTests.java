package com.contaazul.desafios.mars.Business;

/**
 * Created by pablo on 08/01/18.
 */

import com.contaazul.desafios.mars.business.Coordinate;
import com.contaazul.desafios.mars.business.Field;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FieldTests {

    @Test(expected=Exception.class)
    public void fieldSizeUpperThenMaxForX()  throws Exception {
        new Field(6,4);
    }

    @Test(expected=Exception.class)
    public void fieldSizeUpperThenMaxForY() throws Exception {
        new Field(4,6);
    }

    @Test(expected=Exception.class)
    public void fieldSizeLowerThen0X() throws Exception {
        new Field(0,6);
    }

    @Test(expected=Exception.class)
    public void fieldSizeLowerThen0Y() throws Exception {
        new Field(6,0);
    }

    @Test
    public void coordinateInsideField() throws Exception {
        Integer xsize = 5;
        Integer ysize = 5;
        Coordinate coordinate = new Coordinate(4,4);
        Field fieldTest = new Field(xsize,ysize);
        Boolean isValid = fieldTest.IsValidCoordinate(coordinate);

        Assert.assertEquals(true, isValid);
    }

    @Test
    public void coordinateOutsideField() throws Exception {
        Integer xsize = 5;
        Integer ysize = 5;
        Coordinate coordinate = new Coordinate(5,5);
        Field fieldTest = new Field(xsize,ysize);
        Boolean isValid = fieldTest.IsValidCoordinate(coordinate);

        Assert.assertEquals(false, isValid);
    }

}