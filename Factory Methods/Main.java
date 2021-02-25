public class Main {
    public static void main(String[] args)
    {
        TasksFactory t = new TasksFactory();
        Tasks t1 = t.createNotification("Intern");
        t1.notifyUser();
	Tasks t2 = t.createNotification("Developer");
        t2.notifyUser();
	Tasks t3 = t.createNotification("Intern");
        t3.notifyUser();
    }
}