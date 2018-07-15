public class Wspisok {
  Women[] spisok = new Women[5];
  int i = 0;
  public void add(Women w){
  if(i<spisok.length){
      spisok[i] = w;
      System.out.println("added element by key "+i);
      i++;
    }
  }
}
