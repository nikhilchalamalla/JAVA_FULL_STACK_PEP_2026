package multithreading;

public class DownloadTask implements Runnable {
    String file;

    DownloadTask(String file) {
        this.file = file;
    }

    public void run() {
        System.out.println("Downloading " + file);
        try { Thread.sleep(2000); } catch (Exception e) {}
        System.out.println(file + " downloaded");
    }

    public static void main(String[] args) {
        new Thread(new DownloadTask("File1")).start();
        new Thread(new DownloadTask("File2")).start();
    }
}
