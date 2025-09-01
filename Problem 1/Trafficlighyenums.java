public class Trafficlighyenums {
    enum Trafficlight{
        RED,
        YELLOW,
        GREEN
    }
    abstract class light {
        abstract void display();
    }
    class Red extends light {
        void display(){
            System.out.println("STOP");
        }
    }
    class Yellow extends light {
        void display(){
            System.out.println("WAIT");
        }
    }
    class Green extends light {
        void display(){
            System.out.println("GO");
        }
    }
    

    public static void main(String[] args) {
        Trafficlight str = Trafficlight.GREEN;
         Trafficlighyenums obj = new Trafficlighyenums();
        System.out.println(str);
        switch (str) {
            case RED:
                light l=obj.new Red();
                l.display();
                break;
            case YELLOW:
                light m=obj.new Yellow();
                m.display();
                break;
            default:
                light n=obj.new Green();
                n.display();
                break;
        }
    }
}