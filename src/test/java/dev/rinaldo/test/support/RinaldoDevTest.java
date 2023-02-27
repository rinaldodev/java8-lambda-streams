package dev.rinaldo.test.support;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RinaldoDevTest {
    public static final String TESTE_QUEBRADO = "Você mexeu em algo que não deveria, volte o código do teste ao estado original.";
    public static final PrintStream CONSOLE_ORIGINAL = System.out;
    public static final ByteArrayOutputStream CONSOLE = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        CONSOLE.reset();
        System.setOut(new PrintStream(CONSOLE));
    }

    @AfterEach
    public void teardown() {
        CONSOLE.reset();
        System.setOut(CONSOLE_ORIGINAL);
    }

    public static final void assertConsoleContains(CharSequence texto) {
        String s = CONSOLE.toString();
        assertTrue(s.contains(texto), "Não foi impresso no console o texto esperado.\n\nDeveria ser: \n------\n" + texto + "\n------\n\nMas o console tinha: \n------\n" + s + "\n------\n\n");
    }
}
