package com.spk.starks.spkpemilihansmartphone;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Toolbar toolbar;
    Button cari;
    Spinner spHarga, spRam, spKamera;
    Context context = this;
    ImageView tampilGambar;
    TextView tvNama;
    Button lihat;
    String nama ;
    int gambar;
    String ket="Maaf Smartphone yang anda cari tidak ada...";
    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        spHarga = (Spinner) findViewById(R.id.spBudget);
        spRam = (Spinner) findViewById(R.id.spRam);
        spKamera = (Spinner) findViewById(R.id.spKamera);
        cari = (Button) findViewById(R.id.btnCari);

        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((spHarga.getSelectedItemPosition() == 0) ||
                        (spKamera.getSelectedItemPosition() == 0) ||
                        (spRam.getSelectedItemPosition() == 0)) {
                    // startActivity(new Intent(getApplicationContext(),MenuSatu.class));

                Toast.makeText(getApplicationContext(),"Silakan pilih terlebih dahulu spesifikasi yang di inginkan. thnk :D",Toast.LENGTH_LONG).show();
                }
                //untuk smartphone yang harganya 1-2juta

                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="ASUS ZENFONE 4";
                    link="http://www.tabloidpulsa.co.id/phones/asus/4269-asus-zenfone-4";
                    gambar= R.drawable.asus;

                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="ASUS ZENFONE 5";
                    link="http://www.tabloidpulsa.co.id/phones/asus/5598-asus-zenfone-5-a501cg";
                    gambar= R.drawable.splashscreen;

                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="ASUS ZENFONE 5";
                    link="http://www.tabloidpulsa.co.id/phones/asus/5598-asus-zenfone-5-a501cg";
                    gambar= R.drawable.splashscreen;

                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="ASUS ZENFONE 5";
                    link="http://www.tabloidpulsa.co.id/phones/asus/5598-asus-zenfone-5-a501cg";
                    gambar= R.drawable.splashscreen;

                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 2)) {
                    nama =" Xiaomi Redmi Note";
                    link="http://ulashape.com/harga-xiaomi-redmi-note/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();



                }
                //untuk smarphone yang harganya 2-3 juta

                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="Motorola Moto G DUAL SIM";
                   link="http://hariangadget.com/harga-motorola-moto-g/";
                    gambar= R.drawable.motogp;

                    tampilDetail();
                }


                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama =" Lenovo S820";
                    link="http://hariangadget.com/harga-lenovo-s820/";
                    gambar= R.drawable.splashscreen;

                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="ACER LIQUID E 700";
                    link="http://www.bursatekno.com/2014/07/harga-acer-liquid-e700-dan-spesifikasi.html";
                    gambar= R.drawable.splashscreen;

                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="ACER LIQUID E 700";
                    link="http://www.bursatekno.com/2014/07/harga-acer-liquid-e700-dan-spesifikasi.html";
                    gambar= R.drawable.splashscreen;

                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="ACER LIQUID E 700";
                    link="http://www.bursatekno.com/2014/07/harga-acer-liquid-e700-dan-spesifikasi.html";
                    gambar= R.drawable.splashscreen;

                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="K-Touch Octa Core";
                    link="http://hariangadget.com/harga-k-touch-octa-core-baru/";
                    gambar= R.drawable.splashscreen;

                    tampilDetail();
                }

                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 3)) {

                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();

                }

                //untuk smartphone yang harganya 3-4 juta
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="Xiaomi Mi3";
                    link="http://hariangadget.com/harga-xiaomi-mi3/";
                    gambar= R.drawable.siomai;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="Xiaomi Mi3";
                    link="http://hariangadget.com/harga-xiaomi-mi3/";
                    gambar= R.drawable.siomai;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="Xiaomi Mi3";
                    link="http://hariangadget.com/harga-xiaomi-mi3/";
                    gambar= R.drawable.siomai;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="Xiaomi Mi3";
                    link="http://hariangadget.com/harga-xiaomi-mi3/";
                    gambar= R.drawable.siomai;
                    tampilDetail();
                }

                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="Xiaomi Mi3";
                    link="http://hariangadget.com/harga-xiaomi-mi3/";
                    gambar= R.drawable.siomai;
                    tampilDetail();
                }


                if ((spHarga.getSelectedItemPosition() == 3) &&
                   (spKamera.getSelectedItemPosition() == 3) &&
                   (spRam.getSelectedItemPosition() == 2)) {


                    nama ="Xiaomi Mi3";
                    link="http://hariangadget.com/harga-xiaomi-mi3/";
                    gambar= R.drawable.siomai;
                    tampilDetail();
                }

                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 3)) {


                    nama ="OnePlus One";
                    link="http://hariangadget.com/harga-oneplus-one/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 3)) {


                    nama ="OnePlus One";
                    link="http://hariangadget.com/harga-oneplus-one/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 3)) {


                    nama ="OnePlus One";
                    link="http://hariangadget.com/harga-oneplus-one/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 4)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 4)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 3) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 4)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }

        //harga 4juta keatas

                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="iPhone 6 Plus";
                    link="http://hariangadget.com/harga-iphone-6s-plus/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 3)) {


                    nama ="Samsung Galaxy S6";
                    link="http://hariangadget.com/harga-samsung-galaxy-s6/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 3)) {


                    nama ="Samsung Galaxy S6";
                    link="http://hariangadget.com/harga-samsung-galaxy-s6/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 3)) {


                    nama ="Samsung Galaxy S6";
                    link="http://hariangadget.com/harga-samsung-galaxy-s6/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 4)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 4)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 4)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 1)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }
                if ((spHarga.getSelectedItemPosition() == 4) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 2)) {


                    nama ="Asus Zenfone 2";
                    link="http://hariangadget.com/harga-asus-zenfone-2/";
                    gambar= R.drawable.splashscreen;
                    tampilDetail();
                }


                //Tidak Ditemukan smartpone 1-2jt
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 3)) {
                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();



                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 3)) {
                    Toast.makeText(getApplicationContext(),
                            ket,Toast.LENGTH_LONG).show();



                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 3)) {
                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();



                }

                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 1)) {
                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();



                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 4)) {
                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();



                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 4)) {
                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();



                }
                if ((spHarga.getSelectedItemPosition() == 1) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 4)) {
                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();



                }
                //tidak ditemukan smartphone 2-3jt
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 3)) {

                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();

                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 3)) {

                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();

                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 3)) {

                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();

                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 1) &&
                        (spRam.getSelectedItemPosition() == 4)) {

                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();

                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 2) &&
                        (spRam.getSelectedItemPosition() == 4)) {

                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();

                }
                if ((spHarga.getSelectedItemPosition() == 2) &&
                        (spKamera.getSelectedItemPosition() == 3) &&
                        (spRam.getSelectedItemPosition() == 4)) {

                    Toast.makeText(getApplicationContext(),ket,Toast.LENGTH_LONG).show();

                }

                //tidak ditemukan smartphone 3-4juta


            }
        });


    }

    private void tampilDetail() {
        LayoutInflater li = LayoutInflater.from(context);
        View tampilDialog = li.inflate(R.layout.activity_dialog, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(tampilDialog);
        tvNama = (TextView) tampilDialog.findViewById(R.id.tvNamaHp);
        tampilGambar = (ImageView) tampilDialog.findViewById(R.id.tampilGambar);
        lihat=(Button)tampilDialog.findViewById(R.id.btnLihat);
tvNama.setText(nama);
        tampilGambar.setImageResource(gambar);
        lihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));
            }
        });
        builder.setCancelable(false).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog adialog = builder.create();
        adialog.show();


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            startActivity(new Intent(MainActivity.this,AboutActivity.class));

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
