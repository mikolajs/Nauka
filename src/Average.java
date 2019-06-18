class Average {
    public static void main(String args[]) {
        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5, 23.1};
        double result = 0;
        //przypisanie wartości do tablicy:
        nums[3] = 14.3;
        for(int i=0; i< nums.length; i++)  result += nums[i];
        System.out.println("Średnia wynosi " + result / nums.length);

    }
}
