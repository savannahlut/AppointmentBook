public class Main 
{
    public static void main(String[] args)
    {
        boolean[][] schedule = new boolean[8][60];
        for(int i = 10; i < 15; i++) schedule[1][i] = true;
        for(int i = 30; i < 45; i++) schedule[1][i] = true;
        
        for(int i = 25; i < 30; i++) schedule[1][i] = true;
        for(int i = 0; i < 15; i++) schedule[2][i] = true;
        for(int i = 41; i < 60; i++) schedule[2][i] = true;
        for(int i = 5; i < 30; i++) schedule[3][i] = true;
        for(int i = 44; i < 60; i++) schedule[3][i] = true;
        AppointmentBook wumbo = new AppointmentBook(schedule);
        wumbo.printPeriod(2);
        System.out.println(wumbo.findFreeBlock(2, 15));
        
        int period = 2;
        while(period < 5)
        {
            System.out.println("Period: " + period);
            wumbo.printPeriod(period);
            period++;
        }

        wumbo.printPeriod(4);
        System.out.println(wumbo.makeAppointment(2, 4, 22));
        wumbo.printPeriod(4);
    }
}