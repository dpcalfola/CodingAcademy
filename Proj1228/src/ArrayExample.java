public class ArrayExample {
    public static void main(String[] args) {

        int[] scores = {83, 90, 87};

        System.out.println("scores[0] : " + scores[0]);
        System.out.println("scores[0] : " + scores[1]);
        System.out.println("scores[0] : " + scores[2]);


        int sum = 0;

        for (int i : scores) {
            sum += i;
        }

        System.out.println("sum : " + sum);

        double avg = (double) sum / scores.length;

        System.out.println("avg : " + avg);


    }
}
