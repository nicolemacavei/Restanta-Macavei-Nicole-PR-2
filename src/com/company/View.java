package com.company;
import java.util.ArrayList; import java.util.List; import java.util.Scanner; public class View {

    Controller cntr; public View(Controller cntr){
        this.cntr = cntr; }

    public void run() {
        Scanner scanner = new Scanner(System.in); loop:
        while (true) {
            System.out.println(" 0. Exit Program \r 1. Show all Mitarbeiter \r 2. Show all Team \r 3. Add a Mitarbeiter \r 4. Add an Team \r 5. Remove a Mitarbeiter \r 6. Remove an Team \r 7. Update a Mitarbeiter \r 8. Update an Team \r ");
            System.out.println("Enter input: "); int variant = scanner.nextInt();
            System.out.println("You've entered: " + variant); switch (variant) {
                case 0:
                    break loop; case 1:

                    break; case 2:

                    break; case 3:

                    break; case 4:

                    break; case 5:

                    break; case 6:

                    break; case 7:

                    break; case 8:

                case 9:

                    break; case 10:

                    break; }

        }
    }

}