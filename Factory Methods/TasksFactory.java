public class TasksFactory {
    public Tasks createNotification(String employee)
    {
        if (employee == null || employee.isEmpty())
            return null;
        if ("Intern".equals(employee)) {
            return new Intern();
        }
        else if ("Developer".equals(employee)) {
            return new Developer();
        }
        else if ("HR".equals(employee)) {
            return new HR();
        }
        return null;
    }
}