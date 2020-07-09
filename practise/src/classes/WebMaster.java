package classes;

public class WebMaster extends User implements Cloneable{

    public String adress;

    public WebMaster(int id, String login, String password, String adress) {
        super(id, login, password);
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }



    @Override
    public String toString() {
        return "WebMaster{" +
                "adress='" + adress + '\'' + id +
                '}';
    }

    @Override
    public void printUser() {

    }
    @Override
    public WebMaster clone(){
        return new WebMaster(id, login, password, adress);
    }
}
