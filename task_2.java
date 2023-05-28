
@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    assertEquals("ƒолжно вернутьс€ true, так как пользователь совершеннолетний", true, isAdult);
}
// Ќапиши код здесь
@Test
public void checkIsAdultWhenAgeIsLessThan18False() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(17);
    assertEquals("ƒолжно вернутьс€ false, так как пользователь несовершеннолетний", false, isAdult);
}

@Test
public void checkIsAdultWhenAgeIs18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(18);
    assertEquals("ƒолжно вернутьс€ true, так как пользователь совершеннолетний", true, isAdult);
}