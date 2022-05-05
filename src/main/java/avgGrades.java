public class avgGrades {
    public String avarageGrads (int [] grads ) {
        if (grads.length <= 0)
            return "No Grades";
        for ( int i = 0; i < grads.length; i++) {
            if(grads[i] < 0  || grads[i] > 100 ) return "Not a valid grade";
        }

        float avg =  this.sum(grads)/(grads.length);
        if(avg >= 90) return "Excellent";
        else if(avg < 90 && avg >= 70) return "Very good";
        else if(avg < 70 && avg >= 60) return "Fair";
        else return "you fail";
    }
        private float sum(int [] arr)
    {
        float sum = 0; // initialize sum
        int i;

        // Iterate through all elements and add them to sum
        for ( i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
