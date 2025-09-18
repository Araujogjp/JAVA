import java.util.ArrayList;

import java.util.Arrays;



class Aluno {

    private String nome;

    private ArrayList<Double> notas;



    // Construtor

    public Aluno(String nome, Double... notas) {

        this.nome = nome;

        this.notas = new ArrayList<>(Arrays.asList(notas));

    }



    // Calcular média

    public double calcularMedia() {

        double soma = 0;

        for (double n : notas) {

            soma += n;

        }

        return soma / notas.size();

    }



    // Verificar aprovação

    public boolean estaAprovado() {

        return calcularMedia() >= 7.0;

    }



    // Exibir informações do aluno

    public void exibirResultado() {

        double media = calcularMedia();

        System.out.println("Aluno: " + nome);

        System.out.println("Notas: " + notas);

        System.out.println("Média: " + media);

        if (estaAprovado()) {

            System.out.println("Status: Aprovado");

        } else {

            System.out.println("Status: Reprovado");

        }

    }

}



public class Main {

    public static void main(String[] args) {

        // Criando 3 alunos

        Aluno a1 = new Aluno("João", 8.0, 7.5, 9.0);

        Aluno a2 = new Aluno("Maria", 6.0, 5.5, 7.0);

        Aluno a3 = new Aluno("Mariana", 9.0, 8.5, 10.0);



        // Exibindo resultados

        a1.exibirResultado();

        a2.exibirResultado();

        a3.exibirResultado();

    }

}

