
import com.lucasrocha.arquitetura.model.EquilibrioCorrecaoCTC;
import com.lucasrocha.arquitetura.model.TexturaSolo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EquilibrioCorrecaoCTCTest {

    @Test
    public void testValoresIdeaisArgiloso() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);

        assertEquals(9.0, ecc.getFosforoIdeal(), 0);
        assertEquals(0.35, ecc.getPotassioIdeal(), 0);
        assertEquals(6.0, ecc.getCalcioIdeal(), 0);
        assertEquals(1.5, ecc.getMagnesioIdeal(), 0);
        assertEquals(9.0, ecc.getEnxofreIdeal(), 0);
        assertEquals(0.0, ecc.getAluminioIdeal(), 0);
    }

    @Test
    public void testValoresIdeaisTexturaMedia() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);

        assertEquals(12.0, ecc.getFosforoIdeal(), 0);
        assertEquals(0.25, ecc.getPotassioIdeal(), 0);
        assertEquals(4.0, ecc.getCalcioIdeal(), 0);
        assertEquals(1.0, ecc.getMagnesioIdeal(), 0);
        assertEquals(6.0, ecc.getEnxofreIdeal(), 0);
        assertEquals(0.0, ecc.getAluminioIdeal(), 0);
    }

    @Test
    public void testCalcularSCmol() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);

        assertEquals(16.74, ecc.calcularSCmol(0.82, 12.45, 3.47), 0);
    }

    @Test
    public void testCalcularCTCCmol() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);

        assertEquals(21.89, ecc.calcularSCmol(0.82, 12.45, 3.47) + 5.15);
    }

    @Test
    public void testCalculaVPercentual() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        double scmol = ecc.getPotassio() + ecc.getCalcio() + ecc.getMagnesio();
        double ctccmol = scmol + ecc.getAcidezPotencial();

        assertEquals(76.47327546825034, ecc.calculaVPercentual(scmol, ctccmol));
    }

    @Test
    public void testMOPercentual() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);

        assertEquals(3.07, ecc.calcularMOPercentual(ecc.getMo()));
    }

    @Test
    public void testCalcularCarbono() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.TEXTURA_MEDIA, 10.23, 0.82, 12.45, 3.47, 1.10, 0.00, 5.15, 30.7);
        double moPercentual = ecc.calcularMOPercentual(ecc.getMo());

        assertEquals(17.848837209302324, ecc.calcularCarbono(moPercentual));
    }
}
