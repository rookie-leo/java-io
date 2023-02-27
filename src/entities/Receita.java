package entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public class Receita implements Serializable {
    private static final long serialVersionUID = 1L;

    private String descricao;
    private BigDecimal valor;
    private LocalDateTime dataEntrada = LocalDateTime.now();

    public Receita() {
    }

    public Receita(String descricao, BigDecimal valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setDataEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receita receita = (Receita) o;
        return descricao.equals(receita.descricao) && dataEntrada.equals(receita.dataEntrada);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao, dataEntrada);
    }

    @Override
    public String toString() {
        return "Receita{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", data=" + dataEntrada +
                '}';
    }
}
