public class HeroDirector {
    private final Builder builder;

    public HeroDirector(Builder builder) {
        this.builder = builder;
    }

    public Hero createDefaultWarrior() {
        return builder
                .setName("Hero")
                .setWeapon("Sword")
                .setArmor("Armor")
                .setLevel(1)
                .build();
    }
}
