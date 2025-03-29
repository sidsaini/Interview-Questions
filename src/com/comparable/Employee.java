package com.comparable;

public class Employee implements Comparable<Employee> {

    private String name;
    private Long phoneNo;
    private int empId;

    public Employee(String name, Long phoneNo, int empId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", empId=" + empId +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Long.compare(this.phoneNo, o.phoneNo);
        //return this.name.CompareTo(o.name);
        //return this.empId - o.empId;
    }
}
