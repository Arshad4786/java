public class maxelement {
    public static void main(String[] args) {


        int[] array = {11, 2, 3, 4, 5};
        int max = Integer.MIN_VALUE;
        for (int x : array) {
            if(x>max){
            max = x;
}
        }
            System.out.println(max);
        }
    }
