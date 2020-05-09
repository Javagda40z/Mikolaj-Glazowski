package ZadaniaNaEnumach.Zadanko;

public enum ProductType {
    OWOCE("owoce", 111), WARZYWA("warzywa", 112),
    MIESO("mieso", 122), PIECZYWO("pieczywo", 221);

    private String type;
    private int code;

    ProductType(String type, int code) {
    }
}
