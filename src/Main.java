public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("Ф.И.О. сотрудника: " + fullName);

        System.out.println("Задача 2");
        System.out.println("Ф.И.О. сотрудника для заполнения отчета: " + fullName.toUpperCase());

        System.out.println("Задача 3");
        firstName = "Семён ";
        middleName = "Семёнович";
        lastName = "Иванов ";
        firstName = firstName.replace("ё", "е");
        middleName = middleName.replace("ё", "е");
        fullName = lastName + firstName + middleName;
        System.out.println("Данные Ф.И.О. сотрудника: " + fullName);

    }
}