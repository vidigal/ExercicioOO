public class Data {

    public Integer dia;
    private int mes;
    public Integer ano;

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
        if (this.dia == x.dia && this.mes == x.mes && this.ano == x.ano) {
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
        if (this.ano == x.ano && this.mes == x.mes) {
            if (this.dia > x.dia) {
                return 1;
            } else {
                if (this.dia < x.dia) {
                    return -1;
                }
            }
        }

        // Ex.: 01/06/2022  -> 08/05/2022
        if (this.ano == x.ano) {
            if (this.mes > x.mes) {
                return 1;
            } else {
                return -1;
            }
        }

        return -2;

    }

}
