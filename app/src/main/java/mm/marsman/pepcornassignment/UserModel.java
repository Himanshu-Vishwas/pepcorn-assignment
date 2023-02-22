package mm.marsman.pepcornassignment;

public class UserModel {
    String user_id;
    String name;
    int age;
    String pay_id;
    String pay_ref;

    public UserModel(String user_id, String name, int age, String pay_id, String pay_ref) {
        this.user_id = user_id;
        this.name = name;
        this.age = age;
        this.pay_id = pay_id;
        this.pay_ref = pay_ref;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPay_id() {
        return pay_id;
    }

    public void setPay_id(String pay_id) {
        this.pay_id = pay_id;
    }

    public String getPay_ref() {
        return pay_ref;
    }

    public void setPay_ref(String pay_ref) {
        this.pay_ref = pay_ref;
    }
}
