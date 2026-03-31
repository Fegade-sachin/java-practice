package hybridI_nheritance;
class Appliance
{
    void power() {
        System.out.println("Appliance power");
    }
}

class Machine extends Appliance {
    void run() {
        System.out.println("Machine running");
    }
}

class Washer extends Machine {
    void wash() {
        System.out.println("Washing clothes");
    }
}

class Grinder extends Machine {
    void grind() {
        System.out.println("Grinding");
    }
}

public class Hybrid_10 {
    public static void main(String[] args) {
        Grinder g = new Grinder();
        g.grind();
        g.run();
        g.power();

        Washer wash = new Washer();
        wash.wash();
        wash.run();
        wash.power();

    }
}

