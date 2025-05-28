class ifelse {

    public static void main(String args[]) {

        int age = 25;
        if (age > 18 && age < 60) {
            if (age > 20 && age < 30) {
                System.out.println("You are in 30`s");

            } else if (age >= 30 && age < 40) {
                System.out.println("You are in 40`s");

            } else {
                System.out.println("You are in 50`s");
            }
        } else if (age >= 60 && age < 100) {

            System.out.println("You are Older Person");

        } else {
            System.out.println("You are Minor");
        }
    }
}