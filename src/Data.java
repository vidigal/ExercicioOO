public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data(Integer dia, Integer mes, Integer ano) {
        if (this.isValida()) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    }

    private boolean isValida() {
        if (ano < 0 || ano > 9999) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
            return false;
        }

        if (mes < 1 || mes > 12) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
            return false;
        }

        // meses com 31 dias: 1, 3, 5, 7, 8, 10, 12
        // meses com 30 dias: 4, 6, 9, 11
        // Meses com 28 ou 29 dias: 2
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 1 || dia > 31) {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;
                return false;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9|| mes == 11) {
            if (dia < 1 || dia > 30) {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;
                return false;
            }
        }

        if (mes == 2) {
            if (dia < 1 || dia > 29) {
                this.dia = 1;
                this.mes = 1;
                this.ano = 1;
                return false;
            }
        }

        return true;
    }

}
