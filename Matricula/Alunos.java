package Matricula;
import java.util.ArrayList;
import java.util.Scanner;

public class Alunos {
    String nome;
    String matricula;
    ArrayList<Aluno> alunos = new ArrayList<>();

    public void realizarMatricula() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();
        

        System.out.println("Digite sua matrícula: ");
        matricula = scanner.nextLine();

        Aluno aluno = new Aluno(nome, matricula);
        alunos.add(aluno);

        System.out.println("Matrícula realizada com sucesso!");
        scanner.close();
    }

    public void listarAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula());
        }
    }

    public static void main(String[] args) {
        Alunos alunos = new Alunos();
        alunos.realizarMatricula();
        alunos.listarAlunos();

        Aluno[] vetorAlunos = alunos.alunos.toArray(new Aluno[alunos.alunos.size()]);

        // Exemplo de uso do vetor de objetos
        for (Aluno aluno : vetorAlunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getMatricula());
        }
    }
}

class Aluno {
    String nome;
    String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}



// static int age = 25;
// public static int args(){
//     return age+2;
// }
// public static void main(String[] args){
    
//     System.out.println("Olá mundo!" + "Minha idade é: " + age);
//     Hello ola = new Hello();
//     System.out.println("Depois de 2 anos terei " + ola.args());
// };