public class Timer {
    private int hundredSeconds;
    private int seconds;
    
    public Timer() {
        this.hundredSeconds = 0;
        this.seconds = 0;
    }
    public String toString() {
        if (this.hundredSeconds < 10 && this.seconds < 10) {
            return "0" + String.valueOf(seconds) + ":" + "0" + String.valueOf(hundredSeconds);
        } else if (this.hundredSeconds < 10) {
            return String.valueOf(seconds) + ":" + "0" + String.valueOf(hundredSeconds);
        } else if (this.seconds < 10) {
            return "0" + String.valueOf(seconds) + ":" + String.valueOf(hundredSeconds);
        } else {
            return String.valueOf(seconds) + ":" + String.valueOf(hundredSeconds);
        }
    }
    public void advance() {
        this.hundredSeconds += 1;
        if (this.hundredSeconds >= 100) {
            this.hundredSeconds = 0;
            this.seconds += 1;
        }
        if(this.seconds >= 60){
            this.seconds = 0;
        }
    }
}
