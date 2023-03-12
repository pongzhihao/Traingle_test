import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;




class TriangleTest {
    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();
        String type = triangle.getTraingleType(0, 4, 5);
        assertEquals("输入错误", type);
    }
    @Test
    @DisplayName("非三角形")
    void general_test() {
        Triangle triangle = new Triangle();
        String type = triangle.getTraingleType(1,1,2);
        assertEquals("非三角形",type);
    }
    @Test
    @DisplayName("等边三角形")
    void equilateral_test() {
        Triangle triangle = new Triangle();
        String type = triangle.getTraingleType(6,6,6);
        assertEquals("等边三角形",type);
    }
    @Test
    @DisplayName("等腰三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.getTraingleType(4, 4, 6);
        assertEquals("等腰三角形", type);
    }
    @Test
    @DisplayName("一般三角形")
    void normal_test() {
        Triangle triangle = new Triangle();
        String type = triangle.getTraingleType(3,4,5);
        assertEquals("一般三角形",type);
    }
}