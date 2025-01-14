import java.util.Arrays;

public class Enum {
    public static void main(String[] args) {
        FootbalRole smolov = new FootbalRole("Fedor Smolov", FootbalRoleList.captain, CountryList.Russia, 720);
        if (smolov.getPlayerRole().equals(FootbalRoleList.captain)) {
            System.out.println("Победа почти у нас в кармане");
        } else {
            System.out.println("Придется попотеть");
        }

    }
}
