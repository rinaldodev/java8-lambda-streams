package dev.rinaldo.test.lambda;

import dev.rinaldo.test.support.RinaldoDevTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * EXERCÍCIOS da aula de Streams - Parte 1: https://www.youtube.com/watch?v=bTlS_BdS41w&list=PLuYctAHjg89ZkhgOQo0zcTtmHY5nuRYud&index=3
 *
 *
 * ----------------------- SOBRE OS EXERCÍCIOS -----------------------
 * Estes exercícios foram elaborados por Rinaldo para o canal RinaldoDev no youtube: youtube.com/rinaldodev
 *
 * Este exercício foi feito gratuitamente e está disponível abertamente no GitHub.
 *
 * Se puder, peço que contribua se tornando membro do canal no YouTube. Você ainda ganha acesso a mais vídeos de
 * correções de exercícios e vários conteúdos exclusivos: https://www.youtube.com/rinaldodev/join
 * -------------------------------------------------------------------
 *
 *
 * ----------------------- COMO FAZER OS EXERCÍCIOS -----------------------
 * Os exercícios são testes usando JUnit onde você deve alterar a parte do código indicada para fazer o teste passar.
 *
 * Sempre que um comentário tiver "!!! INÍCIO DA SUA PARTE !!!", significa que você deverá alterar o teste a partir
 * daquele ponto para fazê-lo passar, e não poderá alterar nada mais depois de "!!! FIM DA SUA PARTE !!!".
 * Os comentários podem ainda conter instruções e regras adicionais.
 * Alterar o teste em qualquer outro ponto ou não seguir as regras descritas nos comentários é considerado trapaça.
 * ------------------------------------------------------------------------
 *
 *
 * ----------------------- SETUP/WHEN/THEN -----------------------
 * O teste usa o formato de testes setup/when/then.
 * "setup": é onde é feito a configuração inicial dos testes, instanciados os objetos que serão testados.
 * "validações do exercício": validações mínimas para garantir que o teste vai rodar.
 * "when": execução que será testada e irá alterar o estado de variáveis ou objetos.
 * "then": validações de que o estado esperado foi atingido.
 * ---------------------------------------------------------------
 *
 *
 * ----------------------- AINDA ESTOU COM DÚVIDAS! -----------------------
 * Assista ao vídeo com as explicações de cada exercício! Ele fica na mesma playlist dos demais!
 * Se quiser mais ajuda, entra no nosso grupo do WhatsApp que alguém pode te ajudar: https://rinaldo.dev/whatsapp
 * ------------------------------------------------------------------------
 *
 *
 * ----------------------- DEPOIS DE TERMINAR -----------------------
 * Ao terminar os testes, se você for um membro do canal, compartilha lá no nosso grupo do WhatsApp! https://rinaldo.dev/whatsapp
 * 
 * Ou então poste em qualquer rede social e me marque! Sou @RinaldoDev em todas elas!
 *
 * Twitter: https://twitter.com/rinaldodev
 * Instagram: https://www.instagram.com/rinaldodev/
 * LinkedIn: https://www.linkedin.com/in/rinaldodev/
 * Site: https://rinaldo.dev
 * GitHub: https://github.com/rinaldodev
 * Facebook: https://www.facebook.com/rinaldodev
 * Twitch: https://www.twitch.tv/rinaldodev
 * ------------------------------------------------------------------
 *
 */
public class Java8_Stream_1_Test extends RinaldoDevTest {

    /**
     * EXERCÍCIO 1 - SKIP
     */
    @Test
    public void test1() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números 4, 5 e 6 da lista.
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, skip e forEach.

        // ... seu código ...

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("456");
    }

    /**
     * EXERCÍCIO 2 - LIMIT
     */
    @Test
    public void test2() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números 1, 2 e 3 da lista.
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, limit e forEach.

        // ... seu código ...

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("123");
    }

    /**
     * EXERCÍCIO 3 - DISTINCT
     */
    @Test
    public void test3() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 1, 2, 3);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 1, 2, 3), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números 1, 2 e 3 da lista, mas apenas uma vez cada
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, distinct e forEach.

        // ... seu código ...

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("123");
    }

    /**
     * EXERCÍCIO 4 - FILTER
     */
    @Test
    public void test4() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números ímpares da lista
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, filter e forEach.

        // ... seu código ...    

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("1357");
    }

    /**
     * EXERCÍCIO 5 - MAP
     */
    @Test
    public void test5() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números da lista multiplicados por 3
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, map e forEach.

        // ... seu código ...     

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("369121518");
    }

    /**
     * EXERCÍCIO 6 - SKIP, LIMIT, MAP
     */
    @Test
    public void test6() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números 3 e 4 da lista, multiplicados por 2
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, skip, limit, map e forEach.

        // ... seu código ...  

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("68");
    }    

}
