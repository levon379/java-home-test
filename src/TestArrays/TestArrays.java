package TestArrays;

public class TestArrays {
    public static void main(String[] args) {
      /*  int y = 0;
        int[] index  = new int[4];
        String[] islands = new String[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;
        islands[0] = "as";
        islands[1] = "s";
        islands[2] = "s";
        islands[3] = "a";
        int ref;
        while(y<4){
        ref = index[y];
            System.out.print("islands = ");
            System.out.println(islands[ref]);
            y++;
        }*/

        int[] arr1 = {1,1,2};
        int[] arr2 = {1,2,4};
        for(int i = 0;i<arr1.length;i++){
        for(int j =0;j<arr2.length;j++){
            if((arr1[i] == arr2[j]) && arr2[j]>0){
                arr2[j] = -1;

            }
        }
        }
        for(int x =0; x<arr2.length;x++) {
            if (arr2[x] > 0) {
                System.out.println(arr2[x] + "no");
            }


        }
    }
}
