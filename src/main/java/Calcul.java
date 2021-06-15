package calcul;
public class Calcul {
/**
 * Definition d'une constante pour eliiminer nombre magique.
 * {@value NOMBRES_REFERENCE} ce nombre vaut 10
 */
private static final int NOMBRES_REFERENCE = 10;
/**constructor of the class. */
protected Calcul() {

}
/***
* Calcul la somme de deux nombres.
* @return a + b
* @param a premier parametre de somme est un entier
* @param b second parametre de somme est un entier
**/
public static int somme(final int a, final int b) {
return a + b;
}
/***
 * @return a / b si b >= 10.
 * @param a premier parametere de maFonciton est un entier
 * @param b second parametre de maFonction est un entier
 */
public static int maFonction(final int a, final int b) {
if (b >= NOMBRES_REFERENCE) {
return a / b;
}
return b;
}
/**
 * @return a / b si b != 0.
 * @param a premier parametre de division est un entier
 * @param b second parametre de division est un entier
 * @throw IllegalArgumentException si b == 0;
 */
 public static int division(final int a, final int b) {
if (b  == 0) {
throw new IllegalArgumentException("b ne doit pas etre 0");
}
return a / b;
}
}
