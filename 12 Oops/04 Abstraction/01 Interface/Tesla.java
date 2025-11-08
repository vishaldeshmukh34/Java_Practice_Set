public class Tesla implements Car  {
    public void start() {
        System.out.println("Tesla is starting...");
    }

    public void stop() {
        System.out.println("Tesla is stopping...");
    }

    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.start();
        t.stop();
    }
}
