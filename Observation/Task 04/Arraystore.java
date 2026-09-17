package exception;
public class smtg {
public static void main(String[] args) {
	Object[] arr = new String[3];
    try {
        arr[0] = "Java";
        arr[1] = "Python";
        arr[2] = 10;
    }
    catch (ArrayStoreException as) {
        System.out.println("Enter same type of data type");
    }
}
}
