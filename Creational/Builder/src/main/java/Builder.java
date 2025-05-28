public interface Builder {
    Builder setName(String name);
    Builder setWeapon(String weapon);
    Builder setArmor(String armor);
    Builder setLevel(int level);
    Builder addAbility(String ability);
    Hero build();
}
