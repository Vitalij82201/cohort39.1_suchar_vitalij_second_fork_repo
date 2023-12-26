    public class ResidentBuildingDesideOne {
    public static void main(String[] args) {
        ResidentBuildingOne myHouse = new ResidentBuildingOne(25, 1, 2, 3, 0);
        System.out.println("\nПлощадь квартиры " + myHouse.getArea_house());
        myHouse.setArea_house(300);
        System.out.println("Новая площадь квартиры " + myHouse.getArea_house());
        System.out.println("\nСколько комнат " + myHouse.getRooms());
        myHouse.setRooms(2);
        System.out.println("Количество новых комнат " + myHouse.getRooms());
        System.out.println("\nСколько жителей " + myHouse.getResidents());
        myHouse.setResidents(5);
        System.out.println("Количество новых жителей! " + myHouse.getResidents());
        System.out.println("\nНа каком этаже квартира " + myHouse.getFloor());
        myHouse.setFloor(4);
        System.out.println("Новый этаж на котором мы живем " + myHouse.getFloor());
        System.out.println("\nСколько приехало новых жильцов " + myHouse.getArrivals());
        myHouse.setArrivals(6);
        System.out.println("Новое количество переселенцев " + myHouse.getArrivals());
        ResidentBuildingOne neighbors = new ResidentBuildingOne(52, 2, 3, 3, 0);
        neighbors.showInfo();
        ResidentBuildingOne neighborsSecond = new ResidentBuildingOne(80, 3, 5, 3, 0);
        neighborsSecond.showInfo();


    }
}
