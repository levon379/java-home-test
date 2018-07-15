package garik_test;

public class Simetric {
    public static void main(String[] args) {

    String a = "31230013213";
    Simetric s = new Simetric();
    System.out.println(s.simetric(a));
    }
    public String simetric(String str){
        int l = str.length();
        Boolean t = true;
        for(int i = 0; i < l/2; i++){
            if(Character.getNumericValue(str.charAt(l - i -1)) == Character.getNumericValue(str.charAt(i ))){
                if(l/2 == i){break;}
            } else{
                t = false;
                break;
            }
        }
        if(t == false){
            return "No";
        } else {
            return "Yes";
        }

    }
}
