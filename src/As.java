public class As {
    public static void main(String[] args) {
      int x = 1;
      while(x<3){
          System.out.println("x < "+x);
          x++;
      }
      if(x==3){
          System.out.println("x = " +x);
      }

      String[] worldListOne = {"aa","vv","cc","dd"};
      int oneLength = worldListOne.length;

      int rand1 = (int) (Math.random()* oneLength);
        System.out.println(rand1);
      String phrase = worldListOne[rand1];
        System.out.println("What we need is "+phrase);
        int z = 0;
        int c = 0;
        while(z<5){
            c = z-c;
            System.out.println(z+"" + c+"");
            z = z+1;
        }
    }
}
