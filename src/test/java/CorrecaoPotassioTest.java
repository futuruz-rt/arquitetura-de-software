
import com.lucasrocha.arquitetura.model.CorrecaoPotassio;
import com.lucasrocha.arquitetura.model.EquilibrioCorrecaoCTC;
import com.lucasrocha.arquitetura.model.FontesPotassio;
import com.lucasrocha.arquitetura.model.ForneceCorrecao;
import com.lucasrocha.arquitetura.model.Nutrientes;
import com.lucasrocha.arquitetura.model.TexturaSolo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CorrecaoPotassioTest {

    @Test
    public void testParticipacaoPotassioAtual() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.CLORETO_POTASSIO, 2500.00);
        
        assertEquals(1.2, correcaoPotassio.participacaoPotassioAtual(), 0.1);
    }

    @Test
    public void testParticipacaoPotassioCorrecao() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.CLORETO_POTASSIO, 2500.00);
        
        assertEquals(3.0, correcaoPotassio.participacaoPotassioCorrecao(), 0.1);
    }

    @Test
    public void testParticipacaoPotassioPercentualIdeal() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.CLORETO_POTASSIO, 2500.00);
        
        assertEquals(3.0, correcaoPotassio.participacaoPotassioPercentualIdeal(), 0.1);
    }

    @Test
    public void testQuantidadePotassioAplicacao() {

        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.CLORETO_POTASSIO, 2500.00);
        
        assertEquals(450.55, correcaoPotassio.quantidadeAplicarPotassio(), 0.1);

        correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.SULFATO_POTASSIO, 2500.00);
        
        assertEquals(502.53, correcaoPotassio.quantidadeAplicarPotassio(), 0.1);

        correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
        
        assertEquals(1187.80, correcaoPotassio.quantidadeAplicarPotassio(), 0.1);
    }

    @Test
    public void testForneceCorrecaoPotassioUm() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.SULFATO_POTASSIO, 2500.00);
        ForneceCorrecao correcao = new ForneceCorrecao(85.43, Nutrientes.ENXOFRE);
        
        assertEquals(correcao.getValor(), correcaoPotassio.forneceCorrecaoPotassioUm().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoPotassio.forneceCorrecaoPotassioUm().getDescricao_item());

        correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
        correcao = new ForneceCorrecao(261.32, Nutrientes.ENXOFRE);
        
        assertEquals(correcao.getValor(), correcaoPotassio.forneceCorrecaoPotassioUm().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoPotassio.forneceCorrecaoPotassioUm().getDescricao_item());
    }

    @Test
    public void testForneceCorrecaoPotassioDois() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
        ForneceCorrecao correcao = new ForneceCorrecao(213.80, Nutrientes.MAGNESIO);
        
        assertEquals(correcao.getValor(), correcaoPotassio.forneceCorrecaoPotassioDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoPotassio.forneceCorrecaoPotassioDois().getDescricao_item());
    }

    @Test
    public void testCustoAlqueirePotassio() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 5.35, 30.7);
        CorrecaoPotassio correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.CLORETO_POTASSIO, 2500.00);
        
        assertEquals(1126.37, correcaoPotassio.custoAlqueirePotassio(), 0.1);

        correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.SULFATO_POTASSIO, 2500.00);
        assertEquals(1256.33, correcaoPotassio.custoAlqueirePotassio(), 0.1);

        correcaoPotassio = new CorrecaoPotassio(3.0, ecc, FontesPotassio.SULFATO_POTASSIO_MAGNESIO, 2500.00);
        assertEquals(2969.51, correcaoPotassio.custoAlqueirePotassio(), 0.1);
    }

}
