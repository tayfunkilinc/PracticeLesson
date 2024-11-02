package InterviewDay04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C03InterviewQuestion {
    public static void main(String[] args) {
        /*".    Bir tamsayı listesini kullanarak aşağıdaki işlemleri gerçekleştiren bir Java metodu yazın:
                Negatif sayıları filtreleyin.
                Kalan pozitif sayıları iki katına çıkarın.
                Sonuçları küçükten büyüğe sıralayın ve bir liste olarak döndürün.*/
        List<Integer> numbers = Arrays.asList(-5, 3, -2, 8, 0, 1, -1, 6);
        ikiKatinaCikart(numbers);
    }
    public static void ikiKatinaCikart(List<Integer> numbers){
        List<Integer> newNumbers = numbers.stream().filter(t-> t>0).map(t-> t*2).sorted().collect(Collectors.toList());
        System.out.println("newNumbers = " + newNumbers); // newNumbers = [2, 6, 12, 16]
    }
}
