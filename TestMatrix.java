package javaAssignment3;

class Matrix {
	private int rows;
	private int columns;
	int[][] elements;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		elements = new int[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setElement(int i, int j, int value) {
		if (i >= 0 && i < rows && j >= 0 && j < columns) {
			elements[i][j] = value;
		} else {
			System.out.println("Invalid position");
		}
	}

	public Matrix add(Matrix other) {
		if (this.rows != other.rows || this.columns != other.columns) {
			System.out.println("Matrice cannot be add ");
			return null;
		}
		Matrix result = new Matrix(rows, columns);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++)
				;
			{
				int j = 0;
				result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
			}
		}
		return result;
	}
}

public class TestMatrix {
	public static void main(String[] args) {

		Matrix matrix1 = new Matrix(2, 2);
		Matrix matrix2 = new Matrix(2, 2);

		matrix1.setElement(0, 0, 1);
		matrix1.setElement(0, 1, 2);
		matrix1.setElement(1, 0, 3);
		matrix1.setElement(1, 1, 4);

		matrix2.setElement(0, 0, 5);
		matrix2.setElement(0, 1, 6);
		matrix2.setElement(1, 0, 7);
		matrix2.setElement(1, 1, 8);

		Matrix result = matrix1.add(matrix2);
		if (result != null) {
			System.out.println("Result of matrix addition:");
			for (int i = 0; i < result.getRows(); i++) {
				for (int j = 0; j < result.getColumns(); j++) {
					System.out.print(result.elements[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
