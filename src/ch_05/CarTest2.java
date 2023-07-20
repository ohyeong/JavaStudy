package ch_05;

class Car {
    String color; // 색상
    String gearType; // 변속기 종류 - auto (자동) , manual (수동)
    int door; // 문의개수

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);  //생성자 이름으로 클래스 이름 대신 this 사용
        //한 생성자에서 다른 생성자를 호출할 때 반드시 첫 줄에서만 호출가능
    }

    Car(Car c){
        this(c.color, c.gearType, c.door);
    }   //매개변수로 넘겨진 Car 인스턴스 변수의 값을 인스턴스 자신으로 복사

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest2 {
    public static void main(String[] args) {
        Car cl = new Car();
        Car c2 = new Car("blue");
        System.out.println("cl2J color=" + cl.color + ", gearType="
                + cl.gearType + ", door=" + cl.door);
        System.out.println("c22j color=" + c2.color + ", gearType="
                + c2.gearType + ", door=" + c2.door);
    }
}
