public class SquareDigit {

    public int squareDigits(int n) {
        String num = String.valueOf(n);
        String[] nums = num.split("");
        String numbers ="";
        for (int i =0; i< nums.length;i++){
            int number = Integer.parseInt(nums[i]);
            number *=number;
            numbers+=String.valueOf(number);
        }

        return Integer.parseInt(numbers);
    }

}