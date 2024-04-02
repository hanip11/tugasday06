package com.example.tugasday06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MotorAdapter.OnItemClickListener {

    private ArrayList<MotorModel> motorModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        RecyclerView recyclerView = findViewById(R.id.rview);
        MotorAdapter motorAdapter = new MotorAdapter(motorModel);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(motorAdapter);

        motorAdapter.setOnItemClickListener(this);
    }

    private void getData() {
        motorModel = new ArrayList<>();
        motorModel.add(new MotorModel("Yamaha Aerox 155", "Yamaha Aerox 155 adalah skuter matik sporty yang menawarkan kombinasi desain futuristik, performa tinggi, dan fitur canggih. Ditenagai oleh mesin berkapasitas 155cc, Aerox memberikan akselerasi responsif dan kecepatan tinggi", "Rp 29.000.000",R.drawable.aerox));
        motorModel.add(new MotorModel("Yamaha Nmax 155", "Yamaha NMAX adalah skuter matik yang populer dan elegan yang diproduksi oleh Yamaha Motor Company. Skuter ini menawarkan gaya modern, performa handal, dan berbagai fitur canggih yang membuatnya menjadi pilihan yang menarik bagi pengendara perkotaan", "Rp 33.000.000",R.drawable.nmax));
        motorModel.add(new MotorModel("Yamaha Fazio 125", "Desainnya yang futuristik dan stylish. Yamaha benar-benar memperhatikan hingga detail kecil pada desain motor ini.Dari lampu depan LED hingga panel instrumen digital yang elegan, semuanya memberikan kesan mewah dan elegan. Sobat yang ingin tampil beda di jalan pasti akan sangat menyukai tampilan motor ini", "Rp 22.000.000",R.drawable.fazio));
        motorModel.add(new MotorModel("Yamaha Xmax 250", "Yamaha XMAX adalah skuter matic premium yang dikembangkan oleh Yamaha Motor Company. Skuter ini memiliki desain modern dan elegan dengan fitur-fitur yang membuatnya menjadi pilihan yang menarik di segmen skuter kelas menengah.", "Rp 71.000.000",R.drawable.xmax));
        motorModel.add(new MotorModel("Yamaha Lexi 155", "Yamaha Lexi adalah skuter matik yang memadukan desain modern, performa handal, dan teknologi terkini untuk memberikan pengalaman berkendara yang optimal. Dengan bentuk aerodinamis yang elegan, Lexi menawarkan tampilan yang stylish dan eye-catching.", "Rp 28.000.000",R.drawable.lexi));
        motorModel.add(new MotorModel("Kawasaki zx 4r", "Kawasaki Ninja ZX-4R didukung oleh mesin empat silinder segaris berkapasitas 400 cc. Mesin ini dilengkapi dengan teknologi canggih, seperti DOHC (Double Overhead Camshaft) dan pendinginan cairan. Ini menghasilkan tenaga sebesar 98,6 hp pada 12.000 rpm dan torsi 59 lb-ft pada 9.000 rpm, memberikan akselerasi yang sangat kuat dan respon gas yang luar biasa", "Rp 430.000.000",R.drawable.zx_4r));
        motorModel.add(new MotorModel("Kawasaki zx 636", "Kawasaki Ninja ZX-6R, atau sering disebut ZX-636, adalah representasi yang luar biasa dari kecanggihan teknologi dan performa tinggi dalam kelas sepeda motor sport. Didesain untuk memberikan pengalaman berkendara yang memikat, ZX-6R menonjol dengan mesin empat silinder 636cc yang penuh tenaga.", "Rp 600.000.000",R.drawable.zx_636));
        motorModel.add(new MotorModel("Yamaha R1", "Dilengkapi dengan mesin empat silinder berkapasitas tinggi,R1 menghasilkan tenaga yang mengesankan, memberikan akselerasi yang luar biasa di lintasan lurus dan kemampuan manuver yang presisi di tikungan. Sistem kontrol traksi, quick-shifter, dan sistem pengereman canggih membuatnya menjadi salah satu sepeda motor paling canggih di kelasnya.", "Rp 900.000.000",R.drawable.r1));
        motorModel.add(new MotorModel("Yamaha R6", "Yamaha R6 merupakan pilihan ideal bagi pengendara yang mencari sepeda motor sport berkinerja tinggi dengan fokus pada kehandalan dan manuverabilitas. Dikembangkan dengan inspirasi dari saudara besar R1, R6 menawarkan kombinasi antara kecepatan dan kestabilan yang cocok untuk pengendara berpengalaman", "Rp 550.000.000",R.drawable.r6));
        motorModel.add(new MotorModel("Kawasaki Ninja H2", "Kawasaki Ninja H2 adalah sepeda motor sport kelas atas yang menonjolkan kecanggihan teknologi dan desain futuristik. Dikenal sebagai salah satu sepeda motor tercepat di dunia, Ninja H2 memadukan performa tinggi dengan estetika yang menakjubkan.", "Rp 999.000.000",R.drawable.h2));
        motorModel.add(new MotorModel("Honda Adv 160", "Honda ADV (atau sering disebut Honda X-ADV di beberapa pasar) adalah sepeda motor dual-sport yang unik, menawarkan kombinasi antara kemampuan off-road dan kenyamanan berkendara di jalan raya.", "Rp 40.000.000",R.drawable.adv));
        motorModel.add(new MotorModel("Honda Beat Street 110", "Honda Beat Street adalah skuter matik yang menonjol dengan desain yang sporty dan dinamis. Dikembangkan untuk memberikan kenyamanan dan kepraktisan dalam berkendara sehari-hari di perkotaan, Beat Street menawarkan kombinasi antara gaya dan kinerja.", "Rp 18.000.000",R.drawable.street));
        motorModel.add(new MotorModel("Honda Scoopy 110", "Honda Scoopy adalah sepeda motor skuter yang menawan dengan desain yang elegan dan futuristik. Dengan bodi ramping dan bentuk aerodinamis, Scoopy memberikan kesan modern yang memikat.", "Rp 20.000.000",R.drawable.scoppy));
        motorModel.add(new MotorModel("Honda Vario 160", "Honda Vario adalah salah satu sepeda motor skuter matik yang sangat populer, terkenal dengan desainnya yang elegan dan modern serta performa yang handal.", "Rp 30.000.000",R.drawable.vario));
        motorModel.add(new MotorModel("Honda Beat Deluxe 110", "Honda Beat adalah salah satu sepeda motor skuter matik yang populer di pasar, terutama di kawasan Asia Tenggara. Dikenal karena desainnya yang ramping, ringan, dan ekonomis, Honda Beat sangat cocok untuk digunakan dalam mobilitas perkotaan sehari-hari.", "Rp 16.000.000",R.drawable.beat_deluxe));
    }



    @Override
    public void onItemClick(int position) {
        MotorModel clickedItem = motorModel.get(position);

        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        intent.putExtra("nama_motor", clickedItem.getNamaItem());
        intent.putExtra("deskripsi_motor", clickedItem.getDeskripsiItem());
        intent.putExtra("harga_motor", clickedItem.getHargaItem());
        intent.putExtra("gambar_motor", clickedItem.getLogoMotor());

        startActivity(intent);
    }
}
