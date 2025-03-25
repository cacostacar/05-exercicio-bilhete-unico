import java.util.Random;

public class Bilhete {
    static final double tarifaBase = 5.20;
    long numero;
    double saldo;
    Usuario usuario;


    public Bilhete(Usuario usuario) {
        Random rd = new Random();
        this.numero = rd.nextInt(1000, 10000);
        this.usuario = usuario;
    }

    //Método para carregar o bilhete
    public double carregarBilhete(double valor) {
        saldo += valor;
        return saldo;
    }

    //Método para  consultar o saldo do bilhete
    public double consultarSaldo() {
        return saldo;
    }


    //Método para simular a passagem na catraca
    public String passarNaCatraca() {
        double debito = tarifaBase / 2;
        if (usuario.perfil.equalsIgnoreCase("comum")) {
            debito = tarifaBase;
        }
        if (saldo >= debito) {
            saldo -= debito;
            return "Passagem Liberada";
        }
        return "Saldo Insuficiente";
    }//public string
}
