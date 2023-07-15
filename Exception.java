public class Exception {
    public static void main(String[] args) {
        int a[] = new int[3];
        try {
            System.out.println(a[6]);   
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
            System.out.println(e.getLocalizedMessage());
        }
        
    }
}
