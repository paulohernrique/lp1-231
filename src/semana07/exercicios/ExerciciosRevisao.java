package semana07.exercicios;


public class ExerciciosRevisao {

    public static double somarTresnumeros(double n1, double n2, double n3){
        return n1+n2+n3;

    }

    public static double calcularMediaAritmetica(double n1, double n2, double n3) {
        return (n1+n2+n3)/3;
        
    }

    public static int PegarMaiorvalor(int n1, int n2, int n3) {
        int maiorEntren2n3 = Math.max(n2, n3);
        return Math.max(maiorEntren2n3, n1);
    }

    public static int PegarMenorvalor(int n1, int n2, int n3) {
        int menorEntren2n3 = Math.min(n2, n3);
        return Math.min(menorEntren2n3, n1);
    }

    public static double[] PegarArray(double n1, double n2, double n3) {
        double[] array ={n1, n2, n3};
        return array;
    }

    public static double somarValores(double[] numero) {
        double soma = 0;
        for (int i = 0; i < numero.length; i++) {
            soma += numero[i];
        }
        return soma;
        
    }

    public static double calcularMediaValores(double[] numero) {
        return somarValores(numero)/numero.length;
        
    }

    public static double pegarMenorValorArray(double[] numero) {
        double menor = numero[0];
        for (int i = 1; i < numero.length; i++) {
            menor = Math.min(menor, numero[i]);
        }
        return menor;
    }

    public static double pegarMaiorValorArray(double[] numero) {
        double maior = numero[0];
        for (int i = 1; i < numero.length; i++) {
            maior = Math.max(maior, numero[i]);
        }
        return maior;
    }

    public static int[] retornarValoresDeDoisArrays(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length + array2.length];
        int indice = 0;
        for (int valor : array1) {
            resultado[indice] = valor;
            indice++;
        }
        for (int valor : array2) {
            resultado[indice] = valor;
            indice++;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        double n1= 2.5;
        double n2= 5.5;
        double n3= 8.5;
        int nm1 = 3;
        int nm2 = 8;
        int nm3 = 12;
        double[] numeros = {4.5, 8.5, 6.5};
        int[] nms1 = {4, 8, 9};
        int[] nms2 = {2, 6, 10};

        System.out.println(somarTresnumeros(n1, n2, n3));
        System.out.println(calcularMediaAritmetica(n1, n2, n3));
        System.out.println(PegarMaiorvalor(nm1, nm2, nm3));
        System.out.println(PegarMenorvalor(nm1, nm2, nm3));
        System.out.println(PegarArray(n1, n2, n3));
        System.out.println(somarValores(numeros));
        System.out.println(calcularMediaValores(numeros));
        System.out.println(pegarMaiorValorArray(numeros));
        System.out.println(pegarMenorValorArray(numeros));
        System.out.println(retornarValoresDeDoisArrays(nms1, nms2));

    }
}