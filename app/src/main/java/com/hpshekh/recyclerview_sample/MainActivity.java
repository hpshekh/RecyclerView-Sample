package com.hpshekh.recyclerview_sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.hpshekh.recyclerview_sample.adapter.RVAdapter;
import com.hpshekh.recyclerview_sample.databinding.ActivityMainBinding;
import com.hpshekh.recyclerview_sample.model.Contact;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());

        ArrayList<Contact> contactsList = new ArrayList<>();
        contactsList.add(new Contact("Hakesh Shekh", "9595959595", "hakesh.shekh@gmail.com"));
        contactsList.add(new Contact("vijay Dharajiya", "9898989898", "vijay.dharajiya@gmail.com"));
        contactsList.add(new Contact("vinod koshiyaniya", "9999999999", "vinod.koshiyaniya@gmail.com"));

        RVAdapter adapter = new RVAdapter(contactsList);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        binding.recyclerView.setAdapter(adapter);
    }
}