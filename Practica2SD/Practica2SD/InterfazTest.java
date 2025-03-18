import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.rmi.RemoteException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InterfazTest {
    private static Interfaz interfaz;

    @BeforeAll
    public static void setUp() throws RemoteException {
        interfaz = new Interfaz() {
            @Override
            public float sumar(float numero1, float numero2) throws RemoteException {
                return numero1 + numero2;
            }

            @Override
            public float restar(float numero1, float numero2) throws RemoteException {
                return numero1 - numero2;
            }

            @Override
            public float multiplicar(float numero1, float numero2) throws RemoteException {
                return numero1 * numero2;
            }

            @Override
            public float dividir(float numero1, float numero2) throws RemoteException {
                return numero1 / numero2;
            }

            @Override
            public float raiz(float numero1) throws RemoteException {
                return (float) Math.sqrt(numero1);
            }
        };
    }

    @Test
    public void testSumar() throws RemoteException {
        assertEquals(5.0, interfaz.sumar(2.0f, 3.0f));
    }

    @Test
    public void testRestar() throws RemoteException {
        assertEquals(1.0, interfaz.restar(3.0f, 2.0f));
    }

    @Test
    public void testMultiplicar() throws RemoteException {
        assertEquals(6.0, interfaz.multiplicar(2.0f, 3.0f));
    }

    @Test
    public void testDividir() throws RemoteException {
        assertEquals(2.0, interfaz.dividir(6.0f, 3.0f));
    }

    @Test
    public void testRaiz() throws RemoteException {
        assertEquals(2.0, interfaz.raiz(4.0f));
    }
}
