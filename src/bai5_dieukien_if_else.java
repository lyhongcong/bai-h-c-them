public class bai5_dieukien_if_else {
    public static void main(String[] args) {
//        int score = 5;
//        if(score > 5) { // điều kiện sai
//            System.out.println("Đủ điểm quá môn");
//        }
//        System.out.println("Run here " + (score > 5)); -> Run here false

//        int score = 9;
//        if(score > 5) { // điều kiện đúng
//            System.out.println("Đủ điểm quá môn");
//        }
//        System.out.println("Run here " + (score > 5)); // Đủ điểm quá môn -> Run here true
// -----------------------------------
//        - dưới 10M: không đóng thuế
//        - từ 10M tới 15M: thuế 10%
//        - từ 15 tới 30M : thuế 20%
//        - trên 30M: thuế 50%
        int tax = 0;
        if(tax < 10) {
            System.out.println("Không đóng thuế");
        } else if(10 <= tax && tax <= 15) {
            System.out.println("Thuế 10%");
        } else if(15 <= tax && tax <= 30) {
            System.out.println("Thuế 20%");
        } else {
            System.out.println("Thuế 50%");
        }
    }
}
