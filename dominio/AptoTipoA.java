package dominio;


public class AptoTipoA extends Apto{
  
  public AptoTipoA(int numero, int andar, float area) {
    super(numero, andar, area);
  }

  
  protected float precoExtra() {
   
    return 100 * getAndar();
  }
  
}