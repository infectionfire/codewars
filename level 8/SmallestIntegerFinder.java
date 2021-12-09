public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int result = Integer.MAX_VALUE;
        for (int i=0; i<args.length;i++){
            if(result>=args[i]){
                result=args[i];
            }
        }
        return result;
    }
}
