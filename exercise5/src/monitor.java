class monitor {
    public void connect(VGA connector) {
    System.out.println("Monitor expecting VGA connector..");
    connector.connectWithVGA();
    System.out.println("Connected!");
    }
}
