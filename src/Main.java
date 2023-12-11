import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array={10, 20, 20, 10, 10, 20, 5, 20,5};
        Arrays.sort(array);
        for (int i=0; i<array.length; i++){
            int counter=1;

            while(i+1<array.length && array[i]==array[i+1]){
                i++;
                counter++;
            }
            System.out.println(array[i] + " sayısı\t" +counter +" kez tekrar edildi.");
        }



    }
}