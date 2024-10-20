//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] letters ={'a', 's', 'd'};
        System.out.println(reverseArr(letters));
    }
    public static char[] reverseArr(char[] arr){
        char[] reversed = new char[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--){
            reversed[j] =arr[i];
            j++;
        }
        return reversed;
    }
}