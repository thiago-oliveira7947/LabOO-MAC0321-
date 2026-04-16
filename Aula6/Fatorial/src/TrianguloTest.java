import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

public class TrianguloTest {
    
    @Test
    public void testEscaleno() {
        Triangulo triangle = new Triangulo(3, 4, 5);
        assertEquals("Escaleno", triangle.typeTriangle(triangle.getA(), triangle.getB(), triangle.getC()));
    }

    @Test
    public void testEquilatero() {
        Triangulo triangle = new Triangulo(3, 3, 3);
        assertEquals("Equilatero", triangle.typeTriangle(triangle.getA(), triangle.getB(), triangle.getC()));
    }

    @Test
    public void testIsosceles() {
        Triangulo triangle = new Triangulo(2, 2, 3);
        assertEquals("Isosceles", triangle.typeTriangle(triangle.getA(), triangle.getB(), triangle.getC()));
    }

    @Test
    public void testInexistentTriangle() {
        Triangulo triangle = new Triangulo(1, 2, 17);
        assertEquals("Esse triângulo não existe!", triangle.typeTriangle(triangle.getA(), triangle.getB(), triangle.getC()));
    }

    @Test
    public void testNegativeSides() {
        Triangulo triangle = new Triangulo(-1, 2, 17);
        assertEquals("Valores inválidos!", triangle.typeTriangle(triangle.getA(), triangle.getB(), triangle.getC()));
    }
}
