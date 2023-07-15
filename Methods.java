public interface Methods {
    static int average(int firstnum, int secondnum){
        int sum = firstnum + secondnum;
        return sum/2;
    }
    public static void main(String[] args) {
        System.out.println(average(4,5));

    }
}
