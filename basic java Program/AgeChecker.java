class AgeCheckar {

    public static void main(String args[]) {

        int age = 19;
        if (age > 18 && age <= 60) {

            if (age > 20 && age >= 30) {

                System.out.println("You are in 20");

            } else if (age > 30 && age <= 40) {

                System.out.println("You are in you 40`th");
            } else {
                System.out.println("You are in Teenager");
            }

        }

    }
}