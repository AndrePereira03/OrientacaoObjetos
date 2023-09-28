/*package Lista01.Exercicio07;
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Livro extends MaterialBiblioteca
{
    public static long calcularDiasDeAtraso(Date dataRetirada, Date dataDevolucao) {
        String dataRetiradaStr = "15/09/2023"; // Substitua pela data real

        // Formato da data (no exemplo, está no formato "yyyy-MM-dd")
        SimpleDateFormat formatoData = new SimpleDateFormat("dd-MM-yyyy");


        // Crie um objeto Calendar para manipular datas
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataRetirada);

        // Adicione 15 dias à data de retirada
        calendar.add(Calendar.DAY_OF_MONTH, 15);
        Date dataLimite = calendar.getTime();

        // Calcula o número de milissegundos de atraso
        long diferencaEmMilissegundos = dataDevolucao.getTime() - dataLimite.getTime();

        // Calcula o número de dias de atraso
        long diasDeAtraso = diferencaEmMilissegundos / (24 * 60 * 60 * 1000);

        return diasDeAtraso;
}*/
