package ch_05;

class CarTest3 {
    public static void main(String[] args) {
        Car cl = new Car();
        Car c2 = new Car (cl); // cl의 복사본 c2를 생성한다.
        System.out.println("cl2] color=" + cl.color + ", gearType="
                + cl.gearType+ ", door="+cl.door);
        System.out.println("c22J color=" + c2.color + ", gearType="
                + c2.gearType+ ", door="+c2.door);
        cl .door=100;
        System.out .println ("cl .door=100; 수행 후");
                System.out .println ("cl의 color=" + cl.color + ", gearType="
                        + cl.gearType+ ", door="+cl.door);
        System.out.println("c22J color=" + c2.color + ", gearType="
                + c2.gearType+ ", door="+c2.door);
    }
}
