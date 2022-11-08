import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovelTest {

    @Test
    void deveRetornarPrecoCarro() {
        Automovel automovel = new Carro(1000.0f);

        assertEquals(1000.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoCarroComPintura() {
        Automovel automovel = new Pintura(new Carro(1000.0f));

        assertEquals(1150.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoComDirecao() {
        Automovel automovel = new Direcao(new Carro(1000.0f));

        assertEquals(1300.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoComAerofolio() {
        Automovel automovel = new Aerofolio(new Carro(1000.0f));

        assertEquals(1500.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoComPinturaMaisDirecao() {
        Automovel automovel = new Direcao(new Pintura(new Carro(1000.0f)));

        assertEquals(1450.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoComPinturaMaisAerofolio() {
        Automovel automovel = new Aerofolio(new Pintura(new Carro(1000.0f)));

        assertEquals(1650.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoComDirecaoMaisAerofolio() {
        Automovel automovel = new Aerofolio(new Direcao(new Carro(1000.0f)));

        assertEquals(1800.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarPrecoComPinturaMaisDirecaoMaisAerofolio() {
        Automovel automovel = new Aerofolio(new Direcao(new Pintura(new Carro(1000.0f))));

        assertEquals(1950.0f, automovel.getPreco());
    }

    @Test
    void deveRetornarEstruturaCarro() {
        Automovel automovel = new Carro();

        assertEquals("Carro", automovel.getInfo());
    }

    @Test
    void deveRetornarEstruturaCarroComDirecao() {
        Automovel automovel = new Direcao(new Carro());

        assertEquals("Carro/Direção", automovel.getInfo());
    }

    @Test
    void deveRetornarEstruturaCarroComPintura() {
        Automovel automovel = new Pintura(new Carro());

        assertEquals("Carro/Pintura", automovel.getInfo());
    }

    @Test
    void deveRetornarEstruturaCarroComAerofolio() {
        Automovel automovel = new Aerofolio(new Carro());

        assertEquals("Carro/Aerofólio", automovel.getInfo());
    }

    @Test
    void deveRetornarEstruturaCarroComDirecaoMaisPintura() {
        Automovel automovel = new Pintura(new Direcao (new Carro()));

        assertEquals("Carro/Direção/Pintura", automovel.getInfo());
    }

    @Test
    void deveRetornarEstruturaCarroComDirecaoMaisAerofolio() {
        Automovel automovel = new Aerofolio(new Direcao (new Carro()));

        assertEquals("Carro/Direção/Aerofólio", automovel.getInfo());
    }

    @Test
    void deveRetornarEstruturaCarroComPinturaMaisAerofolio() {
        Automovel automovel = new Aerofolio(new Pintura (new Carro()));

        assertEquals("Carro/Pintura/Aerofólio", automovel.getInfo());
    }

    @Test
    void deveRetornarEstruturaCarroComDirecaoMaisPinturaMaisAerofolio() {
        Automovel automovel = new Aerofolio (new Pintura(new Direcao (new Carro())));

        assertEquals("Carro/Direção/Pintura/Aerofólio", automovel.getInfo());
    }

}