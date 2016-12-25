package dominio;


public abstract class Apto {
  
  
  private int numero;
  private int andar;
  private float area;
  private boolean alugado=false; 
  private Inquilino inquilino=null; 

  
  private static float reaisPorMetroQuadrado = 10;
  
 
  protected abstract float precoExtra();
 
  public static float getReaisPorMetroQuadrado () {
    return reaisPorMetroQuadrado;
  }
  
  public static void setReaisPorMetroQuadrado(float r) {
    if (r >=0 )
      reaisPorMetroQuadrado = r;
  }
  
  public Apto(int numero, int andar, float area) {
    this.numero = numero;
    this.andar = andar;
    this.area = area;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getAndar() {
    return andar;
  }

  public void setAndar(int andar) {
    this.andar = andar;
  }

  public float getArea() {
    return area;
  }

  public void setArea(float area) {
    this.area = area;
  }

  public boolean isAlugado() {
    return alugado;
  }

  public void setAlugado(boolean alugado) {
    this.alugado = alugado;
  }
  
  public Inquilino getInquilino() {
    return inquilino;
  }
  
  
  public void aluga(Inquilino i) {
    if (i != null) {
      this.inquilino = i;
      this.alugado = true;
    }
  }

  
  public float precoFinal() {
    return precoBase() + precoExtra();
  }

  
  private float precoBase() {
    return Apto.reaisPorMetroQuadrado * area;
  }

}//Fim classe Apto.
