package kiosk;

import java.util.Scanner;

public class Kiosk {
    static Scanner sc = new Scanner(System.in);
    static Product[][] products = {MenuList.getBurgerArr(), MenuList.getChickenArr(), MenuList.getSnackSideArr(), MenuList.getDrinkArr()};
    static int cnt = 1; // 주문 번호 초기화

    // 메인 메뉴판 화면 출력
    public static void mainMenu() {
        MenuList.menuData();
        System.out.println("\n================================================\n");
        System.out.println("\"KFC에 오신걸 환영합니다.\"");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 번호를 입력해주세요.");
        System.out.println("\n[ KFC MENU ]");
        int i = 0;
        for (Menu m : MenuList.getMenuArr()) {
            i++;
            System.out.println(i + ". " + m.toString());
        }
        System.out.println("\n[ ORDER MENU ]");
        for (Menu o : MenuList.getOrderArr()) {
            i++;
            System.out.println(i+". " + o.toString());
        }
        System.out.print("\n번호 입력: ");
    }

    //상품 메뉴판 화면 출력
    public static void choiceMenu(int n) {
        int i=0;

        switch (n) {
            case 1 -> {
                System.out.println("\n================================================\n");
                System.out.println("[ BURGUR MENU ]");
                for (Product b : MenuList.getBurgerArr()) {
                    i++;
                    System.out.println(i + ". " + b.toString());
                }
                System.out.print("\n번호 입력: ");
            }
            case 2 -> {
                System.out.println("\n================================================\n");
                System.out.println("[ CHICKEN MENU ]");
                for (Product b : MenuList.getChickenArr()) {
                    i++;
                    System.out.println(i + ". " + b.toString());
                }
                System.out.print("\n번호 입력: ");
            }
            case 3 -> {
                System.out.println("\n================================================\n");
                System.out.println("[ SNACK & SIDE MENU ]");
                for (Product b : MenuList.getSnackSideArr()) {
                    i++;
                    System.out.println(i + ". " + b.toString());
                }
                System.out.print("\n번호 입력: ");

            }
            case 4 -> {
                System.out.println("\n================================================\n");
                System.out.println("[ DRINK MENU ]");
                for (Product b : MenuList.getDrinkArr()) {
                    i++;
                    System.out.println(i + ". " + b.toString());
                }
                System.out.print("\n번호 입력: ");

            }
            case 5 -> { // order
                System.out.println("\n================================================\n");
                System.out.println("아래와 같이 주문하시겠습니까?\n");
                System.out.println("[ Orders ]");
                for (int j = 0; j < Order.getCntCart().size(); j++) {
                    System.out.println(Order.getCntCart().get(j).toString_cnt());
                }
                System.out.println("\n [ Total ]");
                System.out.println("W " + (Math.round(Order.salePriceTotal() * 10.0) / 10.0));
                System.out.println("\n1. 주문      2. 메뉴판");
                System.out.print("\n번호 입력: ");
            }
            case 6 -> { // cancel
                System.out.println("\n================================================\n");
                System.out.println("\n진행하던 주문을 취소하시겠습니까?");
                System.out.println("1. 확인        2. 취소 ");
                System.out.print("\n번호 입력: ");
            }
            default -> {
                System.out.println("\n================================================\n");
                System.out.println("번호를 잘못 입력하셨습니다.");
                System.out.println("메인 메뉴로 돌아갑니다.");
            }

        }
    }



    // 구매 화면
    public static void cartList(int n, int m) {
        System.out.println("\n================================================\n");
        System.out.println("\"" + products[n-1][m-1].toString() + "\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인        2. 취소");
        System.out.print("\n번호 입력: ");
    }

    //주문 완료 화면
    static int c;
    public static void orderComplete() throws InterruptedException {
        Order.getTotalCart().addAll(Order.getCart());
        c = sc.nextInt();
        if(c == 1) {
            Order.getCart().clear();
            Order.getCntCart().clear(); // 장바구니 비워주기
            System.out.println("\n================================================\n");
            System.out.println("주문이 완료되었습니다!");
            System.out.println("대기번호는 [ " + (cnt++) +" ] 번 입니다.");
            System.out.println("(3초 후 메뉴판으로 돌아갑니다.) \n");
            Thread.sleep(3000); // 3초 지연
        }
    }

    // 장바구니가 비어있을 때
    public static void emptiedCart() {
        System.out.println("\n================================================\n");
        System.out.println("장바구니가 비어있습니다.");
        System.out.println("메뉴판으로 돌아갑니다\n");
    }

    // 장바구니에 추가
    public static void putInBasket(int n, int m, int k) {
        if (k != 1) {
            System.out.println("취소되었습니다.");
        } else {
            Order.getCart().add(products[n-1][m-1]);
            boolean exists = false;

            // 같은 메뉴 장바구니에 담을 때
            for(int i=0; i<Order.getCntCart().size(); i++) {
                if (Order.getCntCart().get(i).toString().equals(Kiosk.products[n-1][m-1].toString())) {
                    exists = true;
                    Product existingProduct = Order.getCntCart().get(i);
                    existingProduct.setCount(existingProduct.getCount() + 1); // 상품의 카운트 +1
                    System.out.println("\n================================================\n");
                    System.out.println(existingProduct.getName() + "가 장바구니에 추가되었습니다.");
                }
            }

            //기존 장바구니에 상품이 없는 경우
            if(!exists) {
                Order.getCntCart().add(products[n-1][m-1]);
                System.out.println("\n================================================\n");
                System.out.println(products[n-1][m-1].getName() + " 가 장바구니에 추가되었습니다.");
            }
        }
    }
}