package exception;

public class ExTestDrive {
    public static void main(String[] args) {
        //String test = args[0];
        String test = "no";
        try{
            doRisky(test);
            System.out.print("thro");
        }
        catch(MyEx e){
            System.out.print("tha");
        }
        catch(ScaryException e){
            System.out.print("scary");
        }
        finally {
            System.out.println("ws");
        }

    }
    static void doRisky(String t) throws MyEx,ScaryException{

        if("yes".equals(t)){
            throw new MyEx();
        }
        if("no".equals(t)){
            throw new ScaryException("aa");
        }
    }
}
