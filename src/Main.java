public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        String firstName = "Ivan"; // имя
        String middleName = "Ivanovich"; //отчество
        String lastName = "Ivanov"; // фамилия
        System.out.println("Ф.И.О. сотрудника - " + lastName + " " + firstName + " " + middleName);

        //Задача 2
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        //Задача 3
        System.out.println("Задача 3");
        String fullName2 = "Иванов Семён Семёнович";
        String fullNameTrue = fullName2.replace("ё","е");
        System.out.println(fullNameTrue);
    }
}