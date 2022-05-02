public class SkillsDemo1 {

    public static int getAverage(int[] data){
        //taking the average of a given set of data
        int sum = 0;
        for(int i = 0; i < data.length; i++) {
            sum = sum + data[i];
        }
        return sum/data.length; 
    }
}
