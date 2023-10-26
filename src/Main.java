public class Main
{
    public static void main(String[] args)
    {
        Professor professor = new Professor("Ensar", 45, "Software");
        
        Student student1 = new Student("Omer Faruk", 21);
        Student student2 = new Student("Numan", 15);
        
        
        professor.Teach("Inheritance");
        
        student1.TakeNotes("Inheritance");
        student2.Listen(professor, "Inheritance");
    }
}
