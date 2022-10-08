import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задание №1
        Elevator elevator = new Elevator(-3, 26);
        System.out.println("Текущий этаж: " + elevator.getCurrentFloor());
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите номер этажа: ");
            int floor = in.nextInt();
            elevator.move(floor);
            System.out.println("Хотите продолжить?");
            Boolean f = in.nextBoolean();//В случае если нужно выйти из цикла написать false, иначе true
            if (f == false) {     // В случае если нужно выйти из цикла
                break;
            }
        }
        //Задание №2
        Cargo gold = new Cargo(new Dimensions(50.8,70.9,40.4),60.25,"Fort Knox",false,"25679134ApTe74$",false);
        System.out.println();
        System.out.println("ИНФОРМАЦИЯ О ПЕРЕМЕЩАЕМОМ ГРУЗЕ");
        System.out.println("Исходный объект: ");// Исходный объект
        System.out.println("Адрес: " + gold.getAddress());
        System.out.println("Масса: " + gold.getGravity());
        System.out.println("Объем груза: " + gold.getDimensions());
        System.out.println("Регистрационный номер: " + gold.getRegistrationNumber());
        System.out.println("Может ли груз быть перевернут: " + gold.isTurnOver());
        System.out.println("Является ли груз хрупким: " + gold.isFragility());
        System.out.println();
        //Замена адреса
        Cargo copy1 = gold.setAddress("Bank of England");
        System.out.println("Копия с измененным адресом: ");//Копия первоначального объекта с измененным адресом
        System.out.println("Адрес: " + copy1.getAddress());
        System.out.println("Масса: " + copy1.getGravity());
        System.out.println("Объем груза: " + copy1.getDimensions());
        System.out.println("Регистрационный номер: " +copy1.getRegistrationNumber());
        System.out.println("Может ли груз быть перевернут: " + copy1.isTurnOver());
        System.out.println("Является ли груз хрупким: " + copy1.isFragility());
        System.out.println();
        // Замена массы
        Cargo copy2 = gold.setGravity(80.69);
        System.out.println("Копия с измененной массой: ");//Копия первоначального объекта с измененной массой
        System.out.println("Адрес: " + copy2.getAddress());
        System.out.println("Масса: " +copy2.getGravity());
        System.out.println("Объем груза: " + copy2.getDimensions());
        System.out.println("Регистрационный номер: " +copy2.getRegistrationNumber());
        System.out.println("Может ли груз быть перевернут: " + copy2.isTurnOver());
        System.out.println("Является ли груз хрупким: " + copy2.isFragility());
        System.out.println();
        //Замена габаритов
        System.out.println("Копия с измененными габаритами: ");//Копия первоначального объекта с измененными габаритами
        Cargo copy3 = gold.setDimensions(new Dimensions(70,70,70));
        System.out.println("Адрес: " + copy3.getAddress());
        System.out.println("Масса: " +copy3.getGravity());
        System.out.println("Объем груза: " + copy3.getDimensions());
        System.out.println("Регистрационный номер: " +copy3.getRegistrationNumber());
        System.out.println("Может ли груз быть перевернут: " + copy3.isTurnOver());
        System.out.println("Является ли груз хрупким: " +copy2.isFragility());
    }
}