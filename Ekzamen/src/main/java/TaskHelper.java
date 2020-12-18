public class TaskHelper {
    public Integer getSumProgression(int a1, int n) {
        int sum = 0;
        int aN = 0;
        for (int i = a1; i < n; i++) {
            aN+=i;
        }
        //due to formula
        sum = n* (a1 + aN) / 2 ;
        return sum;
    }
}

