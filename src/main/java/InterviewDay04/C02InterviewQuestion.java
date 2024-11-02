package InterviewDay04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C02InterviewQuestion {
    public static void main(String[] args) {
        /*"Bir tamsayı listesindeki pozitif sayıların karelerini hesaplayan bir Java metodu yazın. " +
                "Lambda ifadelerini ve akış (stream) API'sini kullanarak bu işlemi gerçekleştirin."*/
        List<Integer> numbers = Arrays.asList(-1, 2, 3, -4, 5);
        kareHesapla(numbers);
    }

    private static void kareHesapla(List<Integer> num) {
        List<Integer> list = num.stream().filter(t-> t>0).map(t-> t*t).collect(Collectors.toList());
        System.out.println("list = " + list); // list = [4, 9, 25]
    }
}
