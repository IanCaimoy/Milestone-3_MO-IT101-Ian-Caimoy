/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;
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
class Employee
{
    // Declaration of Variables
    // Employee Details
    private String _employeeNo;
    private String _employeeLastName;
    private String _employeeFirstName;
    private String _employeeBday;
    private String _employeePhone;
    private String _employeeAddress;
    private String _employeeSSS;
    private String _employeePhilhealth;
    private String _employeeTin;
    private String _employeePagibig;
    private String _employeeStatus;
    private String _employeePosition;
    private String _employeeSupervisor;
    
    // Declaration of Variables
    // Employee DTR
    // Salary Calculation
    private int _week;
    private LocalTime _timeIn;
    private LocalTime _timeOut;
    private float _totalHoursWorked;
    private float _hourlyRate;
    private float _basicSalary;
    private float _riceSubsidy;
    private float _phoneAllowance;
    private float _clothingAllowance;
    
    
    // GETTER METHODS
    
    public String getEmployeeNo()
    {
        return _employeeNo;
    }
    public String getEmployeeFirstName()
    {
        return _employeeFirstName;
    }
    
    public String getEmployeeLastName()
    {
        return _employeeLastName;
    }
    
    public String getEmployeeBday()
    {
        return _employeeBday;
    }
    
    public String getEmployeePhone()
    {
        return _employeePhone;
    }
    
    public String getEmployeeAddress()
    {
        return _employeeAddress;
    }
    
    public String getEmployeeSSS()
    {
        return _employeeSSS;
    }
    
    public String getEmployeePhilhealth()
    {
        return _employeePhilhealth;
    }
    
    public String getEmployeeTIN()
    {
        return _employeeTin;
    }
    
    public String getEmployeePagibig()
    {
        return _employeePagibig;
    }
    
    public String getEmployeeStatus()
    {
        return _employeeStatus;
    }
    
    public String getEmployeePosition()
    {
        return _employeePosition;
    }
    
    public String getEmployeeSupervisor()
    {
        return _employeeSupervisor;
    }
    
    public int getWeek()
    {
        return _week;
    }
    
    public LocalTime getTimeIn()
    {
        return _timeIn;
    }
    
    public LocalTime getTimeout()
    {
        return _timeOut;
    }
    
    public float getHourlyRate()
    {
        return _hourlyRate;
    }
    
    public float getBasicSalary()
    {
        return _basicSalary;
    }
    
    public float getWeeklyRiceSubsidy()
    {
        return _riceSubsidy / 4 ;
    }
    
    public float getWeeklyPhoneAllowance()
    {
        return _phoneAllowance / 4;
    }
    
    public float getWeeklyClothingAllowance()
    {
        return _clothingAllowance / 4;
    }
    
    public float getTotalHoursWorked()
    {
        return _totalHoursWorked;
    }
    
    // Compute Gross Salary method
    // Created a local variable "_totalHoursWorked" to get the value from "computeHoursWorked" method
    // Return value _totalHoursWorked * _hourlyRate
    public float basicPay()
    {
        return (float) (getTotalHoursWorked() * _hourlyRate);   
    }
    
    // Compute Gross Pay
    public float grossPay()
    {
        return basicPay() + getWeeklyRiceSubsidy() + getWeeklyPhoneAllowance() + getWeeklyClothingAllowance();
    }
    
    // THIS SECTION CONTAINS 
    // DEDUCTIONS
    // Withholding Tax
    
    // Compute PAGIBIG contribution
    // Getter Method + IF Statement
    public float computePagibigRate()
    {
        float basicPay = basicPay();
        float i = 1500;
        
        if (basicPay > 0 && basicPay <= i)
        {
            return basicPay * 0.01f;
        }
        else if (basicPay > i)
        {
            return basicPay * 0.02f;
        }
        else if (basicPay == 0)
        {
            return 0;
        }
        else
        {
            return 0;
        }
    }
        
    
    // Compute Max PAGIBIG Contribution    
    public float getPagibig()
    {
        float max = 100;
        if (computePagibigRate() > 0 && computePagibigRate() < max)
        {
            return computePagibigRate();
        }
        else if (computePagibigRate() == 0)
        {
            return 0;
        }
        else
        {
            return max;
        }
    }
    
    
    // Compute Philhealth
    public float getPhilhealth()
    {
        float basicPay = basicPay();
        float premiumRate = 0.03f;
        float minimum = 10000f;
        float maximum = 60000f;
        float employeeShare = 0.5f;
        
        if (basicPay > 0 && basicPay <= minimum)
        {
            return minimum * premiumRate * employeeShare;
        }
        else if (basicPay > minimum && basicPay < maximum)
        {
            return basicPay * premiumRate * employeeShare;
        }
        else if (basicPay > maximum)
        {
            return  maximum * premiumRate * employeeShare;
        }
        else if (basicPay == 0)
        {
            return 0;
        }
        else 
        {
            return 0;
        }
    }
    
