package ru.mirea.prak18;

public class Test {
    public static void main(String[] args) {
        MinMax<Integer> arr = new MinMax<>(new Integer[]{52, 21, 90, 11, -1, 7});
        System.out.println(arr.maxElement());
        System.out.println(arr.minElement());

        System.out.println(Calculator.sum(15, 21));
        System.out.println(Calculator.divide(24, 2));
//        Calculator.divide(66, 0);
        System.out.println(Calculator.multiply(13, 4));
        System.out.println(Calculator.subtract(90, 92));


        Matrix<Integer> matrix1 = new Matrix<>(3, 3);
        int value = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix1.set(i, j, value++);
            }
        }
        matrix1.print();
        System.out.println();
        Matrix<Integer> matrix2 = new Matrix<>(3, 3);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix2.set(i, j, value++);
            }
        }
        matrix2.print();
        System.out.println();
        Matrix<Integer> matrix3 = matrix1.multiply(matrix2);

        matrix3.print();

    }
}
