public class Traingle {
    String checkTriangle(int x, int y, int z)
    {
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
