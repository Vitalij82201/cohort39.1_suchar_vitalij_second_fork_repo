public class ResidentBuildingOne {
    private int area_house;
    private int rooms;
    private int residents;
    private int floor;
    private int arrivals;

    public ResidentBuildingOne(int setArea_house, int setRooms, int setResidents, int setFloor, int setArrivals) {
        this.area_house = setArea_house;
        this.rooms = setRooms;
        this.residents = setResidents;
        this.floor = setFloor;
        this.arrivals = setArrivals;
    }

    public ResidentBuildingOne() {

    }

    public int getArea_house() {
        return area_house;
    }

    public int getRooms() {
        return rooms;
    }

    public int getArrivals() {

        return arrivals;
    }

    public void setArrivals(int arrivals) {
        if (arrivals < 10) {
            this.arrivals = arrivals;
        } else {
            System.out.println("Количество переселенцев не может быть больше десяти!");
        }
    }

    public int getFloor() {
        return floor;
    }
// Я поставил ограничение везде, просто для того что-бы проверить.
    public void setFloor(int floor) {
        if (floor >= 0 && floor <= 25) {
            this.floor = floor;
        } else {
            System.out.println("такой этаж не возможен");
        }
    }

    public int getResidents() {
        return residents;
    }

    public void setResidents(int residents) {
        if (residents >= 1 && residents <= 10) {
            this.residents = residents;
        } else {
            System.out.println("К сожалению такое количество жильцов невозможно!");
        }
    }

    public void setRooms(int rooms) {
        if (rooms >= 1 && rooms <= 5) {
            this.rooms = rooms;
        } else {
            System.out.println("Такое количество комнат невозможно!");
        }
    }

    public void setArea_house(int area_house) {
        if (area_house >= 10 && area_house <= 200) {
            this.area_house = area_house;
        } else {
            System.out.println("Такая площадь для промышленного квартала не реальна!");
        }
    }

    public void showInfo() {
    }
}
