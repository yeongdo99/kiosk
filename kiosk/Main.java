package kiosk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            // 메뉴 초기화
            MenuList.menuData();

            // 메인 메뉴 출력
            Kiosk.mainMenu();
            int n = scanner.nextInt();

            // 2 상품 메뉴 출력
            try {
                if (n == 5) {
                    if (Order.getCart().size() == 0) { // 장바구니 비어있는 경우
                        Kiosk.emptiedCart();
                        continue;
                    } else {
                        Kiosk.choiceMenu(n);
                        Kiosk.orderComplete();
                        continue;
                    }
                } else if (n == 6) { // 주문 취소
                    Kiosk.choiceMenu(n);
                    int c = scanner.nextInt();
                    if (c == 1) {
                        Order.getCart().clear();
                        System.out.println("주문이 취소되었습니다. \n");
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    Kiosk.choiceMenu(n); // 상품 메뉴 출력
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            // 장바구니
            int m = scanner.nextInt();
            Kiosk.cartList(n, m);
            int k = scanner.nextInt();
            Kiosk.putInBasket(n, m, k); // 장바구니 메서드

        }
    }
}
