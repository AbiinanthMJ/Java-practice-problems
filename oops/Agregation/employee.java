package oops.Agregation;
public class employee {
    public String name;
    public employee(String name){
        this.name=name;
    }
    public void show(){
        System.out.println(STR."This is one of the employee of the organization and his name is \{this.name}");
    }
}
class Department{
    private String departname;
    private employee [] employees;
    public Department(String departname , employee[] employees){
         this.departname=departname;
         this.employees=employees;
    }
    public boolean showdepartment(){
        for(employee e : employees){
            System.out.println(e.name);
        }
        return false;
    }
    public static void main(String[] args) {
        employee e1 = new employee("Jai");
        employee e2 = new employee("Abi");
        employee e3 = new employee("Sibi");
        employee[] employeesarray = {e1,e2,e3};
        Department hostel = new Department("Hostel",employeesarray);
        System.out.println(e1.name);
        System.out.println(e2.name);
        System.out.println(e3.name);
        System.out.println(hostel.showdepartment());
    }
}


