package classes;

public abstract class User implements PrintData{

    public int id;
    public String login;
    public String password;

    public User(int id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void setId() {
        setId(0);
    }

    public void setLogin() {
       setLogin("guest");
    }

    public void setPassword() {
        setPassword("");
    }

    public abstract void printUser();
}
