public class bai1chap4
{
package school;
import java.util.Scanner;

    public class Student {
        private String name;
        private int year;

        public Student(String name, int year) {
            this.name = name;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public int getYear() {
            return year;
        }
    }
    public class Test {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập số lượng sinh viên: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            Student[] students = new Student[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Nhập tên sinh viên " + (i + 1) + ": ");
                String name = scanner.nextLine();

                System.out.print("Nhập năm sinh của " + name + ": ");
                int year = scanner.nextInt();
                scanner.nextLine();

                students[i] = new Student(name, year);
            }

            System.out.println("\nDanh sách sinh viên:");
            int totalAge = 0;
            int currentYear = 2025;

            for (Student s : students) {
                System.out.println("- " + s.getName());
                totalAge += (currentYear - s.getYear());
            }

            System.out.println("Tổng số tuổi của tất cả sinh viên: " + totalAge);

            scanner.close();
        }
    }

}
