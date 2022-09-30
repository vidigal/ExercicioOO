// Esta é minha classe principal
public class Joao {

    public static void main(String[] args) {

        Data d1 = new Data(25, 12, 128);

        Data d2 = new Data(25, 12, 128);


        if (d1.ano.equals(d2.ano)) {
            System.out.println("é igual");
        } else {
            System.out.println("NÃO É IGUAL");
        }

    }

}
