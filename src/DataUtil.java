public class DataUtil {

    public static Data strToDate(String dataStr) {
        String[] dataQuebrada = dataStr.split("/");

        Integer dia = Integer.valueOf(dataQuebrada[0]);
        Integer mes = Integer.valueOf(dataQuebrada[1]);
        Integer ano = Integer.valueOf(dataQuebrada[2]);

        return new Data(dia, mes, ano);
    }


}
