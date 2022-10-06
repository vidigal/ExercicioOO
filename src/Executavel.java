// Esta é minha classe principal
public class Executavel {

    public static void main(String[] args) {

        Data d1 = new Data(27, 12, 128);

        Data d2 = new Data(26, 12, 128);


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
