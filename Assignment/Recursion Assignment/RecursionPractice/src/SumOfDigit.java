class SumOfDigit {

    public static void main(String[] args) {
        int n = 12992392;
        System.out.println(sumofd(n));
    }

    static int sumofd(int n) {
        if (n <= 0) {
            return 0;
        }
        return n % 10 + sumofd(n / 10);
    }

}
