

  import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

        class Time {
            int hr, min, sec;

            Time() {
                hr = 0;
                min = 0;
                sec = 0;
            }

            Time(int hr, int min, int sec) {
                this.hr = hr;
                this.min = min;
                this.sec = sec;
            }

            void display() {
                System.out.println("Time: " + hr + ":" + min + ":" + sec);
            }
        }

        public class currenttime {
            public static void main(String[] args) {

                Time t1 = new Time();
                Time t2 = new Time(10, 30, 45);

                t1.display();
                t2.display();

                LocalDateTime now = LocalDateTime.now();

                DateTimeFormatter formatter =
                        DateTimeFormatter.ofPattern("dd-MM-yyyy  EEE   hh:mm:ss a ");

                System.out.println(" live Date and Time : " + now.format(formatter));
            }
        }