interface a {
    void physical();
}
interface b {
    void mental();
}
class strong implements a, b {
    public void physical() 
    {
        System.out.println("Which one we need to use Classes or Interface to compile the Multiple Inheritance in java ??");
    }
    public void mental() 
    {
        System.out.println("-->By using Interface, we can compile the Multiple Inheritance in java");
    }
      public static void main(String[] args) 
      {
        strong s = new strong();
        s.physical();
        s.mental();
}
}
