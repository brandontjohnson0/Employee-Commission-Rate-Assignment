//Employee -- Creates superclass Employee
//CSIS 312-D01
//References
//Deitel, P. J., & Deitel, H. (2021, April 12). Java How to Program, Late Objects 11th Edition. Retrieved September 17, 2017, from VitalSource: https://www.vitalsource.com/
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee (String firstName, String lastName, String socialSecurityNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public String getSocialSecurityNumber() {return socialSecurityNumber;}

    public String toString() {
            return String.format("%s: %s %s%n%s: %s",
                    "employee", getFirstName(), getLastName(),
                    "social security number", getSocialSecurityNumber());
    }
}
