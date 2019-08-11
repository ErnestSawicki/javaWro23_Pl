package Stopwatch;

public class Stopwatch {
    private long stopTime;
    private long startTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public long stop() {
        if (startTime == 0)
            throw new timerNotStarted();
        stopTime = System.nanoTime();
        return stopTime - startTime;
    }


}
