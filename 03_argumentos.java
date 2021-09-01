/*Crie um arquivo chamado AlunoResetComParametro.java
Implemente um programa que imprima na tela o texto “Sou aluno do Level 1 do CWI Reset! Me chamo {SEU NOME}”
Compile e execute o programa*/

class AlunoResetComParametro {

    public static void main(String[] args) {
        System.out.println("Sou aluno do Level 1 do CWI Reset! Me chamo "+ args[0]);
    }

}

//salvar como AlunoReset.java

//compilar
cd //colar o diretorio onde salvou o arquivo
javac AlunoResetComParametro.java //vai gerar o .class na pasta

//executar
java AlunoResetComParametro Aline //escrever nome

//resultado output na tela
Sou aluno do Level 1 do CWI Reset! Me chamo Aline
