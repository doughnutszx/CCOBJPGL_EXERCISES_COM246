

public class App {
    public static void main(String[] args) throws Exception {
        //HDMI
        HDMI hdmi = new HDMI();

        //Connector/adapter working to make the monitor compatible with the VGA
        VGA connector = new VGAtoHDMI(hdmi);

        //Monitor
        monitor monitor = new monitor();
        monitor.connect(connector);
    }
}
