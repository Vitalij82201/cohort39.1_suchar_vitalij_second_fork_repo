public class ResidentialBuilding {
    /*Задание 2: Жилой Комплекс
Объект Реализации: Квартира
Поля:
площадь: Площадь квартиры в квадратных метрах.
количествоКомнат: Количество комнат.
Этаж: Этаж, на котором находится квартира.
Жильцы: Список проживающих людей.
Методы:
добавить Жильца(жилец): Добавляет жильца в список.
Выписать Жильца(жилец): Удаляет жильца из списка.
показатьИнформацию(): Выводит информацию о квартире..*/
    private int area_house;
    private int rooms;
    private int residents;
    private int floor;
    private int arrivals;

    public ResidentialBuilding(int area_house, int rooms, int residents, int floor) {
        this.area_house = area_house;
        this.rooms = rooms;
        this.residents = residents;
        this.floor = floor;
        this.arrivals = 0;

    }

    public void arrivalsResidents(int tenants) {
        residents += tenants;

    }

    public void droppedOutResidents(int tenants) {
        residents -= tenants;
    }

    public void showInfo() {
        System.out.println("Площадь квартиры " + area_house + " количество комнат " + rooms +
                " живущих людей " + residents + " этаж " + floor);
    }

    public static void main(String[] args) {
        ResidentialBuilding myHouse = new ResidentialBuilding(25, 1, 2, 3);
        myHouse.showInfo();
        ResidentialBuilding neighbors = new ResidentialBuilding(52, 2, 3, 3);
        neighbors.showInfo();
        ResidentialBuilding neighborsSecond = new ResidentialBuilding(80, 3, 5, 3);
        neighborsSecond.showInfo();
        System.out.println("\nК нам приехали племянники ");
        myHouse.arrivalsResidents(2);
        myHouse.showInfo();
        System.out.println("\n У соседей жена с мужем развелись, муж ушел");
        neighbors.droppedOutResidents(1);
        neighbors.showInfo();
        System.out.println("\n У других соседей родилась тройня, они счастливы");
        neighborsSecond.arrivalsResidents(3);
        neighborsSecond.showInfo();
    }
}
