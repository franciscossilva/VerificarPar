package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TesteVerificaPar {

    @Test
    public void VerificarNumeroPar() {
        // Arrange (preparação)
        VerificaPar verificaPar = new VerificaPar();
        int numeroPar = 6;

        // Act (ação)
        boolean resultado = verificaPar.Par(numeroPar);

        // Assert (verificação)
        assertTrue(resultado, "O número não é  par.");
    }

    @Test
    public void VerificarNumeroNaoPar() {
        // Arrange (preparação)
        VerificaPar verificaPar = new VerificaPar();
        int numeroImpar = 7;

        // Act (ação)
        boolean resultado = verificaPar.Par(numeroImpar);

        // Assert (verificação)
        assertFalse(resultado, "O número não é  par.");
    }
}
