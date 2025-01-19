public class Footballs {
    private String playerName;
    private Integer countgamesToClub;
    private String country;
    private String role;

    public Footballs(String playerName, Integer countgamesToClub, String country, String role) {
        this.playerName = playerName;
        this.countgamesToClub = countgamesToClub;
        this.country = country;
        this.role = role;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getCountgamesToClub() {
        return countgamesToClub;
    }

    public void setCountgamesToClub(Integer countgamesToClub) {
        this.countgamesToClub = countgamesToClub;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Footballs{" +
                "playerName='" + playerName + '\'' +
                ", countgamesToClub=" + countgamesToClub +
                ", country='" + country + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
