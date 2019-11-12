package state;

/**
 * @author Jerry Salonen
 */
public class Bulbasaur implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Attacked for 10hp!");
    }

    @Override
    public void defense() {
        System.out.println("Defence went up by 5hp.");
    }

    @Override
    public void cry() {
        System.out.println("Bulbasaur!!!");
    }
}
