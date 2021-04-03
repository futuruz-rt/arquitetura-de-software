
import com.lucasrocha.arquitetura.model.CorrecaoFosforo;
import com.lucasrocha.arquitetura.model.FontesFosforo;
import com.lucasrocha.arquitetura.model.EquilibrioCorrecaoCTC;
import com.lucasrocha.arquitetura.model.ForneceCorrecao;
import com.lucasrocha.arquitetura.model.Nutrientes;
import com.lucasrocha.arquitetura.model.TexturaSolo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CorrecaoFosforoTest {

    @Test
    public void testQuantidadeFosforoAplicacao() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, ecc);
        assertEquals(123.95, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, ecc);
        assertEquals(54.41, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, ecc);
        assertEquals(46.48, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, ecc);
        assertEquals(49.58, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.TERMOFOSTATO_YOORIN, 70, 1260, ecc);
        assertEquals(123.95, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, ecc);
        assertEquals(67.60, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, ecc);
        assertEquals(76.93, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, ecc);
        assertEquals(69.72, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_NAT_PATOS_MINAS, 70, 1260, ecc);
        assertEquals(92.96, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, ecc);
        assertEquals(120.60, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, ecc);
        assertEquals(42.90, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MULTIFOSFATO_MAGNESIANO, 70, 1260, ecc);
        assertEquals(123.95, correcaoFosforo.quantidadeFosforoAplicacao(), 0.1);
    }

    @Test
    public void testForneceCorrecaoFosforoUm() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, ecc);
        ForneceCorrecao correcao = new ForneceCorrecao(12.39, Nutrientes.ENXOFRE);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoUm().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoUm().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.TERMOFOSTATO_YOORIN, 70, 1260, ecc);
        correcao = new ForneceCorrecao(18.59, Nutrientes.MAGNESIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoUm().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoUm().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MULTIFOSFATO_MAGNESIANO, 70, 1260, ecc);
        correcao = new ForneceCorrecao(13.63, Nutrientes.ENXOFRE);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoUm().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoUm().getDescricao_item());
    }

    @Test
    public void testForneceCorrecaoFosforoDois() {
        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, ecc);
        ForneceCorrecao correcao = new ForneceCorrecao(34.70, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, ecc);
        correcao = new ForneceCorrecao(10.88, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, ecc);
        correcao = new ForneceCorrecao(4.18, Nutrientes.NITROGENIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, ecc);
        correcao = new ForneceCorrecao(7.93, Nutrientes.NITROGENIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.TERMOFOSTATO_YOORIN, 70, 1260, ecc);
        correcao = new ForneceCorrecao(34.70, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, ecc);
        correcao = new ForneceCorrecao(35.15, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, ecc);
        correcao = new ForneceCorrecao(40.00, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, ecc);
        correcao = new ForneceCorrecao(31.37, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_NAT_PATOS_MINAS, 70, 1260, ecc);
        correcao = new ForneceCorrecao(26.02, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, ecc);
        correcao = new ForneceCorrecao(53.06, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, ecc);
        correcao = new ForneceCorrecao(0.0, null);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MULTIFOSFATO_MAGNESIANO, 70, 1260, ecc);
        correcao = new ForneceCorrecao(22.31, Nutrientes.CALCIO);
        assertEquals(correcao.getValor(), correcaoFosforo.forneceCorrecaoFosforoDois().getValor(), 0.1);
        assertEquals(correcao.getDescricao_item(), correcaoFosforo.forneceCorrecaoFosforoDois().getDescricao_item());
    }

    @Test
    public void testeCustoAlqueire() {

        EquilibrioCorrecaoCTC ecc = new EquilibrioCorrecaoCTC(TexturaSolo.ARGILOSO, 8.59, 0.15, 5.76, 1.63, 3.67, 0.0, 0.0, 30.7);
        CorrecaoFosforo correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_SIMPLES, 70, 1260, ecc);
        assertEquals(156.17, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.SUPERFOSFATO_TRIPLO, 70, 1260, ecc);
        assertEquals(68.56, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MAP, 70, 1260, ecc);
        assertEquals(58.56, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.DAP, 70, 1260, ecc);
        assertEquals(62.46, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.TERMOFOSTATO_YOORIN, 70, 1260, ecc);
        assertEquals(156.17, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_ARAD, 70, 1260, ecc);
        assertEquals(85.18, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_GAFSA, 70, 1260, ecc);
        assertEquals(96.93, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_DAOUI, 70, 1260, ecc);
        assertEquals(87.84, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.FOSFATO_NAT_PATOS_MINAS, 70, 1260, ecc);
        assertEquals(117.12, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ESCORIA_THOMAS, 70, 1260, ecc);
        assertEquals(151.94, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.ACIDO_FOSFORICO, 70, 1260, ecc);
        assertEquals(54.05, correcaoFosforo.custoFosforoAlqueire(), 0.1);

        correcaoFosforo = new CorrecaoFosforo(12, FontesFosforo.MULTIFOSFATO_MAGNESIANO, 70, 1260, ecc);
        assertEquals(156.17, correcaoFosforo.custoFosforoAlqueire(), 0.1);
    }
}
