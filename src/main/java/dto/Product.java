package dto;

public record Product(String name, int price, int quantity) {
    // 메서드 구현
    public int getTotalPrice() {
        return price * quantity;
    }
}
