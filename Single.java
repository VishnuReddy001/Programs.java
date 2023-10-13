class Single {
    void Rating()
    {System.out.println("5 out of 5 !!");}
}
class Tea extends  Single {
    void Rating()
    {System.out.println("4 out of 5 !!");}
}
class single {
    public static void main(String[] args) {
        Tea t = new Tea();
        t.Rating();
        Single c = new Single();
        c.Rating();
    }
}