    // Compute SSS
    public float getSSS()
    {
        float basicPay = basicPay();
        
        if (basicPay > 0 && basicPay < 3250f)
        {
            return 135f;
        }
        else if (basicPay >= 3250f && basicPay <= 3749.99f)
        {
            return 157.50f;
        }
        else if (basicPay >= 3750f && basicPay <= 4249.99f)
        {
            return 180f;
        }
        else if (basicPay >= 4250f && basicPay <= 4749.99f)
        {
            return 202.50f;
        }
        else if (basicPay >= 4750f && basicPay <= 5249.99f)
        {
            return 225f;
        }
        else if (basicPay >= 5250f && basicPay <= 5749.99f)
        {
            return 247.50f;
        }
        else if (basicPay >= 5750f && basicPay <= 6249.99f)
        {
            return 270f;
        }
        else if (basicPay >= 6250f && basicPay <= 6749.99f)
        {
            return 292.50f;
        }
        else if (basicPay >= 6750f && basicPay <= 7249.99f)
        {
            return 315f;
        }
        else if (basicPay >= 7250f && basicPay <= 7749.99f)
        {
            return 337.50f;
        }
        else if (basicPay >= 7750f && basicPay <= 8249.99f)
        {
            return 360f;
        }
        else if (basicPay >= 8250f && basicPay <= 8749.99f)
        {
            return 382.50f;
        }
        else if (basicPay >= 8750f && basicPay <= 9249.99f)
        {
            return 405.00f;
        }
        else if (basicPay >= 9250f && basicPay <= 9749.99f)
        {
            return 427.50f;
        }
        else if (basicPay >= 9750f && basicPay <= 10249.99f)
        {
            return 450f;
        }
        else if (basicPay >= 10250f && basicPay <= 10749.99f)
        {
            return 472.50f;
        }
        else if (basicPay >= 10750f && basicPay <= 11249.99f)
        {
            return 495f;
        }
        else if (basicPay >= 11250f && basicPay <= 11749.99f)
        {
            return 517.50f;
        }
        else if (basicPay >= 11750f && basicPay <= 12249.99f)
        {
            return 540f;
        }
        else if (basicPay >= 12250f && basicPay <= 12749.99f)
        {
            return 562.50f;
        }
        else if (basicPay >= 12750f && basicPay <= 13249.99f)
        {
            return 585f;
        }
        else if (basicPay >= 13250f && basicPay <= 13749.99f)
        {
            return 607.50f;
        }
        else if (basicPay >= 13750f && basicPay <= 14249.99f)
        {
            return 630f;
        }
        else if (basicPay >= 14250f && basicPay <= 14749.99f)
        {
            return 652.50f;
        }
        else if (basicPay >= 14750f && basicPay <= 15249.99f)
        {
            return 675f;
        }
        else if (basicPay >= 15250f && basicPay <= 15749.99f)
        {
            return 697.50f;
        }
        else if (basicPay >= 15750f && basicPay <= 16249.99f)
        {
            return 720f;
        }
        else if (basicPay >= 16250f && basicPay <= 16749.99f)
        {
            return 742.50f;
        }
        else if (basicPay >= 16750f && basicPay <= 17249.99f)
        {
            return 765f;
        }
        else if (basicPay >= 17250f && basicPay <= 17749.99f)
        {
            return 785.50f;
        }
        else if (basicPay >= 17750f && basicPay <= 18249.99f)
        {
            return 810f;
        }
        else if (basicPay >= 18250f && basicPay <= 18749.99f)
        {
            return 832.50f;
        }
        else if (basicPay >= 18750f && basicPay <= 19249.99f)
        {
            return 855f;
        }
        else if (basicPay >= 19250f && basicPay <= 19749.99f)
        {
            return 877.50f;
        }
        else if (basicPay >= 19750f && basicPay <= 20249.99f)
        {
            return 900f;
        }
        else if (basicPay >= 20250f && basicPay <= 20749.99f)
        {
            return 922.50f;
        }
        else if (basicPay >= 20750f && basicPay <= 21249.99f)
        {
            return 945f;
        }
        else if (basicPay >= 21250f && basicPay <= 21749.99f)
        {
            return 967.50f;
        }
        else if (basicPay >= 21750f && basicPay <= 22249.99f)
        {
            return 990f;
        }
        else if (basicPay >= 22250f && basicPay <= 22749.99f)
        {
            return 1012.50f;
        }
        else if (basicPay >= 22750f && basicPay <= 23249.99f)
        {
            return 1035f;
        }
        else if (basicPay >= 23250f && basicPay <= 23749.99f)
        {
            return 1057.50f;
        }
        else if (basicPay >= 23750f && basicPay <= 24249.99f)
        {
            return 1080f;
        }
        else if (basicPay >= 24250f && basicPay <= 24749.99f)
        {
            return 1102.50f;
        }
        else if (basicPay > 24750f)
        {
            return 1125f;
        }
        else if (basicPay == 0)
        {
            return 0;
        }
        else
        {
            return 0;
        }
    }
    
