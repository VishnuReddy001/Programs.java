class single {
    void physical()
    {System.out.println("GIRL...!!");}
}
class multi extends single{
    void mental()
    {System.out.println("BOY...!!");}
}
class level extends single {
    void chemical()
    {System.out.println("BAB...!!");}
}
class Hierarchical {
    public static void main(String[] args) {
        level l = new level();
        l.chemical();
        l.physical();
    }
}