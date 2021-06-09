//1 - Pacote
package cursoIntroJava;

//2 - Referências as Bibliotecas


//3 - Classe (Programação)
public class Medidas {
    //3.1 - Atributos da classe Medidas (caracteristicas da classe)

    //3.2 - Métodos e funções (Como a classe executa ações)
    public static void main(String[] args){
        calcularArea();
    }

    public static void calcularArea (){
        System.out.println("Olá Caralhoooo!");

        //Calculo da área - Exemplo: o tamanho do tapete ou do piso
        int largura = 4;
        int comprimento = 5;
        int resultado = largura*comprimento;

        System.out.println("Para largura de " + largura +"m e comprimento de " + comprimento +"m, a área é de " + resultado +"m².");
    }

}
