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

}