     // Taxable Income
     // Basic Pay - Deductions
     
     public float getTaxableIncome()  
        {
            return basicPay() - getPagibig() - getPhilhealth() - getSSS();
        }
    
     
     // Compute Withholding Tax
     public float getWithholdingTax()
     {
         float taxableIncome = getTaxableIncome();
         if (taxableIncome < 20833f)
         {
             return 0;
         }
         else if (taxableIncome >= 20833f && taxableIncome < 33333f)
         {
             return taxableIncome - 20833f * 0.20f;
         }
         else if (taxableIncome >= 33333f && taxableIncome < 66667f)
         {
             return taxableIncome - 33333 * 0.25f + 2500;
         }
         else if (taxableIncome >= 66667f && taxableIncome < 166667f)
         {
             return taxableIncome - 66667f * 0.30f + 10833;
         }
         else if (taxableIncome >= 166667f && taxableIncome < 666667f)
         {
             return taxableIncome - 166667f * 0.32f + 40833.33f;
         }
         else
         {
             return taxableIncome - 666667f * 0.35f + 200833.33f;
         }  
     }
     
     // Compute Net Pay
     // Taxable Income - Withholding Tax + De Minimis
     public float getNetPay()
     {
         return getTaxableIncome() - getWithholdingTax() + getWeeklyRiceSubsidy() + getWeeklyPhoneAllowance() + getWeeklyClothingAllowance();
     }
    
     
    // This section contains CSV Reading class/methods
    // Employee Records file reading
    // Sets the values for the declared variables
    public void displayEmployeeDetails (String employeeNo) throws FileNotFoundException, IOException, CsvValidationException
    {
        String filename = "MotorPH Employee Details - Corrected.csv";
        CSVReader reader = new CSVReader (new FileReader(filename));
        String[] header = reader.readNext();
        String[] record;
        while((record = reader.readNext()) != null)
        {
            if (record[0].equals(employeeNo))
            {
                _employeeNo = record[0];
                _employeeLastName = record[1];
                _employeeFirstName = record[2];
                _employeeBday = record[3];
                _employeeAddress = record[4];
                _employeePhone = record[5];
                _employeeSSS = record[6];
                _employeePhilhealth = record[7];
                _employeeTin = record[8];
                _employeePagibig = record[9];
                _employeeStatus = record[10];
                _employeePosition = record[11];
                _employeeSupervisor = record[12];
                _basicSalary = Float.parseFloat(record[13]);
                _riceSubsidy = Float.parseFloat(record[14]);
                _phoneAllowance = Float.parseFloat(record[15]);
                _clothingAllowance = Float.parseFloat(record[16]);
                _hourlyRate = Float.parseFloat(record[18]);    
            }
        }
    }
    
    
    // Employee Attendance File Reading
    // Sets the values for the declared variables 
    public void computeHoursWorked (String employeeNo, int weekNo) throws FileNotFoundException, IOException, CsvValidationException
    {
        String filename = "MotorPH Employee Attendance - Corrected.csv";
        CSVReader reader = new CSVReader (new FileReader(filename));
        String[] header = reader.readNext();
        String[] attendance;
        while ((attendance = reader.readNext()) != null)
        {
            if (attendance[0].equals(employeeNo)&& Integer.parseInt(attendance[4]) == weekNo)
            {
                String strTimeIn = attendance[5];
                String strTimeOut = attendance[6];
                _week = Integer.parseInt(attendance[4]);
                _timeIn = LocalTime.parse(strTimeIn);
                _timeOut = LocalTime.parse(strTimeOut);
                
                //compute hours worked
                Duration duration = Duration.between(_timeIn, _timeOut);
                long minutes = duration.toMinutes();
                double hours = (double) minutes / 60;
                
                _totalHoursWorked += hours;
                
            }
        }
    }    
}
