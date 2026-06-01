import java.util.Arrays;
import java.util.Collections;
public class sordes {
public static void main(String[] args) {
Integer[] arr={5,3,4,1,2};
Arrays.sort(arr,Collections.reverseOrder());
System.out.println("Descending order:");
for(int n:arr) {
System.out.println(n);
}
}
}
