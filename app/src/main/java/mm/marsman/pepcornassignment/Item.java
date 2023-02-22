package mm.marsman.pepcornassignment;

public class Item {
    String user_id;
    String name;
    String status;
    String pay_id;


    public Item(String user_id, String name, String status, String pay_id) {
        this.user_id = user_id;
        this.name = name;
        this.status = status;
        this.pay_id = pay_id;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPay_id() {
        return pay_id;
    }

    public void setPay_id(String pay_id) {
        this.pay_id = pay_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
