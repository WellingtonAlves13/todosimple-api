package testeClasse;

public class Carro {
    String nome;
    String marca;
    int ano;
    int vel;

    void acelerar(int acelaracao){
        vel += acelaracao;
        System.out.println(vel);
    }
    void freiar(int reduzir){
        vel -= reduzir;
        System.out.println(vel);
    }
    void buzinar(){
        if (vel >= 60){
            System.out.println("bibibibi");
        }
    }
    void multa(){
        if (vel >= 80){
            System.out.println("Acima do limite multado ");
        }else{
            System.out.println("Dentro do limite");
        }
    }
}
