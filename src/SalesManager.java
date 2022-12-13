public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {//создаем открытый метод SalesManager;
        this.sales = sales;
    }

    public int max() {//создаем открытый метод max;
        int max = -1;// если max = -1;
        for (int sale : sales) { // то метод max идет перебором по имеющимся у нас значениям массива;
            if (sale > max) { //если sale > max; max = sale;
                max = sale;
            }
        }
        return max;//возвращаем значеие max;
    }

    public int min() {//создаем открытый метод min;
        int min = max();//если min = max;
        for (int sale : sales) {//то метод sale идет перебором по имеющимся у нас значениям массива;
            if (sale < min) {//sale < min, то
                min = sale;// min = sale;
            }
        }
        return min;//возвращем значение min = sale;
    }

    public int stat() {//создаем метод stat;
        int stat = 0;//начальное значение переменной stat = 0;
        int i = 0;
        int n = 0;
        int x = 0;
        for (int sale : sales) {
            //if (min() != sale $$ sale != max() ) {
            //   stat += sale;
            //   i++;
            //}
            if (min() == sale && n == 0) {
                n++;
            } else if (max() == sale && x == 0) {
                x++;
            } else {
                stat += sale;
                i++;
                //System.out.println(sale);
            }
        }
        //System.out.println(i);
        return (stat / i);
    }
}