package Exercise1;
import java.util.Date;

public class Singers {
    private int singerId;
    private String singerName;
    private String singerAddress;
    private Date dateOfBirth;
    private int noOfAlbPublished;
    //constructor
    public Singers(){
        this.singerId = 0;
        this.singerName = "";
        this.singerAddress = "";
        this.dateOfBirth = null;
        this.noOfAlbPublished = 0;
    }
    public Singers(int singerId){
        this.singerId = singerId;
    }
    public Singers(int singerId, String singerName){
        this.singerId = singerId;
        this.singerName = singerName;
    }
    public Singers(int singerId, String singerName, String singerAddress){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;

    }
    public Singers(int singerId, String singerName, String singerAddress, Date dateOfBirth){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;

    }
    public Singers(int singerId, String singerName, String singerAddress,Date dateOfBirth, int noOfAlbPublished){
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.noOfAlbPublished = noOfAlbPublished;
    }
    //get and set
    public int getSingerId() {
        return singerId;
    }
    public String getSingerName() {
        return singerName;
    }
    public String getSingerAddress() {
        return singerAddress;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public int getNoOfAlbPublished() {
        return noOfAlbPublished;
    }
    public void setSingerId(int singerId) {
        this.singerId = singerId;
    }
    public void setSingerName(String singerName) {
        this.singerName = singerName;

    }
    public void setSingerAddress(String singerAddress) {
        this.singerAddress = singerAddress;

    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setNoOfAlbPublished(int noOfAlbPublished) {
        this.noOfAlbPublished = noOfAlbPublished;
    }
    //All
    public void setWhole(int singerId,String singerName,String singerAddress,Date dateOfBirth,int noOfAlbPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.noOfAlbPublished = noOfAlbPublished;
    }
    //Display
    public void displaySingerDetails() {
        System.out.println("Singer ID: " + singerId);
        System.out.println("Singer Name: " + singerName);
        System.out.println("Singer Address: " + singerAddress);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Number of Album Published: " + noOfAlbPublished);
    }
}
