public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    // Vamos criar um construtor, e teremos que sempre informar o que iremos comprar e o valor:


    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    // Para a compra, vamos também fazer apenas getters, porque não teremos nenhuma outra classe externa
    // que irá modificar esses valores:


    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    // Vamos usar a BOA PRÁTICA de criar o método toString, para ele já gerar um determinado valor:


    @Override
    public String toString() {
        return "Compra: descrição = " + descricao +
                " valor = " + valor;
        }


    @Override
    public int compareTo(Compra outraCompra) {
        // vamos ordenar pelo valor, vamos usar a classe usando valueOf:
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
