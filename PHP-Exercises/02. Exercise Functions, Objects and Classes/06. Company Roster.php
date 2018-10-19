<?php
/*
 Define a class Employee that holds the following information: name, salary, position, department, email and age.
The name, salary, position and department are mandatory while the rest are optional.
Your task is to write a program which takes N lines of employees from the console and calculates the department
with the highest average salary and prints for each employee in that department his name, salary, email and age –
sorted by salary in descending order. If an employee doesn’t have an email – in place of that field you should print
“n/a” instead, if he doesn’t have an age – print “-1” instead. The salary should be printed to two decimal places
after the seperator.
 */

class Employee
{
    private $name;
    private $salary;
    private $position;
    private $department;
    private $email;
    private $age;

    public function __construct(string $name, float $salary,
                                string $position, string $department,
                                string $email = "n/a", int $age = -1)
    {
        $this->name = $name;
        $this->salary = $salary;
        $this->position = $position;
        $this->department = $department;
        $this->email = $email;
        $this->age = $age;
    }

    /**
     * @return string
     */
    public function getName(): string
    {
        return $this->name;
    }

    /**
     * @return float
     */
    public function getSalary(): float
    {
        return $this->salary;
    }

    /**
     * @return string
     */
    public function getDepartment(): string
    {
        return $this->department;
    }

    /**
     * @return string
     */
    public function getEmail(): string
    {
        return $this->email;
    }

    /**
     * @return int
     */
    public function getAge(): int
    {
        return $this->age;
    }

    public function __toString(): string
    {
        $salaryFormat = number_format($this->getSalary(), 2);
        return "{$this->getName()} {$salaryFormat} {$this->getEmail()} {$this->getAge()}\n";
    }
}

class Department
{
    private $name;
    private $employees;

    public function __construct($name)
    {
        $this->name = $name;
        $this->employees = [];
    }

    public function addEmployee(Employee $employee)
    {
        $this->employees[] = $employee;
    }

    /**
     * @return mixed
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * @return array
     */
    public function getEmployees(): array
    {
        return $this->employees;
    }

    public function avgSalary(): float
    {
        $sum = 0;
        foreach ($this->employees as $employee) {
            $sum += $employee->getSalary();
        }
        return $sum / count($this->employees);
    }
}

$n = intval(readline());

$departments = [];

while ($n-- > 0) {
    $input = explode(" ", readline());

    $employeeName = $input[0];
    $employeeSalary = floatval($input[1]);
    $employeePosition = $input[2];
    $departmentName = $input[3];

    if (count($input) == 4) {
        $employee = new Employee($employeeName, $employeeSalary, $employeePosition, $departmentName);
    } elseif (count($input) == 5) {
        if (is_numeric($input[4])) {
            $employee = new Employee($employeeName, $employeeSalary, $employeePosition, $departmentName,
                "n/l", intval($input[4]));
        } else {
            $employee = new Employee($employeeName, $employeeSalary, $employeePosition, $departmentName,
                $input[4]);
        }
    } else {
        $employee = new Employee($employeeName, $employeeSalary, $employeePosition, $departmentName,
            $input[4], intval($input[5]));
    }

    if (!array_key_exists($departmentName, $departments)) {
        $department = new Department($departmentName);
        $departments[$departmentName] = $department;
    }
    $departments[$departmentName]->addEmployee($employee);
}

usort($departments, function (Department $d1, Department $d2) {
    return $d2->avgSalary() <=> $d1->avgSalary();
});

$departmentNameKey = $departments[0]->getName();
$firstDepartment = $departments[0]->getEmployees();

usort($firstDepartment, function (Employee $e1, Employee $e2) {
    return $e2->getSalary() <=> $e1->getSalary();
});

echo "Highest Average Salary: {$departmentNameKey}\n";
foreach ($firstDepartment as $employee) {
    echo $employee;
}