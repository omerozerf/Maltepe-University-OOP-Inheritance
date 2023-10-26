public class Student extends Person
{
    public Student(String name, int age)
    {
        super(name, age);
    }
    
    public void Listen(Professor professor, String topic)
    {
        System.out.println("Student " + GetName() + " listening to a professor " + professor.GetName() + " on a specific " + topic);
    }
    
    public void TakeNotes(String topic)
    {
        System.out.println("Student " + GetName() + " taking notes on a " + topic);    
    }
}
