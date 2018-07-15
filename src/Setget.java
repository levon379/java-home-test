public class Setget
{
    private String moviename;
    public Setget(String name){
        moviename = name;
    }
   /* public void setName(String name){   poxarinvela constructorv
        moviename = name;
    }*/
    public String getName(){
        return moviename;
    }
    public void output(){
        System.out.printf("you favorite movie - %s",getName());
    }
}
