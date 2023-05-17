public class NuttyDecorator extends IcecreamDecorator
{

    public NuttyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    @Override
    public String makeIcecream() {
        return super.makeIcecream()+addNuts();
    }

    private String addNuts()
    {
        return "+ Crunchy Nuts ";
    }
}
