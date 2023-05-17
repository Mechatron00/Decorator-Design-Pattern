public class HoneyDecorator extends IcecreamDecorator
{
    public HoneyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    @Override
    public String makeIcecream() {
        return super.makeIcecream()+addHoney();
    }

    private String addHoney()
    {
        return "+ Golden Honey";
    }
}
