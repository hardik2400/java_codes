/*public class Student {
    int rollno;
    String name;
    int marks;

    Student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+marks);
    }
}
class TestThis{
public static void main(String args[]){
    Student s1=new Student(3,"hardik",45);
    Student s2=new Student(7,"harsh",75);
    s1.display();
    s2.display();

}
}
*/
class A{  
    void m(){System.out.println("hello m");}  
    void n(){  
    System.out.println("hello n");  
    //m();//same as this.m()  
     m();  
    }  
    }  
    class TestThis4{  
    public static void main(String args[]){  
    A a=new A();  
    a.n();  
    }}  