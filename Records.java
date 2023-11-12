import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


class Record{
    String EmployeeID;
    String SIN;
    String Name; 
    String Department;
    String Address;
    String Salary;

    Record(String EmployeeID,String SIN,String Name,String Department,String Address,String Salary){
        this.EmployeeID=EmployeeID;
        this.SIN = SIN;
        this.Name=Name;
        this.Department=Department;
        this.Address = Address;
        this.Salary=Salary;
    }
}


public class Records{
    public Records(int size, File records){
        
    }

}