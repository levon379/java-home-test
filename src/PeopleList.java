public class PeopleList {
    private Cheloveki[] spisok = new Cheloveki[5];
    private int i = 0;

    public void add(Cheloveki ppl){
        if(i<spisok.length){
            spisok[i] = ppl;
            System.out.println("dobavlen chelovek pod nomerov "+i);
            i++;
        }
    }
}
