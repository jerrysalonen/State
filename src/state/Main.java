package state;

public class Main {

    public static void main(String[] args) {
        PokemonContext pokemonContext = new PokemonContext();

        System.out.println("Initial methods:");
        pokemonContext.attack();
        pokemonContext.defense();
        pokemonContext.cry();

        System.out.println("Next level: ");
        pokemonContext.setState(new Ivysaur());

        pokemonContext.attack();
        pokemonContext.defense();
        pokemonContext.cry();

        System.out.println("Final level: ");
        pokemonContext.setState(new Venusaur());

        pokemonContext.attack();
        pokemonContext.defense();
        pokemonContext.cry();
    }
}
