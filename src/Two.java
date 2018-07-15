public class Two {
    public static void main(String[] args) {
        Two t = new Two();
        //System.out.println(t.convertToTwo(87));
//        System.out.println(t.convertToEight(132));
      //  System.out.println(t.convertToEight(8));
    }
    public String convertToTwo(int x) {
        int[] array = new int[10]; //1010111
        for(int i = 0; i < 9; i++){
            if(x % 2 == 0){
                array[i] = 2;
                x = (int) x / 2;
            } else {
                array[i] = 1;
                x = (int)  x / 2;
            }
            if(x < 1){
                array[i] = 1;
                break;
            }
        }
        String res = "";
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[i] == 0) {
                continue;
            }
            res += "" + array[i];
        }
        return res;
    }
    public String convertToEight(int x){
        int[] array = new int[10];
        for(int i = 0; i < 9; i++){
                array[i] = x % 8;
                x = (int) x / 8;
                if(x == 0){
                    break;
                }
        }
        String res = "";
        for(int i = 0; i < array.length; i++){
            res += "" + array[i];
        }
        return res;
    }

    public String convertToFor(int x){
        int[] array = new int[10];
        for(int i = 0; i < 9; i++){
                array[i] = x % 4;
                x = (int) x / 4;
                if(x == 0){
                    break;
                }
        }
        String res = "";
        for(int i = 0; i < array.length; i++){
            res += "" + array[i];
        }
        return res;
    }
}
