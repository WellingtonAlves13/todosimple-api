package testeClasse;

public class CarroTestar {

    public static void main(String[] args) {
        Carro carroTesta = new Carro();

        carroTesta.marca = "Fiat";
        carroTesta.ano = 2020;
        carroTesta.nome = "Toro";
        carroTesta.vel = 100;

        System.out.println(carroTesta.marca);
        System.out.println(carroTesta.ano);
        System.out.println(carroTesta.nome);

        carroTesta.acelerar(50);
        carroTesta.freiar(30);
        carroTesta.buzinar();
        carroTesta.multa();




    }

}
