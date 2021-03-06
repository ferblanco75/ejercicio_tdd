/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void clienteCompraCocaPor120MangosHabiendoCostado10ManosResultandoUnaGanaciaDe110() {
        Coca coca = new Coca( new Costo(10));

        Margen esperado = new Margen(110);

        assertEquals(esperado, coca.venderA(new PrecioVenta(120)));

    }

    @Test
    public void clienteCompraCocaPor120MangosHabiendoCostado10ManosResultandoUnaGanaciaNoEsDe110() {
        Coca coca = new Coca( new Costo(10));

        Margen esperado = new Margen(10);

        assertNotEquals(esperado, coca.venderA(new PrecioVenta(120)));

    }

    @Test
    public void clienteCompraPapasPor200MangosHabiendoCostado5ManosResultandoUnaGanaciaDe195() {
        Papas producto = new Papas( new Costo(5));

        Margen esperado = new Margen(195);

        assertEquals(esperado, producto.venderA(new PrecioVenta(200)));

    }

    @Test
    public void clienteCompraComboPapasCocaPor1000MangosHabiendoCostado5laPapa10laCocaResultandoUnaGanaciaDe985() {
        Combo producto = new Combo( new Papas(5), new Coca(10));

        Margen esperado = new Margen(985);

        assertEquals(esperado, producto.venderA(new PrecioVenta(1000)));

    }

    @Test
    public void clienteCompraCocaPor100MangosHabiendoCompradoPackDe6Por6ResultandoUnaGanaciaDe99() {
        Coca producto = new PackDeCoca(6, 6).item();

        Margen esperado = new Margen(99);

        assertEquals(esperado, producto.venderA(new PrecioVenta(100)));

    }

              /*
    @Test
    public void testUnChinitoCompraUnaSpriteA12pYLaVendeA150pLaRentaEsDe138p(){
        Sprite sprite = new Sprite(12);

        Venta venta = new Venta(sprite, 150);

        assertEquals(138, venta.rentabilidad());
    }

    @Test
    public void testUnChinitoCompraUnaSpriteA10pYLaVendeA150pLaRentaEsDe140p(){
        Sprite sprite = new Sprite(10);

        Venta venta = new Venta(sprite, 150);

        assertEquals(140, venta.rentabilidad());

    }

    @Test
    public void testUnChinitoCompraUnaFritaA30pYLaVendeA40pLaRentaEsDe10p(){
        Papa papa = new Papa(30);

        Venta venta = new Venta(papa, 40);

        assertEquals(10, venta.rentabilidad());
    }

    @Test public void testUnChinitoCompraUnPackDe10Coca600pVendeUnaCocaa150p(){
        Paquete pack = new Paquete( new Coca(), 10, 600);

        Venta venta = new Venta(pack.unidad(), 150);

        assertEquals(90, venta.rentabilidad());
    }

    @Test public void testUnChinitoCompraUnPackDe10Papa600pVendeUnaPapaa150p(){
        Paquete pack = new Paquete( new Papa(), 10, 600);

        Venta venta = new Venta(pack.unidad(), 150);

        assertEquals(90, venta.rentabilidad());
    }

     */
}
