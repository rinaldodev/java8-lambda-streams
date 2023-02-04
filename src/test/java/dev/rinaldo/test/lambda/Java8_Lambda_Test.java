package dev.rinaldo.test.lambda;

import dev.rinaldo.test.support.RinaldoDevTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

/**
 * EXERCÍCIOS da aula introdutória de Lambdas.
 *
 *
 * ----------------------- SOBRE OS EXERCÍCIOS -----------------------
 * Estes exercícios foram elaborados por Rinaldo para o canal RinaldoDev no youtube: youtube.com/@rinaldodev
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
 * Se quiser mais ajuda, coloca lá na nossa comunidade do Discord que eu ou alguém da comunidade pode tentar te ajudar!
 * https://rinaldo.dev/discord
 * ------------------------------------------------------------------------
 *
 *
 * ----------------------- DEPOIS DE TERMINAR -----------------------
 * Ao terminar os testes coloque lá na nossa comunidade do Discord! https://rinaldo.dev/discord
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
public class Java8_Lambda_Test extends RinaldoDevTest {

    /**
     * EXERCÍCIO 1 - FUNÇÃO LAMBDA
     */
    @Test
    public void test1() {
        // -- setup --
        final AtomicInteger soma = new AtomicInteger(0);

        final Thread minhaTreadTradicional = new Thread(new Runnable() {
            @Override
            public void run() {
                soma.incrementAndGet();
            }
        });

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) faça uma thread imitando o comportamento da thread acima
        // 2) use uma função lambda para representar o Runnable

        final Thread minhaTreadLambda = null; // ... seu código ao invés de 'null' ...

        // !!! FIM DA SUA PARTE !!!

        // -- validações do exercício --
        assertNotNull(soma, TESTE_QUEBRADO);
        assertNotNull(minhaTreadTradicional, TESTE_QUEBRADO);
        assertNotNull(minhaTreadLambda, "'minhaTreadLambda' não pode ser 'null', você deve implementá-la.");

        // -- when --
        minhaTreadTradicional.run();
        minhaTreadLambda.run();

        // -- then --
        assertEquals(2, soma.get(), "O valor final de 'soma' deve ser 2, pois deverá incrementado 2 vezes: primeiro pela thread 'minhaTreadTradicional' e depois pela 'minhaTreadLambda'.");
    }

    /**
     * EXERCÍCIO 2 - FOREACH
     */
    @Test
    public void test2() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --
        for (Integer integer : listaDeNumeros) {
            System.out.print(integer);
        }

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima os 5 números da lista no console, imitando o comportamento do 'for' acima
        // 2) imprima todos os números na mesma linha usando "System.out.print"
        // 3) utilize o método forEach da API de Streams
        // 4) passe uma função lambda como argumento para o método forEach

        // ... seu código ...

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("1234512345");
    }

    /**
     * EXERCÍCIO 3 - FILTER
     */
    @Test
    public void test3() {
        // -- setup --
        final List<Integer> listaDeNumeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        // -- validações do exercício --
        assertNotNull(listaDeNumeros, TESTE_QUEBRADO);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6), listaDeNumeros, TESTE_QUEBRADO);

        // -- when --

        // !!! INÍCIO DA SUA PARTE !!!

        // 1) imprima no console os números pares da lista
        // 2) imprima todos na mesma linha usando "System.out.print"
        // 3) use streams, filter e forEach.

        // ... seu código ...

        // !!! FIM DA SUA PARTE !!!

        // -- then --
        assertConsoleContains("246");
    }
}
