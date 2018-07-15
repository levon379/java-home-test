public class Edward {
   /* public  void FrySay(String name) {
        System.out.println(name + "     fraysay");
    }*/

 /*  private int hour;
   private int minute;
   private int second;

   public void setTime(int h, int m, int s){

       hour =  (h>0 && h<25)? h:0;
       minute =  (h>0 && h<60)? h:0;
       second =  (h>0 && h<60)? h:0;

   }
    public String toMilitary(){
        return String.format("%02d:%02d:%02d",hour,minute,second);                  37
    }

    public String toNormal(){
       return String.format("%d:%02d:%02d %s",(hour==12||hour == 0)?12:hour%12,minute,second,(hour<12?"AM":"PM"));
    }*/
 private int hour;
    private int minute;
    private int second;
    public Edward(){
        this(0,0,0);
    }
    public Edward(int h){
        this(h,0,0);
    }
    public Edward(int h,int m){
        this(h,m,0);
    }
    public Edward(int h,int m,int s){
       setDate(h,m,s);
    }
    public void setDate(int h,int m,int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        hour = (h>0 && h<25)?h:0;
    }
    public void setMinute(int h){
        minute = (h>0 && h<60)?h:0;
    }
    public void setSecond(int h){
        second = (h>0 && h<60)?h:0;
    }
    public int getHour(){
       return hour;
    }
    public int getMinute(){
       return minute;
    }
    public int getSecond(){
       return second;
    }


public String toDisplay(){
        return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
}




}