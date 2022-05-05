import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Traingle_2Test {
    @Test
    void equal(){
        var traingleType = new Traingle_2();
        assertEquals("Equilateral Triangle", traingleType.checkTriangle(1,1,1));
    }
    @Test
    void isosceles(){
        var traingleType = new Traingle_2();
        assertEquals("Isosceles Triangle", traingleType.checkTriangle(3,3,4));
    }
    @Test
    void scalene(){
        var traingleType = new Traingle_2();
        assertEquals("Scalene Triangle", traingleType.checkTriangle(3,5,4));
    }
    @Test
    void notTriangle_1(){
        var traingleType = new Traingle_2();
        assertEquals("Not Triangle!", traingleType.checkTriangle(2,2,4));
    }
    @Test
    void notTriangle_2(){
        var traingleType = new Traingle_2();
        assertEquals("Not Triangle!", traingleType.checkTriangle(0,2,4));
    }
    @Test
    void notTriangle_3(){
        var traingleType = new Traingle_2();
        assertEquals("Not Triangle!", traingleType.checkTriangle(0,-1,4));
    }
    @Test
    void notTriangle_4(){
        var traingleType = new Traingle_2();
        assertEquals("Not Triangle!", traingleType.checkTriangle(3,2,6));
    }

}