public class MultiFor {
    public static void main(String[] args) {
       int val;
       val = 15%10;
        System.out.println(val);
        for(int i = 0;i<4;i++){
            for(int y =4;y>2;y--){
                    System.out.println(i + "" +y);
                if(i == 1){
                i++;
                }
            }

        }
    }
}
