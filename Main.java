import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //������� �1
        Elevator elevator = new Elevator(-3, 26);
        System.out.println("������� ����: " + elevator.getCurrentFloor());
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("������� ����� �����: ");
            int floor = in.nextInt();
            elevator.move(floor);
            System.out.println("������ ����������?");
            Boolean f = in.nextBoolean();//� ������ ���� ����� ����� �� ����� �������� false, ����� true
            if (f == false) {     // � ������ ���� ����� ����� �� �����
                break;
            }
        }
        //������� �2
        Cargo gold = new Cargo(new Dimensions(50.8,70.9,40.4),60.25,"Fort Knox",false,"25679134ApTe74$",false);
        System.out.println();
        System.out.println("���������� � ������������ �����");
        System.out.println("�������� ������: ");// �������� ������
        System.out.println("�����: " + gold.getAddress());
        System.out.println("�����: " + gold.getGravity());
        System.out.println("����� �����: " + gold.getDimensions());
        System.out.println("��������������� �����: " + gold.getRegistrationNumber());
        System.out.println("����� �� ���� ���� ����������: " + gold.isTurnOver());
        System.out.println("�������� �� ���� �������: " + gold.isFragility());
        System.out.println();
        //������ ������
        Cargo copy1 = gold.setAddress("Bank of England");
        System.out.println("����� � ���������� �������: ");//����� ��������������� ������� � ���������� �������
        System.out.println("�����: " + copy1.getAddress());
        System.out.println("�����: " + copy1.getGravity());
        System.out.println("����� �����: " + copy1.getDimensions());
        System.out.println("��������������� �����: " +copy1.getRegistrationNumber());
        System.out.println("����� �� ���� ���� ����������: " + copy1.isTurnOver());
        System.out.println("�������� �� ���� �������: " + copy1.isFragility());
        System.out.println();
        // ������ �����
        Cargo copy2 = gold.setGravity(80.69);
        System.out.println("����� � ���������� ������: ");//����� ��������������� ������� � ���������� ������
        System.out.println("�����: " + copy2.getAddress());
        System.out.println("�����: " +copy2.getGravity());
        System.out.println("����� �����: " + copy2.getDimensions());
        System.out.println("��������������� �����: " +copy2.getRegistrationNumber());
        System.out.println("����� �� ���� ���� ����������: " + copy2.isTurnOver());
        System.out.println("�������� �� ���� �������: " + copy2.isFragility());
        System.out.println();
        //������ ���������
        System.out.println("����� � ����������� ����������: ");//����� ��������������� ������� � ����������� ����������
        Cargo copy3 = gold.setDimensions(new Dimensions(70,70,70));
        System.out.println("�����: " + copy3.getAddress());
        System.out.println("�����: " +copy3.getGravity());
        System.out.println("����� �����: " + copy3.getDimensions());
        System.out.println("��������������� �����: " +copy3.getRegistrationNumber());
        System.out.println("����� �� ���� ���� ����������: " + copy3.isTurnOver());
        System.out.println("�������� �� ���� �������: " +copy2.isFragility());
    }
}