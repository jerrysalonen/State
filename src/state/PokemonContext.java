package state;

/**
 * @author Jerry Salonen
 */
public class PokemonContext {

    private PokemonState current;

    public PokemonContext() {
        // default value
        current = new Bulbasaur();
    }

    public void setState(PokemonState state) {
        this.current = state;
    }

    public void attack() {
        current.attack();
    }

    public void defense() {
        current.defense();
    }

    public void cry() {
        current.cry();
    }

}