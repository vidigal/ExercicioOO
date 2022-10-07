// Esta é minha classe principal
public class Executavel {

    public static void main(String[] args) {

        Data d1 = new Data(27, 12, 128);

        Data d2 = new Data(26, 7, 128);

        Data d3 = d1.clone();



        System.out.println("O dia da data d1 é: " + d1.getDia());
        System.out.println("O mês por extenso de d2 é: " + d2.getMesExtenso());

        if (d1.compara(d2) == 0) {
            System.out.println("As datas são iguais.");
        } else {
            if (d1.compara(d2) == 1) {
                System.out.println("D1 é maior que D2");
            } else {
                if (d1.compara(d2) == -1) {
                    System.out.println("D2 é maior que D1");
                }
            }

        }


    }

}
