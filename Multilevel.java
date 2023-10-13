class Boy {
    void physically()
    {System.out.println("Boy is physically strong!!");}
}
class girl extends Boy {
    void mentally()
    {System.out.println("girl is mentally strong!!");}
}
class baby extends girl {
    void chemically()
    {System.out.println("baby is chemically strong");}
}
class Multilevel{
    public static void main(String[] args) {
        baby b = new baby();
        b.chemically();
        b.mentally();
        b.physically();
    }
}
