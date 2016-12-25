package dominio;


public class AptoTipoB extends Apto {

  public AptoTipoB(int numero, int andar, float area) {
    super(numero, andar, area);
  }
  
  
  protected float precoExtra() {

    if (getAndar() == 1)
      return 200;
    else
      return 0;
  }
  
}
