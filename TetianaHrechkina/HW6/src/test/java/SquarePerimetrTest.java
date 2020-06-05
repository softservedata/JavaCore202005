import com.softserve.edu.hw6_2.Square;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class SquarePerimetrTest {

    @Test
    public void perimetrSquare(){
        Square square = new Square(2);
        int result = 8;
        Assert.assertEquals(result, square.perimetr());
    }
}
