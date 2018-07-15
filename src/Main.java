public class Main {
    public static void main(String[] args) {

   Cheloveki[] persone = new Cheloveki[2];

   Man m = new Man();
   Women w = new Women();

   persone[0] =m;
   persone[1] =w;
   for(Cheloveki i:persone){
    i.chel();
   }








    }
}
