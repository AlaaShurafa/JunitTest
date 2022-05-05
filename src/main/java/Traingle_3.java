public class Traingle_3 {
    String checkTriangle(int x, int y, int z)
    {
        if(     x <= 0 || y <= 0 || z <= 0 ||
                x + y <= z ||
                x + z <= y ||
                z + y <= x
        ) return "Not Triangle!";
        // Check for equilateral triangle
        if (x == y && y == z )
            return "Equilateral Triangle";

            // Check for isosceles triangle
        else if (x == y || y == z || z == x )
            return "Isosceles Triangle";

            // Otherwise scalene triangle
        else
            return "Scalene Triangle";
    }
}
