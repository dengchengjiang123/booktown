package cn.dcj.bookcity.domain;

public class User {
    private int id;//id
    private  String username;//用户名
    private  String password;//密码
    private  String email;//邮箱
    private  String verification;//判断是否经过邮箱设置，其值如果经过邮箱设置则为Y 否则为N
    private  String e_code;//跟着邮箱的唯一表示验证码

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", verification='" + verification + '\'' +
                ", e_code='" + e_code + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVerification() {
        return verification;
    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public String getE_code() {
        return e_code;
    }

    public void setE_code(String e_code) {
        this.e_code = e_code;
    }
}
