public class RecursiveKelimeAra {

        public static int kelimeSayisi(String metin, String arananKelime, int index) {
            int metinUzunluk = metin.length();
            int kelimeUzunluk = arananKelime.length();
            int sayac = 0;

            if (index >= metinUzunluk)
                return 0;


            if (metin.charAt(index) == arananKelime.charAt(0)) {
                int eslesme = 1;

                for (int i = 1; i < kelimeUzunluk; i++) {
                    if (metin.charAt(index + i) != arananKelime.charAt(i)) {
                        eslesme = 0;
                        break;
                    }
                }

                if (eslesme == 1)
                    sayac++;
            }

            return sayac + kelimeSayisi(metin, arananKelime, index + 1);
        }

        public static void main(String[] args) {
            String metin = "merhaba merhaba merhabalar!";
            String arananKelime = "merhaba";

            int sonuc = kelimeSayisi(metin.toLowerCase(), arananKelime.toLowerCase(), 0);

            System.out.printf("'%s' kelimesi '%s' metni içinde %d kez kullanılmıştır.\n", arananKelime, metin, sonuc);
        }
    }

