class demo3//multiple method parameterized program,object created by user
{
    int n1,n2,ans;
    void init(int num1,int num2)
    {
        n1=num1;
        n2=num2;
    }
    void calc()
    {
        ans=n1+n2;
    }
    void display()
    {
        System.out.println(ans);
    }
    public static void main()
    {
        demo3 obj1=new demo3();//object creation
        obj1.init(4,6);//caller
        obj1.calc();
        obj1.display();
    }
}