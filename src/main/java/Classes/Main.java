/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Classes;
import java.util.Scanner;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
/**
 *
 * @author Ian Kent
 */

public class Main 
{

    public static void main(String[] args) throws IOException, FileNotFoundException, CsvValidationException 
    {
        Scanner strScanner = new Scanner(System.in);
        System.out.print ("Enter Employee No: ");
        String employeeNo = strScanner.nextLine();
        
        Employee _employee = new Employee();
        _employee.displayEmployeeDetails(employeeNo);
        _employee.displayAttendanceRecord(employeeNo);
        
        // Display Employee Details
        System.out.println();
        System.out.println();
        System.out.println("EMPLOYEE DETAILS:");
        System.out.println("======================================");
        System.out.println();
        System.out.println("Employee No: " + _employee.getEmployeeNo());
        System.out.println();
        System.out.println("First Name: " + _employee.getEmployeeFirstName());
        System.out.println("Last Name: " + _employee.getEmployeeLastName());
        System.out.println ("Birthday: " + _employee.getEmployeeBday());
        System.out.println ("Address: " + _employee.getEmployeeAddress());
        System.out.println ("Phone Number: " + _employee.getEmployeePhone());
        System.out.println();
        System.out.println ("Position: " + _employee.getEmployeePosition());
        System.out.println ("Status: " + _employee.getEmployeeStatus());
        System.out.println ("Immediate Supervisor: " + _employee.getEmployeeSupervisor());
        System.out.println();
        System.out.println ("SSS No: " + _employee.getEmployeeSSS());
        System.out.println ("Philheath No: " + _employee.getEmployeePhilhealth());
        System.out.println ("PagIBIG No: " + _employee.getEmployeePagibig());
        System.out.println ("TIN No: " + _employee.getEmployeeTIN());
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        System.out.println();
        System.out.println("PAYSLIP");
        System.out.println("======================================");
        System.out.println();
        System.out.println("Date Worked: " + _employee.getDate());
        System.out.println("Total Hours Worked: " + _employee.computeHoursWorked());
        System.out.println("Hourly Rate: " + _employee.getHourlyRate());
        System.out.println("----------------------");
        System.out.println("BASIC PAY: " + _employee.basicPay());
        System.out.println();
        System.out.println("Deminimis");
        System.out.println("Rice Subsidy: " + _employee.getRiceSubsidy());
        System.out.println("Phone Allowance: " + _employee.getPhoneAllowance());
        System.out.println("Clothing Allowance: " + _employee.getClothingAllowance());
        System.out.println("----------------------");
        System.out.println("GROSS PAY: " + _employee.grossPay());
        System.out.println();
        System.out.println("(Deductions)");
        System.out.println("PAG-IBIG: " + _employee.getPagibig());
        System.out.println("Philhealth: " + _employee.getPhilhealth());
        System.out.println("SSS: " + _employee.getSSS());
        System.out.println("----------------------");
        System.out.println("TAXABLE INCOME: " + _employee.getTaxableIncome());
        System.out.println();
        System.out.println("(Less)");
        System.out.println("Withholding Tax: " + _employee.getWithholdingTax());
        System.out.println("----------------------");
        System.out.println("NET PAY: " + _employee.getNetPay());
        System.out.println();
        System.out.println("======================================");
    }
       
}
