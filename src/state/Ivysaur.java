package state;

/**
 * @author Jerry Salonen
 */
public class Ivysaur implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Attacked for 20hp!");
    }

    @Override
    public void defense() {
        System.out.println("Defence went up by 10hp.");
    }

    @Override
    public void cry() {
        System.out.println("Ivysaur!!!");
    }
}
