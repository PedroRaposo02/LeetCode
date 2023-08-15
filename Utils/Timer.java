package Utils;

public class Timer {
    
    private long startTimer;
    private long endTimer;

    public Timer() {
        startTimer = 0;
        endTimer = 0;
    }

    public void start() {
        startTimer = System.currentTimeMillis();
    }

    public void end() {
        endTimer = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTimer - startTimer;
    }
}
