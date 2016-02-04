package zadaci_03_02_2016;
/*(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays
employees and their total hours in decreasing order of the total hours.*/

public class Z1_HoursForEmployee {
	// deklarisemo
	static final int EMP = 0;
	static final int HOURS = 1;

	public static void main(String[] args) {
		// unosimo sate u nizove za zaposlene
		int[][] employeeHours = new int[][] { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 }, { 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, { 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 }, { 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };
		// kreiramo niz za ukupan broj sati
		int[][] totalHoursChart = calcTotalHours(employeeHours);
		// pozivamo metodu za opadajuce sortiranje
		descendingSort(totalHoursChart);

		for (int i = 0; i < totalHoursChart.length; i++) {

			System.out.println("Employee " + totalHoursChart[i][EMP] + " total hours = " + totalHoursChart[i][HOURS]);
		}

	}

	// racunanje ukupnih sati
	public static int[][] calcTotalHours(int[][] m) {

		int[][] totalHoursChart = new int[m.length][2];

		for (int i = 0; i < m.length; i++) {
			totalHoursChart[i][HOURS] = getRowTotalHour(m, i);
			totalHoursChart[i][EMP] = i;
		}

		return totalHoursChart;
	}

	// ucitavanje sati iz niza
	public static int getRowTotalHour(int[][] m, int row) {

		int total = 0;
		for (int column = 0; column < m[row].length; column++) {
			total += m[row][column];
		}
		return total;
	}

	// metoda za sortiranje u opadajucem redosljedu
	public static void descendingSort(int[][] m) {

		for (int i = 0; i < m.length - 1; i++) {

			int currentIndex = i;
			int currentMax = m[i][HOURS];
			int empNum = m[i][EMP];
			for (int k = i + 1; k < m.length; k++) {

				if (currentMax < m[k][HOURS]) {
					currentMax = m[k][HOURS];
					currentIndex = k;
					empNum = m[k][EMP];
				}
			}

			if (currentIndex != i) {
				m[currentIndex][EMP] = m[i][EMP];
				m[currentIndex][HOURS] = m[i][HOURS];
				m[i][EMP] = empNum;
				m[i][HOURS] = currentMax;
			}

		}
	}
}
