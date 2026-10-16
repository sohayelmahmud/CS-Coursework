class Time {
    public int hr, min, sec;

    public Time() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    public Time(int h, int m, int s) {
        if (h >= 0 && h < 24) {
            hr = h;
        } else {
            hr = 0;
        }

        if (m >= 0 && m < 60) {
            min = m;
        } else {
            min = 0;
        }

        if (s >= 0 && s < 60) {
            sec = s;
        } else {
            sec = 0;
        }
    }

    public void display() {
        System.out.printf("Time: %02d:%02d:%02d\n", hr, min, sec);
    }
}

public class LabTask5 {
    public static void main(String[] args) {
        Time t1 = new Time();
        t1.display();

        Time t2 = new Time(14, 30, 45);
        t2.display();

        Time t3 = new Time(25, 61, 70);
        t3.display();
    }
}