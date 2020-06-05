import com.softserve.edu.hw6_2.Rectangle;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RectanglePerimetrTest {

    @Test
    public void perimetrRectangle() {
        Rectangle rectangle = new Rectangle(3, 4);
        int result = 14;
        Assert.assertEquals(result, rectangle.perimetr());
    }
}

