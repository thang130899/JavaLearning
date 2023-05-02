package Exercise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        String name, gender, address, branch, task;
        int age, level;

        while (true) {
            System.out.println("\n--Application Manager Officer--");
            System.out.println("Enter 1: To insert officer");
            System.out.println("Enter 2: To search officer by name");
            System.out.println("Enter 3: To show information officers");
            System.out.println("Enter 4: To exit");
            String line = scanner.nextLine();

            switch (line) {
                case "1": {
                    System.out.println("Enter a: to insert Engineer");
                    System.out.println("Enter b: to insert Worker");
                    System.out.println("Enter c: to insert Staff");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a":
                            System.out.print("Enter name: ");
                            name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            address = scanner.nextLine();
                            System.out.print("Enter major: ");
                            branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, address, gender, branch);
                            managerOfficer.AddNewOfficer(engineer);
                            System.out.println(engineer);
                            System.out.println();
                            break;

                        case "b":
                            System.out.print("Enter name: ");
                            name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            address = scanner.nextLine();
                            System.out.print("Enter level: ");
                            level = scanner.nextInt();
                            Officer worker = new Worker(name, age, address, gender, level);
                            managerOfficer.AddNewOfficer(worker);
                            System.out.println(worker);
                            scanner.nextLine();
                            System.out.println();
                            break;

                        case "c":
                            System.out.print("Enter name: ");
                            name = scanner.nextLine();
                            System.out.print("Enter age: ");
                            age = scanner.nextInt();
                            System.out.print("Enter gender: ");
                            scanner.nextLine();
                            gender = scanner.nextLine();
                            System.out.print("Enter address: ");
                            address = scanner.nextLine();
                            System.out.print("Enter task: ");
                            task = scanner.nextLine();
                            Officer staff = new Staff(name, age, address, gender, task);
                            managerOfficer.AddNewOfficer(staff);
                            System.out.println(staff);
                            System.out.println();
                            break;

                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
                    managerOfficer.FindByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerOfficer.FindByInfo();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}

//        // Dec to Bin
//        int i = 60; //101
//        System.out.printf("%d %d %d\n", i >> 0, i >> 1, i >> 2);
//        System.out.printf("%d \t %s\n", i >> 0, DectoBin(i >> 0));
//        System.out.printf("%d \t %s\n", i >> 1, DectoBin(i >> 1));
//        System.out.printf("%d \t %s\n", i >> 2, DectoBin(i >> 2));
//    public static String DectoBin(int i) {
//        String str = "", temp;
//        int div = i;
//        while (div != 0) {
//            div = div % 2;
//            temp = Integer.toString(div);
//            str = str.concat(temp);
//            i = i / 2;
//            div = i;
//        }
//        ;
//        StringBuilder binStr = new StringBuilder(str);
//        binStr.reverse();
//        return binStr.toString();
//    }

