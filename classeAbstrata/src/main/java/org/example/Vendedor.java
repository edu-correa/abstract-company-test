package org.example;

public class Vendedor extends Funcionario{
    private Double taxa;
    private Double vendas;

    public Vendedor(String cpf, String nome, Double taxa, Double vendas) {
        super(cpf, nome);
        this.taxa = taxa;
        this.vendas = vendas;
    }

    @Override
    public Double calcSalario() {
        return (taxa * 0.01) * vendas;
    }

    @Override
    public String toString() {
        return super.toString() + "Vendedor{" +
                "taxa=" + taxa +
                ", vendas=" + vendas +
                '}' + "Salario: " + calcSalario();
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }
}
