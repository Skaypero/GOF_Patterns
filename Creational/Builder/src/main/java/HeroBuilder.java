public class HeroBuilder implements Builder {
    private Hero hero;

    public HeroBuilder() {
        hero = new Hero();
    }

    @Override
    public Builder setName(String name) {
        hero.setName(name);
        return this;
    }

    @Override
    public Builder setWeapon(String weapon) {
        hero.setWeapon(weapon);
        return this;
    }

    @Override
    public Builder setArmor(String armor) {
        hero.setArmor(armor);
        return this;
    }

    @Override
    public Builder setLevel(int level) {
        hero.setLevel(level);
        return this;
    }

    @Override
    public Builder addAbility(String ability) {
        hero.setAbility(ability);
        return this;
    }

    @Override
    public Hero build() {
        return hero;
    }
}
