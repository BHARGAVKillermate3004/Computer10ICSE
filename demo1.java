class demo1
{
    int num1,num2,ans;
    void init()
    {
        num1=5;
        num2=6;
    }
    void calc()
    {
        ans=num1+num2;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        demo1 obj=new demo1();
        obj.init();
        obj.calc();
        obj.display();
    }
}
