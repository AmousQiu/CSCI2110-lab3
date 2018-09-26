public class StudentRecord {
    private String firstName;
    private String lastName;
    private int bannerID;

    StudentRecord(String firstName, String lastName, int bannerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bannerID = bannerID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBannerID(int bannerID) {
        this.bannerID = bannerID;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBannerID() {
        return bannerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + bannerID;
    }
}
