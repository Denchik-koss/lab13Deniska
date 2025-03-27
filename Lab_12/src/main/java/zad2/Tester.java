package zad2;

public class Tester {

        private String name;
        private String surname;
        private int experienceInYears;
        private String englishLevel;
        private double salary;

        public Tester(String name) {
                this(name, "Kust");
        }

        public Tester(String name, String surname) {
                this(name, surname, 5);
        }

        public Tester(String name, String surname, int experienceInYears) {
                this(name, surname, 5, "Good", 2000);
        }

        public Tester(String name, String surmane, int experienceInYears, String englishLevel, double salary) {
                this.name = name;
                this.surname = surmane;
                this.englishLevel = englishLevel;
                this.experienceInYears = experienceInYears;
                this.salary = salary;
        }

        public void print() {
                System.out.println("Имя: " + name + ", Фамилия: " + surname);
        }
        public void print(int i) {
                if(i>5) {
                        System.out.println("Опыт работы: " + experienceInYears + " лет");
                }
                System.out.println("Опыт работы:  лет");
        }
        public void print(boolean flag)
        {
                if(flag){
                        System.out.println("Зарплата: " + salary);
                }
        }
        public static void printchoto() {
                System.out.println("я не знаю что тут написать");
        }
}
