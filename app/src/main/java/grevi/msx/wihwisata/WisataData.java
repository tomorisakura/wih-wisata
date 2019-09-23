package grevi.msx.wihwisata;
import java.util.ArrayList;

public class WisataData extends Wisata {

    private static int[] picWisata = {
            R.drawable.wisata1,
            R.drawable.wisata2,
            R.drawable.wisata3,
            R.drawable.wisata4,
            R.drawable.wisata5,
            R.drawable.wisata6,
            R.drawable.wisata7,
            R.drawable.wisata8,
            R.drawable.wisata9,
            R.drawable.wisata10
    };

    private static String[] namaWisata = {
            "Kyoto Temple",
            "Bradenburg Gate",
            "Pisa Tower",
            "Arch de Triomphe",
            "Himeji Palace",
            "Tugu Yogyakarta",
            "Fushima Inari Tokyo",
            "Bromo Mountain",
            "Yosemite Park",
            "Furka Pass"
    };

    private static int[] hargaWisata = {
            700,
            800,
            800,
            900,
            700,
            650,
            700,
            650,
            800,
            650
    };

    private static String[] lokasiWisata = {
            "Kyoto, Japan",
            "Berlin, Germany",
            "Pisa, Italy",
            "Paris, France",
            "Hyogo, Japan",
            "Yogyakarta, Indonesia",
            "Kyoto, Japan",
            "Malang, Indonesia",
            "California, USA",
            "Gletsch, Swiss"
    };

    private static String[] categoryWisata = {
            "Kuil",
            "Bangunan",
            "Bangunan",
            "Bangunan",
            "Bangunan",
            "Kota",
            "Sejarah",
            "Alam",
            "Taman",
            "Alam"
    };

    private static String[] infoWisata = {
            "Kyoto Temple adalah kuil yang terletak di prefektur Kyoto yang dimana kuil tersebut digunakan untuk acara dan festival yang sering dikunjungi oleh wisatawan mancanegara",
            "Merupakan simbol utama gerbang Berlin dan lambang dari penyatuan Berlin Barat dan Berlin Timur. Dibangun pada abad ke-18 sebagai gerbang masuk kota Brandenburg an der Havel, atau yang lebih dikenal sebagai kota Brandenburg. Berada di paling barat kota Berlin, gerbang ini memiliki sejarah panjang sejak didirikan, khususnya dalam sejarah politik negeri ini. ",
            "Menara pisa merupakan sebuah menara lonceng dari katedral pisa yang mana tempat tersebut berdiri terpisah. Menara pisa mulai dibangun pada tahun 1173 dan penyelesaiannya secara bertahap yakni baru benar – benar selesai selam kurun waktu selama 177 tahun.",
            "Arc de Triomphe adalah monumen berbentuk Pelengkung kemenangan di Paris yang berdiri di tengah area Place de l'Étoile, di ujung barat wilayah Champs-Élysées. Bangunan ini dibangun atas perintah Napoleon Bonaparte dengan tujuan untuk menghormati jasa tentara kebesarannya.",
            "Pesona keindahan plesteran berwarna putih yang mendominasi tembok-tembok istana menjadikan Istana Himeji mempunyai sebutan lain istana burung putih (bahasa Jepang: 白鷺城, Shirasagi-jō). Istana Himeji merupakan salah satu contoh peninggalan arsitektur istana dari awal abad ke-17 yang paling penting.",
            "Tugu Ngayogyakarta) adalah sebuah tugu atau monumen yang sering dipakai sebagai simbol atau lambang dari kota Yogyakarta. Tugu ini dibangun oleh pemerintah Belanda setelah tugu sebelumnya runtuh akibat gempa yang terjadi waktu itu. Tugu sebelumnya yang bernama Tugu Golong-Gilig dibangun oleh Hamengkubuwana I, pendiri kraton Yogyakarta.",
            "Fushimi Inari Taisha (伏見稲荷大社) adalah kuil Shinto yang berada di Fushimi-ku, Kyoto, Jepang. Kuil ini merupakan kuil pusat bagi sekitar 40.000 kuil Inari yang memuliakan Inari. Kuil utama (honden) terletak di kaki Gunung Inari, dan tanah milik kuil mencakup gunung yang tingginya 233 meter.",
            "Gunung Bromo atau dalam bahasa Tengger dieja Brama, adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang",
            "Taman Nasional Yosemite adalah taman nasional yang terletak di sebelah timur California, Amerika Serikat. Taman nasional ini mencakup luas daerah sebesar 3,080.74 km². Lebih dari 3,7 juta orang mengunjungi taman nasional ini setiap tahunnya. Kebanyakan orang menghabiskan waktu mereka di Lembah Yosemite.",
            "Furka Pass, dengan ketinggian 2.429 meter, adalah jalur gunung tinggi di Pegunungan Alpen Swiss yang menghubungkan Gletsch, Valais dengan Realp, Uri. Garis Furka Oberalp Bahn melalui Terowongan Furka memotong pass."
    };

    static ArrayList<Wisata> getList() {
     ArrayList<Wisata> list = new ArrayList<>();
     for (int position = 0 ; position < picWisata.length; position++) {
         Wisata wisata = new Wisata();
         wisata.setNama_wisata(namaWisata[position]);
         wisata.setPicWisata(picWisata[position]);
         wisata.setInfo_wisata(infoWisata[position]);
         wisata.setLokasi_wisata(lokasiWisata[position]);
         wisata.setKategory_wisata(categoryWisata[position]);
         wisata.setHarga_wisata(hargaWisata[position]);
         list.add(wisata);
     }
     return list;
    }
}
