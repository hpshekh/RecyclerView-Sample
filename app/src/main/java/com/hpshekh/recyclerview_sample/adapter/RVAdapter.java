package com.hpshekh.recyclerview_sample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hpshekh.recyclerview_sample.R;
import com.hpshekh.recyclerview_sample.databinding.ContactItemBinding;
import com.hpshekh.recyclerview_sample.model.Contact;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder> {

    private ArrayList<Contact> contactsList;

    public RVAdapter(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_item, parent, false);
//        return new ViewHolder(view);
        ContactItemBinding binding = ContactItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = contactsList.get(position);
        holder.nameText.setText(contact.getName());
        holder.mobileText.setText(contact.getMobile());
        holder.emailText.setText(contact.getEmail());
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText, mobileText, emailText;

        //        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//        }
        public ViewHolder(@NonNull ContactItemBinding binding) {
            super(binding.getRoot());
            nameText = binding.nameText;
            mobileText = binding.mobileText;
            emailText = binding.emailText;
        }
    }
}
