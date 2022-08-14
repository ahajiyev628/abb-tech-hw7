public class RoboCat extends Pet {
    public RoboCat(AnimalSpecies species, String nickname, int age, int tricklevel, String[] habits) {
        super(species, nickname, age, tricklevel, habits);
        setSpecies(AnimalSpecies.ROBOCAT);
    }

    @Override
    public String eat() {
        return "RoboCat eats";
    }

    @Override
    public String respond() {
        return "RoboCat responds";
    }

    @Override
    public String foul() {
        return "RoboCat fouls";
    }
}