import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Records{
    Record[] records;
    int totalRecords;
    public Records(int size, String recordFile){
        this.records = new Record[size];
        this.totalRecords = 0;
        String data;

        try {
            File file = new File(recordFile);
            Scanner scanner = new Scanner(file);

            //not reading the first line of file
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                data = scanner.nextLine();

                Scanner readRecord = new Scanner(data).useDelimiter(",\\s*");
                Record record = new Record(readRecord.next(), readRecord.next(), 
                readRecord.next(), readRecord.next(),readRecord.next(), readRecord.next());
                records[totalRecords]=record;
                totalRecords++;
                //NEED TO ACCOUNT FOR END OF ARRAY              
            }
            scanner.close();
          } catch (FileNotFoundException e) {
            System.out.println("No records file found");
        }
    }
    public void heapify(String field){

    }
    public void heapSort(String field){

    }

    public static void main(String[] args){
        Records employees = new Records(50, "records.txt");
        employees.records[0].printFields();
    }

}


class Record{
    String EmployeeID;
    String SIN;
    String Name; 
    String Department;
    String Address;
    String Salary;

    public Record(String EmployeeID,String SIN,String Name,String Department,String Address,String Salary){
        this.EmployeeID=EmployeeID;
        this.SIN = SIN;
        this.Name=Name;
        this.Department=Department;
        this.Address = Address;
        this.Salary=Salary;
    }

    public void printFields() {
        System.out.println("EmployeeID: " + EmployeeID);
        System.out.println("SIN: " + SIN);
        System.out.println("Name: " + Name);
        System.out.println("Department: " + Department);
        System.out.println("Address: " + Address);
        System.out.println("Salary: " + Salary);
    }
}
