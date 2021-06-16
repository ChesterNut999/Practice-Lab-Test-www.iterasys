//1 - Pacote
package cursoIntroJava;

//2 - Referências as Bibliotecas/
import java.util.Scanner;

//3 - Classe (Programação)
public class Medidas {
    //3.1 - Atributos da classe Medidas (caracteristicas da classe)


    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //CHAMADAS DE MÉTODOS
    public static void main(String[] args) {
        condicionalIf();
        condicionalSwitch();
        capturaDeDadosScannerJava();
        repeticaoFor();

        //Método calculá comprimento
        System.out.println("O comprimento do circulo é de "+ calcularComprimentoCirculo());

    }

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //ESTRUTURAS BÁSICAS DE PROGRAMAÇÃO
    public static void condicionalIf(){
        //Condicionais = Validar uma condição se verdadeira/falso | igual/diferente/maior/menor
        //if = se | else = senão

        String modo = "curto";
        if (modo.equals("curto")) {
            calcularAreaCurto();
        } else {
            calcularAreaExtenso();
        }

    }

    public static void condicionalSwitch(){
        //Switch = Selecionar o comportamento do programa conforme a escolha do usuário ou do software
        String opcao = "if";

        switch (opcao) {
            default -> System.out.println("Método em execução: N/D");
            case "if" -> {
                System.out.println("Método em execução: condicionalIf()");
                condicionalIf();
            }
            case "metodo calcular área modo curto" -> {
                System.out.println("Método em execução: calcularAreaCurto");
                calcularAreaCurto();
            }
            case "metodo calcular área modo extenso" -> {
                System.out.println("Método em execução: calcularAreaCurto");
                calcularAreaExtenso();
            }
        }
    }

    public static void capturaDeDadosScannerJava(){
        //Utilizar a classe Java Utils

        Scanner scanner = new Scanner(System.in);
        System.out.println("D I G I T E  |  A  O P Ç Ã O  |  D E S E J A D A");
        System.out.println("");

        System.out.println("* A - Método calcularAreaCurto");
        System.out.println("* B - Método calcularAreaExtenso");
        System.out.println("* Nenhum método - Pressione quaisquer outras letras");
        System.out.println("");

        System.out.println("Digite a opção escolhida: ");
        String opcao = scanner.next().toUpperCase();
        System.out.println("");

        switch (opcao) {
            case "A" -> {
                System.out.println("Método em execução: calcularAreaCurto");
                System.out.println("");
                calcularAreaCurto();
            }
            case "B" -> {
                System.out.println("Método em execução: calcularAreaCurto");
                System.out.println("");
                calcularAreaExtenso();
            }
            default -> {
                System.out.println("Método em execução: N/D");
                System.out.println("");
            }
        }
    }

    public static void repeticaoFor(){
        //Loops/ repetições sob demanda do usuário
        System.out.print("Contagem crescente: ");
        for(int num1 = 0; num1 <= 10; num1++){
            System.out.print(num1 + " | ");
        }

        System.out.println("");

        System.out.print("Contagem descrescente: ");
        for(int num0 = 10; num0 > -1; num0--) {
            System.out.print(num0 + " | ");
        }

        System.out.println("");

        System.out.print("Contagem decrescente n° pares: ");
        for(int num0 = 10; num0 >= -1; num0-= 2) {
            System.out.print(num0 + " | ");
        }

        System.out.println("");

        System.out.print("Contagem crescente n° impares: ");
        for(int num0 = 1; num0 <= 10; num0+= 2) {
            System.out.print(num0 + " | ");
        }

    }

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    //3.2 - Métodos e funções (Como a classe executa ações)
    //MÉTODOS EXEMPLOS/TESTES
    public static void calcularAreaCurto() {
        //Calculo da área - Exemplo: o tamanho do tapete ou do piso
        int largura = 4;
        int comprimento = 5;

        System.out.println("Para L " + largura + "m | Para C " + comprimento + "m | A é " + (largura*comprimento) + "m².");
        System.out.println("");
    }

    public static void calcularAreaExtenso() {
        //Calculo da área - Exemplo: o tamanho do tapete ou do piso
        int largura = 4;
        int comprimento = 5;
        int resultado = largura * comprimento;

        System.out.println("Para largura de " + largura + "m e comprimento de " + comprimento + "m, a área é de " + resultado + "m².");
        System.out.println("");
    }

    public static Double calcularComprimentoCirculo(){
        Double pi = 3.14;
        Integer raio = 8;
        Double comprimento = 2*pi*raio;

        return comprimento;
    }

}