public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[5];
        marks[0] = 23;
        marks[1] = 12;
        marks[2] = 56;
        marks[3] = 34;
        marks[4] = 99;
        
        for(int i =0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        // int a[][] = new int[5][5];
        int a [] [] = {
            {
                1,2
            }, {
                3,4
            },
        };
        System.out.println(a[1][0]);
    }
    
}
