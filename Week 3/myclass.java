class myclass {
    static int count = 0;
    final double pi = 3.14;

    myclass() {
        count++;
    }

    public static void main(String[] args) {
        myclass object1 = new myclass();
        myclass object2 = new myclass();
        myclass object3 = new myclass();

        System.out.println("The value of Count variable : " + count);
        System.out.println("The value of Pi variable : " + object1.pi);
    }
}
