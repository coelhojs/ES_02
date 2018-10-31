package Questão_02;

public class Aplication {
    public static void main(String[] args) throws Exception {
        Arvore a = new Arvore();

        a.inserir(32);
        a.inserir(76);
        a.inserir(24);
        a.inserir(48);
        a.inserir(19);

        Arvore b = new Arvore();

        b.inserir(32);
        b.inserir(48);
        b.inserir(24);
        b.inserir(19);
        b.inserir(76);

        Arvore c = new Arvore();

        c.inserir(35);
        c.inserir(4);
        c.inserir(26);
        c.inserir(2);
        c.inserir(64);

        compararArvore(a, c);

        compararArvore(b, c);

        compararArvore(b, b);


    }

    public static void compararArvore(Arvore a, Arvore b){
        System.out.print(a.numComparador() + " " + b.numComparador() + "\n");
        if(a.numComparador() != b.numComparador())
            System.out.println("As árvores são diferentes");
        else
            System.out.print("As árvores são iguias");
    }
}
