import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    // Vamos criar um Construtor para construir com o limite, informase sempre o limite
    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    // Vamos criar um método booleano, para informar o lançamento da compra, irá retornar um verdadeiro ou falso

    public boolean lancaCompra(Compra compra){
        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            // precisamos adicionar na lista de compras:
            this.compras.add(compra);
            return true;
        }
            return false;

    }


    // Nenhuma classe externa irá mexer no limite, portanto teremos apenas getters

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }





}
