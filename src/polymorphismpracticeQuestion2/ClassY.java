package polymorphismpracticeQuestion2;


    class X
    {
        static void methodOfX()
        {
            System.out.println("Class X");
        }
    }

    class Y extends X
    {
        //@Override compile time error will be appear
        static void methodOfX()//method is static ,so static method can't override static are method class level method
        {
            System.out.println("Class X");
        }


        public static void main(String[] args) {

        }
    }


