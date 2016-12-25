package testes;

import java.util.List;

import dominio.Apto;
import dominio.AptoTipoA;
import dominio.AptoTipoB;
import dominio.Edificio;
import dominio.Inquilino;

public class TesteAlugueis {

  public static void main(String[] args) {
    
    
    
    Edificio edPortaldoSol = new Edificio("Portal do Sol");
    Edificio edEstelar = new Edificio("Estelar");
    
    Apto a101 = new AptoTipoA(101, 1, 50);
    edPortaldoSol.adicionaApartamento(a101);
    Apto a102 = new AptoTipoB(102, 1, 80);
    edPortaldoSol.adicionaApartamento(a102);
    Apto a201 = new AptoTipoA(201, 2, 60);
    edPortaldoSol.adicionaApartamento(a201);
    Apto a202 = new AptoTipoB(202, 2, 90);
    edPortaldoSol.adicionaApartamento(a202);
    Apto a301 = new AptoTipoA(301, 3, 70);
    edPortaldoSol.adicionaApartamento(a301);
    Apto a302 = new AptoTipoB(302, 3, 100);
    edPortaldoSol.adicionaApartamento(a302);

    Apto a1001 = new AptoTipoA(1001, 1, 50);
    edEstelar.adicionaApartamento(a1001);
    Apto a1002 = new AptoTipoA(1002, 1, 50);
    edEstelar.adicionaApartamento(a1002);
    Apto a1003 = new AptoTipoA(1003, 1, 50);
    edEstelar.adicionaApartamento(a1003);
    
   
    
    Inquilino joao = new Inquilino("Joao");
    Inquilino maria = new Inquilino("Maria");
    
    a101.aluga(joao);
    a302.aluga(maria);
    a1002.aluga(maria);

    
    List<Apto> alugados;
    
    alugados = edPortaldoSol.getApartamentosAlugados();
    for (Apto a: alugados) {
      System.out.println(edPortaldoSol.getNome() + "," + a.getNumero() + "," + a.getInquilino().getNome() + "," + a.precoFinal());
    }

    alugados = edEstelar.getApartamentosAlugados();
    for (Apto a: alugados) {
      System.out.println(edEstelar.getNome() + "," + a.getNumero() + "," + a.getInquilino().getNome() + "," + a.precoFinal());
    }
    
  }

}
