package clone;

public class Clone implements Cloneable{
    String t;

    public Clone(String t){
        this.t = t;
    }
    public void setText(String t){
        this.t = t;
    }
    public String getText (){
        return t;
    }
    public Clone clone() throws CloneNotSupportedException{
        return (Clone) super.clone();
    }
}
