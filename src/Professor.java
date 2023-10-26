public class Professor extends Person
{
    private String department;

    
    public Professor(String name, int age, String department)
    {
        super(name, age);
        this.department = department;
    }
    
    public void Teach(String topic)
    {
        System.out.println("Professor " + GetName() + " teaches " + topic);
    }
    
    public String GetDepartment()
    {
        return department;
    }

    public void SetDepartment(String department)
    {
        this.department = department;
    }
}
