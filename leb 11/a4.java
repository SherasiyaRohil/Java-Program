class OddEvenThread extends Thread {
    private int start;

    public OddEvenThread(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        for (int i = start; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(5000); // Pause for 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread oddThread = new OddEvenThread(1);
        Thread evenThread = new OddEvenThread(2);

        oddThread.start();
        evenThread.start();
    }
}
