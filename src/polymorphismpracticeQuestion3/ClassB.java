package polymorphismpracticeQuestion3;

//28) In the below example, Class B extends Class A. Which method of Class A is not properly overridden in class B?

class  ClassA
{
    void methodOne(Double D)
    {

    }

    int methodTwo(Integer I)
    {
        return I;
    }
}

class ClassB extends ClassA
{
   //A @Override// compile time error because here primitive data type is use but another method wrapper class used
    void methodOne(double d)//if d smaller we can not get out put you got compile time error
    {

    }

    @Override
    int methodTwo(Integer I)
    {
        return (int)1.1;
    }
    //here main method is not written
}