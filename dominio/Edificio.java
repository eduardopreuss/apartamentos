package dominio;

import java.util.ArrayList;
import java.util.List;


public class Edificio {

  private String nome;
  
  private List<Apto> aptos;
  
  public Edificio(String nome) {
    this.nome = nome;
    aptos = new ArrayList<Apto>();
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  
  public void adicionaApartamento(Apto a) {
    aptos.add(a);
  }
  
  
  public List<Apto> getApartamentosAlugados(){
    List<Apto> lista = new ArrayList<Apto>();
    for (Apto a: aptos) {
      if (a.isAlugado()){
        lista.add(a);
      }
    }
    return lista;
  }
  
}