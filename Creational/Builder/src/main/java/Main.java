public class Main {
    public static void main(String[] args) {
        Hero builder = new HeroBuilder()
                .setName("Ivan")
                .setWeapon("Bow")
                .setArmor("Helmet")
                .setLevel(10)
                .addAbility("Invisible")
                .addAbility("SuperPunch")
                .build();

        HeroDirector director = new HeroDirector(new HeroBuilder());
        Hero defaultHero = director.createDefaultWarrior();

        System.out.println(builder.getAbilities());
        System.out.println(defaultHero.getAbilities());
    }
}
