public class Main {
    public static void main(String[] args) {

        int initialScore = 100; // начальный счет в рублях
        int entrance = 100; // поступление в рублях
        //int entrance = 1100; // поступление в рублях
        int bonusRubles;// количество бонусных рублей
        int finalScore; // итоговый счет в рублях

        if (entrance > 1000) {
            bonusRubles = (entrance /100); }
        else { bonusRubles = 0;}

        finalScore = initialScore + entrance + bonusRubles;

        System.out.println("Итоговый счет :" + finalScore);
        System.out.println("Количество бонусных рублей :" + bonusRubles);
    }
}