public class classObj {
    public static void main(String[] args) {
        System.out.println("Studen details");

        Student d1 = new Student();
        d1.name="purushottam kumar";
        d1.age=22;
        d1.department="MCA";
        d1.rolln=24271026;
        d1.number=1;
        d1.purushottam();
        d1.vijay();

    }
}
    class Student {
        String name;
        int age;
        String department;
        double rolln;
        int number;
       void purushottam(){
            System.out.println(name+"\n"+age+"\n" +department +"\n" +rolln + "\n" +number);
           System.out.println("purushottam is very good student ");
        }

        void vijay(){
            System.out.println("Vijay is good student");
        }
    }



