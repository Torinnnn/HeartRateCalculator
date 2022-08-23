public class HeartRates {
    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int currentYear;

    public HeartRates(String firstName, String lastName, int dateOfBirth, int monthOfBirth, int yearOfBirth, int currentYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.currentYear = currentYear;

        }




    public  int age(){
        int patientAge = this.currentYear - this.yearOfBirth;
      return patientAge;

    }

    public  int maximumHeartRate(){
       int patientMaxHeartRate = 220 - this.age();
        return patientMaxHeartRate;

    }

    public  String targetHeartRate(){
        double patientTargetHeartRateRange1 = 0.5 * this.maximumHeartRate();
        double patientTargetHeartRateRange2 = 0.85 * this.maximumHeartRate();
        String patientTargetHeartRateRange = patientTargetHeartRateRange1 + " to " + patientTargetHeartRateRange2;
        return patientTargetHeartRateRange;

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth(){
        return dateOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = dateOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    public int getCurrentYear() {
        return currentYear ;
    }




}
