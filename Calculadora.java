
package com.mycompany.calculadora;

import java.util.Scanner;

class Calculadora {
    //método para adição
    public static double adicao(double n1, double n2) {
        return n1 + n2;
    }
    
    //Método para subtração
    public static double subtracao(double n1, double n2){
        return n1 - n2;
    }
    
    //Método para subtração
    public static double multiplicacao(double n1, double n2){
        return n1 * n2;
    }
    
    //Método para divisão
    public static double divisao(double n1, double n2){
        if (n2 == 0){
            System.out.println("Impossível realizar uma divisão por zero");
        } else 
            return n1 / n2;
        return 0;
        
    
    }
    //Método para potência
    public static double potencia(double n1, double n2){
        return Math.pow(n1, n2);
    }
    
    //Método para raiz quadrada
    public static double raizQuadrada(double n){
        if (n < 0){
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN; //Retornando NaN (not a number)
        } else {
            return Math.sqrt(n);
        }
    }
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        char op;
        
        do {
            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potência");
            System.out.println("6. Raiz Quadrada");
            System.out.println("Q. Sair");
            
            op = scanner.next(). charAt(0);
            
            if (op != 'Q') {
            System.out.println("Digite o primeiro número:");
            double n1 = scanner.nextDouble();
            
            if (op != '6'){
                System.out.println("Digite o segundo número:");
                double n2 = scanner.nextDouble();
                
                switch (op) {
                    case '1':
                        System.out.println("Resultado: " + adicao(n1, n2));
                        break;
                    case '2':
                        System.out.println("Resultado: " + subtracao(n1, n2));
                        break;
                    case '3':
                        System.out.println("Resultado: " + multiplicacao(n1, n2));
                        break;
                    case '4':
                        System.out.println("Resultado: " + divisao(n1, n2));
                        break;
                        case '5':
                            System.out.println("Resultado: " + potencia(n1, n2));
                            break;
                            
                }        
                }else {
                        System.out.println("Resultado: " + raizQuadrada(n1));
                        }
                
                }
            } while (op != 'Q');
        
        scanner.close();
        }
        
}

