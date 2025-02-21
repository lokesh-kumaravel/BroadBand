package src.model;

public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private long phone_no;
    private String address;

    public User(int id, String name, String email, String password, long phone_no, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone_no = phone_no;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public long getPhone_no() {
        return phone_no;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone_no(long phone_no) {
        this.phone_no = phone_no;
    }

    public void setAdress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User ID: " + id + ", Name: " + name + ", Email: " + email + ", Password: " + password + ", Phone: "
                + phone_no + ", Address: " + address;
    }
}