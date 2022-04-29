import java.util.*;

public class color{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String[] warna = {"Biru", "Hitam", "Merah", "Hijau", "Kuning", "Putih", "Ungu"};
        String[] sifat = {
                " Warna kesukaan kamu Biru, biasanya termasuk tipe pemurung, selalu menyenangkan dan\n" + 
                "selalu bertindak pasif dalam segala hal. Selalu mengharapkan kedamaian dan ketenangan.\n" +
                "Kamu memiliki kesulitan dalam pergaulan. Demikian pula dalam bercinta karena kamu sering\n" +
                "sekali menyembunyikan perasaan.",
                "Hitam termasuk tipe orang yang sangat lincah dalam hal-hal tertentu saja. Jika berada\n" +
                "dilingkungan yang tidak disukai, maka kamu akan menjadi murung. Kamu selalu tampil\n" +
                "menarik, rapi, cukup banyak lawan jenis berusaha mengejar dan merebut cinta kamu.",
                "Merah sangat berwibawa dan juga senang melindungi orang yang lemah. Walau sering kali\n" +
                "bergaul dan bercanda tapi kamu bisa menahan diri. Banyak orang mengatakan cinta, tapi kamu\n" +
                "selalu berpikir dan berpikir lagi. Kamu termasuk tipe yang sulit jatuh cinta",
                "Jika warna favorit kamu hijau, maka kamu adalah tipe yang sangat romantik, menyukai\n" +
                "keindahan, menyenangi alam dengan udara yang sejuk. Kamu adalah seseorang yang selalu\n" +
                "memegang prinsip. Dalam hal bercinta kamu mengidam-idamkan calon teman hidup yang\n" +
                "penuh toleransi dan dapat dipercaya.",
                "Kesukaan kamu warna kuning menandakan bahwa kamu memiliki sifat optimis. Kamu tipe\n" +
                "periang dan senang bergaul, tidak memiliki penampilan yang loyo. Sifat tolong-menolong\n" +
                "selalu ada dalam diri kamu, karena menolong merupakan suatu kewajiban mutlak bagi kamu.\n" +
                "Kamu orang yang tidak pernah meremehkan siapapun juga, walaupun seseorang itu dungu atau\n" +
                "bloon.",
                "Kamu adalah orang yang dilahirkan ke dunia dengan sempurna, jika menyukai warna putih,\n" +
                "banyak orang mengagumi kamu karena sifat angun, sifat idealis dan moral kamu yang teramat\n" +
                "tinggi. Tak pernah angkuh, senang menolong siapa saja yang membutuhkan bantuan kamu",
                "Warna Ungu adalah pribadi dengan tipe yang benar-benar luar biasa. Selalu optimis, dalam\n" +
                "menghadapi masa depan kamu tidak pernah ragu-ragu, apa yang dikerjakan kamu adalah yang\n" +
                "terbaik. Kamu pandai benar dalam mengikuti perkembangan jaman. Dalam bercinta, hanya\n" +
                "merekalah yang kuat mental yang bisa mendekati dan menjadi kekasih kamu.",

        };
        System.out.print("Input Warna");
        System.out.print("Masukkan warna yang Anda sukai: ");
        String inputWarna = userInput.nextLine();
        if (inputWarna.equalsIgnoreCase("Biru")) {
            System.out.println("Karakter Anda: "+sifat[0]);

        } else if (inputWarna.equalsIgnoreCase("Hitam")) {
            System.out.print("Karakter Anda: "+ sifat[1]);
        }else if (inputWarna.equalsIgnoreCase("Merah")) {
            System.out.print("Karakter Anda: "+ sifat[2]);
        }else if (inputWarna.equalsIgnoreCase("Hijau")) {
            System.out.print("Karakter Anda: "+ sifat[3]);
        }else if (inputWarna.equalsIgnoreCase("Kuning")) {
            System.out.print("Karakter Anda: "+ sifat[4]);
        }else if (inputWarna.equalsIgnoreCase("Putih")) {
            System.out.print("Karakter Anda: "+ sifat[5]);
        }else if (inputWarna.equalsIgnoreCase("Ungu")) {
            System.out.print("Karakter Anda: "+ sifat[5]);
        }
    }
}