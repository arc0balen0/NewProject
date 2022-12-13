public class Main {
    public static void main(String[] args) {
//<<<<<<< HEAD
        //long[] price = {15L, 200L, 25L, 666L};
//=======
        int[] price = {15, 15, 666, 200, 25, 666, 526, 126, 88, 666};// создаем массив данных price;
//>>>>>>> Stat
        SalesManager sales = new SalesManager(price);
        System.out.println("Sale max = " + sales.max());// максимальное значение;
        System.out.println("Sale min = " + sales.min());// минимальное знчаение;
        System.out.println("Sale stat = " + sales.stat());// среднее значение;
    }
}
