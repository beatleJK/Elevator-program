public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;
    public Elevator(int minFloor,int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public void moveDown(){
        currentFloor = currentFloor>minFloor ? currentFloor - 1:currentFloor;
    }
    public void moveUp(){
        currentFloor = currentFloor<maxFloor ? currentFloor + 1:currentFloor;
    }
    public void move(int floor){
        if (floor <= maxFloor && floor >= minFloor) {
            if (floor < currentFloor){
                System.out.println("�����");
                do {
                    moveDown();
                    System.out.println(currentFloor + " ����");
                }
                while (currentFloor > floor);
            } else if (floor > currentFloor) {
                System.out.println("������");
                do {
                    moveUp();
                    System.out.println(currentFloor + " ����");
                }
                while (currentFloor < floor);
            }
            else {
                System.out.println("���� ��������� �� " + floor + " �����");
            }
        }
        else {
            System.out.println("Error:incorrect floor number");
        }
    }
}