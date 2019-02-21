package main;

import java.util.Objects;

public class Key {
    Integer sum;
    Integer product;

    public Key() {
    }

    public Key(Integer sum, Integer product) {
        this.sum = sum;
        this.product = product;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Key key = (Key) o;
        return Objects.equals(sum, key.sum) &&
                Objects.equals(product, key.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sum, product);
    }




}
