package com.marvelous_nm.completenewsapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    ListView    listView;
    HashMap<String,String> hashMap ;
    ArrayList<HashMap<String,String>>   arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        listView = findViewById( R.id.listView );

        creatTable();

        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter( myAdapter );




    }


    //--------------layout inflation
        private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            View myView = layoutInflater.inflate( R.layout.item_desine,viewGroup,false );

            TextView item_tag = myView.findViewById( R.id.item_tag );
            TextView item_titel = myView.findViewById( R.id.item_titel );
            TextView item_des = myView.findViewById( R.id.item_des );

            HashMap<String,String> hashMap = arrayList.get( position );

            String out_item_tag = hashMap.get( "item_tag" );
            String out_item_titel = hashMap.get( "item_titel" );
            String out_item_des = hashMap.get( "item_des" );

            item_tag.setText( out_item_tag );
            item_titel.setText( out_item_titel );
            item_des.setText( out_item_des );

            return myView;
        }
    }


            //--------------------

    private void creatTable(){
        hashMap = new HashMap<>();
        hashMap.put( "item_tag" ,"World news" );
        hashMap.put( "item_titel" ,"সেই বালক ডেভিডের সাহস নিয়ে ফিলিস্তিনি যোদ্ধাদের ফেরা" );
        hashMap.put( "item_des" ,"হামাস এককথায় অবিশ্বাস্য কাণ্ড করেছে। ইসরায়েলের ভেতরে ঢুকে হামলা করেছে। এত দিন ইসরায়েলকে দুর্ভেদ্য বলেই মনে হতো। এই বিশ্বাসকে একদম গুঁড়িয়ে দিয়েছে হামাস। ইসরায়েলের বিলিয়ন বিলিয়ন ডলার ব্যয়ের নিরাপত্তাব্যবস্থাকে নানা প্রশ্নের সামনে দাঁড় করিয়ে দিয়েছে ২০ মিনিটে ৫ হাজার রকেট নিক্ষেপ করে। " );
        arrayList.add( hashMap );

        hashMap = new HashMap<>();
        hashMap.put( "item_tag" ,"bd news" );
        hashMap.put( "item_titel" ,"লাখ টাকার সিলিকন প্যাডেড ব্রার মতোই কাজ করবে দেশালের ১৬০ টাকার ফিলার" );
        hashMap.put( "item_des" ,"২১ বছর বয়স মানে হুলুস্থুল প্রেমে পড়ার বয়স। তিনিও পড়েছিলেন, সব ঠিকই চলছিল। হঠাৎই প্রেমে তৃতীয় পক্ষ হয়ে আঘাত হানল স্তন ক্যানসার। দিশাহারা হয়ে পড়লেন তিনি। নিজেই উদ্যোগ নিয়ে সরিয়ে নিলেন সম্পর্ক থেকে। প্রেমিককে না জানিয়ে চুপিচুপি গেলেন পাশের দেশে উন্নত চিকিৎসার জন্য। কিছুই বুঝতে না পেরে প্রেমিক পাগলপ্রায় হয়ে খোঁজখবর নিতে লাগলেন। ঠিকই ঠিকানা জোগাড় করে কাঁটাতারের বেড়া পাড়ি দিয়ে পৌঁছে গেলেন ওপারে, সেখানে এক ভাঙা হৃদয় নিয়ে নিজের সব শক্তি জড়ো করে ক্যানসারের সঙ্গে লড়ছিলেন প্রেমিকা।" );
        arrayList.add( hashMap );

        hashMap = new HashMap<>();
        hashMap.put( "item_tag" ,"World news" );
        hashMap.put( "item_titel" ,"title" );
        hashMap.put( "item_des" ,"title" );
        arrayList.add( hashMap );
    }





}