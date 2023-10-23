package kiosk;

public class MenuList {
    
    // 메뉴 배열
    private static Menu[] menuArr = new Menu[4];
    private static Menu[] orderArr = new Menu[2];
    
    // 상품 배열
    private static Product[] burgerArr = new Product[5];
    private static Product[] chickenArr = new Product[5];
    private static Product[] snackSideArr = new Product[5];
    private static Product[] drinkArr = new Product[2];


    public static void menuData() {
        // 메뉴
        menuArr[0] = new Menu("Burgers       ", "KFC 버거");
        menuArr[1] = new Menu("Chickens      ", "KFC 치킨");
        menuArr[2] = new Menu("Snack & Side  ", "KFC 스낵&사이드");
        menuArr[3] = new Menu("Drinks        ", "음료");

        orderArr[0] = new Menu("Order       ", "장바구니를 확인 후 주문합니다.");
        orderArr[1] = new Menu("Cancel      ", "진행중인 주문을 취소합니다.");

        // 상품

        // burger
        burgerArr[0] = new Product("블랙라벨폴인치즈 세트                   ", 10.0, "부드러운 통닭다리살과 크림치즈, 고다치즈, 블루치즈의 완벽한 조화의 버거세트");
        burgerArr[1] = new Product("징거더블다운맥스 세트                   ", 9.8, "Only meat 치킨 통살로만 구성된 Real 치킨통살버거!");
        burgerArr[2] = new Product("불고기버거 세트                        ", 6.6, "달콤한 불고기 소스와 부드러운 패티로 더 맛있어진 불고기버거");
        burgerArr[3] = new Product("트위스터 세트                         ", 6.6, "담백한 닭가슴살을 신선한 야채와 또띠아에 말아만든 트위스터버거세트");
        burgerArr[4] = new Product("켄터키통다리스파이시(스콜쳐플러스) 세트    ", 9.3, "육즙가득 닭다리살에 스콜쳐소스로 매콤하게, 해시브라운으로 든든하게!");

        // Chicken
        chickenArr[0] = new Product("갓 양념치킨 8조각              ", 24.4, "달콤 매콤, 먹을수록 땡기는 맵달의 완벽한 조화 한국 사람 입맛에 딱! 맞춘 환상의 양념 치킨!");
        chickenArr[1] = new Product("켄터키 통다리 순살치킨 8조각     ", 25.2, "닭다리 통살로 만든 최고급 프리미엄 치킨(스윗칠리소스에 찍어 먹으면 더욱 맛있습니다)");
        chickenArr[2] = new Product("오리지널치킨 8조각             ", 22.0, "커넬샌더스가 개발한 11가지 비밀양념에 고압쿠킹 방식으로 육즙이 살아있어 촉촉하고 담백한 KFC 오리지널 치킨");
        chickenArr[3] = new Product("핫크리스피치킨 8조각            ", 22.0, "KFC만의 비법으로 매콤바삭하게 튀겨낸 KFC 핫크리스피치킨");
        chickenArr[4] = new Product("갓양념블랙라벨 8조각            ", 4.9, "KFC에서도 ‘양념 순살’을 먹고 싶다는 고객님들을 위해 준비했다! 블랙라벨 치킨의 변신! 닭다리 통살 블랙라벨이 갓양념과 만났다!");

        // SnackSide
        snackSideArr[0] = new Product("너겟 6조각                ", 3.1, "순 닭고기살로 만들어 부드럽고 쫄깃한 치킨너겟");
        snackSideArr[1] = new Product("케이준후라이L              ", 2.8, "케이준 양념으로 더욱 고소하고 바삭해진 KFC 케이준후라이");
        snackSideArr[2] = new Product("코울슬로                   ", 2.0, "양배추와 당근, 각종 신선한 야채를 상큼하게 버무린 샐러드");
        snackSideArr[3] = new Product("텐더 4조각                 ", 5.8, "담백한 치킨 안심살로 만들어 깔끔하게 먹을 수 있는 KFC 순살 치킨스낵");
        snackSideArr[4] = new Product("비스켓                    ", 2.5, "달콤하고 부드러워진 KFC 대표스낵 비스켓");

        // Drink
        drinkArr[0] = new Product("코카콜라(L)      ", 2.4, "속까지 시원해지는 청량음료의 대표! 콜라");
        drinkArr[1] = new Product("스프라이트(L)    ", 2.4, "속까지 시원해지는 청량음료 스프라이트!");
    }


    // 상품 메뉴
    public static Product[] getBurgerArr() {
        return burgerArr;
    }

    public static Product[] getChickenArr() {
        return chickenArr;
    }

    public static Product[] getSnackSideArr() {
        return snackSideArr;
    }

    public static Product[] getDrinkArr() {
        return drinkArr;
    }


    // 메인 메뉴
    public static Menu[] getMenuArr() {
        return menuArr;
    }

    public static Menu[] getOrderArr() {
        return orderArr;
    }
}

