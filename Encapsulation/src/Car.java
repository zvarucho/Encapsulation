public class Car {
  private String marks;
  private int year;
  private String  maxSpeed;
  public String getMarks() {
    return marks;
  }

  public void setMarks(String newMarks) {
    this.marks = newMarks;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int newYear) {
    if(newYear >= 1800 && newYear <= 2022) {
      year = newYear;
    } else {
      throw new IllegalArgumentException("Value must be between 1800 and 2022");
    }
  }

  public String getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(String newMaxSpeed) {
    this.maxSpeed = newMaxSpeed;
  }
}
