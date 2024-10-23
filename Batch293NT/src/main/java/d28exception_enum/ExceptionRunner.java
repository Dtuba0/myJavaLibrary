package d28exception_enum;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(-55);

    }//main dısı

    public static void studentGrade(int not ){
      //  System.out.println(not);
        if (not < 0 || not > 100){
            try {
                throw new InvalidStudentGradeException("Ogrencı notu 0'dan küçük veya 100'den büyük girilemez ");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(not);
        }

    }
}
