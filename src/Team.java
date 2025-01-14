public class Team {

    private String country;

    private int playInClub;

//    public void beepBeep(){
//        System.out.println("Машина посигналила");
//    }


    public Team(String country, int playInClub) {
        this.country = country;
        this.playInClub = playInClub;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPlayInClub() {
        return playInClub;
    }

    public void setPlayInClub(int playInClub) {
        this.playInClub = playInClub;
    }
}
