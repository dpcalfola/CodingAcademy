public class StackTheory {

    public static void main(String[] args) {

        String strVar1 = "JBEdu";
        String strVar2 = "JBEdu";


        // 동일한 주소값을 가지고 있음
        if(strVar1 == strVar2){
            System.out.println("참조가 같음");
        }else {
            System.out.println("참조가 다름");
        }


        if(strVar1.equals(strVar2)){
            System.out.println("두 문자열이 같음"); // 데이터 값이 같음
        }


        String strVar3 = new String("JBEdu");
        String strVar4 = new String("JBEdu");


        // 서로 다른 주소값을 가지고 있음
        if(strVar3 == strVar4) {
            System.out.println("참조가 같음");
        }else{
            System.out.println("참조가 다름");
        }


        if(strVar3.equals(strVar4)){
            System.out.println("두 문자열이 같음");
        }
    }
}
