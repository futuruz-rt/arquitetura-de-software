
import com.lucasrocha.arquitetura.App;
import com.lucasrocha.arquitetura.model.Elementos;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElementosTest {

    @Test
    public void testFosforoTexturaSoloUm() {
        Elementos e = new Elementos();
        double fosforoIdeal = 9.0;
        e.setTexturaSolo(1);
        e.setFosforo(9.0);
        assertEquals(fosforoIdeal, e.getFosforo(), e.getFosforoIdeal());
    }

    @Test
    public void testFosforoTexturaSoloDois() {
        Elementos e = new Elementos();
        double fosforoIdeal = 12.0;
        e.setTexturaSolo(2);
        e.setFosforo(12.0);
        assertEquals(fosforoIdeal, e.getFosforo(), e.getFosforoIdeal());
    }

    // teste unitário do valor ideal do potássio com textura 1 (argiloso)
    @Test
    public void testPotassioTexturaSoloUm() {
        Elementos e = new Elementos();
        double potassioIdeal = 0.35;
        e.setTexturaSolo(1);
        e.setPotassio(0.35);
        assertEquals(potassioIdeal, e.getPotassio(), e.getPotassioIdeal());
    }

    // teste unitário do valor ideal do potássio com textura 2 (Textura Média)
    @Test
    public void testPotassioTexturaSoloDois() {
        Elementos e = new Elementos();
        double potassioIdeal = 0.25;
        e.setTexturaSolo(2);
        e.setPotassio(0.25);
        assertEquals(potassioIdeal, e.getPotassio(), e.getFosforoIdeal());
    }

    @Test
    public void testCalcioTexturaSoloUm() {
        Elementos e = new Elementos();
        double calcioIdeal = 6.0;
        e.setTexturaSolo(1);
        e.setCalcio(6.0);
        assertEquals(calcioIdeal, e.getCalcio(), e.getCalcioIdeal());
    }

    // teste unitário do valor ideal do potássio com textura 2 (Textura Média)
    @Test
    public void tesCalcioTexturaSoloDois() {
        Elementos e = new Elementos();
        double calcioIdeal = 4.0;
        e.setTexturaSolo(2);
        e.setCalcio(4.0);
        assertEquals(calcioIdeal, e.getCalcio(), e.getCalcioIdeal());
    }

    @Test
    public void testMagnesioTexturaSoloUm() {
        Elementos e = new Elementos();
        double magnesioIdeal = 1.5;
        e.setTexturaSolo(1);
        e.setMagnesio(1.5);
        assertEquals(magnesioIdeal, e.getMagnesio(), e.getMagnesioIdeal());
    }

    // teste unitário do valor ideal do potássio com textura 2 (Textura Média)
    @Test
    public void testMagnesioTexturaSoloDois() {
        Elementos e = new Elementos();
        double magnesioIdeal = 1.0;
        e.setTexturaSolo(2);
        e.setMagnesio(1.0);
        assertEquals(magnesioIdeal, e.getMagnesio(), e.getMagnesioIdeal());
    }

    @Test
    public void testEnxofreTexturaSoloUm() {
        Elementos e = new Elementos();
        double enxofreIdeal = 9.0;
        e.setTexturaSolo(1);
        e.setEnxofre(9.0);
        assertEquals(enxofreIdeal, e.getEnxofre(), e.getEnxofreIdeal());
    }

    // teste unitário do valor ideal do potássio com textura 2 (Textura Média)
    @Test
    public void testEnxofreTexturaSoloDois() {
        Elementos e = new Elementos();
        double enxofreIdeal = 6.0;
        e.setTexturaSolo(2);
        e.setEnxofre(6.0);
        assertEquals(enxofreIdeal, e.getEnxofre(), e.getEnxofreIdeal());
    }

    @Test
    public void testAluminioTexturaSoloUm() {
        Elementos e = new Elementos();
        double aluminioIdeal = 0.0;
        e.setTexturaSolo(1);
        e.setAluminio(0.0);
        assertEquals(aluminioIdeal, e.getAluminio(), e.getAluminioIdeal());
    }

    @Test
    public void testAluminioTexturaSoloDois() {
        Elementos e = new Elementos();
        double aluminioIdeal = 0.0;
        e.setTexturaSolo(2);
        e.setAluminio(0.0);
        assertEquals(aluminioIdeal, e.getAluminio(), e.getAluminioIdeal());
    }

    @Test
    public void testHAlTexturaSoloUm() {
        Elementos e = new Elementos();
        double HAlideal = 0.0;
        e.setTexturaSolo(1);
        e.sethAl(0.0);
        assertEquals(HAlideal, e.getHAl());
    }

    @Test
    public void testHAlTexturaSoloDois() {
        Elementos e = new Elementos();
        double HAlideal = 0.0;
        e.setTexturaSolo(2);
        e.sethAl(0.0);
        assertEquals(HAlideal, e.getHAl());
    }
}
