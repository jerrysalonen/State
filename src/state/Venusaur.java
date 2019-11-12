package state;

/**
 * @author Jerry Salonen
 */
public class Venusaur implements PokemonState {
    @Override
    public void attack() {
        System.out.println("Attacked for 30hp!");
    }

    @Override
    public void defense() {
        System.out.println("Defence went up by 15hp.");
    }

    @Override
    public void cry() {
        System.out.println("Venusaur!!!");
    }
}
