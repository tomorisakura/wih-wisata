package grevi.msx.wihwisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailAct extends AppCompatActivity {

    public static String GET_IMAGE = "image_wisata";
    public static String GET_NAMA = "nama_wisata";
    public static String GET_LOKASI = "lokasi_wisata";
    public static String GET_KATEGORI = "kategori_wisata";
    public static String GET_INFO = "info_wisata";
    public static String GET_HARGA = "harga_wisata";

    ImageView picWisata;
    TextView xnamaWisata,xlokasiWisata,xkatWisata,xinfoWisata,xhargaWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        picWisata = findViewById(R.id.picWisata);
        xnamaWisata = findViewById(R.id.namaWisata);
        xlokasiWisata = findViewById(R.id.lokasiWisata);
        xkatWisata = findViewById(R.id.catWisata);
        xinfoWisata = findViewById(R.id.infoWisata);
        xhargaWisata = findViewById(R.id.hargaWisata);

        showDataWisata();

    }

    private void showDataWisata() {
        String nama_wisata = getIntent().getStringExtra(GET_NAMA);
        Integer image_wisata = getIntent().getIntExtra(GET_IMAGE, 0);
        String lokasi_wisata = getIntent().getStringExtra(GET_LOKASI);
        String kategori_wisata = getIntent().getStringExtra(GET_KATEGORI);
        String info_wisata = getIntent().getStringExtra(GET_INFO);
        Integer harga_wisata = getIntent().getIntExtra(GET_HARGA, 0);

        String harga = Integer.toString(harga_wisata);

        Glide.with(this).load(image_wisata).into(picWisata);
        xnamaWisata.setText(nama_wisata);
        xlokasiWisata.setText(lokasi_wisata);
        xkatWisata.setText(kategori_wisata);
        xinfoWisata.setText(info_wisata);
        xhargaWisata.setText("IDR " +harga +".000");
    }
}
