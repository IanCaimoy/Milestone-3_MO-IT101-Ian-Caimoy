/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Classes;
import java.util.Scanner;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.time.LocalTime;
/**
 *
 * @author Ian Kent
 */

public class Main 
{
    private static final HashSet<String> validEmployeeNumbers = new HashSet<>
        (Arrays.asList("10001", "10002", "10003", "10004", "10005", "10006", "10007", "10008", "10009", "10010",
                    "10011", "10012", "10013", "10014", "10015", "10016", "10017", "10018", "10019", "10020", "10021",
                    "10022", "10023", "10024", "10025"));

    public static void main(String[] args) throws IOException, FileNotFoundException, CsvValidationException 
    {
        // Instance declaration
        Scanner employee = new Scanner(System.in);
        String employeeNo;
        
        // Do - While loop
        do 
        {
            System.out.print("Enter Employee No: ");
            employeeNo = employee.nextLine();

            if (!validEmployeeNumbers.contains(employeeNo)) 
            {
                System.out.println("Please enter a valid employee number.");
            }
        } 
        while (!validEmployeeNumbers.contains(employeeNo));

        Employee _employee = new Employee();
        _employee.displayEmployeeDetails(employeeNo);
        

        // Display Employee Details
        System.out.println();
        System.out.println();
        System.out.println("EMPLOYEE DETAILS");
        System.out.println("============================");
        System.out.println();
        System.out.println("Employee No: " + _employee.getEmployeeNo());
        System.out.println();
        System.out.println("First Name: " + _employee.getEmployeeFirstName());
        System.out.println("Last Name: " + _employee.getEmployeeLastName());
        System.out.println("Birthday: " + _employee.getEmployeeBday());
        System.out.println("Address: " + _employee.getEmployeeAddress());
        System.out.println("Phone Number: " + _employee.getEmployeePhone());
        System.out.println();
        System.out.println("Position: " + _employee.getEmployeePosition());
        System.out.println("Status: " + _employee.getEmployeeStatus());
        System.out.println("Immediate Supervisor: " + _employee.getEmployeeSupervisor());
        System.out.println();
        System.out.println("SSS No: " + _employee.getEmployeeSSS());
        System.out.println("Philhealth No: " + _employee.getEmployeePhilhealth());
        System.out.println("PagIBIG No: " + _employee.getEmployeePagibig());
        System.out.println("TIN No: " + _employee.getEmployeeTIN());
        System.out.println();
        System.out.println("============================");
        System.out.println();
        System.out.println();
        
        
        // Prompt User for Payslip printing
        Scanner input = new Scanner(System.in);
        Scanner week = new Scanner(System.in);
        String userInput;
        
        while (true) 
        {
            System.out.print("Do you wish to print your Payslip? (YES/NO): ");
            userInput = input.nextLine().toUpperCase();

            if (userInput.equals("YES")) 
            {
                int weekNo;
                while (true) 
                {
                    System.out.print("Enter Week No. (1-53): ");
                    weekNo = week.nextInt();

                    if (weekNo >= 1 && weekNo <= 53) 
                    {
                        break;
                    } 
                    else 
                    {
                        System.out.println("Invalid week number. Please enter a value between 1-53.");
                    }
                }

                _employee.computeHoursWorked(employeeNo, weekNo);

                System.out.println();
                System.out.println();
                System.out.println("PAYSLIP");
                System.out.println("============================");
                System.out.println();
                System.out.println("Week No: " + _employee.getWeek());
                System.out.println("Total Hours Worked: " + _employee.getTotalHoursWorked());
                System.out.println("Hourly Rate: " + _employee.getHourlyRate());
                System.out.println("============================");
                System.out.printf ("BASIC PAY: %.2f", _employee.basicPay());
                System.out.println();
                System.out.println();
                System.out.println("DE MINIMIS");
                System.out.println("Rice Subsidy: " + _employee.getWeeklyRiceSubsidy());
                System.out.println("Phone Allowance: " + _employee.getWeeklyPhoneAllowance());
                System.out.println("Clothing Allowance: " + _employee.getWeeklyClothingAllowance());
                System.out.println("============================");
                System.out.printf("GROSS PAY: %.2f", _employee.grossPay());
                System.out.println();
                System.out.println();
                System.out.println("(DEDUCTIONS)");
                System.out.println("PAG-IBIG: " + _employee.getPagibig());
                System.out.println("Philhealth: " + _employee.getPhilhealth());
                System.out.println("SSS: " + _employee.getSSS());
                System.out.println("Withholding TAX: " + _employee.getWithholdingTax());
                System.out.println("============================");
                System.out.println();
                System.out.printf ("NET PAY: %.2f" , _employee.getNetPay());
                System.out.println();
                System.out.println();
                break;
            } 
            else if (userInput.equals("NO")) 
            {
                System.out.println("Thank you for your hard work!");
                break;
            } 
            else 
            {
                System.out.println("Invalid input. Please enter YES or NO.");
            }
        }
    }    
}
