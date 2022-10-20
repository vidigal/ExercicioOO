public class Data {

    public Integer dia;
    private Integer mes;
    public Integer ano;

    public static String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (!this.isValida()) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    public Integer getDia() {
        return this.dia;
    }

    public Integer getMes() {
        return this.mes;
    }

    private boolean isValida() {
        return  (this.isAnoValido() && this.isMesValido() && this.isDiaValido());
    }

    private boolean isAnoValido() {
        if (ano < 0 || ano > 9999) {
            return false;
        }
        return true;
    }

    private boolean isMesValido() {
        if (mes < 1 || mes > 12) {
            return false;
        }
        return true;
    }

    private boolean isDiaValido() {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 1 || dia > 31) {
                return false;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9|| mes == 11) {
            if (dia < 1 || dia > 30) {
                return false;
            }
        }

        if (mes == 2) {
            if (dia < 1 || dia > 29) {
                return false;
            }
        }
        return true;
    }

    public int compara(Data x) {
        if (this.dia.equals(x.dia) && this.mes.equals(x.mes) && this.ano.equals(x.ano)) {
            return 0;
        }

        if (this.ano > x.ano) {
            return 1;
        } else {
            if (this.ano < x.ano) {
                return -1;
            }
        }

        // Ex.: 01/05/2022  -> 08/05/2022
        if (this.ano.equals(x.ano) && this.mes.equals(x.mes)) {
            if (this.dia > x.dia) {
                return 1;
            } else {
                if (this.dia < x.dia) {
                    return -1;
                }
            }
        }

        // Ex.: 01/06/2022  -> 08/05/2022
        if (this.ano.equals(x.ano)) {
            if (this.mes > x.mes) {
                return 1;
            } else {
                return -1;
            }
        }

        return -2;
    }

    public String getMesExtenso() {
        return Data.nomesMeses[this.mes-1];
    }

//    public String getMesExtenso() {
//        if (this.mes.equals(1)) {
//            return "Janeiro";
//        } else if (this.mes.equals(2)) {
//            return "Fevereiro";
//        } else if (this.mes.equals(3)) {
//            return "Março";
//        } else if (this.mes.equals(4)) {
//            return "Abril";
//        } else if (this.mes.equals(5)) {
//            return "Maio";
//        } else if (this.mes.equals(6)) {
//            return "Junho";
//        } else if (this.mes.equals(7)) {
//            return "Julho";
//        } else if (this.mes.equals(8)) {
//            return "Agosto";
//        } else if (this.mes.equals(9)) {
//            return "Setembro";
//        } else if (this.mes.equals(10)) {
//            return "Outubro";
//        } else if (this.mes.equals(11)) {
//            return "Novembro";
//        } else if (this.mes.equals(12)) {
//            return "Dezembro";
//        }
//
//        return null;
//    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

    public boolean isBissexto() {
        //Caso 1) É um número divisível por 4, mas não é divisível por 100.
        //Caso 2) É um número divisível por 4, por 100 e por 400.
        if ((this.ano % 4 == 0) && (this.ano % 100 != 0)) {
            return true;
        }

        if ((this.ano % 4 ==0) && (this.ano % 100 == 0) && (this.ano % 400 == 0)) {
            return true;
        }

        return false;
    }

}
