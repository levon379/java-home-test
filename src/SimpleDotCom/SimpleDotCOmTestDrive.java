package SimpleDotCom;

public class SimpleDotCOmTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {1,2,3};
        //dot.setLocationCells(locations);

        String userGuess  = "4";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        if(result.equals("hit")){
            testResult = "passed";
        }
        System.out.println(testResult);
    }
}
