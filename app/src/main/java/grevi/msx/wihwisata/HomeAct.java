package grevi.msx.wihwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeAct extends AppCompatActivity {

    RecyclerView recView;
    Button btn_wish,btn_like;
    ImageView profilePic;

    ArrayList<Wisata> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recView = findViewById(R.id.rc_content);
        btn_like = findViewById(R.id.btn_like);
        btn_wish = findViewById(R.id.btn_wish);
        profilePic = findViewById(R.id.profile);
        recView.setHasFixedSize(true);

        list.addAll(WisataData.getList());
        showWisataList();
        showProfile();
    }

    private void showProfile() {
        profilePic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prof = new Intent(HomeAct.this, ProfileAct.class);
                startActivity(prof);
            }
        });
    }

    private void showWisataList() {
        recView.setLayoutManager(new LinearLayoutManager(this));
        ListViewAdapter listViewAdapter = new ListViewAdapter(list);
        recView.setAdapter(listViewAdapter);

        listViewAdapter.setOnItemClicked(new ListViewAdapter.itemCallback() {
            @Override
            public void onClickedItem(Wisata wisata) {
                showSelected(wisata);
                Intent intent = new Intent(HomeAct.this, DetailAct.class);
                intent.putExtra(DetailAct.GET_IMAGE, wisata.getPicWisata());
                intent.putExtra(DetailAct.GET_NAMA, wisata.getNama_wisata());
                intent.putExtra(DetailAct.GET_LOKASI,wisata.getLokasi_wisata());
                intent.putExtra(DetailAct.GET_KATEGORI, wisata.getKategory_wisata());
                intent.putExtra(DetailAct.GET_INFO, wisata.getInfo_wisata());
                intent.putExtra(DetailAct.GET_HARGA,wisata.getHarga_wisata());
                startActivity(intent);
            }
        });
    }

    private void showSelected(Wisata wisata) {
        Toast.makeText(getApplicationContext(),wisata.getNama_wisata(), Toast.LENGTH_SHORT).show();
    }
}
