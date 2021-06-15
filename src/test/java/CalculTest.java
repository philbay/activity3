package calcul;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculTest {
@Test
public void testConstructeur() {
    new Calcul();
}
@Test
public void testSomme() {
    assertEquals(5, Calcul.somme(2,3));
}
@Test
public void testMaFonction(){
    assertEquals(4, Calcul.maFonction(40,10));
    assertEquals(9, Calcul.maFonction(20,9));
}
@Test
public void testDivision() {
    assertEquals(4, Calcul.division(8,2));
    assertEquals(2, Calcul.division(4,0));
}
}
