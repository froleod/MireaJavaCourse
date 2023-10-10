package ru.mirea.prak18;

public class Matrix<T> extends Calculator{
    T[][] matrix;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        if(rows < 0 || cols < 0)
            throw new IllegalArgumentException("Rows and cols must be bigger than 0");
        this.rows = rows;
        this.cols = cols;

        this.matrix = (T[][]) new Object[rows][cols];
    }

    public void set(int row, int col, T value) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IllegalArgumentException("Invalid matrix indices.");
        }
        matrix[row][col] = value;
    }

    public T get(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IllegalArgumentException("Invalid matrix indices.");
        }
        return matrix[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix<T> add(Matrix<T> other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Matrix dimensions must be the same for addition.");
        }

        Matrix<T> result = new Matrix<>(rows, cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.set(i, j, (T) (addElements(this.get(i, j), other.get(i, j))));
            }
        }

        return result;
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication.");
        }

        Matrix<T> result = new Matrix<>(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                T sum = null;
                for (int k = 0; k < this.cols; k++) {
                    T product = multiplyElements(this.get(i, k), other.get(k, j));
                    sum = (sum == null) ? product : addElements(sum, product);
                }
                result.set(i, j, sum);
            }
        }

        return result;
    }

    private T addElements(T a, T b) {
        return (T) (a instanceof Number ? ((Number) a).doubleValue() + ((Number) b).doubleValue() : null);
    }

    private T multiplyElements(T a, T b) {
        return (T) (a instanceof Number ? ((Number) a).doubleValue() * ((Number) b).doubleValue() : null);
    }
}
