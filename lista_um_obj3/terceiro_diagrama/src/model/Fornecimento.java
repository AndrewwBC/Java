package model;

import java.util.Date;
import java.util.List;

public class Fornecimento {

   private String data;
   private Double valorTotal;

   public Fornecimento(String data, Double valorTotal) {
      this.data = data;
      this.valorTotal = valorTotal;
   }

   public String getData() {
      return data;
   }

   public void setData(String data) {
      this.data = data;
   }

   public Double getValorTotal() {
      return valorTotal;
   }

   public void setValorTotal(Double valorTotal) {
      this.valorTotal = valorTotal;
   }

   @Override
   public String toString() {
      return "Fornecimento{" +
              "data='" + data + '\'' +
              ", valorTotal=" + valorTotal +
              '}';
   }
}
