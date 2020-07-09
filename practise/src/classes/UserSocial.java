package classes;

public class UserSocial extends User implements Cloneable{

    private String name;
    public int height;

    public UserSocial(int id, String login, String password, String name, int height) {
        super(id, login, password);
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void printUser(){
        System.out.println(this.name);
    };

    @Override
    public String toString() {
        return "UserSocial{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }

    @Override
    public UserSocial clone(){
        return new UserSocial(id, login, password, name, height);
    }
}
