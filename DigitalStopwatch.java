package Project;
import java.util.*;

class Stopwatch {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public Stopwatch(){
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
    }

    public void start(){
        if(!isRunning){
            startTime = System.currentTimeMillis();
            isRunning = true;
            System.out.println("Stopwatch started....");
        }else{
            System.out.println("Stopwatch is already running.");
        }
    }

    public void stop(){
        if(isRunning){
            elapsedTime += System.currentTimeMillis() - startTime;
            isRunning = false;
            System.out.println("Stopwatch stopped....");
        }else{
            System.out.println("Stopwatch is not running.");
        }
    }

    public void reset(){
        startTime = 0;
        elapsedTime = 0;
        isRunning = false;
        System.out.println("Stopwatch reset....");
    }

    public long getElapsedTime(){
        if(isRunning){
            return elapsedTime + (System.currentTimeMillis() - startTime);
        }else{
            return elapsedTime;
        }
    }

    public void displayTime(){
       System.out.println("Elapsed Time: " + getElapsedTime() + " ms");
    }
    
}

public class DigitalStopwatch {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        Stopwatch sw1 = new Stopwatch();

        int choice;

        do {
            System.out.println("\n--------Digital Stopwatch Menu:--------");
            System.out.println("1. Start Stopwatch");
            System.out.println("2. Stop Stopwatch");
            System.out.println("3. Reset Stopwatch");
            System.out.println("4. Display Elapsed Time");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = ip.nextInt();

            switch (choice) {
                case 1:
                    sw1.start();
                    break;
                case 2:
                    sw1.stop();
                    break;
                case 3:
                    sw1.reset();
                    break;
                case 4:
                    sw1.displayTime();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (choice != 5);

        ip.close();
    }
}
