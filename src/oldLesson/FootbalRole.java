package oldLesson;

public class FootbalRole {

//Описание объекта
    private String playerName;
    private FootbalRoleList playerRole;
    private CountryList placeOfBirht;
    private Integer countgamesToDinamo;

// конструктор
    public FootbalRole(String playerName, FootbalRoleList playerRole, CountryList placeOfBirht, Integer countgamesToDinamo) {
        this.playerName = playerName;
        this.playerRole = playerRole;
        this.placeOfBirht = placeOfBirht;
        this.countgamesToDinamo = countgamesToDinamo;
    }

// геттеры и сеттеры
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public FootbalRoleList getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(FootbalRoleList playerRole) {
        this.playerRole = playerRole;
    }

    public CountryList getPlaceOfBirht() {
        return placeOfBirht;
    }

    public void setPlaceOfBirht(CountryList placeOfBirht) {
        this.placeOfBirht = placeOfBirht;
    }

    public Integer getCountgamesToDinamo() {
        return countgamesToDinamo;
    }

    public void setCountgamesToDinamo(Integer countgamesToDinamo) {
        this.countgamesToDinamo = countgamesToDinamo;
    }
}
