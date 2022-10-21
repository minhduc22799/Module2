package bai_tap;

import java.util.*;

public class ProductManager {
    public static ArrayList<Product> listProduct = new ArrayList<>();

    public static void main(String[] args) {
        listProduct.add(new Product(1, "Sanpham1", 100));
        listProduct.add(new Product(2, "Sanpham2", 300));
        listProduct.add(new Product(3, "Sanpham3", 200));

        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("\n------------------------------------------------\n");
            System.out.println("Menu");
            System.out.println("1.Them san pham");
            System.out.println("2.Sua san Pham ");
            System.out.println("3.Xoa san pham");
            System.out.println("4.Tim kiem theo ten");
            System.out.println("5.Hien thi san pham");
            System.out.println("6.Sap xep gia tu nho den lon");
            System.out.println("7.Sap xep gia tu lon den nho");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    findProduct();
                    break;
                case 5:
                    display();
                    break;
                case 6:
                   sortMax();
                    break;
                case 7:
                    sortMin();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
        display();


    }

    public static void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham: ");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        listProduct.add(product);

    }

    public static void display() {
        if (listProduct.size() == 0) {
            System.out.println("Khong co san pham nao");
        } else {
            for (int i = 0; i < listProduct.size(); i++) {
                System.out.println(listProduct.get(i).toString());
            }
        }
    }

    public static void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham can sua: ");
        int index = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == index) {
                System.out.println("Nhap ten san pham: ");
                String name = scanner.nextLine();
                listProduct.get(i).setName(name);
                System.out.println("Nhap gia san pham: ");
                int price = Integer.parseInt(scanner.nextLine());
                listProduct.get(i).setPrice(price);
                display();

            }
        }
    }

    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id san pham can xoa: ");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == index) {
                listProduct.remove(i);
                display();
            }
        }
    }

    public static void findProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten san pham can tim: ");
        String name = scanner.nextLine();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(name)) {
                System.out.println(listProduct.get(i).toString());
            }
        }
    }

    public static void sortMax(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });

        display();
    }
    public static void sortMin(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        display();
    }
}
